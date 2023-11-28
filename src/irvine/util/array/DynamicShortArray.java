package irvine.util.array;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Provides a dynamic array of shorts indexed by an int.
 * See DynamicArray for further information on performance.
 *
 * @author Sean A. Irvine
 */
public class DynamicShortArray implements Serializable {

  /**
   * Allocates chunks CHUNK_SIZE bytes at a time.  This means
   * the low CHUNK_BITS of an index are within a chunk and the
   * remaining bits select the chunk.
   *
   * Be wary of changing CHUNK_BITS.
   */
  private static final int CHUNK_BITS = 16;
  private static final int CHUNK_SIZE = 1 << CHUNK_BITS;
  private static final int CHUNK_MASK = CHUNK_SIZE - 1;

  /** Main reference point for all stored information. */
  private final ArrayList<short[]> mChunks = new ArrayList<>();

  /** Length of the array (highest indexed value). */
  private int mLength = 0;

  /**
   * Return the length of the array.  This is one more than the
   * highest location which has been assigned a value or zero
   * in the case of an empty array.
   *
   * @return length of the array
   */
  public int length() {
    return mLength;
  }

  /**
   * Get the short at the specified array index.
   *
   * @param index array index
   * @return value at specified index
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public short get(final int index) {
    if (index >= mLength) {
      return 0;
    }
    return mChunks.get(index >> CHUNK_BITS)[index & CHUNK_MASK];
  }

  /**
   * Get the chunk containing the given index value.  If necessary
   * generate new chunks to reach it.
   */
  private short[] getChunk(final int index) {
    if (index >= mLength) {
      final int chunk = index & ~CHUNK_MASK;
      while (chunk >= mLength) {
        // need to expand number of chunks
        mChunks.add(new short[CHUNK_SIZE]);
        mLength += CHUNK_SIZE;
      }
      mLength = index + 1;
    }
    return mChunks.get(index >> CHUNK_BITS);
  }

  /**
   * Set the entry at specified index to the given value.
   * @param index index of entry
   * @param value value to set at the index
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public void set(final int index, final short value) {
    getChunk(index)[index & CHUNK_MASK] = value;
  }

  /**
   * Add a value to the entry at the specified index, returning the new value.
   * @param index index of entry
   * @param value value to add
   * @return the value after addition
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public short add(final int index, final int value) {
    return getChunk(index)[index & CHUNK_MASK] += value;
  }

  /**
   * Increment the entry at the specified index returning the new value.
   * @param index index of entry
   * @return the value after incrementing
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public short increment(final int index) {
    return add(index, 1);
  }


  /**
   * Truncate the array to specified length.  Entries beyond
   * this position are lost.  This method can release memory.
   * Calling <code>truncate(0);</code> empties the entire array.
   * If the array is already the specified length or is shorter,
   * then no action is taken.
   *
   * @param length position to truncate at
   * @exception ArrayIndexOutOfBoundsException if length is negative.
   */
  public void truncate(int length) {
    if (length < mLength) {
      if (length < 0) {
        throw new ArrayIndexOutOfBoundsException("Cannot truncate to negative length.");
      }
      mLength = length;
      if (mLength == 0) {
        mChunks.clear();
      } else {
        final int lastChunk = (mLength - 1) >>> CHUNK_BITS;
        for (int i = mChunks.size() - 1; i > lastChunk; --i) {
          mChunks.remove(i);
        }
        mChunks.trimToSize();
        // Zero entries in rest of chunk.
        // Necessary in case set() is subsequently called at
        // a higher value, making these entries valid again
        final short[] last = getChunk(--length);
        length &= CHUNK_MASK;
        while (++length != CHUNK_SIZE) {
          last[length] = 0;
        }
      }
    }
  }


  /**
   * Convert this array into an ordinary Java array.
   * @return Java array
   */
  public short[] toArray() {
    final short[] r = new short[length()];
    for (int i = 0, j = 0; i < length(); i += CHUNK_SIZE, ++j) {
      System.arraycopy(mChunks.get(j), 0, r, i, Math.min(length() - i, CHUNK_SIZE));
    }
    return r;
  }
}


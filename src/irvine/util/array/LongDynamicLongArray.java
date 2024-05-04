package irvine.util.array;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A long dynamic array of longs. See <code>LongDynamicArray</code> for a
 * longer description of what is supported.
 *
 * @author Sean A. Irvine
 */
public class LongDynamicLongArray implements Serializable {

  /**
   * Allocates chunks CHUNK_SIZE bytes at a time.  This means
   * the low CHUNK_BITS of an index are within a chunk and the
   * remaining bits select the chunk.
   *
   * Be wary of changing CHUNK_BITS.
   */
  private static final int CHUNK_BITS = 20;
  private static final int CHUNK_SIZE = 1 << CHUNK_BITS;
  private static final int CHUNK_MASK = CHUNK_SIZE - 1;

  /** Main reference point for all stored information. */
  private final ArrayList<long[]> mChunks = new ArrayList<>();

  /** Length of the array (highest indexed value). */
  private long mLength = 0;

  /**
   * Return the length of the array.  This is one more than the
   * highest location which has been assigned a value or zero
   * in the case of an empty array.
   *
   * @return length of the array
   */
  public long length() {
    return mLength;
  }

  /**
   * Get the long at the specified array index.
   *
   * @param index array index
   * @return value at specified index
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public long get(final long index) {
    if (index >= mLength) {
      return 0L;
    }
    return mChunks.get((int) (index >> CHUNK_BITS))[(int) index & CHUNK_MASK];
  }

  /**
   * Get the chunk containing the given index value.  If necessary
   * generate new chunks to reach it.
   */
  private long[] getChunk(final long index) {
    if (index >= mLength) {
      final long chunk = index & ~(long) CHUNK_MASK;
      while (chunk >= mLength) {
        // need to expand number of chunks
        mChunks.add(new long[CHUNK_SIZE]);
        mLength += CHUNK_SIZE;
      }
      mLength = index + 1;
    }
    return mChunks.get((int) (index >>> CHUNK_BITS));
  }

  /**
   * Set the entry at specified index to the given value.
   * @param index index of entry
   * @param value value to set at the index
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public void set(final long index, final long value) {
    getChunk(index)[(int) (index & CHUNK_MASK)] = value;
  }

  /**
   * Add a value to the entry at the specified index, returning the new value.
   * @param index index of entry
   * @param value value to add
   * @return the value after addition
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public long add(final long index, final long value) {
    return getChunk(index)[(int) (index & CHUNK_MASK)] += value;
  }

  /**
   * Multiple a value to the entry at the specified index, returning the new value.
   * @param index index of entry
   * @param value value to multiply
   * @return the value after multiplication
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public long multiply(final long index, final long value) {
    return getChunk(index)[(int) (index & CHUNK_MASK)] *= value;
  }

  /**
   * Divide a value into the entry at the specified index, returning the new value.
   * @param index index of entry
   * @param value value to divide by
   * @return the value after division
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public long divide(final long index, final long value) {
    return getChunk(index)[(int) (index & CHUNK_MASK)] /= value;
  }

  /**
   * Increment the entry at the specified index returning the new value.
   * @param index index of entry
   * @return the value after incrementing
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   */
  public long increment(final long index) {
    return add(index, 1);
  }

  /**
   * Truncate the array to specified length.  Entries beyond
   * this position are lost.  This method can release memory.
   * Calling <code>truncate(0);</code> empties the entire array.
   * If the array is already the specified length or is shorter,
   * then no action is taken.
   * @param length position to truncate at
   * @exception ArrayIndexOutOfBoundsException if length is negative.
   */
  public void truncate(long length) {
    if (length < mLength) {
      if (length < 0) {
        throw new ArrayIndexOutOfBoundsException("Cannot truncate to negative length.");
      }
      mLength = length;
      if (mLength == 0) {
        mChunks.clear();
      } else {
        final int lastChunk = (int) ((mLength - 1) >>> CHUNK_BITS);
        for (int i = mChunks.size() - 1; i > lastChunk; --i) {
          mChunks.remove(i);
        }
        mChunks.trimToSize();
        // Zero entries in rest of chunk.
        // Necessary in case set() is subsequently called at
        // a higher value, making these entries valid again
        final long[] last = getChunk(--length);
        int len = (int) (length & CHUNK_MASK);
        while (++len != CHUNK_SIZE) {
          last[len] = 0L;
        }
      }
    }
  }

  /**
   * Return a deep copy of this array.
   * @return copy
   */
  public LongDynamicLongArray copy() {
    final LongDynamicLongArray res = new LongDynamicLongArray();
    for (final long[] a : mChunks) {
      res.mChunks.add(Arrays.copyOf(a, a.length));
    }
    res.mLength = mLength;
    return res;
  }
}


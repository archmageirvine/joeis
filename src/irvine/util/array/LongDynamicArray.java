package irvine.util.array;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Provides dynamic arrays for generic objects.  Arrays of this class grow dynamically
 * as required.  Dynamic arrays can be truncated to release memory.
 * Offers O(1) get() and length(), amortized O(1) set().  Memory use
 * is O(n) and comparatively tight.  This class differs from DynamicArray
 * in that indices are longs.  The maximum usable
 * index is 2^(31+CHUNK_BITS)=2^51 (ought to be large enough for
 * most applications).
 *
 * @author Sean A. Irvine
 * @param <T> type of array
 */
public class LongDynamicArray<T> implements Serializable {

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
  private final ArrayList<T[]> mChunks = new ArrayList<>();

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
   * Get the object at the specified array index.  May be null
   * if no object was previously assigned to the specified index.
   *
   * @param index array index
   * @return value at specified index
   * @exception UnsupportedOperationException if the underlying
   * array is a primitive type.
   * @exception ArrayIndexOutOfBoundsException if the index is
   * negative.
   */
  public T get(final long index) {
    if (index >= mLength) {
      return null;
    }
    return mChunks.get((int) (index >> CHUNK_BITS))[(int) index & CHUNK_MASK];
  }

  /**
   * Get the chunk containing the given index value.  If necessary
   * generate new chunks to reach it.
   */
  @SuppressWarnings("unchecked")
  private T[] getChunk(final long index) {
    if (index >= mLength) {
      final long chunk = index & ~(long) CHUNK_MASK;
      while (chunk >= mLength) {
        // need to expand number of chunks
        mChunks.add((T[]) new Object[CHUNK_SIZE]);
        mLength += CHUNK_SIZE;
      }
      mLength = index + 1;
    }
    return mChunks.get((int) (index >>> CHUNK_BITS));
  }

  /**
   * Set the entry at specified index to the given value.
   * ClassCastExceptions will happen if the type is
   * otherwise incorrect.
   *
   * @param index array index
   * @param value value to set at the index
   * @exception ArrayIndexOutOfBoundsException if the index is negative.
   * @exception ArrayStoreException if value is not of a class compatible
   * with the underlying array.
   */
  public void set(final long index, final T value) {
    getChunk(index)[(int) index & CHUNK_MASK] = value;
  }

  /**
   * Truncate the array to specified length.  Entries beyond
   * this position are lost.  This method can release memory.
   * Calling <code>truncate(0);</code> empties the entire array.
   * If the array is already the specified length or is shorter
   * then no action is taken.
   *
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
        //  entries in rest of chunk.
        // Necessary in case set() is subsequently called at
        // a higher value, making these entries valid again
        final T[] last = getChunk(--length);
        int len = (int) (length & CHUNK_MASK);
        while (++len != CHUNK_SIZE) {
          last[len] = null;
        }
      }
    }
  }
}


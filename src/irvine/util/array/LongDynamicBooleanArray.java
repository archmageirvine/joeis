package irvine.util.array;

import java.io.Serializable;

/**
 * Provides a fairly compact binary array that grows dynamically
 * as required.
 * @author Sean A. Irvine
 */
public class LongDynamicBooleanArray implements Serializable {

  private static final int BITS = 5;
  private static final int MASK = (1 << BITS) - 1;
  private final LongDynamicIntArray mArray = new LongDynamicIntArray();

  /**
   * Return an approximation to the largest index currently in the array.
   * It is guaranteed there are no set values beyond the return value.
   * @return approximate array length
   */
  public long length() {
    return mArray.length() << BITS;
  }

  /**
   * Test if the specified bit is set.
   * @param n bit
   * @return true if bit is set
   */
  public boolean isSet(final long n) {
    final int bit = (int) (n & MASK);
    final long index = n >>> BITS;
    return (mArray.get(index) & (1 << bit)) != 0;
  }

  /**
   * Set the specified bit to true.
   * @param n bit to set
   */
  public void set(final long n) {
    final int bit = (int) (n & MASK);
    final long index = n >>> BITS;
    mArray.set(index, mArray.get(index) | (1 << bit));
  }

  /**
   * Clear the specified bit to true.
   * @param n bit to set
   */
  public void clear(final long n) {
    final int bit = (int) (n & MASK);
    final long index = n >>> BITS;
    mArray.set(index, mArray.get(index) & ~(1 << bit));
  }

  /**
   * Return the total number of set bits in the array.
   * @return population count
   */
  public long popcount() {
    long c = 0;
    for (int k = 0; k < mArray.length(); ++k) {
      c += Integer.bitCount(mArray.get(k));
    }
    return c;
  }

  /**
   * Return the index of the highest set bit less than <code>n</code> or -1
   * if there are no further set bits.
   * @param n start index
   * @return index of next lower set bit
   */
  public long prevSetBit(final long n) {
    if (n <= 0) {
      return -1;
    }
    long m = n - 1;
    final int bit = (int) (m & MASK);
    long index = m >>> BITS;
    int v = mArray.get(index) << (Integer.SIZE - bit - 1);
    int remaining = bit + 1;
    while (true) {
      while (v != 0) {
        if (v < 0) {
          return m;
        }
        v <<= 1;
        --m;
        --remaining;
      }
      m -= remaining;
      if (m < 0) {
        return -1;
      }
      v = mArray.get(--index);
      remaining = Integer.SIZE;
    }
  }

  /**
   * Return the index of the highest clear bit less than <code>n</code> or -1
   * if there are no further clear bits.
   * @param n start index
   * @return index of next lower clear bit
   */
  public long prevClearBit(final long n) {
    if (n <= 0) {
      return -1;
    }
    long m = n - 1;
    final int bit = (int) (m & MASK);
    long index = m >>> BITS;
    int v = mArray.get(index);
    final int shift = Integer.SIZE - bit - 1;
    v <<= shift;
    v |= (1 << shift) - 1;
    int remaining = bit + 1;
    while (true) {
      while (v != -1) {
        if (v >= 0) {
          return m;
        }
        v <<= 1;
        v |= 1;
        --m;
        --remaining;
      }
      m -= remaining;
      if (m < 0) {
        return -1;
      }
      v = mArray.get(--index);
      remaining = Integer.SIZE;
    }
  }

  /**
   * Return the index of the lowest set bit greater than <code>n</code> or -1
   * if there are no further set bits.
   * @param n start index
   * @return index of next higher set bit
   */
  public long nextSetBit(final long n) {
    long m = n + 1;
    final int bit = (int) (m & MASK);
    long index = m >>> BITS;
    int v = mArray.get(index) >>> bit;
    int remaining = Integer.SIZE - bit;
    while (true) {
      while (v != 0) {
        if ((v & 1) == 1) {
          return m;
        }
        v >>>= 1;
        --remaining;
        ++m;
      }
      m += remaining;
      if (++index >= length()) {
        return -1;
      }
      v = mArray.get(index);
      remaining = Integer.SIZE;
    }
  }

  /**
   * Return the index of the lowest clear bit greater than <code>n</code>.
   * @param n start index
   * @return index of next higher clear bit
   */
  public long nextClearBit(final long n) {
    long m = n + 1;
    final int bit = (int) (m & MASK);
    long index = m >>> BITS;
    int v = mArray.get(index) >> bit;
    int remaining = Integer.SIZE - bit;
    while (true) {
      while (v != -1) {
        if ((v & 1) == 0) {
          return m;
        }
        v >>= 1;
        ++m;
        --remaining;
      }
      m += remaining;
      v = mArray.get(++index); // safe even if we go past the end of array
      remaining = Integer.SIZE;
    }
  }
}


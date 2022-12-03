package irvine.util.array;

import java.util.Arrays;

/**
 * Provides a multidimensional int array with the number dimensions
 * determined at construction time.  This means code can construct
 * arrays where the number of dimensions is determined at runtime.
 * @author Sean A. Irvine
 */
public class MultidimensionalIntArray {

  private final int[] mLengths;
  private final int[] mA;

  /**
   * Construct a multidimensional array with the given dimensions.
   * @param sizes lengths in each dimension
   * @throws IllegalArgumentException if any length is non-positive or
   * no lengths are given.
   * @throws NullPointerException if <code>sizes</code> is null.
   * @throws UnsupportedOperationException if the array size is too large.
   */
  public MultidimensionalIntArray(final int... sizes) {
    if (sizes.length == 0) {
      throw new IllegalArgumentException();
    }
    mLengths = Arrays.copyOf(sizes, sizes.length);
    long totalLength = 1;
    for (int len : sizes) {
      totalLength *= len;
      if (totalLength > Integer.MAX_VALUE) {
        throw new UnsupportedOperationException("Requested array size is too large");
      }
    }
    mA = new int[(int) totalLength];
  }

  private int getIndex(final int... coordinates) {
    if (coordinates.length != mLengths.length) {
      throw new IllegalArgumentException();
    }
    int index = 0;
    for (int k = 0; k < coordinates.length; ++k) {
      if (coordinates[k] < 0 || coordinates[k] >= mLengths[k]) {
        throw new ArrayIndexOutOfBoundsException("Coordinate " + k + " is out of range: " + coordinates[k]);
      }
      if (k > 0) {
        index *= mLengths[k - 1];
      }
      index += coordinates[k];
    }
    return index;
  }

  /**
   * Get a value from the array
   * @param coordinates array coordinates
   * @return value in array
   * @throws IllegalArgumentException if the number of coordinates does not match the array.
   * @throws ArrayIndexOutOfBoundsException if a coordinate is out of range.
   */
  public int get(final int... coordinates) {
    return mA[getIndex(coordinates)];
  }

  /**
   * Set a value from the array
   * @param coordinates array coordinates
   * @param value value to set
   * @throws IllegalArgumentException if the number of coordinates does not match the array.
   * @throws ArrayIndexOutOfBoundsException if a coordinate is out of range.
   */
  public void set(final int[] coordinates, final int value) {
    mA[getIndex(coordinates)] = value;
  }

  /**
   * Return the number of dimensions in this array.
   * @return number of dimensions
   */
  public int dimensions() {
    return mLengths.length;
  }
}


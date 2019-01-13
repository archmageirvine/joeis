package irvine.util;

/**
 * A triple of a particular type.
 *
 * @author Sean A. Irvine
 * @param <T> type
 */
public class Triple<T> {

  private final T mLeft;
  private final T mMid;
  private final T mRight;

  /**
   * Construct a new triple.
   * @param left left of triple
   * @param mid middle of triple
   * @param right right of triple
   */
  public Triple(final T left, final T mid, final T right) {
    mLeft = left;
    mMid = mid;
    mRight = right;
  }

  /**
   * Left of triple.
   *
   * @return left of triple
   */
  public T left() {
    return mLeft;
  }

  /**
   * Middle of triple.
   *
   * @return middle of triple
   */
  public T mid() {
    return mMid;
  }

  /**
   * Right of triple.
   *
   * @return right of triple
   */
  public T right() {
    return mRight;
  }

  @Override
  public String toString() {
    return "(" + mLeft + "," + mMid + "," + mRight + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Triple)) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    final Triple<?> that = (Triple<?>) obj;
    return mLeft.equals(that.mLeft) && mMid.equals(that.mMid) && mRight.equals(that.mRight);
  }

  @Override
  public int hashCode() {
    return mLeft.hashCode() ^ mRight.hashCode() ^ mMid.hashCode();
  }

}

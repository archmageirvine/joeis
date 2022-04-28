package irvine.util;

import java.io.Serializable;

/**
 * A pair where the left and right may have different types.
 *
 * @author Sean A. Irvine
 * @param <L> left type
 * @param <R> right type
 */
public class Pair<L, R> implements Serializable {

  private final L mLeft;
  private final R mRight;

  /**
   * Construct a new pair.
   * @param left left of pair
   * @param right right of pair
   */
  public Pair(final L left, final R right) {
    mLeft = left;
    mRight = right;
  }

  /**
   * Left of pair.
   *
   * @return left of pair
   */
  public L left() {
    return mLeft;
  }

  /**
   * Right of pair.
   *
   * @return right of pair
   */
  public R right() {
    return mRight;
  }

  @Override
  public String toString() {
    return '(' + (mLeft == null ? null : mLeft.toString()) + ',' + (mRight == null ? null : mRight.toString()) + ')';
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Pair)) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    final Pair<?, ?> that = (Pair<?, ?>) obj;
    return mLeft.equals(that.mLeft) && mRight.equals(that.mRight);
  }

  @Override
  public int hashCode() {
    return (mLeft.hashCode() * 65537) ^ mRight.hashCode();
  }

}

package irvine.util;

/**
 * A quadruple of a particular type.
 *
 * @author Sean A. Irvine
 * @param <T> type
 */
public class Quadruple<T> {

  private final T mA;
  private final T mB;
  private final T mC;
  private final T mD;
  private final int mHashCode;

  /**
   * Construct a new quadruple.
   * @param a first of quadruple
   * @param b second of quadruple
   * @param c third of quadruple
   * @param d fourth of quadruple
   */
  public Quadruple(final T a, final T b, final T c, final T d) {
    mA = a;
    mB = b;
    mC = c;
    mD = d;
    mHashCode = mA.hashCode() ^ (mB.hashCode() * 65537) ^ (mC.hashCode() * 7) ^ (mD.hashCode() * 31);
  }

  /**
   * First of quadruple.
   * @return first of quadruple
   */
  public T a() {
    return mA;
  }

  /**
   * Second of quadruple.
   * @return second of quadruple
   */
  public T b() {
    return mB;
  }

  /**
   * Third of quadruple.
   * @return third of quadruple
   */
  public T c() {
    return mC;
  }

  /**
   * Fourth of quadruple.
   * @return fourth of quadruple
   */
  public T d() {
    return mD;
  }

  @Override
  public String toString() {
    return "(" + mA + "," + mB + "," + mC + "," + mD + ")";
  }

  @Override
  public boolean equals(final Object obj) {
    if (!(obj instanceof Quadruple)) {
      return false;
    }
    if (obj == this) {
      return true;
    }
    final Quadruple<?> that = (Quadruple<?>) obj;
    return mA.equals(that.mA) && mB.equals(that.mB) && mC.equals(that.mC) && mD.equals(that.mD);
  }

  @Override
  public int hashCode() {
    return mHashCode;
  }

}

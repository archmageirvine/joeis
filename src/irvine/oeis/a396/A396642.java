package irvine.oeis.a396;

/**
 * A396642 Numbers k = p_1^e_1 * ... * p_i^e_i such that the area of the convex hull of the planar coordinates [p_i, e_i] is an integer &gt;= 1.
 * @author Sean A. Irvine
 */
public class A396642 extends A396647 {

  @Override
  protected boolean accept(final long area) {
    return area >= 2 && (area & 1) == 0;
  }
}

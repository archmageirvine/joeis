package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A396818 allocated for Shunya Tamura.
 * @author Sean A. Irvine
 */
public class A396818 extends AbstractSequence {

  private long mN = 2;

  /** Construct the sequence. */
  public A396818() {
    super(4);
  }

  @Override
  public Z next() {
    final long q = ++mN / 2;
    final Z f2 = Functions.FIBONACCI.z(2 * mN);
    final Z l2 = Functions.LUCAS.z(2 * mN).subtract(2);
    Z t = l2.multiply(Functions.FIBONACCI.z(2 * q + 1).subtract(1))
      .subtract(f2.multiply(Functions.LUCAS.z(2 * q + 1).subtract(2 * q + 1)))
      .add(f2)
      .multiply(mN);
    if ((mN & 1) == 0) {
      t = t.subtract(Functions.FIBONACCI.z(mN).multiply(l2)
        .subtract(f2.multiply(Functions.LUCAS.z(mN).subtract(2)))
        .multiply(q));
    }
    return t;
  }
}

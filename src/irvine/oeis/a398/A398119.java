package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a046.A046471;

/**
 * A398119 a(n) is the number of distinct cycles under iteration of x -&gt; s(x^n) on the positive integers, where s is the decimal digit sum and fixed points are counted as cycles of length 1.
 * @author Sean A. Irvine
 */
public class A398119 extends A398120 {

  private final Sequence mA = new A046471().skip();

  @Override
  public Z next() {
    return super.next().add(mA.next()).add(1);
  }
}

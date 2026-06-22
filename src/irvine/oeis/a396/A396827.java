package irvine.oeis.a396;

import irvine.oeis.ConvolutionSequence;
import irvine.oeis.a046.A046675;

/**
 * A396827 a(n) is the number of distinct primitive integer-sided triangles (x, y, z) with sopfr(x) = sopfr(y) = sopfr(z) = n, where sopfr is A001414.
 * @author Sean A. Irvine
 */
public class A396827 extends ConvolutionSequence {

  /** Construct the sequence. */
  public A396827() {
    super(1, new A046675(), new A396826());
  }
}

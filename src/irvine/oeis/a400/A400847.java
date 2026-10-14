package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a065.A065091;

/**
 * A400847 allocated for Martin Michael Musatov.
 * @author Sean A. Irvine
 */
public class A400847 extends FilterSequence {

  /** Construct the sequence. */
  public A400847() {
    super(1, new A065091(), p -> p.square().add(Functions.NEXT_PRIME.z(p)).divide2().isProbablePrime());
  }
}

package irvine.oeis.a402;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A402269 Composite numbers c such that psi(c+6) - psi(c) = 6 where psi is Dedekind's psi function (A001615).
 * @author Sean A. Irvine
 */
public class A402269 extends FilterSequence {

  /** Construct the sequence. */
  public A402269() {
    super(1, new A002808(), k -> Functions.DEDEKIND_PSI.z(k.add(6)).subtract(Functions.DEDEKIND_PSI.z(k)).equals(Z.SIX));
  }
}

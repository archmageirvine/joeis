package irvine.oeis.a399;

import irvine.math.graph.PcpBusyBeaver;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399884 Variant of the Busy Beaver sequence for the Post correspondence problem.
 * @author Gregory Morse
 */
public class A399884 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 3) {
      // Regenerate with the internal PcpInvariant checker and its certificates.
      return Z.valueOf(75);
    }
    return Z.valueOf(PcpBusyBeaver.maximum(mN));
  }
}

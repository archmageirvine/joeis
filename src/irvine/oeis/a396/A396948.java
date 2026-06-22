package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.UnionSequence;

/**
 * A396948 Numbers m with two or more digits such that if we insert a 0 between the units and tens digits we get a multiple of the original number.
 * @author Sean A. Irvine
 */
public class A396948 extends UnionSequence {

  /** Construct the sequence. */
  public A396948() {
    super(1, new FiniteSequence(1, FiniteSequence.FINITE, 15, 18, 45), new Sequence1() {
      private  long mN = 0;
      @Override
      public Z next() {
        mN += 10;
        return Z.valueOf(mN);
      }
    });
  }
}

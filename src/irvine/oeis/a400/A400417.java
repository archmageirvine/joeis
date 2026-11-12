package irvine.oeis.a400;

import irvine.math.group.AlternatingGroup;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400417 allocated for Sergei Uskov.
 * @author Sean A. Irvine
 */
public class A400417 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(AlternatingGroup.create(++mN).cayleyGraph().diameter());
  }
}

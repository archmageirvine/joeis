package irvine.oeis.a401;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401668 Number of groups G of order n such that |Aut(G)| = n.
 * @author Sean A. Irvine
 */
public class A401668 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Group<?> g : GroupFactory.smallGroups(++mN)) {
      if (g.autOrder().equals(mN)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

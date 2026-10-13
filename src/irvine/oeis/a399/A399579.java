package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a055.A055932;

/**
 * A399579 allocated for Zhicheng Wei.
 * @author Sean A. Irvine
 */
public class A399579 extends A055932 {

  private final HashMap<Long, ArrayList<Z>> mA = new HashMap<>();
  private long mN = 1;
  private Z mLast = Z.ONE;
  private int mM = 0;

  @Override
  public Z next() {
    while (true) {
      final ArrayList<Z> lst = mA.get(mN);
      if (lst != null && lst.get(lst.size() - 1).equals(mLast)) {
        if (mM >= lst.size()) {
          mA.remove(mN);
          ++mN;
          mLast = mLast.multiply2();
          mM = 0;
        } else {
          return lst.get(mM++);
        }
      }
      final Z t = super.next();
      final long key = Functions.SIGMA0.l(t);
      mA.computeIfAbsent(key, k -> new ArrayList<>()).add(t);
    }
  }
}

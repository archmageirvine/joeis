package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a005.A005101;

/**
 * A396223 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A396223 extends Sequence1 {

  // After Felix Huber

  private static final int ITERATION_LIMIT = 200;
  private static final double EPS = 1e-12;
  private static final double PI = Math.PI;
  private final Sequence mS = new A005101();

  private List<Double> divisors(final Z n) {
    final ArrayList<Double> res = new ArrayList<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      res.add(d.doubleValue());
    }
    return res;
  }

  private double[] b(final List<Double> l, final double rl, final double rh) {
    double s0 = 0.0;
    double s1 = 0.0;
    final double c = 1.0 - 1e-30;

    for (final double d : l) {
      double t0 = d / (2.0 * rh);
      if (t0 > c) {
        t0 = c;
      } else if (t0 < 0.0) {
        t0 = 0.0;
      }
      double t1 = d / (2.0 * rl);
      if (t1 > c) {
        t1 = c;
      } else if (t1 < 0.0) {
        t1 = 0.0;
      }
      s0 += Math.asin(t0);
      s1 += Math.asin(t1);
    }

    return new double[] {s0, s1};
  }

  private double[] r(final List<Double> l) {
    final double x = l.get(l.size() - 1);
    final double rm = x / 2.0;
    double[] s = b(l, rm, rm * (1.0 + EPS));
    if (s[1] <= PI) {
      return new double[] {rm, rm};
    }
    final double rl = rm * (1.0 + EPS);
    double rh = Math.max(4.0 * x, x + 1.0);
    s = b(l, rh * (1.0 - EPS), rh);
    for (int j = 0; j < 200 && s[0] >= PI; ++j) {
      rh *= 2.0;
      s = b(l, rh * (1.0 - EPS), rh);
    }
    return new double[] {rl, rh};
  }

  private double area(final List<Double> l, final double r) {
    double sum = 0.0;
    final double rr = 4.0 * r * r;
    for (final double d : l) {
      sum += d * Math.sqrt(Math.max(0.0, rr - d * d));
    }
    return 0.25 * sum;
  }

  @Override
  public Z next() {
    final List<Double> l = divisors(mS.next());
    final double[] rr = r(l);
    double rl = rr[0];
    double rh = rr[1];
    if (rl == rh) {
      return Z.valueOf((long) Math.floor(area(l, rl)));
    }
    for (int j = 0; j < ITERATION_LIMIT; ++j) {
      final long f0 = (long) Math.floor(area(l, rl));
      final long f1 = (long) Math.floor(area(l, rh));
      if (f0 == f1) {
        return Z.valueOf(f0);
      }
      final double rm = (rl + rh) / 2.0;
      final double[] s = b(l, rm * (1.0 - EPS), rm * (1.0 + EPS));
      if (s[1] > PI) {
        rl = rm;
      } else if (s[0] < PI) {
        rh = rm;
      } else {
        final double oldRl = rl;
        rl = rm * (1.0 + EPS);
        rh = rm * (1.0 - EPS) + (rh - oldRl) / 2.0;
      }
    }

    throw new RuntimeException("Iteration limit exceeded");
  }
}

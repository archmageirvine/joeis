package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A401675 allocated for Karan Sharma.
 * @author Sean A. Irvine
 */
public class A401675 extends Sequence0 {

  // After Karan Sharma

  private static final int[] DA = {0, -1, -1, 0, 1, 1};
  private static final int[] DB = {1, 1, 0, -1, -1, 0};

  private final List<Point> mPoints = new ArrayList<>();
  private int mA = 0;
  private int mB = 0;
  private int mR = 1;
  private int mSegment = 0;
  private int mStep = 0;
  private boolean mStartRing = true;

  private Point nextPoint() {
    if (mStartRing) {
      mA = mR;
      mB = 1 - mR;
      mStartRing = false;
      mSegment = 0;
      mStep = 0;
      return new Point(mA, mB);
    }

    while (mSegment < 6) {
      final int len = mSegment == 0 ? mR - 1 : mR;
      if (mStep < len) {
        mA += DA[mSegment];
        mB += DB[mSegment];
        ++mStep;
        return new Point(mA, mB);
      }
      ++mSegment;
      mStep = 0;
    }

    ++mR;
    mStartRing = true;
    return nextPoint();
  }

  @Override
  public Z next() {
    final Point p;
    if (mPoints.isEmpty()) {
      p = new Point(0, 0);
    } else {
      p = nextPoint();
    }
    long count = 0;
    for (final Point q : mPoints) {
      if (Functions.GCD.i(Math.abs(p.left() - q.left()), Math.abs(p.right() - q.right())) == 1) {
        ++count;
      }
    }
    mPoints.add(p);
    return Z.valueOf(count);
  }
}

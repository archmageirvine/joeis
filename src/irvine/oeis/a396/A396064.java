package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396064 Lexicographically earliest sequence, where for every term-pair the sum, difference and product is unique.
 * @author Sean A. Irvine
 */
public class A396064 extends Sequence0 {

  // After Marc Morgenegg

  private final ArrayList<Z> mTerms = new ArrayList<>();
  private final HashSet<Z> mUsedValues = new HashSet<>();
  private Z mCandidate = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      boolean valid = true;
      final HashSet<Z> candidateValues = new HashSet<>();
      for (final Z t : mTerms) {
        final Z s = mCandidate.add(t);
        final Z d = mCandidate.subtract(t);
        final Z p = mCandidate.multiply(t);
        // Check against previously used values
        if (mUsedValues.contains(s) || mUsedValues.contains(d) || mUsedValues.contains(p)) {
          valid = false;
          break;
        }

        // Check against values generated with earlier terms
        if (candidateValues.contains(s) || candidateValues.contains(d) || candidateValues.contains(p)) {
          valid = false;
          break;
        }

        candidateValues.add(s);
        candidateValues.add(d);
        candidateValues.add(p);
      }

      final Z c = mCandidate;
      mCandidate = mCandidate.add(1);

      if (valid) {
        mTerms.add(c);
        mUsedValues.addAll(candidateValues);
        return c;
      }
    }
  }
}


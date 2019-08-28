package irvine.math.group;

import java.util.ArrayList;
import java.util.List;

import irvine.math.set.IntegerPermutation;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class BaseStrongGeneratingCandidateElementTest extends TestCase {

  public void test() {
    final List<IntegerPermutation> generators = new ArrayList<>();
    generators.add(new IntegerPermutation(0, 3, 4, 1));
    final List<BaseStrongGeneratingCandidateElement> l = SchreierSims.createRawBSGSCandidate(generators);
    assertEquals(1, l.size());
    final BaseStrongGeneratingCandidateElement e = l.get(0);
    assertEquals("[1, [[0, 3, 4, 1]]]", e.toString());
    assertEquals("[1, [[0, 3, 4, 1]]]", e.asBaseStrongGeneratingElement().toString());
    e.addStabilizer(new IntegerPermutation(0, 2));
    e.recalculateOrbitAndSchreierVector();
    assertEquals("[1, [[0, 3, 4, 1], [0, 2]]]", e.toString());
  }
}

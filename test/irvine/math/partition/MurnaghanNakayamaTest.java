package irvine.math.partition;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MurnaghanNakayamaTest extends TestCase {

  public void testEssentialPartitionSequence() {
    assertEquals("101011010", MurnaghanNakayama.essentialPartitionSequence(new int[] {5, 4, 2, 1}).toString());
    assertEquals("1010010", MurnaghanNakayama.essentialPartitionSequence(new int[] {3, 2, 2, 1}).toString());
  }

  public void testCharacter() {
    assertEquals(Z.ONE, MurnaghanNakayama.character(new int[0], new int[0]));
    assertEquals(Z.ONE, MurnaghanNakayama.character(new int[] {1}, new int[] {1}));
    assertEquals(Z.ONE, MurnaghanNakayama.character(new int[] {3}, new int[] {2, 1}));
    assertEquals(Z.ONE, MurnaghanNakayama.character(new int[] {3, 2}, new int[] {2, 2, 1}));
    assertEquals(Z.NEG_ONE, MurnaghanNakayama.character(new int[] {3, 2, 2, 1}, new int[] {3, 2, 2, 1}));
    assertEquals(Z.ZERO, MurnaghanNakayama.character(new int[] {5, 4, 2, 1}, new int[] {4, 3, 2, 2, 1}));
  }
}

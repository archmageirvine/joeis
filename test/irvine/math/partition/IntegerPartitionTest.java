package irvine.math.partition;

import java.util.Arrays;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class IntegerPartitionTest extends TestCase {

  public void test0() {
    final IntegerPartition ip = new IntegerPartition(0);
    assertEquals(0, ip.next().length);
    assertNull(ip.next());
  }

  public void test5() {
    final IntegerPartition ip = new IntegerPartition(5);
    assertTrue(Arrays.equals(new int[] {5}, ip.next()));
    assertTrue(Arrays.equals(new int[] {4, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 2}, ip.next()));
    assertTrue(Arrays.equals(new int[] {3, 1, 1}, ip.next()));
    final int[] p = ip.next();
    assertTrue(Arrays.equals(new int[] {2, 2, 1}, p));
    final int[] c = {42, 43, 44, 45, 46, 47};
    IntegerPartition.toCountForm(p, c);
    assertTrue(Arrays.equals(new int[] {0, 1, 2, 0, 0, 0}, c));
    c[0] = 42;
    assertEquals(2, IntegerPartition.ord(c));
    assertTrue(Arrays.equals(new int[] {2, 1, 1, 1}, ip.next()));
    assertTrue(Arrays.equals(new int[] {1, 1, 1, 1, 1}, ip.next()));
    assertNull(ip.next());
    assertNull(ip.next());
  }

  public void test1() {
    final IntegerPartition ip = new IntegerPartition(1);
    assertTrue(Arrays.equals(new int[] {1}, ip.next()));
    assertNull(ip.next());
  }

  public void testStandardYoungTableaux() {
    assertEquals(Z.valueOf(216), IntegerPartition.numStandardYoungTableaux(new int[] {4, 2, 2, 1}));
  }

  public void testDual() {
    assertEquals("[2, 2]", Arrays.toString(IntegerPartition.dual(new int[] {2, 2})));
    assertEquals("[4]", Arrays.toString(IntegerPartition.dual(new int[] {1, 1, 1, 1})));
    assertEquals("[1, 1, 1, 1]", Arrays.toString(IntegerPartition.dual(new int[] {4})));
    assertEquals("[3, 1]", Arrays.toString(IntegerPartition.dual(new int[] {2, 1, 1})));
    assertEquals("[2, 1, 1]", Arrays.toString(IntegerPartition.dual(new int[] {3, 1})));
  }
}

package irvine.math.partition;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MultidimensionalIntegerPartitionTest extends TestCase {

  public void test5() {
    final MultidimensionalIntegerPartition ip = new MultidimensionalIntegerPartition(7, 4);
    assertEquals(835, ip.count());
  }
}

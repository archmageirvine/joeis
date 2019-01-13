package irvine.math.partitions;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SmarandacheFactorPartitionTest extends TestCase {

  public void test() {
    assertEquals(2, SmarandacheFactorPartition.count(0, 2));
    assertEquals(522, SmarandacheFactorPartition.count(7, 4));
    assertEquals(522, SmarandacheFactorPartition.count(4, 7));
    assertEquals(522, SmarandacheFactorPartition.count(Z.valueOf(10368)));
  }
}

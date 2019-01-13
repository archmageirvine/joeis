package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GroupFactoryTest extends TestCase {

  public void test() {
    assertEquals(Z.valueOf(120), GroupFactory.createGroup("S5").size());
    assertEquals(Z.FIVE, GroupFactory.createGroup("C5").size());
    assertEquals(Z.TEN, GroupFactory.createGroup("D5").size());
    assertEquals(Z.valueOf(20), GroupFactory.createGroup("Dic5").size());
    assertEquals(Z.FOUR, GroupFactory.createGroup("Q4").size());
    assertEquals(Z.valueOf(12), GroupFactory.createGroup("A4").size());
    assertEquals(Z.valueOf(16), GroupFactory.createGroup("C4:C4").size());
    assertEquals(Z.valueOf(36), GroupFactory.createGroup("C3.A4").size());
    assertEquals(Z.valueOf(27), GroupFactory.createGroup("He3").size());
  }
}

package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MobiusTest extends TestCase {

  public void testMobius() {
    final Function1 f = new Mobius();
    assertEquals(0, f.i(0));
    assertEquals(1, f.i(1));
    assertEquals(-1, f.i(2));
    assertEquals(-1, f.i(3));
    assertEquals(0, f.i(4));
    assertEquals(-1, f.i(5));
    assertEquals(1, f.i(6));
    assertEquals(-1, f.i(7));
    assertEquals(0, f.i(8));
    assertEquals(0, f.i(9));
    assertEquals(1, f.i(10));
    assertEquals(-1, f.i(11));
    assertEquals(0, f.i(12));
    assertEquals(-1, f.i(13));
    assertEquals(1, f.i(14));
    assertEquals(1, f.i(15));
    assertEquals(0, f.i(16));
    assertEquals(-1, f.i(17));
    assertEquals(0, f.i(18));
    assertEquals(-1, f.i(19));
    assertEquals(0, f.i(20));
    assertEquals(1, f.i(21));
    assertEquals(1, f.i(22));
    assertEquals(-1, f.i(23));
    assertEquals(0, f.i(24));
    assertEquals(0, f.i(25));
    assertEquals(1, f.i(26));
    assertEquals(0, f.i(27));
    assertEquals(0, f.i(28));
    assertEquals(-1, f.i(29));
    assertEquals(-1, f.i(30));
    assertEquals(-1, f.i(31));
    assertEquals(0, f.i(32));
    assertEquals(1, f.i(33));
    assertEquals(1, f.i(34));
    assertEquals(1, f.i(35));
    assertEquals(0, f.i(36));
    assertEquals(-1, f.i(37));
    assertEquals(1, f.i(38));
    assertEquals(1, f.i(39));
    assertEquals(0, f.i(40));
    assertEquals(-1, f.i(41));
    assertEquals(-1, f.i(42));
    assertEquals(-1, f.i(43));
    assertEquals(0, f.i(44));
    assertEquals(0, f.i(45));
    assertEquals(1, f.i(46));
    assertEquals(-1, f.i(47));
    assertEquals(0, f.i(48));
    assertEquals(0, f.i(49));
    assertEquals(0, f.i(50));
    assertEquals(1, f.i(51));
    assertEquals(0, f.i(52));
    assertEquals(-1, f.i(53));
    assertEquals(0, f.i(54));
    assertEquals(1, f.i(55));
    assertEquals(0, f.i(56));
    assertEquals(1, f.i(57));
    assertEquals(1, f.i(58));
    assertEquals(-1, f.i(59));
    assertEquals(0, f.i(60));
    assertEquals(-1, f.i(61));
    assertEquals(1, f.i(62));
    assertEquals(0, f.i(63));
    assertEquals(0, f.i(64));
    assertEquals(1, f.i(65));
    assertEquals(-1, f.i(66));
    assertEquals(-1, f.i(67));
    assertEquals(0, f.i(68));
    assertEquals(1, f.i(69));
    assertEquals(-1, f.i(70));
    assertEquals(-1, f.i(71));
    assertEquals(0, f.i(72));
    assertEquals(-1, f.i(73));
    assertEquals(1, f.i(74));
    assertEquals(0, f.i(75));
    assertEquals(0, f.i(76));
    assertEquals(1, f.i(77));
    assertEquals(-1, f.i(78));
    assertEquals(-1, f.i(79));
    assertEquals(0, f.i(80));
    assertEquals(0, f.i(81));
    assertEquals(1, f.i(82));
    assertEquals(-1, f.i(83));
    assertEquals(0, f.i(84));
    assertEquals(1, f.i(85));
    assertEquals(1, f.i(86));
    assertEquals(1, f.i(87));
    assertEquals(0, f.i(88));
    assertEquals(-1, f.i(89));
    assertEquals(0, f.i(90));
    assertEquals(1, f.i(91));
    assertEquals(0, f.i(92));
    assertEquals(1, f.i(93));
    assertEquals(1, f.i(94));
    assertEquals(1, f.i(95));
    assertEquals(0, f.i(96));
    assertEquals(-1, f.i(97));
    assertEquals(0, f.i(98));
    assertEquals(0, f.i(99));
    assertEquals(0, f.l(Z.ONE.shiftLeft(200).subtract(1)));
  }

  public void testIncrementalConstruction() {
    assertEquals(0, new Mobius().l(5043));
    final Mobius f = new Mobius();
    f.l(2000);
    f.l(4000);
    assertEquals(0, f.l(5043));
  }
}

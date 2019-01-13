package irvine.math.group;

import irvine.math.z.Integers;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GroupUtilsTest extends TestCase {

  public void testAbelian() {
    assertTrue(GroupUtils.isAbelian(new IntegersMod(4)));
    assertFalse(GroupUtils.isAbelian(SymmetricGroup.create(3)));
    try {
      GroupUtils.isAbelian(Integers.SINGLETON);
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }

  public void testGnu() {
    assertEquals(1, GroupUtils.gnu(1).longValue());
    assertEquals(1, GroupUtils.gnu(2).longValue());
    assertEquals(1, GroupUtils.gnu(3).longValue());
    assertEquals(2, GroupUtils.gnu(4).longValue());
    assertEquals(1, GroupUtils.gnu(5).longValue());
    assertEquals(2, GroupUtils.gnu(6).longValue());
    assertEquals(1, GroupUtils.gnu(7).longValue());
    assertEquals(5, GroupUtils.gnu(8).longValue());
    assertEquals(2, GroupUtils.gnu(9).longValue());
    assertEquals(2, GroupUtils.gnu(10).longValue());
    assertEquals(1, GroupUtils.gnu(11).longValue());
    assertEquals(5, GroupUtils.gnu(12).longValue());
    assertEquals(1, GroupUtils.gnu(13).longValue());
    assertEquals(2, GroupUtils.gnu(14).longValue());
    assertEquals(1, GroupUtils.gnu(15).longValue());
    assertEquals(14, GroupUtils.gnu(16).longValue());
    assertEquals(1, GroupUtils.gnu(17).longValue());
    assertEquals(5, GroupUtils.gnu(18).longValue());
    assertEquals(1, GroupUtils.gnu(19).longValue());
    assertEquals(5, GroupUtils.gnu(20).longValue());
    assertEquals(2, GroupUtils.gnu(21).longValue());
    assertEquals(2, GroupUtils.gnu(22).longValue());
    assertEquals(1, GroupUtils.gnu(23).longValue());
    assertEquals(15, GroupUtils.gnu(24).longValue());
    assertEquals(2, GroupUtils.gnu(25).longValue());
    assertEquals(2, GroupUtils.gnu(26).longValue());
    assertEquals(5, GroupUtils.gnu(27).longValue());
    assertEquals(4, GroupUtils.gnu(28).longValue());
    assertEquals(1, GroupUtils.gnu(29).longValue());
    assertEquals(4, GroupUtils.gnu(30).longValue());
    assertEquals(1, GroupUtils.gnu(31).longValue());
    assertEquals(51, GroupUtils.gnu(32).longValue());
    assertEquals(1, GroupUtils.gnu(33).longValue());
    assertEquals(2, GroupUtils.gnu(34).longValue());
    assertEquals(1, GroupUtils.gnu(35).longValue());
    assertEquals(14, GroupUtils.gnu(36).longValue());
    assertEquals(1, GroupUtils.gnu(37).longValue());
    assertEquals(2, GroupUtils.gnu(38).longValue());
    assertEquals(2, GroupUtils.gnu(39).longValue());
    assertEquals(14, GroupUtils.gnu(40).longValue());
    assertEquals(1, GroupUtils.gnu(41).longValue());
    assertEquals(6, GroupUtils.gnu(42).longValue());
    assertEquals(1, GroupUtils.gnu(43).longValue());
    assertEquals(4, GroupUtils.gnu(44).longValue());
    assertEquals(2, GroupUtils.gnu(45).longValue());
    assertEquals(2, GroupUtils.gnu(46).longValue());
    assertEquals(1, GroupUtils.gnu(47).longValue());
    assertEquals(52, GroupUtils.gnu(48).longValue());
    assertEquals(2, GroupUtils.gnu(49).longValue());
    assertEquals(5, GroupUtils.gnu(50).longValue());
    assertEquals(1, GroupUtils.gnu(51).longValue());
    assertEquals(5, GroupUtils.gnu(52).longValue());
    assertEquals(1, GroupUtils.gnu(53).longValue());
    assertEquals(15, GroupUtils.gnu(54).longValue());
    assertEquals(2, GroupUtils.gnu(55).longValue());
    assertEquals(13, GroupUtils.gnu(56).longValue());
    assertEquals(2, GroupUtils.gnu(57).longValue());
    assertEquals(2, GroupUtils.gnu(58).longValue());
    assertEquals(1, GroupUtils.gnu(59).longValue());
    assertEquals(13, GroupUtils.gnu(60).longValue());
    assertEquals(1, GroupUtils.gnu(61).longValue());
    assertEquals(2, GroupUtils.gnu(62).longValue());
    assertEquals(4, GroupUtils.gnu(63).longValue());
    assertEquals(267, GroupUtils.gnu(64).longValue());
    assertEquals(1, GroupUtils.gnu(65).longValue());
    assertEquals(4, GroupUtils.gnu(66).longValue());
    assertEquals(1, GroupUtils.gnu(67).longValue());
    assertEquals(5, GroupUtils.gnu(68).longValue());
    assertEquals(1, GroupUtils.gnu(69).longValue());
    assertEquals(4, GroupUtils.gnu(70).longValue());
    assertEquals(1, GroupUtils.gnu(71).longValue());
    assertEquals(50, GroupUtils.gnu(72).longValue());
    assertEquals(1, GroupUtils.gnu(73).longValue());
    assertEquals(2, GroupUtils.gnu(74).longValue());
    assertEquals(3, GroupUtils.gnu(75).longValue());
    assertEquals(4, GroupUtils.gnu(76).longValue());
    assertEquals(1, GroupUtils.gnu(77).longValue());
    assertEquals(6, GroupUtils.gnu(78).longValue());
    assertEquals(1, GroupUtils.gnu(79).longValue());
    assertEquals(52, GroupUtils.gnu(80).longValue());
    assertEquals(15, GroupUtils.gnu(81).longValue());
    assertEquals(2, GroupUtils.gnu(82).longValue());
    assertEquals(1, GroupUtils.gnu(83).longValue());
    assertEquals(15, GroupUtils.gnu(84).longValue());
    assertEquals(1, GroupUtils.gnu(85).longValue());
    assertEquals(2, GroupUtils.gnu(86).longValue());
    assertEquals(1, GroupUtils.gnu(87).longValue());
    assertEquals(12, GroupUtils.gnu(88).longValue());
    assertEquals(1, GroupUtils.gnu(89).longValue());
    assertEquals(10, GroupUtils.gnu(90).longValue());
    assertEquals(1, GroupUtils.gnu(91).longValue());
    assertEquals(4, GroupUtils.gnu(92).longValue());
    assertEquals(2, GroupUtils.gnu(93).longValue());
    assertEquals(2, GroupUtils.gnu(94).longValue());
    assertEquals(1, GroupUtils.gnu(95).longValue());
    assertEquals(231, GroupUtils.gnu(96).longValue());
    assertEquals(1, GroupUtils.gnu(97).longValue());
    assertEquals(5, GroupUtils.gnu(98).longValue());
    assertEquals(2, GroupUtils.gnu(99).longValue());
  }
  
}

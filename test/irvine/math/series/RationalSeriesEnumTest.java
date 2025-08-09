package irvine.math.series;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RationalSeriesEnumTest extends TestCase {

  public void testExp() {
    assertEquals("1+x+(1/2)*x^2+(1/6)*x^3+(1/24)*x^4+(1/120)*x^5+(1/720)*x^6+(1/5040)*x^7+(1/40320)*x^8+(1/362880)*x^9+(1/3628800)*x^10", SeriesRing.SQ.toString(RationalSeriesEnum.EXP.s(), 10));
  }

  public void testEta() {
    assertEquals("1-x-x^2+x^5+x^7", SeriesRing.SQ.toString(RationalSeriesEnum.ETA.s(), 10));
  }
}

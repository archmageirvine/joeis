package irvine.math.cr;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AgmTest extends TestCase {

  public void testAgm() {
    CRTest.assertEquals("agm", CR.ZERO, CR.ZERO.agm(CR.ZERO));
    CRTest.assertEquals("agm", CR.ONE, CR.ONE.agm(CR.ONE));
    CRTest.assertEquals("agm", CR.valueOf(1.456791031046906869186432383215), CR.ONE.agm(CR.TWO));
    CRTest.assertEquals("agm", CR.valueOf(1.456791031046906869186432383215), CR.TWO.agm(CR.ONE));
    CRTest.assertEquals("agm", CR.valueOf(1.69442616958795817321299824682), CR.TWO.agm(CR.TWO.sqrt()));
    CRTest.assertEquals("agm", CR.valueOf(1.96577816579315727145632610071), CR.TWO.agm(CR.THREE.sqrt().add(CR.TWO).sqrt()));
  }
}

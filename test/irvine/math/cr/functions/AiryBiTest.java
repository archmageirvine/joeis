package irvine.math.cr.functions;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class AiryBiTest extends TestCase {

  public void test() {
    assertEquals("0.61492662744600073515", CrFunctions.AIRY_BI.cr(Z.ZERO).toString(20));
    assertEquals("0.85427704310315549330", CrFunctions.AIRY_BI.cr(CR.HALF).toString(20));
    assertEquals("0.38035265975105385017", CrFunctions.AIRY_BI.cr(CR.HALF.negate()).toString(20));
    assertEquals("1.20742359495287125944", CrFunctions.AIRY_BI.cr(CR.ONE).toString(20));
    assertEquals("17.74733433148902129273", CrFunctions.AIRY_BI.cr(CR.PI).toString(20));
  }
}

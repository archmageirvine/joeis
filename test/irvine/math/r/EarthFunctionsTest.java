package irvine.math.r;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EarthFunctionsTest extends TestCase {

  public void testWaterVapourPressure() {
    assertEquals(2336.297378283675, EarthFunctions.waterVapourPressure(EarthFunctions.celsiusToKelvin(20)), 0.001);
    assertEquals(101305.29512456073, EarthFunctions.waterVapourPressure(EarthFunctions.celsiusToKelvin(100)), 0.001);
  }

  public void testWaterVapourPressureOverWater() {
    assertEquals(23.36047793274996, EarthFunctions.waterVapourPressureOverWater(EarthFunctions.celsiusToKelvin(20)), 0.001);
    assertEquals(1012.8847028302437, EarthFunctions.waterVapourPressureOverWater(EarthFunctions.celsiusToKelvin(100)), 0.001);
  }

  public void testWaterVapourPressureOverIce() {
    assertEquals(28.275248906403277, EarthFunctions.waterVapourPressureOverIce(EarthFunctions.celsiusToKelvin(20)), 0.001);
    assertEquals(1.4003526073968357E-5, EarthFunctions.waterVapourPressureOverIce(EarthFunctions.celsiusToKelvin(-100)), 0.001);
  }
}

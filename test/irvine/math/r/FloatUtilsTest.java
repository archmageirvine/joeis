package irvine.math.r;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class FloatUtilsTest extends TestCase {

  public void testReadFloat0() throws IOException {
    final ByteArrayInputStream bis = new ByteArrayInputStream(new byte[4]);
    assertEquals(0.0F, FloatUtils.readFloat(bis));
  }

  public void testReadFloat1() throws IOException {
    final ByteArrayInputStream bis = new ByteArrayInputStream(new byte[] {0x01, 0x02, 0x03, 0x04});
    assertEquals(1.5399902E-36, FloatUtils.readFloat(bis), 1e-42);
  }
}

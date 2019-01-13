package irvine.util.io;

import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import junit.framework.TestCase;

/**
 * Provides some tests which every FilterOutputStream should pass.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractFilterOutputStreamTest extends TestCase {


  // implemented in subclasses to provide streams
  public abstract OutputStream getOutputStream(final OutputStream s) throws IOException;


  public abstract byte[] getTestStream();


  /** Test it is indeed a FilterOutputStream.  */
  public void testInstanceOf() {
    try {
      assertTrue(getOutputStream(null) instanceof FilterOutputStream);
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Tests the <code>equals()</code> method.  */
  public void testEquals() {
    try {
      final OutputStream s = getOutputStream(null);
      assertTrue("Reflextivity of equality", s.equals(s));
      assertTrue("Null comparison", !s.equals(null));
      final Object junk = new Object();
      assertTrue("Non instance", !s.equals(junk));
      assertTrue("Non instance", !junk.equals(s));
      OutputStream t = new ByteArrayOutputStream();
      assertTrue("IS test", !s.equals(t));
      assertTrue("IS test", !t.equals(s));
      t = getOutputStream(t);
      assertTrue("self type test", !s.equals(t));
      assertTrue("self type test", !t.equals(s));
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Tests the <code>hashCode()</code> method.  */
  public void testHashcode() {
    try {
      final OutputStream s = getOutputStream(null);
      assertEquals("Reflexive hashcode", s.hashCode(), s.hashCode());
      final Object junk = new Object();
      assertTrue("Hashcode", s.hashCode() != junk.hashCode());
      final OutputStream t = new ByteArrayOutputStream();
      assertTrue("Hashcode", s.hashCode() != t.hashCode());
      final OutputStream t2 = getOutputStream(t);
      assertTrue("Hashcode", s.hashCode() != t2.hashCode());
      t2.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Tests <code>close()</code> functionality.  */
  public void testWritePastClose() {
    try {
      final OutputStream s = getOutputStream(new ByteArrayOutputStream());
      s.close();
      try {
        s.write(0);
        fail("Write past close");
      } catch (final IOException e) {
        assertEquals("Stream closed", e.getMessage());
      }
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Tests multiple closes.  */
  public void testMultipleClose() {
    try {
      final OutputStream s = getOutputStream(new ByteArrayOutputStream());
      s.close();
      s.close();
      s.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Test write functionality.  */
  public void testWriteConsistency() {
    try {
      final byte[] testData = getTestStream();
      ByteArrayOutputStream bos = new ByteArrayOutputStream();
      OutputStream s = getOutputStream(bos);
      s.write(testData);
      final byte[] r = bos.toByteArray();
      s.close();

      bos = new ByteArrayOutputStream();
      s = getOutputStream(bos);
      s.write(testData);
      byte[] rr = bos.toByteArray();
      assertEquals("Length variation", r.length, rr.length);
      for (int i = 0; i < r.length; ++i) {
        assertEquals("Byte level inequality", r[i], rr[i]);
      }
      s.close();

      bos = new ByteArrayOutputStream();
      s = getOutputStream(bos);
      for (final byte d : testData) {
        s.write(d);
      }
      rr = bos.toByteArray();
      assertEquals("Length variation", r.length, rr.length);
      for (int i = 0; i < r.length; ++i) {
        assertEquals("Byte level inequality", r[i], rr[i]);
      }
      s.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }

}

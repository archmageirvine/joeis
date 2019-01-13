package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import junit.framework.TestCase;

/**
 * Provides some tests which every FilterInputStream should pass.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractFilterInputStreamTest extends TestCase {

  // implemented in subclasses to provide streams
  public abstract InputStream getInputStream(final InputStream s) throws IOException;

  public abstract OutputStream getOutputStream(final OutputStream s);

  public abstract byte[] getTestStream();

  /** Test it is indeed a FilterInputStream.  */
  public void testInstanceOf() {
    try {
      assertTrue(getInputStream(new ByteArrayInputStream(new byte[0])) instanceof FilterInputStream);
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }

  /** Tests the <code>equals()</code> method.  */
  public void testEquals() {
    try {
      final InputStream s = getInputStream(new ByteArrayInputStream(new byte[0]));
      assertTrue("Reflextivity of equality", s.equals(s));
      assertTrue("Null comparison", !s.equals(null));
      final Object junk = new Object();
      assertTrue("Non instance", !s.equals(junk));
      assertTrue("Non instance", !junk.equals(s));
      InputStream t = new ByteArrayInputStream(new byte[1]);
      assertTrue("IS test", !s.equals(t));
      assertTrue("IS test", !t.equals(s));
      t = getInputStream(t);
      assertTrue("self type test", !s.equals(t));
      assertTrue("self type test", !t.equals(s));
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }

  /** Tests the <code>hashCode()</code> method.  */
  public void testHashcode() {
    try {
      final InputStream s = getInputStream(new ByteArrayInputStream(new byte[0]));
      assertEquals("Reflexive hashcode", s.hashCode(), s.hashCode());
      final Object junk = new Object();
      assertTrue("Hashcode", s.hashCode() != junk.hashCode());
      final ByteArrayInputStream t = new ByteArrayInputStream(new byte[1]);
        assertTrue("Hashcode", s.hashCode() != t.hashCode());
        final InputStream t2 = getInputStream(t);
        assertTrue("Hashcode", s.hashCode() != t2.hashCode());
        t2.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }

  /** Tests <code>close()</code> functionality.  */
  public void testReadPastClose() {
    try {
      final byte[] testData = getTestStream();
      final InputStream s = getInputStream(new ByteArrayInputStream(testData));
      s.close();
      try {
        s.read();
        fail("Read past close");
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
      final byte[] testData = getTestStream();
      final InputStream s = getInputStream(new ByteArrayInputStream(testData));
      s.close();
      s.close();
      s.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Test skip() functionality.  */
  public void testStrangeSkip() {
    try {
      final byte[] testData = getTestStream();
      InputStream s = getInputStream(new ByteArrayInputStream(testData));
      assertEquals("0 skip ok", 0L, s.skip(0L));
      assertEquals("0 skip ok", 0L, s.skip(-1L));
      assertEquals("0 skip ok", 0L, s.skip(-100L));
      final long length = s.skip(Long.MAX_VALUE);
      s.close();
      s = getInputStream(new ByteArrayInputStream(testData));
      assertEquals("over-skip on re-read", length, s.skip(length + 1L));
      s.close();
      try {
        assertEquals(0, s.skip(1L));
        fail("Permitted skip on closed stream");
      } catch (final IOException e) {
        // ok
      }
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Test read functionality.  */
  public void testReadConsistency() {
    try {
      final byte[] testData = getTestStream();
      int sum = 0;
      int reads = 0;
      int v;
      InputStream s = getInputStream(new ByteArrayInputStream(testData));
      try {
        while ((v = s.read()) != -1) {
          reads += 1;
          sum += v;
        }
      } finally {
        s.close();
      }
      final byte[] data = new byte[reads];
      s = getInputStream(new ByteArrayInputStream(testData));
      int sum2 = 0;
      try {
        for (int i = 0; i < reads; ++i) {
          v = s.read();
          assertTrue("Premature end of input", v != -1);
          sum2 += v;
          data[i] = (byte) v;
        }
        v = s.read();
        assertEquals("Postmature end of input", -1, v);
        assertEquals("Data simple sum failure", sum, sum2);
      } finally {
        s.close();
      }
      s = getInputStream(new ByteArrayInputStream(testData));
      try {
        for (int i = 0; i < reads; i += 2) {
          v = s.read();
          if (i + 1 < reads) {
            assertEquals("skip failure", 1L, s.skip(1L));
          }
          assertTrue("Premature end of input", v != -1);
          assertEquals("Byte failure", data[i], (byte) v);
        }
      } finally {
        s.close();
      }
      s = getInputStream(new ByteArrayInputStream(testData));
      final byte[] t = new byte[reads * 3 + 1];
      try {
        assertEquals("read[] over-read", reads, s.read(t));
        for (int i = 0; i < reads; ++i) {
          assertEquals("Byte failure", data[i], t[i]);
        }
      } finally {
        s.close();
      }
      s = getInputStream(new ByteArrayInputStream(testData));
      try {
        assertEquals("read[] over-read", reads, s.read(t, 0, t.length));
        assertEquals("post-read", -1, s.read(new byte[10], 0, 10));
        for (int i = 0; i < reads; ++i) {
          assertEquals("Byte failure", data[i], t[i]);
        }
      } finally {
        s.close();
      }
      s = getInputStream(new ByteArrayInputStream(testData));
      try {
        assertEquals("read[] over-read", reads, s.read(t, 3, 2 * reads));
        for (int i = 0; i < reads; ++i) {
          assertEquals("Byte failure", data[i], t[i + 3]);
        }
      } finally {
        s.close();
      }
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /**
   * If a corresponding OutputStream is available then test idempotence
   * of reading and writing.
   */
  public void testIdempotence() {
    try {
      final byte[] testData = getTestStream();
      final ByteArrayOutputStream bo = new ByteArrayOutputStream();
      final OutputStream out = getOutputStream(bo);
      if (out == null) {
        return; // test not supported
      }
      try {
        out.write(testData);
      } finally {
        out.close();
      }
      final InputStream in = getInputStream(new ByteArrayInputStream(bo.toByteArray()));
      final byte[] compare = new byte[testData.length];
      assertEquals("Length mismatch", compare.length, in.read(compare));
      for (int i = 0; i < compare.length; ++i) {
        assertEquals("Idempotence failure (offset " + i + ")", testData[i], compare[i]);
      }
      in.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Try invoking reset() without calling mark()  */
  public void testResetWithoutMark() {
    try {
      final byte[] testData = getTestStream();
      try (InputStream s = getInputStream(new ByteArrayInputStream(testData))) {
        if (s.markSupported()) {
          try {
            s.reset();
            fail("Accepted reset without mark");
          } catch (final IOException e) {
            // ok
          }
        }
      }
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** Test the available() method is positive.  */
  public void testAvailable() {
    try {
      final byte[] testData = getTestStream();
      final InputStream s = getInputStream(new ByteArrayInputStream(testData));
      for (int i = 0; i < testData.length; ++i) {
        assertTrue(s.available() >= 0);
        s.read();
      }
      s.close();
      try {
        s.available();
        fail("avail on closed stream");
      } catch (final IOException e) {
        // ok
      }
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  /** If marking is supported test the mark() method  */
  public void testMark() {
    try {
      final byte[] testData = getTestStream();
      InputStream s = getInputStream(new ByteArrayInputStream(testData));
      if (s.markSupported()) {
        for (int i = 0; i < testData.length; ++i) {
          s.mark(1);
          final int v = s.read();
          assertTrue("premature EOS", v != -1);
          s.reset();
          assertEquals("reset failed", v, s.read());
        }
        s.close();
        s = getInputStream(new ByteArrayInputStream(testData));
        for (int i = 0; i < testData.length; ++i) {
          s.mark(2);
          final int v = s.read();
          assertTrue("premature EOS", v != -1);
          s.reset();
          assertEquals("reset failed", v, s.read());
        }
        s.close();
        s = getInputStream(new ByteArrayInputStream(testData));
        for (int i = 0; i < testData.length - 1; ++i) {
          s.mark(2);
          final int v = s.read();
          assertTrue("premature EOS", v != -1);
          assertTrue("premature EOS", s.read() != -1);
          s.reset();
          assertEquals("reset failed", v, s.read());
        }
      }
      s.close();
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }
}

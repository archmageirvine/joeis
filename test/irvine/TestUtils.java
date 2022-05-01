package irvine;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Locale;

import irvine.math.c.C;
import junit.framework.Assert;

/**
 * Functions purely used to assist in testing.
 *
 * @author Sean A. Irvine
 * @author John G. Cleary
 * @author Len Trigg
 */
public final class TestUtils {

  private TestUtils() {
  }

  private static void myFailNotEquals(final String message, final Object expected, final Object actual) {
    String formatted = "";
    if (message != null) {
      formatted = message + " ";
    }
    Assert.fail(formatted + "expected:<" + expected + "> but was:<" + actual + ">");
  }

  /**
   * Get around a bug in <code>assertEquals</code> in JUnit 3.3 to 3.5.
   * This version correctly compares two NaNs or two Infinities as equal.
   * Asserts that two doubles are equal.
   *
   * @param message  the detail message for this assertion
   * @param expected the expected value of an object
   * @param actual   the actual value of an object
   * @param delta    tolerated delta
   */
  public static void assertEqualsLocal(final String message, final double expected, final double actual, final double delta) {
    // Carefully check for special numbers
    // The line below was used in version 3.4 but is incorrectly
    // optimized to Math.abs(expected-actual) > delta by both the jikes and javac compilers.
    // if (!(Math.abs(expected-actual) <= delta))
    // Because comparison with NaN always returns false
    final boolean ok;
    if (Double.isNaN(expected)) {
      ok = Double.isNaN(actual);
    } else if (Double.isInfinite(expected)) {
      ok = Double.isInfinite(actual) && !(expected < 0.0) ^ (actual < 0.0);
    } else {
      ok = Math.abs(expected - actual) <= delta;
    }
    if (!ok) {
      myFailNotEquals(message, expected, actual);
    }
  }

  /**
   * Get around a bug in <code>assertEquals</code> in JUnit 3.3 to 3.5.
   * This version correctly compares two NaNs or two Infinities as equal.
   * Asserts that two doubles are equal.
   *
   * @param expected the expected value of an object
   * @param actual   the actual value of an object
   * @param delta    tolerated delta
   */
  public static void assertEqualsLocal(final double expected, final double actual, final double delta) {
    assertEqualsLocal("", expected, actual, delta);
  }

  /**
   * Test standard properties of an Enum.  Checks that the string
   * representation of the Enum elements matches the expected
   * representation.  Checks the ordinal values match their position
   * in the values() array.  Checks the <code>valueOf()</code> method functions
   * correctly.
   *
   * @param clazz            the class of the Enum to test
   * @param expectedToString the expected output of the array representation of the Enum
   * @param <T>              type of Enum
   */
  public static <T extends Enum<T>> void testEnum(final Class<T> clazz, final String expectedToString) {
    // Check toString of values
    AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
      try {
        Method m = clazz.getMethod("values");
        m.setAccessible(true);
        @SuppressWarnings("unchecked")
        final Enum<T>[] r = (Enum<T>[]) m.invoke(null);
        Assert.assertEquals(expectedToString, Arrays.toString(r));
        m = clazz.getMethod("valueOf", String.class);
        m.setAccessible(true);
        // Check ordinal and valueOf
        for (int i = 0; i < r.length; ++i) {
          Assert.assertEquals(i, r[i].ordinal());
          Assert.assertEquals(r[i], m.invoke(null, r[i].toString()));
          Assert.assertEquals(Enum.valueOf(clazz, r[i].toString()), r[i]);
        }
      } catch (final RuntimeException e) {
        throw e;
      } catch (final Exception e) {
        throw new RuntimeException(e);
      }
      return null;
    });
  }

  /**
   * Test standard properties of an Enum.  Checks that the string
   * representation of the Enum elements matches the expected
   * representation.  Checks the ordinal values match their position
   * in the values() array.  Checks the <code>valueOf()</code> method functions
   * correctly.
   * Forces capitalization during reverse lookup. This
   * allows for testing of some cases where the <code>toString()</code>
   * method is overridden.
   *
   * @param clazz            the class of the Enum to test
   * @param expectedToString the expected output of the array representation of the Enum
   * @param <T>              type of Enum
   */
  public static <T extends Enum<T>> void testEnumForceUpper(final Class<T> clazz, final String expectedToString) {
    // Check toString of values
    AccessController.doPrivileged((PrivilegedAction<Object>) () -> {
      try {
        Method m = clazz.getMethod("values");
        m.setAccessible(true);
        @SuppressWarnings("unchecked")
        final Enum<T>[] r = (Enum<T>[]) m.invoke(null);
        Assert.assertEquals(expectedToString, Arrays.toString(r));
        m = clazz.getMethod("valueOf", String.class);
        m.setAccessible(true);
        // Check ordinal and valueOf
        for (int i = 0; i < r.length; ++i) {
          Assert.assertEquals(i, r[i].ordinal());
          Assert.assertEquals(r[i], m.invoke(null, r[i].toString().toUpperCase(Locale.getDefault())));
          Assert.assertEquals(Enum.valueOf(clazz, r[i].toString().toUpperCase(Locale.getDefault())), r[i]);
        }
      } catch (final RuntimeException e) {
        throw e;
      } catch (final Exception e) {
        throw new RuntimeException(e);
      }
      return null;
    });
  }

  /**
   * Writes the contents of the given input <code>stream</code> to the given
   * file.
   *
   * @param stream an <code>InputStream</code>
   * @param file   a <code>File</code> to write to
   * @return a <code>File</code> containing the contents of the stream
   * @throws IOException          if an error occurs.
   * @throws NullPointerException if the stream is null
   */
  public static File streamToFile(final InputStream stream, final File file) throws IOException {
    if (stream == null) {
      throw new NullPointerException("null stream given");
    }
    if (file == null) {
      throw new NullPointerException("null file given");
    }
    try (FileOutputStream out = new FileOutputStream(file)) {
      final byte[] b = new byte[16384];
      int len = stream.read(b);
      while (len != -1) {
        out.write(b, 0, len);
        len = stream.read(b);
      }
    }
    return file;
  }

  /**
   * Creates a file copying the byte array <code>content</code> to it.
   *
   * @param content a array of <code>byte</code>s
   * @param file    a <code>File</code> to write to
   * @return a <code>File</code> containing the byte array content
   * @throws IOException          if an error occurs.
   * @throws NullPointerException if the content is null
   */
  public static File byteArrayToFile(final byte[] content, final File file) throws IOException {
    if (content == null) {
      throw new NullPointerException("null array of bytes given");
    }
    if (file == null) {
      throw new NullPointerException("null file given");
    }
    try (final FileOutputStream out = new FileOutputStream(file)) {
      out.write(content);
    }
    return file;
  }

  /**
   * Creates a file copying the string <code>content</code> to it.
   *
   * @param content a <code>String</code>
   * @param file    a <code>File</code> to write to
   * @return a <code>File</code> containing the string content
   * @throws IOException          if an error occurs.
   * @throws NullPointerException if the content is null
   */
  public static File stringToFile(final String content, final File file) throws IOException {
    if (content == null) {
      throw new NullPointerException("null string given");
    }
    return byteArrayToFile(content.getBytes(), file);
  }

  /**
   * Convenience method for turning a resource into a file that can be used as input.
   *
   * @param resource name (classpath) of the resource.
   * @param file     a <code>File</code> to write to
   * @return a <code>File</code> containing the string content (same as <code>file</code>).
   * @throws IOException if an error occurs
   */
  public static File resourceToFile(final String resource, final File file) throws IOException {
    try (InputStream stream = TestUtils.class.getClassLoader().getResourceAsStream(resource)) {
      return streamToFile(stream, file);
    }
  }

  /**
   * Creates a new empty directory in the specified directory, using the given
   * prefix and suffix strings to generate its name.
   *
   * @param prefix    The prefix string to be used in generating the file's name;
   *                  must be at least three characters long
   * @param suffix    The suffix string to be used in generating the file's name;
   *                  may be null, in which case the suffix "<code>.tmp</code>" will be used
   * @param directory The directory in which the file is to be created, or null
   *                  if the default temporary-file directory is to be used
   * @return An abstract pathname denoting a newly-created empty directory
   * @throws IOException              If a directory could not be created
   * @throws IllegalArgumentException If the prefix argument contains fewer
   *                                  than three characters
   * @throws SecurityException        If a security manager exists and its
   *                                  <code>SecurityManager.checkWrite(java.lang.String</code>) method does not allow a file
   *                                  to be created
   */
  public static File createTempDir(final String prefix, final String suffix, final File directory) throws IOException {
    final File dir = File.createTempFile(prefix, suffix, directory);
    if (!dir.delete()) {
      throw new IOException("Could not create directory: " + dir);
    }
    if (!dir.mkdir()) {
      throw new IOException("Could not create directory: " + dir);
    }
    return dir;
  }

  /**
   * Creates an empty directory in the default temporary-file directory, using
   * the given prefix and suffix to generate its name. Invoking this method is
   * equivalent to invoking <code>createTempDir(prefix, suffix, null)</code>.
   *
   * @param prefix The prefix string to be used in generating the file's name;
   *               must be at least three characters long
   * @param suffix The suffix string to be used in generating the file's name;
   *               may be null, in which case the suffix "<code>.tmp</code>" will be used
   * @return An abstract pathname denoting a newly-created empty directory
   * @throws IOException              If a directory could not be created
   * @throws IllegalArgumentException If the prefix argument contains fewer
   *                                  than three characters
   * @throws SecurityException        If a security manager exists and its
   *                                  <code>SecurityManager.checkWrite(java.lang.String)</code> method does not allow a file
   *                                  to be created
   */
  public static File createTempDir(final String prefix, final String suffix) throws IOException {
    return createTempDir(prefix, suffix, null);
  }

  /**
   * Comparison of complex numbers.
   *
   * @param expected  expected number
   * @param actual    actual number
   * @param tolerance accuracy
   */
  public static void assertEquals(final C expected, final C actual, final double tolerance) {
    if (!expected.equals(actual, tolerance)) {
      Assert.fail("Expected " + expected + " but was " + actual);
    }
  }

  private static final String LS = System.lineSeparator();

  /**
   * Check that a number of strings are contained in str.
   *
   * @param str  string to be checked.
   * @param subs all the items that should be in the string.
   */
  public static void containsAll(final String str, final String... subs) {
    boolean ok = true;
    final StringBuilder sb = new StringBuilder();
    for (final String sub : subs) {
      if (!str.contains(sub)) {
        sb.append('\'').append(sub).append("' was not contained in:").append(str).append(LS);
        ok = false;
      }
      Assert.assertTrue(sb.toString(), ok);
    }
  }
}


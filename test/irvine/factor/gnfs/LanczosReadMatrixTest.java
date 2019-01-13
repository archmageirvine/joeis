package irvine.factor.gnfs;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.TestUtils;
import irvine.util.array.DynamicIntArray;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LanczosReadMatrixTest extends TestCase {

  public void testLoad() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try (final DataOutputStream dos = new DataOutputStream(bos)) {
      dos.writeInt(Integer.reverseBytes(2));
      dos.writeInt(Integer.reverseBytes(5));
      dos.writeInt(Integer.reverseBytes(6));
      dos.writeInt(Integer.reverseBytes(1));
      dos.writeInt(Integer.reverseBytes(3));
      dos.writeInt(Integer.reverseBytes(2));
      dos.writeInt(Integer.reverseBytes(3));
      dos.writeInt(Integer.reverseBytes(6));
    }
    final DynamicIntArray rows = new DynamicIntArray();
    final DynamicIntArray cols = new DynamicIntArray();
    final Lanczos m = LanczosReadMatrix.loadMatrix(new ByteArrayInputStream(bos.toByteArray()), rows, cols);
    assertEquals("[0, 0, 0, 2, 0, 1, 2]", Arrays.toString(rows.toArray()));
    assertEquals("[2, 1, 2]", Arrays.toString(cols.toArray()));
    assertEquals(3, m.mNCols);
    assertEquals(7, m.mNRows);
  }

  // this is a pretty crappy test
  public void testRead() throws IOException {
    final File matFile = File.createTempFile("junit", ".mat");
    try {
      try (final DataOutputStream dos = new DataOutputStream(new FileOutputStream(matFile))) {
        dos.writeInt(Integer.reverseBytes(2));
        dos.writeInt(Integer.reverseBytes(5));
        dos.writeInt(Integer.reverseBytes(6));
        dos.writeInt(Integer.reverseBytes(1));
        dos.writeInt(Integer.reverseBytes(3));
        dos.writeInt(Integer.reverseBytes(2));
        dos.writeInt(Integer.reverseBytes(3));
        dos.writeInt(Integer.reverseBytes(6));
      }
      try (final ByteArrayOutputStream bos = new ByteArrayOutputStream();
           final PrintStream out = new PrintStream(bos)) {
        LanczosReadMatrix.readReduceMatrix(matFile.getPath(), out);
        out.flush();
        final String s = bos.toString();
        //System.out.println(s);
        TestUtils.containsAll(s,
          "3 * 3, wt=5",
          "0 * 0, wt=0",
          "Blocks: 1 * 1",
          "Dense: 1 (0), Sparse: 0 (0)",
          "Matrix-Bytes: 4",
          "reduced matrix: 0 * 0"
        );
      }
    } finally {
      assertTrue(matFile.delete());
    }
  }

}

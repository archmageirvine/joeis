package irvine.math.matrix;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Random;

import irvine.math.api.Matrix;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MatrixIOTest extends TestCase {

  public void testAsciiIO() throws Exception {
    final Matrix<Boolean> m = BinaryMatrixFactory.create(120, 17);
    final Random r = new Random();
    for (int k = 0; k < 120 * 17 / 2; ++k) {
      m.set(r.nextInt(120), r.nextInt(17), Boolean.TRUE);
    }
    final File f = new File("mxtest.out");
    try {
      try (final FileOutputStream os = new FileOutputStream(f)) {
        MatrixIO.save(m, os, MatrixIO.MatrixFileFormat.ASCII);
      }
      try (final FileInputStream is = new FileInputStream(f)) {
        final Matrix<Boolean> mm = MatrixIO.load(is);
        assertEquals(m.cols(), mm.cols());
        assertEquals(m.rows(), mm.rows());
        for (int k = 0; k < m.rows(); ++k) {
          for (int j = 0; j < m.cols(); ++j) {
            assertEquals(m.get(k, j), mm.get(k, j));
          }
        }
      }
    } finally {
      assertTrue(f.delete());
    }
  }

}

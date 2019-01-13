package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Tests the PMinusOne factoring algorithm
 *
 * @author Sean A. Irvine
 *
 */
public class PMinusOneTest extends AbstractFactorTest {

  /** Standard requirements for JUnit */

  @Override
  public void setUp() {
    mF = new PMinusOne(1000L, 10000L);
  }

  public void testStage1() {
    final PMinusOne pm1 = new PMinusOne(11L, 300L);
    pm1.setVerbose(true);
    final ByteArrayOutputStream bError = new ByteArrayOutputStream();
    final PrintStream pErr = new PrintStream(bError);
    final PrintStream oldErr = System.err;
    try {
      System.setErr(pErr);
      final Z n = Z.valueOf(1081);
      final FactorSequence fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      pm1.factor(fs, n);
      assertEquals(2, fs.omega());
    } finally {
      System.setErr(oldErr);
      pErr.flush();
      pErr.close();
    }
    final String s = bError.toString();
    assertTrue(s.contains("Stage 1 took"));
    assertFalse(s.contains("Stage 2 took"));
    assertTrue(s.contains("Found factor: "));
    assertTrue(s.contains(" ms"));
  }

  public void testStage2() {
    final PMinusOne pm1 = new PMinusOne(5L, 300L);
    pm1.setVerbose(true);
    final ByteArrayOutputStream bError = new ByteArrayOutputStream();
    final PrintStream pErr = new PrintStream(bError);
    final PrintStream oldErr = System.err;
    try {
      System.setErr(pErr);
      final Z n = Z.valueOf(1081);
      final FactorSequence fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      pm1.factor(fs, n);
      assertEquals(2, fs.omega());
    } finally {
      System.setErr(oldErr);
      pErr.flush();
      pErr.close();
    }
    final String s = bError.toString();
    assertTrue(s.contains("Stage 1 took"));
    assertTrue(s.contains("Stage 2 took"));
    assertTrue(s.contains(" ms"));
  }

  public void testOverFind() {
    final PMinusOne pm1 = new PMinusOne(100L, 100L);
    pm1.setVerbose(true);
    final ByteArrayOutputStream bError = new ByteArrayOutputStream();
    final PrintStream pErr = new PrintStream(bError);
    final PrintStream oldErr = System.err;
    try {
      System.setErr(pErr);
      final Z n = Z.valueOf(1081);
      final FactorSequence fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      pm1.factor(fs, n);
      assertEquals(1, fs.omega());
      assertEquals("[1081]", fs.toString().trim());
    } finally {
      System.setErr(oldErr);
      pErr.flush();
      pErr.close();
    }
    final String s = bError.toString();
    assertTrue(s.contains("Found n as a factor, retry with smaller B1 bound"));
    assertTrue(s.contains("Stage 1 took"));
    assertTrue(s.contains(" ms"));
  }

  public void testPMinusOneHarder() {
    final PMinusOne pm1 = new PMinusOne(1000L, 200000L);
    pm1.setVerbose(true);
    final ByteArrayOutputStream bError = new ByteArrayOutputStream();
    final PrintStream pErr = new PrintStream(bError);
    final PrintStream oldErr = System.err;
    try {
      System.setErr(pErr);
      Z n = new Z("10000004400000259");
      FactorSequence fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      pm1.factor(fs, n);
      assertEquals(2, fs.omega());
      assertTrue(fs.toString().contains("100000007"));
      n = new Z("100000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000027100001897");
      fs = new FactorSequence();
      fs.add(n, FactorSequence.COMPOSITE);
      pm1.factor(fs, n);
      assertEquals(2, fs.omega());
      assertTrue(fs.toString().contains("100000007"));
    } finally {
      System.setErr(oldErr);
      pErr.flush();
      pErr.close();
    }
    final String s = bError.toString();
    assertTrue(s.contains("Stage 1 took"));
    assertTrue(s.contains("Stage 2 took"));
    assertTrue(s.contains("Product has"));
    assertTrue(s.contains(" bits took "));
    assertTrue(s.contains(" ms"));
  }

  public void testPMinusOneHarder2() {
    final PMinusOne pm1 = new PMinusOne(200000L, 200000L);
    final Z n = new Z("10000004400000259");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("100000007"));
  }

  /*
  public void testPMinusOneHarder3() {
    // use a p-1 case found by Richard Heylen
    PMinusOne pm1 = new PMinusOne(20000000, 50000000);
    final Z n = new Z("170774195619962197746845327539420344063045114147713008441710215519774388256801253758482061337681448755885213504794407112508919701258004192401");
    FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.getNumberOfDistinctFactors());
    assertTrue(fs.toString().indexOf("34833953933150480441305582629703303") != -1);
  }
  */

}

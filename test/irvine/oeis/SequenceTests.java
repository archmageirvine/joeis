package irvine.oeis;

import java.util.Enumeration;
import java.util.Vector;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Test every sequence having an implementation.
 * @author Sean A. Irvine
 */
public class SequenceTests extends TestSuite {

  public static Test suite() {
    return new SequenceTests();
  }

  @Override
  public Enumeration tests() {
    final Vector<Test> tests = new Vector<>();
    try (ScanResult scanResult = new ClassGraph().whitelistPackages("irvine.oeis").scan()) {
      for (ClassInfo routeClassInfo : scanResult.getClassesImplementing("irvine.oeis.Sequence")) {
        if (routeClassInfo.getName().matches(".*A[0-9]{6}")) {
          tests.add(new AbstractSequenceTest(routeClassInfo.getName()));
        }
      }
    }
    return tests.elements();
  }

  /**
   * Run the unit tests for every sequence with an implementation.
   * @param args ignored
   */
  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

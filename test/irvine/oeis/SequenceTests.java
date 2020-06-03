package irvine.oeis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

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
  public Enumeration<?> tests() {
    final ArrayList<Test> tests = new ArrayList<>();
    try (ScanResult scanResult = new ClassGraph().whitelistPackages("irvine.oeis").scan()) {
      for (ClassInfo routeClassInfo : scanResult.getAllClasses()) {
        if (routeClassInfo.getName().matches(".*A[0-9]{6}")) {
          tests.add(new AbstractSequenceTest(routeClassInfo.getName()));
        }
      }
    }
    return Collections.enumeration(tests);
  }

  /**
   * Run the unit tests for every sequence with an implementation.
   * @param args ignored
   */
  public static void main(final String[] args) {
    junit.textui.TestRunner.run(suite());
  }
}

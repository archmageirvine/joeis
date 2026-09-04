package irvine.oeis.a399;

import irvine.oeis.a182.A182012;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A399438 allocated for Pawe\u0142 Kwaczy\u0144ski.
 * @author Sean A. Irvine
 */
public class A399438 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A399438() {
    super(1, new A182012());
  }
}


package irvine.oeis.a398;

import irvine.oeis.a080.A080035;

/**
 * A080035.
 * @author Sean A. Irvine
 */
public class A398558 extends A080035 {

  @Override
  protected String getString(final long n) {
    return new StringBuilder().append(n).reverse().toString();
  }
}

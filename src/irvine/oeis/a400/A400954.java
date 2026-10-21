package irvine.oeis.a400;

/**
 * A400954 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A400954 extends A400950 {

  @Override
  protected long bsum(final int i) {
    return 1L << (i - 1);
  }
}

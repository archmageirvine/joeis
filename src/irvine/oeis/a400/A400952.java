package irvine.oeis.a400;

/**
 * A400952 allocated for David Cleaver.
 * @author Sean A. Irvine
 */
public class A400952 extends A400950 {

  @Override
  protected long bsum(final int i) {
    return (long) i * i;
  }
}

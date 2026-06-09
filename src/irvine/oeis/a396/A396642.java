package irvine.oeis.a396;

/**
 * A396642 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A396642 extends A396647 {

  @Override
  protected boolean accept(final long area) {
    return area >= 2 && (area & 1) == 0;
  }
}

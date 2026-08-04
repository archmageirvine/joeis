package irvine.oeis.a395;
// manually 2026-08-04/trinv at 2026-08-04 06:27

import irvine.oeis.a126.A126216;
import irvine.oeis.triangle.Inverse;
import irvine.oeis.triangle.PrependColumn;

/**
 * A395975 Triangle read by rows: matrix inverse of triangle A126216 with a left unit column adjoined.
 * @author Georg Fischer
 */
public class A395975 extends PrependColumn {

  /** Construct the sequence. */
  public A395975() {
    super(0, new Inverse(0, new A126216()));
  }
}

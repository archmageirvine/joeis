package irvine.oeis.a399;

import irvine.oeis.FiniteSequence;

/**
 * A399612 Labels of successive landing squares of a rook on the Ulam spiral, starting at 2 and repeatedly moving to the smallest prime reachable without revisiting or passing over an earlier landing square.
 * @author Sean A. Irvine
 */
public class A399612 extends FiniteSequence {

  /** Construct the sequence. */
  public A399612() {
    super(1, FINITE, 2, 3, 5, 7, 41, 37, 31, 29, 521, 509, 331, 103, 101, 97, 181, 173, 43, 47, 83, 89, 179, 641, 631, 211, 197, 191, 193, 1429, 1409, 1091, 937, 941, 107, 109, 337, 499, 487, 307, 293, 113, 349, 347, 2953, 2917, 2879, 443, 353, 359, 953, 947, 2999, 2971, 2957, 709, 719, 727, 1093, 1097, 1103, 449, 457, 461, 463, 467, 479, 1163, 1171, 1181, 503);
  }
}

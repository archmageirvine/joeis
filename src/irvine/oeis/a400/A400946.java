package irvine.oeis.a400;

import irvine.oeis.gf.GfSequence;

/**
 * A400946 Squares visited by knight moves on a diagonally numbered Q1 board and always taking the available unvisited square with the shortest distance to the bisecting line of Q1. In the case of a tie, first squares with the smaller row index are preferred, second the square with larger column index is preferred. Starting square is labeled 1.
 * @author Sean A. Irvine
 */
public class A400946 extends GfSequence {

  /** Construct the sequence. */
  public A400946() {
    super(1, "x*(1+7*x+17*x^2-16*x^3-5*x^4-x^5+10*x^6-11*x^7+8*x^8+6*x^9-5*x^10+4*x^11+x^12-3*x^13-34*x^14+35*x^15+4*x^16-2*x^17+72*x^22-72*x^23-2*x^24+2*x^25-36*x^30+36*x^31+x^32-x^33)/((1+x)^2*(1+x^2)^2*(1+x^4)^2*(1-x)^3)");
  }
}

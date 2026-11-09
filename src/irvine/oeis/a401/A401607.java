package irvine.oeis.a401;

import irvine.oeis.FiniteSequence;

/**
 * A401607 Squares visited by a knight moving on a diagonally numbered Q1 board and always taking the available unvisited square with the shortest distance to the bisecting line of Q1. In the case of a tie, first squares with the shortest Euclidean distance to the starting square (1,1) are preferred, second the square with smaller row index is preferred. Starting square is labeled 1.
 * @author Sean A. Irvine
 */
public class A401607 extends FiniteSequence {

  /** Construct the sequence. */
  public A401607() {
    super(1, FINITE, 1, 8, 25, 9, 4, 3, 13, 2, 6, 19, 5, 18, 41, 72, 113, 73, 42, 32, 61, 33, 14, 34, 62, 50, 85, 51, 26, 10, 27, 52, 86, 98, 145, 99, 84, 128, 181, 129, 112, 162, 221, 163, 114, 74, 43, 20, 28, 53, 87, 130, 182, 200, 265, 201, 146, 100, 63, 35, 15);
  }
}


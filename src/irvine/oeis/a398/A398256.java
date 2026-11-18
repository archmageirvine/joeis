package irvine.oeis.a398;

/**
 * A398256 Number of digraphs on n unlabeled nodes with self-loops allowed and distinguished nodes r and t (r = t if n = 1, else r != t) such that every node is reachable from r and t is reachable from every node, counted up to isomorphism fixing r and t.
 * @author Gregory Morse
 */
public class A398256 extends A398207 {

  /** Construct the sequence. */
  public A398256() {
    super(true);
  }
}

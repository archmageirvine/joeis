package irvine.games;

import java.util.Set;
import java.util.TreeSet;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Connect4BoardTest extends TestCase {

  public void test() {
    final short[] board = {0b000010011001100110, 0, 0, 0, 0, 0};
    final Connect4Board b = new Connect4Board(board, false);
    assertEquals(b, new Connect4Board(b.dense()));
    assertTrue(b.isLeast());
    b.reflect();
    assertEquals("266600000000000000000000<", b.dense());
    for (int k = 0; k < 7; ++k) {
      assertFalse(Connect4Board.isFinished(board, 0, k));
    }
  }

  public void testStep() {
    final Set<Connect4Board> h = new TreeSet<>();
    new Connect4Board().step(h, 0b01);
    assertEquals(4, h.size());
  }

  public void testFinished() {
    final Connect4Board b = new Connect4Board("555555000000000000000000!<");
    assertTrue(b.isFinished());
    final Set<Connect4Board> h = new TreeSet<>();
    b.step(h, 0b01);
    assertTrue(h.isEmpty());
  }
}

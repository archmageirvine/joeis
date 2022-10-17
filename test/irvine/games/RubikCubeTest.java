package irvine.games;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RubikCubeTest extends TestCase {

  public void testMoves() {
    final RubikCube cube = new RubikCube();
    assertTrue(cube.isIdentity());
    for (final RubikCube.RubikMove move : RubikCube.RubikMove.values()) {
      final String s = move.toString();
      cube.apply(move);
      assertFalse(s, cube.isIdentity());
      cube.apply(move);
      assertFalse(s, cube.isIdentity());
      cube.apply(move);
      assertFalse(s, cube.isIdentity());
      cube.apply(move);
      assertTrue(s, cube.isIdentity());
    }
  }
}


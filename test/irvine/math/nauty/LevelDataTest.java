package irvine.math.nauty;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LevelDataTest extends TestCase {

  public void test() {
    final LevelData ld = new LevelData();
    ld.prepareLevelData(false, 6, 22, 2);
    assertEquals("[0, 1, 7, 22, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(ld.mXStart));
    assertEquals("[0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", Arrays.toString(ld.mXX));
    assertEquals("[0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2]", Arrays.toString(ld.mXCard));
    assertEquals("[0, 1, 2, 4, 8, 16, 32, 3, 5, 6, 9, 10, 12, 17, 18, 20, 24, 33, 34, 36, 40, 48]", Arrays.toString(ld.mXSet));
    assertEquals("[0, 1, 2, 7, 3, 8, 9, 0, 4, 10, 11, 0, 12, 0, 0, 0, 5, 13, 14, 0, 15, 0, 0, 0, 16, 0, 0, 0, 0, 0, 0, 0, 6, 17, 18, 0, 19, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0, 21, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(ld.mXInv));
  }
}

package irvine.util.bumper;

/**
 * Factory for constructing bumper implementations.
 * @author Sean A. Irvine
 */
public final class BumperFactory {

  private BumperFactory() {
  }

  /**
   * Weakly decreasing bumper.
   * <code>a0 &gt;= a1 &gt;= a2 &gt; = ...</code>
   * For example, with three elements, minimum of 0:
   * <pre>
   *   000
   *   100
   *   110
   *   111
   *   200
   *   201
   *   210
   *   211
   *   220
   *   221
   *   222
   *   ...
   * </pre>
   * @param min minimum element value
   * @param max maximum element value
   * @return bumper
   */
  public static Bumper weaklyDecreasing(final int min, final int max) {
    return new WeaklyDecreasingBumper(min, max);
  }

  /**
   * Weakly increasing bumper.
   * @param max maximum element value
   * @return bumper
   */
  public static Bumper weaklyIncreasing(final int max) {
    return new WeaklyIncreasingBumper(max);
  }

  /**
   * Weakly increasing numbers bumper.
   * Useful to step through integers with weakly increasing digits, but without leading 0's
   * For example, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 111, 112, ..., 200, 202, ...
   * That is, has special treatment for 0.
   * @param max maximum element value
   * @return bumper
   */
  public static Bumper weaklyIncreasingNumbers(final int max) {
    return new WeaklyIncreasingNumberBumper(max);
  }

  /**
   * Weakly decreasing bumper.
   * <code>a0 &gt;= a1 &gt;= a2 &gt; = ...</code>
   * For example, with three elements, minimum of 0:
   * <pre>
   *   000
   *   100
   *   110
   *   111
   *   200
   *   201
   *   210
   *   211
   *   220
   *   221
   *   222
   *   ...
   * </pre>
   * @return bumper
   */
  public static Bumper weaklyDecreasing() {
    return new WeaklyDecreasingBumper(0, Integer.MAX_VALUE);
  }

  /**
   * Range bumper.
   * <code>ai0 &gt;= a1 &gt;= a2 &gt; = ...</code>
   * For example, with three elements, minimum of 0, maximum of 2:
   * <pre>
   *   000
   *   001
   *   002
   *   010
   *   011
   *   012
   *   020
   *   021
   *   022
   *   100
   *   ...
   * </pre>
   * @param min minimum element value
   * @param max maximum element value
   * @return bumper
   */
  public static Bumper range(final int min, final int max) {
    return new RangeBumper(min, max);
  }

  /**
   * Range bumper with individual element limits.
   * @param limits the limits for each element
   * @return bumper
   */
  public static Bumper range(final int[] limits) {
    return new PerElementRangeBumper(limits);
  }

  /**
   * Like <code>range</code> but incrementing the 0th element first.
   * @param min minimum element value
   * @param max maximum element value
   * @return bumper
   */
  public static Bumper leftRange(final int min, final int max) {
    return new LeftRangeBumper(min, max);
  }

  /**
   * Strictly increasing bumper.
   * @param max exclusive maximum element value
   * @return bumper
   */
  public static Bumper increasing(final int max) {
    return new IncreasingBumper(max);
  }

  /**
   * Strictly decreasing bumper.
   * @param min minimum element value
   * @return bumper
   */
  public static Bumper decreasing(final int min) {
    return new DecreasingBumper(min);
  }

  /**
   * Strictly increasing patterns.
   * @return bumper
   */
  public static Bumper patterns() {
    return new PatternBumper();
  }
}

package irvine.oeis;

/**
 * Timing for sequence generation.
 *
 * @author Sean A. Irvine
 */
public final class Timing {

  private Timing() { }

  /**
   * Run timing of sequence generation.
   *
   * @param args ignored
   */
  public static void main(final String[] args) {
    for (int k = 0; k < 1000; ++k) {
      try {
        final String id = "000000" + k;
        final String key = "A" + id.substring(id.length() - 6);
        final Sequence seq = SequenceFactory.sequence(key);
        final long start = System.currentTimeMillis();
        try {
          for (int j = 0; j < 100000; ++j) {
            seq.next();
          }
          System.out.println(key + " " + (System.currentTimeMillis() - start));
        } catch (final OutOfMemoryError e) {
          System.out.println(key + " MEMORY ERROR");
        }
      } catch (final UnimplementedException e) {
        // too bad
      }
    }
  }
}

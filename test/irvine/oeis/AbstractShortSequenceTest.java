package irvine.oeis;

/**
 * Tests the corresponding class.  Deals with some hard sequences
 * where only a small number of terms can be checked.
 *
 * @author Sean A. Irvine
 */
public abstract class AbstractShortSequenceTest extends AbstractSequenceTest {

  @Override
  protected int maxTerms() {
    return 10;
  }
}

package irvine.math.graph;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DummyGraphTest extends AbstractGraphTest {

  @Override
  protected Graph create(final int order) {
    return new SmallGraph(order);
  }
}

package irvine.math.polynomial;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DiscriminantTest extends TestCase {

  public void testDiscriminant() {
    final PolynomialRingField<Z> f = new PolynomialRingField<>(IntegerField.SINGLETON);
    assertEquals(Z.valueOf(10800), Discriminant.discriminant(f, Polynomial.create(1, 2, 3, 4, 5)));
    assertEquals(Z.valueOf(1037232), Discriminant.discriminant(f, Polynomial.create(1, 2, 3, 4, 5, 6)));
    assertEquals(Z.valueOf(-157351936), Discriminant.discriminant(f, Polynomial.create(1, 2, 3, 4, 5, 6, 7)));
  }
}

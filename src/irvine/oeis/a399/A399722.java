package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a060.A060565;
import irvine.oeis.a122.A122458;
import irvine.oeis.a260.A260590;

/**
 * A399722 a(n) = 3^(m-1) + Sum_{i=2..m} 3^(m-i)*2^(d(1)+...d(i-1)) where m=A122458(n) and d(i)=A351122(n,i-1) for 1&lt;=i&lt;m.
 * @author Sean A. Irvine
 */
public class A399722 extends A060565 {

  private final Sequence mA = new A260590();
  private final Sequence mB = new A122458().skip();
  private long mN = 1;

  @Override
  public Z next() {
    mN += 2;
    return super.next().shiftLeft(mA.next().longValueExact()).subtract(Z.THREE.pow(mB.next()).multiply(mN));
  }
}


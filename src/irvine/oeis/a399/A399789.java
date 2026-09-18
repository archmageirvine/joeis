package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399789 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A399789 extends MultiplicativeSequence {

  private static Z t(final Z p) {
    if (p.mod(4) == 3) {
      return Z.ZERO;
    }
    assert p.mod(4) == 1;
    Z b = Z.ZERO;
    while (true) {
      b = b.add(2);
      final Z a2 = p.subtract(b.square());
      final Z[] a = a2.sqrtAndRemainder();
      if (a[1].isZero() && a[0].isOdd() && a[1].add(b).mod(4) == 1) {
        return a[0].multiply2();
      }
    }
  }

  /** Construct the sequence. */
  public A399789() {
    super(1, (p, e) -> {
      if (p.equals(Z.TWO)) {
        return e == 1 ? Z.TWO : Z.THREE.shiftLeft(e - 1);
      }
      return p.pow(e - 1).multiply(p.subtract(t(p)));
    });
  }
}

/*
Multiplicative with a(1)=1, a(2)=2 and a(2^e)=3*2^(e-1) for e>=2.

For an odd prime p and e>=1, a(p^e)=p^(e-1)*(p-t(p)). Here t(p)=0 if p==3 (mod 4). If p==1 (mod 4), write p=A^2+B^2 with B positive and even, A odd, and A+B==1 (mod 4); then t(p)=2*A. The prime trace formula is classical; see Martin and Ono and A278720.

Equivalently for odd p, a(p)=p+Sum_{x=0..p-1} Legendre(x^3-x,p), with Legendre(0,p)=0.
 */

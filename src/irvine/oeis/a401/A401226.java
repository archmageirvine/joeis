package irvine.oeis.a401;

import irvine.oeis.gf.GfSequence;

/**
 * A401226 allocated for Arjun Pemmasani.
 * @author Sean A. Irvine
 */
public class A401226 extends GfSequence {

  /** Construct the sequence. */
  public A401226() {
    super(1, "x*(1 - 11*x + 40*x^2 - 24*x^3 - 177*x^4 + 383*x^5 - 257*x^6 + 163*x^7 + 809*x^8 - 2202*x^9 - 2918*x^10 + 2958*x^11 + 12261*x^12 - 3496*x^13 + 4315*x^14 - 24275*x^15 - 39018*x^16 + 30876*x^17 + 38988*x^18 - 9604*x^19 + 32060*x^20 - 11536*x^21 - 30904*x^22 + 100264*x^23 + 41200*x^24 - 85584*x^25 - 116448*x^26 - 151200*x^27 - 112896*x^28 - 29376*x^29)/((1-3*x)^3*(1+2*x^2)^3*(1-3*x^2)^2*(1+2*x^4)*(1-2*x-2*x^2)^3*(1-2*x^2-2*x^4))");
  }
}


package irvine.factor.factor;

import irvine.factor.prime.Fast;

/**
 * Farting around.
 *
 * @author Sean A. Irvine
 *
 */
final class BuildSmallCheetahTable {

  private BuildSmallCheetahTable() { }

  public static void main(final String[] args) {
    if (args.length == 0) {
      System.err.println("Usage: BuildSmallCheetahTable filename|NONE");
      return;
    }

    final int[] smallPrimes = new int[65535];
    long p = 2;
    final Fast prime = new Fast();
    for (int k = 0; k < smallPrimes.length; ++k) {
      p = prime.nextPrime(p);
      smallPrimes[k] = (int) p;
      if (p == 65521) {
        System.out.println("k = " + k);
      }
    }
    System.out.println("Largest prime in smallPrimes table is " + p);
    final long pp = prime.nextPrime(p);
    final long limit = pp * pp;
    System.out.println("So can certainly factor everything up to " + limit + " = " + Math.log(limit) / Math.log(2) + " bits");
    final long tlen = (limit - 2627641) / 2;
    System.out.println("Proposed table length is " + tlen + " " + ((2 * tlen) / 1024.0 / 1024.0 / 1024.0) + "GB");
  }
}

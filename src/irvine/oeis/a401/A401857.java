package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401857 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A401857 extends Sequence1 {

  // After Alper Ferudun

  // An event for a prime factor arriving at a particular time.
  private static final class Event {
    private final long mPrime;
    private final boolean mRelease;

    private Event(final long prime, final boolean release) {
      mPrime = prime;
      mRelease = release;
    }
  }

  // Incremental prime generator.
  private static class PrimeGenerator {
    private final List<Long> mPrimes = new ArrayList<>();
    private long mCandidate = 2;

    long next() {
      while (true) {
        final long p = mCandidate;
        if (p == 2) {
          mPrimes.add(2L);
          mCandidate = 3;
          return 2;
        }
        boolean prime = true;
        for (final long q : mPrimes) {
          if (q > p / q) {
            break;
          }
          if (p % q == 0) {
            prime = false;
            break;
          }
        }
        mCandidate += 2;
        if (prime) {
          mPrimes.add(p);
          return p;
        }
      }
    }
  }

  // Calendar of future arrivals.
  private final Map<Integer, List<Event>> mCalendar = new HashMap<>();

  // Released primes, in increasing order.
  private final PriorityQueue<Long> mReleased = new PriorityQueue<>();
  private final PrimeGenerator mPrimeGenerator = new PrimeGenerator();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    // Collect factors arriving at this time.
    final List<Long> factors = new ArrayList<>();
    final List<Event> events = mCalendar.remove(mN);
    if (events != null) {
      for (final Event event : events) {
        if (event.mRelease) {
          mReleased.add(event.mPrime);
        } else {
          factors.add(event.mPrime);
        }
      }
    }

    // If nothing arrived, use the smallest released prime,
    // or introduce the next unused prime.
    if (factors.isEmpty()) {
      final Long p = mReleased.poll();
      factors.add(p == null ? mPrimeGenerator.next() : p);
    } else {
      Collections.sort(factors);
    }

    // Compute the product, checking whether its deadline
    // is within the integer indexing horizon.
    final long remaining = Integer.MAX_VALUE - (long) mN;
    long product = 1;
    boolean fits = true;
    for (final long p : factors) {
      if (p > remaining / product) {
        fits = false;
        break;
      }
      product *= p;
    }

    // Schedule the factors for their next arrival.
    if (fits) {
      final int deadline = mN + (int) product;
      final List<Event> scheduled = mCalendar.computeIfAbsent(deadline, k -> new ArrayList<>());
      for (int i = 0; i < factors.size(); ++i) {
        // The smallest prime is retained; all others
        // are released when this event arrives.
        scheduled.add(new Event(factors.get(i), i != 0));
      }
    }

    // Construct the arbitrary-precision term.
    Z result = Z.ONE;
    for (final long p : factors) {
      result = result.multiply(p);
    }
    return result;
  }
}

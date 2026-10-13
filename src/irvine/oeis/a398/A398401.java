package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A398401 Numbers k such that sigma(k) = psi(k) + Omega(k)^7.
 * @author Sean A. Irvine
 */
public class A398401 extends UnionSequence {

  private static final class MySequence extends A000040 {
    private final Z mM;

    /** Construct the sequence. */
    private MySequence(final long m) {
      mM = Z.valueOf(m);
    }

    @Override
    public Z next() {
      while (true) {
        final Z p = super.next();
        if (!mM.mod(p).isZero()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A398401() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1, 472284, 535992, 548232, 586840, 595240, 598136, 615944, 644776, 668536, 683944, 692392, 1205982, 1233522, 1441935, 1484865, 1684287, 1727217, 2976372, 3667750, 3720250, 4005375, 4124625, 4962125, 5174125, 5229625, 5293375, 7327166, 7545314, 9725765, 18093614, 19386015, 19504474, 20223214, 22644303, 25042765, 27582313, 42399190, 44501954, 46585066, 47680665, 49414954, 55462857, 60454465, 61191415, 65878417, 70884942, 78720490, 91568842, 110658865, 120587137, 377708074, 384995922, 467722615, 486232282, 525684687, 539083617, 557544365, 581364685, 594763615, 640319977, 842522494, 872587018, 967433433, 1043310565, 1913517166, 1957618714, 2142600207, 2272454765L, 2394959065L, 25460031138L, 29943558634L, 62293205290L, 64459925474L, 69064205865L, 109265059990L, 126338808318L, 140986786094L, 151057270815L),
      new MySequence(133998),
      new MySequence(137058),
      new MySequence(146710),
      new MySequence(148810),
      new MySequence(149534),
      new MySequence(153986),
      new MySequence(160215),
      new MySequence(161194),
      new MySequence(164985),
      new MySequence(167134),
      new MySequence(170986),
      new MySequence(173098),
      new MySequence(187143),
      new MySequence(191913),
      new MySequence(198485),
      new MySequence(206965),
      new MySequence(209185),
      new MySequence(211735),
      new MySequence(227953)
    );
  }
}


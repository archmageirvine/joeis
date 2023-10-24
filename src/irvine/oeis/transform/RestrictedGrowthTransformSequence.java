package irvine.oeis.transform;

import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence that enumerates the occurences of the terms of one or two underlying sequences.
 * Construction (from A101296): In this case we start with <code>a(1) = 1</code> for <code>A046523(1) = 1</code>,
 * and thereafter, for all <code>n &gt; 1</code>, we use the least so far unused natural number k for <code>a(n)</code>
 * if <code>A046523(n)</code> has not been encountered before, otherwise [whenever <code>A046523(n) = A046523(m)</code>,
 * for some <code>m &lt;n]</code>, we set <code>a(n) = a(m)</code>.
 * @author Georg Fischer
 */
public class RestrictedGrowthTransformSequence extends AbstractSequence {

  private final Sequence[] mSeqs;
  private final HashMap<String, Integer> mMap;
  private int mStart;
  private int mSeqLen; // = mSeqs.length
  private final StringBuilder mKey = new StringBuilder(32);
  ;

  /**
   * Constructor with parameters
   * @param offset first index
   * @param seqs list of underlying sequences
   */
  public RestrictedGrowthTransformSequence(final int offset, final Sequence... seqs) {
    super(offset);
    mMap = new HashMap<>(1024);
    mStart = 0;
    mSeqLen = seqs.length;
    mSeqs = new Sequence[mSeqLen];
    for (int iseq = 0; iseq < mSeqLen; ++iseq) {
      mSeqs[iseq] = seqs[iseq];
    }
  }

  @Override
  public Z next() {
    mKey.setLength(0);
    for (int iseq = 0; iseq < mSeqLen; ++iseq) {
      if (iseq > 0) {
        mKey.append(',');
      }
      mKey.append(mSeqs[iseq].next().toString());
    }
    Integer value = mMap.get(mKey.toString());
    if (value == null) {
      value = ++mStart;
      mMap.put(mKey.toString(), value);
    }
    // System.out.println("key=" + mKey + ", value=" + value);
    return Z.valueOf(value);
  }
}

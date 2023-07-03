package irvine.oeis.memory;

import java.io.Serializable;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Base class for all sequences using a function that remembers the
 * results of parameter tuples. The result type is always Z.
 * @author Georg Fischer
 */
public abstract class AbstractFunctionSequence extends AbstractSequence {

  private static final int DEFOFF = 0;
  protected final HashMap<String, Z> mHash = new HashMap<>(32768);
  private final StringBuffer mKeyBuf = new StringBuffer(64);

  /**
   * Empty constructor.
   */
  protected AbstractFunctionSequence() {
    super(DEFOFF);
  }

  /**
   * Constructor with offset.
   * @param offset first index
   * Allocate a HashMap with rather big chunks.
   */
  protected AbstractFunctionSequence(final int offset) {
    super(offset);
  }

  /**
   * Return a comma separated list of strings built from the parameters. 
   * @param keys array of serializable objects
   * @return a single String
   */
  protected String concatenate(final Serializable... keys) {
    mKeyBuf.setLength(0);
    for (final Serializable key : keys) {
      mKeyBuf.append(',');
      mKeyBuf.append(key);
    }
    return mKeyBuf.substring(1);
  }

  /**
   * Clear the cache.
   */
  protected void clear() {
    mHash.clear();
  }

  /**
   * Return the number of stored tuples.
   * @return size of the internal HashMap
   */
  protected int size() {
    return mHash.size();
  }

  /**
   * Dummy implementation for applicatons which do not yield a sequence,
   * but which use the caching of function results.
   * @return -1
   */
  @Override
  public Z next() {
    return Z.NEG_ONE;
  }
}


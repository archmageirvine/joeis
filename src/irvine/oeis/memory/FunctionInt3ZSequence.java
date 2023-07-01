package irvine.oeis.memory;

import irvine.math.z.Z;

/**
 * Definition of a sequence using a Z function that has 
 * a number of <code>int</code> parameters.
 * @author Georg Fischer
 */
public abstract class FunctionInt3ZSequence extends AbstractFunctionSequence {

  /**
   * Constructor the sequence.
   * @param offset first index
   */ 
  protected FunctionInt3ZSequence(final int offset) {
   super(offset);
  }

  /**
   * Compute the function at specified parameters.
   * @param a first int parameter
   * @param b second int parameter
   * @param c third int parameter
   * @return value of function
   */
  protected abstract Z compute(final int a, final int b, final int c);

  /**
   * Return the value of the function at specified parameters.
   * @param a first int parameter
   * @param b second int parameter
   * @param c third int parameter
   * @return value of function
   */
  protected Z get(final int a, final int b, final int c) {
    final String key = concatenate(a, b, c);
    Z result = mHash.get(key);
    if (result != null) {
      return result;
    }
    result = compute(a, b, c);
    mHash.put(key, result);
    return result;
  }

}


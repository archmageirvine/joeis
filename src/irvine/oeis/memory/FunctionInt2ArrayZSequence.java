package irvine.oeis.memory;

import java.util.Arrays;

import irvine.math.z.Z;

/**
 * Definition of a sequence using a Z function that has 
 * two <code>int</code> and an <code>int[]</code> parameter.
 * @author Georg Fischer
 */
public abstract class FunctionInt2ArrayZSequence extends AbstractFunctionSequence {

  /**
   * Constructor the sequence.
   * @param offset first index
   */ 
  protected FunctionInt2ArrayZSequence(final int offset) {
   super(offset);
  }

  /**
   * Compute the function at specified parameters.
   * @param a first int parameter
   * @param b second int parameter
   * @param c array of additional int parameters
   * @return value of function
   */
  protected abstract Z compute(final int a, final int b, final int[] c);

  /**
   * Return the value of the function at specified parameters.
   * @param a first int parameter
   * @param b second int parameter
   * @param c array of additional int parameters
   * @return value of function
   */
  protected Z get(final int a, final int b, final int[] c) {
    final String key = concatenate(a, b, Arrays.toString(c));
    Z result = mHash.get(key);
    if (result != null) {
      return result;
    }
    result = compute(a, b, c);
    mHash.put(key, result);
    return result;
  }

}


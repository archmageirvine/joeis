package irvine.oeis.base;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Runs in a given number base.
 * This class computes a number of digit related properties of a number:
 * <ul>
 * <li>run lengths, distinct run lengths</li>
 * <li>counts, increasing, decreasing</li>
 * <li>raises and falls</li>
 * <li>peaks and pits</li>
 * <li>pieces</li>
 * <li>up and down zig-zag pattern</li>
 * </ul>
 * All digit expansions use two digits for bases &gt; 10 (especially base 60).
 * @author Georg Fischer
 */
public abstract class RunsBaseSequence extends AbstractSequence {

  protected int mBase; // number base
  protected int mN; // index of current term to be returned
  protected Z mK; // current number with some property

  /**
   * Constructor for runs of the index
   * @param offset first valid term has this index
   */
  protected RunsBaseSequence(final int offset) {
    super(offset);
    mN = offset - 1;
    mK = Z.valueOf(mN);
    mBase = 10;
  }

  /**
   * Constructor for runs of a single, specified number.
   * @param offset first valid term has this index
   * @param k investigate the runs of this non-negative number
   */
  protected RunsBaseSequence(final int offset, final int k) {
    this(offset);
    mK = Z.valueOf(k);
  }

  /**
   * Ensure that the current number has at least a specified number of digits.
   * @param len width number of required digits
   * @param base represent the number in this base
   * @return width
   */
  protected Z ensureWidth(final int len, final int base) {
    int num = 1;
    int iwid = len - 1;
    while (iwid > 0) {
      num *= base;
      --iwid;
    } // while
    return Z.valueOf(--num);
  } // ensureWidth

  /**
   * Get the number of runs from a number represented in some base.
   * @param number get the run count from this number
   * @param base represent in this base
   * @return number of subsequences with identical digits
   */
  protected int getRunCount(final Z number, final int base) {
    String digits;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10

    int idig = digits.length() - dlen;
    String runElem = digits.substring(idig, idig + dlen);
    int count = 1; // there is always one element = 1 run
    idig -= dlen;
    while (idig >= 0) {
      if (!digits.substring(idig, idig + dlen).equals(runElem)) {
        ++count;
        runElem = digits.substring(idig, idig + dlen);
      }
      idig -= dlen;
    } // while
    return count;
  } // getRunCount

  /**
   * Expand the number as a String of 1-2 digits.
   * For bases &gt;= 11 the result always has even length (may with a leading "0").
   * @param number number to be expanded
   * @param base number base between 2 and 99
   * @return String of digits
   */
  protected String expand(final Z number, final int base) {
    String digits;
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // add a leading zero to make sure that there are pairs
      }
    } // > 10
    return digits;
  }

  /**
   * Expand the number into an array of integer digits.
   * This is independent of the base.
   * @param number number to be expanded
   * @param base number base between 2 and 99
   * @return array of digits, where a[0] has the lowest digit
   */
  protected int[] expandInt(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    final int[] result = new int[digits.length() / dlen];
    int idig = 0;
    try {
      for (int ires = result.length - 1; ires >= 0; --ires) {
        result[ires] = Integer.parseInt(digits.substring(idig, idig + dlen));
        idig += dlen;
      }
    } catch (final NumberFormatException exc) {
      // ignore any error - should not occur
    }
    return result;
  }

  /**
   * Get the run lengths from a number represented in some base,
   * from left to right in the String representation.
   * @param number get the run lengths from this number
   * @param base represent in this base
   * @return array with lengths of the runs
   */
  protected int[] getRunLengths(final Z number, final int base) {
    String digits;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10

    final int[] runLengths = new int[digits.length()];
    int irl = 0;
    int idig = 0;
    String runElem = digits.substring(idig, idig + dlen);
    int count = 1;
    idig += dlen;
    while (idig <= digits.length() - dlen) {
      if (digits.substring(idig, idig + dlen).equals(runElem)) {
        ++count;
      } else {
        runLengths[irl++] = count;
        runElem = digits.substring(idig, idig + dlen);
        count = 1;
      }
      idig += dlen;
    } // while
    runLengths[irl++] = count; // the last one
    return Arrays.copyOfRange(runLengths, 0, irl);
  }

  /**
   * Get the number of distinct run lengths from a number represented in some base.
   * @param number get the run lengths from this number
   * @param base represent in this base
   * @return number of distinct run lengths
   */
  protected int getDistinctRunLengths(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    final HashMap<String, Integer> hash = new HashMap<>(16);
    int ipos = 0;
    int idig = 0;
    String oldDig = digits.substring(idig, idig + dlen);
    idig += dlen;
    while (idig <= digits.length() - dlen) {
      final String newDig = digits.substring(idig, idig + dlen);
      if (!oldDig.equals(newDig)) { // new run starts
        hash.put(digits.substring(ipos, idig), 1); // remember that run
        ipos = idig;
        oldDig = newDig;
      }
      idig += dlen;
    } // while
    hash.put(digits.substring(ipos, idig), 1);
    return hash.size();
  }

  /**
   * Determines whether the number of raises is less, equal or greater than the number of falls (see A296712).
   * @param number get the property from this number
   * @param base represent in this base
   * @return <code>signum(#rises - #falls) = -1 , 0, 1</code> for &gt;, ==, &lt;
   */
  protected int signumRaisesFalls(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    final int[] counts = new int[2];
    int idig = 0;
    String oldDig = digits.substring(idig, idig + dlen);
    idig += dlen;
    while (idig <= digits.length() - dlen) {
      final String newDig = digits.substring(idig, idig + dlen);
      final int signum = oldDig.compareTo(newDig);
      if (signum < 0) { // is a raise
        ++counts[0];
      } else if (signum > 0) { // is a fall
        ++counts[1];
      } // else ignore
      oldDig = newDig;
      idig += dlen;
    } // while
    return Integer.compare(counts[0], counts[1]);
  }

  /**
   * Determines whether the number of pits is less, equal or greater than the number of peaks (see A296882).
   * @param number get the property from this number
   * @param base represent in this base
   * @return <code>signum(#pits - #peaks) = -1 , 0, 1</code> for &gt;, ==, &lt;
   */
  protected int signumPitsPeaks(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    final int[] counts = new int[2];
    int idig = 0;
    String oldDig = digits.substring(idig, idig + dlen);
    idig += dlen;
    if (idig <= digits.length() - dlen) {
      String midDig = digits.substring(idig, idig + dlen);
      idig += dlen;
      while (idig <= digits.length() - dlen) {
        final String newDig = digits.substring(idig, idig + dlen);
        final int signum1 = oldDig.compareTo(midDig);
        final int signum2 = midDig.compareTo(newDig);
        if (signum1 > 0 && signum2 < 0) { // is a pit
          ++counts[0];
        } else if (signum1 < 0 && signum2 > 0) { // is a peak
          ++counts[1];
        } // else ignore
        oldDig = midDig;
        midDig = newDig;
        idig += dlen;
      } // while
    } // midDig exists
    return Integer.compare(counts[0], counts[1]);
  }

  /**
   * Get the number of pieces from a number represented in some base.
   * A piece is a flat (0), ascent (1) or descent (-1), see A297030.
   * A single digit is no piece.
   * @param number get the run count from this number
   * @param base represent in this base
   * @return number of subsequences with identical digits
   */
  protected int getPieceCount(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    int count = 0;
    int idig = 0;
    String oldDig = digits.substring(idig, idig + dlen); // 1st digit
    idig += dlen;
    if (idig <= digits.length() - dlen) { // for 2nd digit
      String newDig = digits.substring(idig, idig + dlen);
      idig += dlen;
      int oldState = newDig.compareTo(oldDig); // 0 = flat, 1 = ascent, -1 = descent
      oldState = oldState == 0 ? oldState : (oldState < 0 ? -1 : 1);
      ++count; // 1st piece
      while (idig <= digits.length() - dlen) { // for 3rd and following
        oldDig = newDig;
        newDig = digits.substring(idig, idig + dlen);
        idig += dlen;
        int newState = newDig.compareTo(oldDig);
        newState = newState == 0 ? newState : (newState < 0 ? -1 : 1);
        if (newState != oldState) {
          ++count;
          oldState = newState;
        }
      } // while
      // >= 2 digits
    } // else only 1 digit - none
    return count;
  }

  /**
   * Determines whether the digits of the number follow a
   * zig-zag-up (1), zig-zag-down (-1) or no zig-zag (0) pattern (see A297146).
   * @param number get the property from this number
   * @param base represent in this base
   * @return 1, -1 or 0
   */
  protected int signumZigZag(final Z number, final int base) {
    final String digits = expand(number, base);
    final int dlen = base <= 10 ? 1 : 2;
    int result = 0; // assume none
    int idig = 0;
    String oldDig = digits.substring(idig, idig + dlen);
    idig += dlen;
    if (idig <= digits.length() - dlen) { // >= 2 digits
      String newDig = digits.substring(idig, idig + dlen);
      idig += dlen;
      final int oldState = newDig.compareTo(oldDig); // 0 = flat, 1 = ascent, -1 = descent
      result = oldState == 0 ? oldState : (oldState < 0 ? -1 : 1); // 1st pair -> up / down
      while (result != 0 && idig <= digits.length() - dlen) { // check that no following is flat
        oldDig = newDig;
        newDig = digits.substring(idig, idig + dlen);
        idig += dlen;
        if (newDig.compareTo(oldDig) == 0) {
          result = 0;
        }
      } // while
      // >= 2 digits
    } // else only 1 digit - none
    return result;
  }

  /**
   * Get the down-variation of the digits of a number as defined in A297330.
   * @param number get the property from this number
   * @param base represent in this base
   * @return sum of distances between adjacent digits that are decreasing.
   */
  protected int getDownVariation(final Z number, final int base) {
    final int[] digits = expandInt(number, base);
    int result = 0; // assume none
    int idig = 0;
    int oldDig = digits[idig++];
    while (idig < digits.length) {
      final int newDig = digits[idig++];
      if (oldDig < newDig) {
        result += newDig - oldDig;
      }
      oldDig = newDig;
    } // while
    return result;
  }

  /**
   * Get the up-variation of the digits of a number as defined in A297330.
   * @param number get the property from this number
   * @param base represent in this base
   * @return sum of distances between adjacent digits that are increasing.
   */
  protected int getUpVariation(final Z number, final int base) {
    final int[] digits = expandInt(number, base);
    int result = 0; // assume none
    int idig = 0;
    int oldDig = digits[idig++];
    while (idig < digits.length) {
      final int newDig = digits[idig++];
      if (oldDig > newDig) {
        result += oldDig - newDig;
      }
      oldDig = newDig;
    } // while
   return result;
  }

  /**
   * Get the total variation of the digits of a number as defined in A297330.
   * @param number get the property from this number
   * @param base represent in this base
   * @return sum of down-variation and up-variation
   */
  protected int getTotalVariation(final Z number, final int base) {
    return getDownVariation(number, base) + getUpVariation(number, base);
  }

  /**
   * Compare the variations
   * @param number get the property from this number
   * @param base represent in this base
   * @return 1 if DV &lt; UV, 0 if DV == UV, -1 if DV &gt; UV
   */
  protected int signumVariation(final Z number, final int base) {
    final int dv = getDownVariation(number, base);
    final int uv = getUpVariation(number, base);
    if (dv < uv) {
      return 1;
    } else if (dv == uv) {
      return 0;
    } else {
      return -1;
    }
  }

  /**
   * Determine whether an array contains increasing lengths only
   * @param number get the run lengths from this number
   * @param base represent in this base
   * @return true if <code>rls[i] &lt; rls[i+1]</code> for all <code>i</code>
   */
  protected boolean hasIncreasingRunLengths(final Z number, final int base) {
    final int[] rls = getRunLengths(number, base);
  /*
    System.out.print(number + "(" + base + ")=" + number.toString(base) + ", runLengths=");
    for (int ir = 0; ir < rls.length; ++ir) {
      System.out.print(rls[ir] + ",");
    }
  */
    boolean result = true;
    int i = rls.length - 1;
    while (i > 0) {
      if (rls[i - 1] >= rls[i]) {
        result = false;
      }
      --i;
    } // while i
    // System.out.println(" hasIncreasingRunLengths=" + result);
    return result;
  }

  protected boolean hasDecreasingRunLengths(final Z number, final int base) {
    final int[] rls = getRunLengths(number, base);
    int i = rls.length - 1;
    while (i > 0) {
      if (rls[i - 1] <= rls[i]) {
        return false;
      }
      --i;
    } // while i
    return true;
  }

  /**
   * Determine whether the number of runs in a number represented
   * in some base has a specific value.
   * @param number get the run count from this number
   * @param base represent in this base
   * @param value so many runs are required
   * @return true if the number of run has the value <code>count</code>
   */
  protected boolean hasRunCount(final Z number, final int base, final int value) {
    String digits;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10
    int idig = digits.length() - dlen;

    String runElem = digits.substring(idig, idig + dlen);
    int count = 1; // there is always one element = 1 run
    idig -= dlen;
    boolean busy = true;
    while (busy && idig >= 0) {
      if (!digits.substring(idig, idig + dlen).equals(runElem)) {
        ++count;
        busy = count <= value; // false if >
        runElem = digits.substring(idig, idig + dlen);
      }
      idig -= dlen;
    } // while
    return busy && count == value;
  }

  /**
   * Get the number of digits in the base representation of number.
   * @param number number to be investigated
   * @param base represent in this base
   * @param digit count this digit (two characters for base &gt; 10)
   * @return the count of digit in number
   */
  protected int getDigitCount(final Z number, final int base, final int digit) {
    String digits;
    final String search;
    int dlen = 1; // assume 1 character per digit
    if (base <= 10) { // one character per digit
      digits = number.toString(base);
      search = String.valueOf(digit);
    } else { // two characters per digit
      dlen = 2;
      digits = number.toTwoDigits(base);
      search = String.format("%02d", digit);
      if ((digits.length() & 1) == 1) { // odd
        digits = "0" + digits; // make sure that there are pairs
      }
    } // > 10
    int idig = digits.length() - dlen;

    int count = 0;
    while (idig >= 0) {
      if (digits.substring(idig, idig + dlen).equals(search)) {
        ++count;
      }
      idig -= dlen;
    } // while
    return count;
  }

  /**
   * Get the next term of a sequence which fulfills some property.
   * @return the next number with the property
   */
  protected Z getNextWithProperty() {
    long loopCheck = 100000000L;
    while (loopCheck > 0) {
      mK = mK.add(Z.ONE);
      if (isOk()) {
        --loopCheck;
        break;
      }
      --loopCheck;
    } // while busy
    if (loopCheck == 0) {
      throw new IllegalArgumentException("More than 10^8 iterations in RunsBaseSequence.getNextWithProperty()");
    }
    return mK;
  }

  /**
   * Get some property of the current number.
   * This method is an example only.
   * It is typically overwritten in order to return some other property.
   * @return a property of the current number <code>mK</code>.
   */
  protected Z getProperty() {
    return mK;
  }

  /**
   * Determine whether the current number has the property which includes it in the sequence.
   * This method is an example only.
   * It is typically overwritten in order to test some other property.
   * @return true iff the current number <code>mK</code> has some property.
   */
  protected boolean isOk() {
    return true;
  }
}

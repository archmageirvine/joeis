package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * Second, alternate attempt, first version was <code>MorphismSequence</code>.
 * Scan a word from left to right, replace the possible patterns, repeat and
 * assume that the beginning of the word becomes steady.
 * An example is:
 * <pre>
 * A171588 The Pell word: Fixed point of the morphism 0-&gt;001, 1-&gt;0.
 * S(0) = 0
 * S(1) = 001
 * S(2) = 001 001 0
 * S(3) = 0010010 0010010 001
 * S(4) = 00100100010010001 00100100010010001 0010010.
 * </pre>
 * @author Georg Fischer
 */
public class MorphismFixedPointSequence extends AbstractSequence {

  private static final int DEFOFF = 1; // default offset
  private static final int POS_FRACTION = 4;
  private static final int MAX_LEN = 10000000; // maximum length of a word
  protected String mStart; // the starting word
  protected String mAnchor; // start of the desired limiting word, or triangle of words if empty
  protected int mAnchorMode; // one of the following
  protected static final int ANCHORED = -1; // mAnchor >= 0
  protected static final int ROWS = -2; // word followed by mapped word
  protected static final int WORD_MAPWORD = -3; // word followed by mapped word
  protected static final int TRIANGLE = -4; // mapped word
  protected int mFactor; // each iterate increases the length roughly by this factor

  protected String mCurWord; // current word expanded so far
  protected String[] mMap; // pairs of String->String, flattened
  protected int mPos; // current position in mCurWord
  protected int mMaxPos; // assume that digits are safe up to this position
  private static int sDebug = 0; // 0 = none, 1 = some, 2 = more debugging output

  /**
   * Constructor with offset, used for special variants.
   * @param offset first index
   */
  protected MorphismFixedPointSequence(final int offset) {
    super(offset);
  }

  /**
   * Empty constructor, used for special variants.
   */
  protected MorphismFixedPointSequence() {
    super(DEFOFF);
  }

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param offset first index
   * @param anchor start of the desired limiting word, or triangle of words if empty
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected MorphismFixedPointSequence(final int offset, final String start, final String anchor, final String mappings) {
    super(offset);
    configure(start, anchor, mappings);
    if (mAnchorMode == ANCHORED) {
      while (mCurWord.length() < 256 || !mCurWord.startsWith(mAnchor)) { // expand a few times
        expandWord();
      }
    }
  }

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * @param anchor start of the desired limiting word, or triangle of words if empty
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected MorphismFixedPointSequence(final String start, final String anchor, final String mappings) {
    this(DEFOFF, start, anchor, mappings);
  }

  /**
   * Construct an instance which generates the fixed point of this morphism.
   * Caution, this method is used in subclass MophismTransform!
   * @param anchor start of the desired limiting word, or triangle of words if empty
   * @param start start with this word
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0"
   */
  protected void configure(final String start, final String anchor, final String mappings) {
    mFactor = 2;
    final String[] pairs = mappings.replaceAll(" ", "").split("\\,"); // remove spaces inserted by gen_seq4.pl
    mMap = new String[pairs.length * 2];
    int imap = 0;
    for (final String pair1 : pairs) {
      String[] pair = pair1.split("\\-\\>");
      if (pair.length == 1) {
        pair = new String[] {pair[0], ""};
      } else if (pair1.startsWith("->")) {
        pair = new String[] {"", pair[0]};
      }
      mMap[imap++] = pair[0];
      mMap[imap++] = pair[1];
    }
    mStart = start;
    mCurWord = mStart;
    mAnchor = anchor;
    mAnchorMode = ANCHORED;
    if (anchor.startsWith("anchor")) {
      // take default
    } else if (anchor.startsWith("rows")) {
      mAnchorMode = ROWS;
    } else if (anchor.startsWith("word")) {
      mAnchorMode = WORD_MAPWORD;
    } else if (anchor.startsWith("tri")) {
      mAnchorMode = TRIANGLE;
    }
    mPos = 0;
  }

  /**
   * Convert characters to Z.
   * @return integer values for characters: 0-9 => 0-9, A-Z => 10..35, a-z => 36..61
   */
  protected Z charToZ(final char ch) {
    return Z.valueOf(ch >= 'a' ? ch - 'a' + 36 : (ch >= 'A' ? ch - 'A' + 10 : ch - '0'));
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    if (mAnchorMode == ANCHORED) {
      while (mPos >= mMaxPos) {
        expandWord();
        while (!mCurWord.startsWith(mAnchor)) { // make sure that it starts with the anchor
          expandWord();
        }
      }
    } else if (mAnchorMode == ROWS) {
      if (mPos >= mCurWord.length()) {
        final String oldWord = mCurWord;
        expandWord();
        mCurWord = oldWord + mCurWord;
        mPos = 0;
        if (sDebug >= 2) {
          System.out.println("# pos=" + mPos + ", oldWord=" + oldWord + ", curWord=" + (mCurWord.length() < 128 ? mCurWord : mCurWord.substring(0, 128) + " ..."));
        }
      }
    } else if (mAnchorMode == WORD_MAPWORD) {
      if (mPos >= mCurWord.length()) {
        final String oldWord = mCurWord;
        expandWord();
        mCurWord = oldWord + mCurWord;
        mPos = oldWord.length();
        if (sDebug >= 2) {
          System.out.println("# pos=" + mPos + ", oldWord=" + oldWord + ", curWord=" + (mCurWord.length() < 128 ? mCurWord : mCurWord.substring(0, 128) + " ..."));
        }
      }
    } else if (mAnchorMode == TRIANGLE) {
      if (mPos >= mCurWord.length()) {
        expandWord();
        mPos = 0;
      }
    } else { // "invalid mAnchorMode";
    }
    // take next from current word
    return charToZ(mCurWord.charAt(mPos++));
  }

  /**
   * Expand the current word by applying the mapping rules from left to right.
   */
  public void expandWord() {
    final StringBuilder newWord = new StringBuilder(mPos * mFactor);
    int ipos = 0;
    while (ipos < mCurWord.length()) {
      int imap = 0;
      boolean busy = true;
      while (busy && imap < mMap.length) {
        final String search = mMap[imap++];
        final String replace = mMap[imap++];
        if (mCurWord.startsWith(search, ipos)) {
          if (newWord.length() + replace.length() < MAX_LEN) {
            newWord.append(replace);
          } // else silently suppress appending behind 10 mio. chars
          ipos += search.length();
          busy = false;
        }
      } // while imap
      if (busy) { // no mapping could be applied
        newWord.append(mCurWord.charAt(ipos++)); // copy character unchanged
      }
    }
    mCurWord = newWord.toString();
    mMaxPos = mCurWord.length() * (POS_FRACTION - 3) / POS_FRACTION;

    if (sDebug >= 1) {
      System.out.println("# expandWord: anchor=" + mAnchor + ", pos=" + mPos + ", max=" + mMaxPos + ", curWord=" + (mCurWord.length() < 128 ? mCurWord : mCurWord.substring(0, 128) + " ..."));
    }

    if (mCurWord.length() > MAX_LEN) {
      throw new IllegalArgumentException("mCurWord longer than " + MAX_LEN + " characters");
    }
  }

  /**
   * Get the mappings.
   * @return String of the form "from1->to1,from2->to2" and so on.
   */
  public String getMappings() {
    final StringBuilder sb = new StringBuilder(256);
    for (int imap = 0; imap < mMap.length; imap += 2) {
      if (imap > 0) {
        sb.append(',');
      }
      sb.append(mMap[imap]);
      sb.append("->");
      sb.append(mMap[imap + 1]);
    }
    return sb.toString();
  }

  /**
   * Get the anchor.
   * @return start of the desired limiting word; if empty, a triangle of words is produced.
   */
  public String getAnchor() {
    return mAnchor;
  }

  /**
   * Get the starting word.
   * @return initial word as a String of digits.
   */
  public String getStart() {
    return mStart;
  }

  /**
   * Test method
   * @param args command line arguments:
   * <ul>
   * <li>-i initial word, start, default "0"</li>
   * <li>-a anchor, default "0010"</li>
   * <li>-m mappings, default "0-&gt;001,1-&gt;0"</li>
   * <li>-n number of terms, default 32</li>
   * <li>-o offset, default 1</li>
   * <li>-d debugging mode: 0=none (default), 1=some, 2=more</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int noTerms = 32;
    int offset = 1;
    int debug = 0;
    String start = "0";
    String anchor = "0010";
    String mappings = "0->001,1->0"; // A171588
    int iarg = 0;
    while (iarg < args.length) {
      final String opt = args[iarg++];
      try {
        if (false) {
        } else if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-i".equals(opt)) {
          start = args[iarg++];
        } else if ("-a".equals(opt)) {
          anchor = args[iarg++];
/*
          if (anchor.length() > 0 && !Character.isDigit(anchor.charAt(0))) {
            anchor = "";
          }
*/
        } else if ("-m".equals(opt)) {
          mappings = args[iarg++];
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-o".equals(opt)) {
          offset = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("invalid option " + opt);
        }
      } catch (final NumberFormatException exc) {
        // ignored
      }
    }
    System.out.println("start=" + start + ", anchor=" + anchor + ", mappings=" + mappings + ", nt=" + noTerms + ", debug=" + debug);
    MorphismFixedPointSequence.sDebug = debug;
    final MorphismFixedPointSequence seq = new MorphismFixedPointSequence(start, anchor, mappings);
    int index = offset;
    while (index < noTerms) {
      System.out.println(index + " " + seq.next());
      ++index;
    }
  }
}

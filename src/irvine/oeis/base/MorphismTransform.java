package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Transformation of a MorphismFixedPointSequence, 
 * that is a replacement of one or more strings
 * @author Georg Fischer
 */
public class MorphismTransform extends MorphismFixedPointSequence {

  private static final int DEFOFF = 1;
  protected static final int MAX_SRC = 16; // pull so many terms from the underlying sequence
  protected Sequence mSeq; // underlying sequence
  protected StringBuilder mSrcWord; // portion of the word of the underlying sequence
  protected StringBuilder mTarWord; // portion of the word of the new sequence
  protected int mSrcPos; // current position in mSrcWord
  protected int mTarPos; // current position in mTarWord
  protected int mLookAhead; // at least so many terms of the underlying sequence must be available

  /**
   * Construct an instance which transforms the underlying sequence by some replacements
   * @param offset first index of target sequence
   * @param seq underlying <code>(MorphismFixedPoint)Sequence</code>
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0", also "111-&gt;" (remove "111").
   */
  public MorphismTransform(final int offset, final Sequence seq, final String mappings) {
    super(offset);
    mSeq = seq;
    configure("", "", mappings); // only to store the mappings into the data structure
    mSrcWord = new StringBuilder(MAX_SRC);
    mSrcPos = 1;
    mTarWord = new StringBuilder(MAX_SRC);
    mTarPos = 1;
    mLookAhead = 1;
    int imap = 0;
    while (imap < mMap.length) { // determine the maximum look-ahead
      final String searchFor = mMap[imap++];
      ++imap; // skip replaceBy
      if (searchFor.length() > mLookAhead) {
        mLookAhead = searchFor.length();
      }
    }
  }

  /**
   * Construct an instance which transforms the underlying sequence by some replacements
   * @param seq underlying <code>(MorphismFixedPoint)Sequence</code>
   * @param mappings pairs of digit string mappings, for example "0-&gt;001,1-&gt;0", also "111-&gt;" (remove "111").
   */
  public MorphismTransform(final Sequence seq, final String mappings) {
    this(DEFOFF, seq, mappings);
  }

  /**
   * Get the next term of the sequence.
   * @return the next term
   */
  @Override
  public Z next() {
    if (mTarPos >= mTarWord.length()) {
      refillBuffers();
    }
    return charToZ(mTarWord.charAt(mTarPos++)); // inherited from MorphismFixedPointSequence
  }

  /**
   * Ensure that there are enough terms in the source buffer,
   * and translate them into the target string up to the look-ahead.
   */
  public void refillBuffers() {
    mSrcWord.delete(0, mSrcPos); // shift the remaining source terms downwards
    for (int i = mSrcWord.length(); i < MAX_SRC; ++i) { // fill the source buffer again to its capacity
      mSrcWord.append(mSeq.next().toString());
    }
    mTarWord.delete(0, mTarWord.length());
    mTarPos = 0;
    mSrcPos = 0;
    while (mSrcPos < mSrcWord.length() - mLookAhead) { // process all source terms as long as there is enough look-ahead
      int imap = 0;
      boolean busy = true;
      while (busy && imap < mMap.length) { // try all mappings
        final String searchFor = mMap[imap++];
        final String replaceBy = mMap[imap++];
        if (mSrcWord.substring(mSrcPos, mSrcPos + searchFor.length()).equals(searchFor)) { // match found
          busy = false; // break loop
          mTarWord.append(replaceBy);
          mSrcPos += searchFor.length();
        }
      } // while imap
      if (busy) { // no mapping could be applied
        mTarWord.append(mSrcWord.charAt(mSrcPos++)); // copy source term unchanged
      }
    } // while mSrcPos
  }

  /**
   * Return the name of the underlying sequence.
   * @return last component of the classname
   */
  public String getSequenceName() {
    return mSeq.getClass().getSimpleName();
  }
} 

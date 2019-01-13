package irvine.util.string;

/**
 * <code>WrappingStringBuffer</code> is sort of like a StringBuilder,
 * that can perform word wrapping.
 *
 * @author Len Trigg
 */
public class WrappingStringBuffer {
  private static final String LS = System.lineSeparator();

  private final StringBuilder mSB = new StringBuilder();
  private String mPrefix = "";
  private int mWrapWidth = 0;
  private int mLineStart = 0;

  /**
   * A new wrapping buffer.
   *
   */
  public WrappingStringBuffer() {
    this("");
  }

  /**
   * A new wrapping buffer with initial content.
   *
   * @param initial initial content
   */
  public WrappingStringBuffer(final String initial) {
    append(initial);
  }

  /**
   * Sets the number of characters that text will be wrapped at when
   * using the wrapping methods.
   *
   * @param width the horizontal wrap width. Default value is 0.
   */
  public void setWrapWidth(final int width) {
    if (width < 0) {
      throw new IllegalArgumentException("Wrap width must be positive.");
    }
    mWrapWidth = width;
  }

  /** Sets the wrap indent to be the length of the current line. */
  public void setWrapIndent() {
    setWrapIndent(lineLength());
  }

  /**
   * Sets the wrap indent to be the specified string.
   *
   * @param prefix wrap indent
   */
  public void setWrapIndent(final String prefix) {
    if (prefix == null) {
      throw new NullPointerException();
    }
    mPrefix = prefix;
  }

  /**
   * Sets the wrap indent to be the specified number of space characters.
   *
   * @param indent indent amount
   */
  public void setWrapIndent(final int indent) {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < indent; ++i) {
      sb.append(' ');
    }
    mPrefix = sb.toString();
  }

  /**
   * Appends a character without implicit wrapping.
   *
   * @param c char to append
   * @return the buffer
   */
  public WrappingStringBuffer append(final char c) {
    mSB.append(c);
    if (c == '\n') {
      mLineStart = mSB.length();
    }
    return this;
  }

  /**
   * Appends a string without implicit wrapping.
   *
   * @param s text to wrap.
   * @return the buffer
   */
  public final WrappingStringBuffer append(final String s) {
    final int end = s.length();
    for (int i = 0; i < end; ++i) {
      append(s.charAt(i));
    }
    return this;
  }

  /**
   * Appends a string, but skipping any leading space characters.
   *
   * @param s text to wrap.
   */
  private void appendTrimmed(final String s) {
    boolean skip = true;
    for (int i = 0; i < s.length(); ++i) {
      final char c = s.charAt(i);
      if (c != ' ') {
        skip = false;
      }
      if (!skip) {
        append(c);
      }
    }
  }

  @Override
  public String toString() {
    return mSB.toString();
  }

  private void wrap() {
    append(LS);
    append(mPrefix);
  }

  private int lineLength() {
    return mSB.length() - mLineStart;
  }

  /**
   * Append a word without breaking it, wrapping first if necessary
   *
   * @param s text to wrap
   * @return the buffer
   */
  public WrappingStringBuffer wrapWord(final String s) {
    if (mWrapWidth - mPrefix.length() < 20) {
      // Skip wrapping if there isn't enough width
      append(s);
      return this;
    }
    final int available = mWrapWidth - lineLength();
    if (s.length() >= available) {
      if (lineLength() != mPrefix.length()) {
        wrap();
      }
      appendTrimmed(s);
    } else {
      append(s);
    }
    return this;
  }


  /**
   * Wraps text.
   *
   * @param s text to wrap
   * @return the buffer
   * @throws IllegalArgumentException if the input string contains <code>\n</code>
   */
  public WrappingStringBuffer wrapText(final String s) {
    if (s.indexOf('\n') != -1) {
      throw new IllegalArgumentException("Input string cannot contain line breaks.");
    }
    int start = 0;
    int end = 0;
    while (end < s.length()) {
      boolean leader = true;
      for (end = start; end < s.length(); ++end) {
        final char c = s.charAt(end);
        if (Character.isWhitespace(c)) {
          if (!leader) {
            break;
          }
        } else {
          leader = false;
        }
      }
      wrapWord(s.substring(start, end));
      start = end;
    }
    return this;
  }
}


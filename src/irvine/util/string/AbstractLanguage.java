package irvine.util.string;

/**
 * Defines functions for getting a textual representation of an integer in a language.
 * @author Sean A. Irvine
 */
public abstract class AbstractLanguage {

  /**
   * Return the text representing a number in this language.
   * @param n number
   * @return text representation
   * @throws UnsupportedOperationException if the numbers exceeds values that can be handled.
   */
  public abstract String toText(final int n);

  /**
   * Return the text representing a number in this language, but omitted spaces, hyphens, etc.
   * @param n number
   * @return text representation
   * @throws UnsupportedOperationException if the numbers exceeds values that can be handled.
   */
  public String toRawText(final int n) {
    final String text = toText(n);
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < text.length(); ++k) {
      final char c = text.charAt(k);
      if (Character.isLetter(c)) {
        sb.append(c);
      }
    }
    return sb.toString();
  }
}

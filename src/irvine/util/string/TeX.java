package irvine.util.string;

/**
 * Utility method to suppress TeX accenting and try to make the
 * resulting stream look sensible. This filter is designed to work on
 * any input, so the changes made are minimal. It deals only with the
 * standard text accents.
 *
 * @author Sean A. Irvine
 */
public final class TeX {

  private TeX() { }

  /**
   * Suppress all text of the form <code>startTag...endTag</code> in the given text,
   * replacing each occurrence with the specified string.  If there are no such
   * occurrences, then the original text is returned.
   * @param text text to make replacements in
   * @param replacement the replacement
   * @param startTag start marker
   * @param endTag end marker
   * @return replaced text
   */
  public static String suppress(String text, final String replacement, final String startTag, final String endTag) {
    int start;
    final int slen = startTag.length();
    final int elen = endTag.length();
    while ((start = text.indexOf(startTag)) != -1) {
      final int end = text.indexOf(endTag, start + slen);
      if (end == -1) {
        return text;
      }
      text = text.substring(0, start) + replacement + text.substring(end + elen);
    }
    return text;
  }

  /**
   * Remove a tag but retain its contents.
   * @param text text to make replacements in
   * @param startTag start marker
   * @param endTag end marker
   * @return replaced text
   */
  public static String flatten(String text, final String startTag, final String endTag) {
    int start;
    final int slen = startTag.length();
    final int elen = endTag.length();
    while ((start = text.indexOf(startTag)) != -1) {
      final int end = text.indexOf(endTag, start + slen);
      if (end == -1) {
        return text;
      }
      text = text.substring(0, start) + text.substring(start + startTag.length(), end) + text.substring(end + elen);
    }
    return text;
  }

  /**
   * Eliminate all TeX calls of the given tag from a string.
   * @param text TeX string to filter
   * @param tag tag to eliminate (e.g. <code>\\pfile{...}</code>)
   * @return filtered text
   */
  public static String suppress(final String text, final String tag) {
    return suppress(text, " ", tag + "{", "}");
  }

  /**
   * Eliminate all TeX calls of the given tags from a string.
   * @param tags tags to eliminate
   * @param text TeX string to filter
   * @return filtered text
   */
  public static String suppress(String text, final String... tags) {
    for (final String tag : tags) {
      text = suppress(text, tag);
    }
    return text;
  }

  /**
   * Suppress TeX mathematical constructs.
   * @param text string
   * @return string without mathematical constructs
   */
  public static String suppressMath(final String text) {
    String s = suppress(text, " ", "$$", "$$");
    // Need to be a little careful here with single $ because it might just
    // be an escaped dollar sign.
    int start = 0;
    while ((start = s.indexOf('$', start)) != -1) {
      if (start > 0 && s.charAt(start - 1) == '\\') {
        ++start;
      } else {
        final int end = s.indexOf('$', start + 1);
        if (end == -1) {
          return s;
        }
        s = s.substring(0, start) + s.substring(end + 1);
      }
    }
    return s;
  }

  /**
   * Remove LaTeX style soft hyphens.
   * @param s string to suppress hyphens in
   * @return suppressed hyphens
   */
  public static String suppressHyphens(final String s) {
    return s.replace("\\-", "");
  }
  
  private static final String VERB = "\\verb";

  private static String suppressVerb(String s) {
    int verb;
    while ((verb = s.indexOf(VERB)) != -1) {
      final char delim = s.charAt(verb +  VERB.length());
      if (Character.isLetter(delim)) {
        break;
      }
      final int end = s.indexOf(delim, verb + VERB.length() + 1);
      if (end == -1) {
        break;
      }
      s = s.substring(0, verb) + " " + s.substring(end + 1);
    }
    return s;
  }

  /**
   * Suppress TeX accenting commands replacing with a close ASCII approximation.
   * Also, removes <code>\\verb</code> constructs.
   *
   * @param s string to replace characters in
   * @return string with accents removed
   */
  public static String ascii(String s) {
    if (s == null) {
      return null;
    }
    // handle \verb|XXX| etc.
    s = suppressVerb(s);

    s = s.replace("\\ucirc ", "u")
      .replace("\\Ucirc ", "U")
      .replace("\\aa ", "a")
      .replace("\\AA ", "A")
      .replace("\\ae ", "ae")
      .replace("\\AE ", "AE")
      .replace("\\oe ", "oe")
      .replace("\\OE ", "oe");

    final StringBuilder sb = new StringBuilder();
    final int len = s.length();
    for (int k = 0; k < len; ++k) {
      final char c = s.charAt(k);
      switch (c) {
      case '~':
        sb.append(' ');
        break;
      case '\\':
        if (k != len - 1) {
          final char accent = s.charAt(k + 1);
          if ("\"'`~.^=-@".indexOf(accent) != -1) {
            ++k;
          } else if ("\\{},".indexOf(accent) != -1) {
            sb.append(' ');
            ++k;
          } else if (k < len - 2 && !Character.isLetter(s.charAt(k + 2))) {
            switch(accent) {
            case 'i':
            case 'j':
            case 'l':
            case 'L':
            case 'o':
            case 'O':
              sb.append(accent);
              k += Character.isWhitespace(s.charAt(k + 2)) ? 2 : 1;
              break;
            case 'd':
            case 'c':
            case 'v':
            case 'u':
            case 'H':
              k += 2;
              break;
            default:
              break;
            }
          } else {
            sb.append(' ');
            sb.append(c);
          }
        }
        break;
      default:
        sb.append(c);
        break;
      }
    }

    final StringBuilder sb2 = new StringBuilder();
    for (int k = 0; k < sb.length(); ++k) {
      final char c = sb.charAt(k);
      sb2.append(c);
      if (c == '\\') {
        // Suppress all other backslash constructs
        while (++k < sb.length() && Character.isLetter(sb.charAt(k))) {
        }
        sb2.append(' ');
      }
    }

    return sb2.toString();
  }


}

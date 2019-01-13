package irvine.util.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

import irvine.util.io.IOUtils;

/**
 * Maintains a table for remapping Unicode characters to a reduced
 * alphabet.<p>
 *
 * With only a few exceptions Unicode characters are semantically
 * distinct, so in principle each Unicode character has a different
 * meaning. However, in practice the distinctions can be so fine that
 * many are of dubious merit. The issue is further confounded by the
 * fact that many documents will not be ideally encoded (for example,
 * because they have been converted to Unicode from earlier legacy
 * formats). A typical symptom would be French documents appearing
 * without any diacritical marking (as might be the case for French
 * text originally encoded with ASCII). Similarly problems can arise
 * with more diverse languages: in Greek capital alpha has the same
 * appearance as capital Latin A and so it is not surprising to find
 * Greek documents incorrectly coding Latin A in place of capital Greek
 * alpha.<p>
 *
 * Other characters where this problem is acute include spaces,
 * punctuation, and quotes. The presence or absence of ligatures will
 * be dealt with in the next section. This class is an attempt to cater
 * for the lowest common denominator. Thus, for instance, Greek capital
 * letter alpha and all its variants with diacritical marks are all
 * mapped to Latin A. All the different whitespace characters are
 * mapped to the space (0x0020). All currency symbols are mapped to $.
 * All dashes, hyphen, subtraction signs, and similar marks are mapped
 * to -. Digits in various alphabets are mapped to their equivalent
 * Arabic numbers (except in the case of Roman numerals which are
 * mapped to the corresponding letters). All undefined characters,
 * control characters, private characters, surrogates, diacritical
 * marks, and some other uninformative signs are mapped to 0x0000.</p>
 * The filter is implemented as a single 65536 entry array <code>REMAP</code>
 * which takes a Unicode character as index and returns the result of
 * the mapping. Thus, in many cases <code>REMAP[i]=i</code>. This means
 * every characters incurs one array lookup, but this is much faster
 * than testing each character against a large number of special cases.
 *
 * @author Sean A. Irvine
 */
public final class UnicodeRemap {

  private UnicodeRemap() { }

  /** Remaps Unicode values */
  private static final char[] REMAP = new char[Character.MAX_VALUE + 1];
  /** Hexadecimal base. */
  private static final int HEX = 16;

  static {
    for (int i = 0; i < REMAP.length; ++i) {
      REMAP[i] = (char) i;
    }
    try {
      try (final BufferedReader s = IOUtils.reader("irvine/util/string/UnicodeRemap.dat.gz")) {
        String line;
        while ((line = s.readLine()) != null) {
          if (line.length() != 9) {
            continue;
          }
          REMAP[Integer.parseInt(line.substring(0, 4), HEX)] = (char) Integer.parseInt(line.substring(5), HEX);
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException("UnicodeRemap.dat is corrupt or inaccessible", e);
    } catch (final ArrayIndexOutOfBoundsException e) {
      throw new RuntimeException("UnicodeRemap.dat is corrupt", e);
    }
  }


  /**
   * Remap a Unicode character into a more restricted alphabet.
   *
   * @param c character to remap
   * @return remapped character value
   */
  public static char remap(final char c) {
    return REMAP[c];
  }

  /**
   * Remap text on standard input.
   *
   * @param args ignored
   * @exception Exception if an error occurs
   */
  public static void main(final String[] args) throws Exception {
    final BufferedReader r = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
    String line;
    while ((line = r.readLine()) != null) {
      for (int i = 0; i < line.length(); ++i) {
        System.out.print(remap(line.charAt(i)));
      }
      System.out.println();
    }
    r.close();
  }
}

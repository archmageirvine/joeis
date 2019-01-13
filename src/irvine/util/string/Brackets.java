package irvine.util.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Functions associated with delimiters in strings.
 *
 * @author Sean A. Irvine
 */
public final class Brackets {

  private Brackets() { }

  /**
   * Check if the supplied string has balanced parentheses, brackets, and
   * braces.  Handles the case where there are interleaved.
   *
   * @param s string to test
   * @return true if delimiters are balanced
   */
  public static boolean isBalanced(final String s) {
    if (s == null || s.isEmpty()) {
      return true;
    }
    int p = 0, b = 0, c = 0, g = 0;
    for (int i = 0; i < s.length(); ++i) {
      switch (s.charAt(i)) {
      case '(':
        ++p;
        ++g;
        break;
      case ')':
        if (--p < 0) {
          return false;
        }
        break;
      case '[':
        ++b;
        ++g;
        break;
      case ']':
        if (--b < 0) {
          return false;
        }
        break;
      case '{':
        ++c;
        ++g;
        break;
      case '}':
        if (--c < 0) {
          return false;
        }
        break;
      default:
        break;
      }
    }
    if (p != 0 || b != 0 || c != 0) {
      return false;
    }
    // individual types are balanced, but still might have constructs like [(])
    // stack to store opens
    final char[] stack = new char[g];
    g = 0;
    for (int i = 0; i < s.length(); ++i) {
      final char k = s.charAt(i);
      switch (k) {
      case '(':
      case '[':
      case '{':
        stack[g++] = k;
        break;
      case ')':
        if (stack[--g] != '(') {
          return false;
        }
        break;
      case ']':
        if (stack[--g] != '[') {
          return false;
        }
        break;
      case '}':
        if (stack[--g] != '{') {
          return false;
        }
        break;
      default:
        break;
      }
    }
    assert g == 0;
    return true;
  }

  /**
   * Check lines on standard input for balanced brackets.
   *
   * @param args ignored
   * @exception IOException if an I/O error occurs
   */
  public static void main(final String[] args) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!isBalanced(line)) {
          System.out.println(line);
        }
      }
    }
  }
}

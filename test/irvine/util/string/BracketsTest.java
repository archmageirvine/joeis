package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class BracketsTest extends TestCase {

  public void test() {
    assertTrue(Brackets.isBalanced(null));
    assertTrue(Brackets.isBalanced(""));
    assertTrue(Brackets.isBalanced("a"));
    assertTrue(Brackets.isBalanced("*"));
    assertTrue(Brackets.isBalanced(" "));
    assertTrue(Brackets.isBalanced("()"));
    assertTrue(Brackets.isBalanced("[]"));
    assertTrue(Brackets.isBalanced("{}"));
    assertTrue(Brackets.isBalanced("([{}])"));
    assertTrue(Brackets.isBalanced("(a)"));
    assertTrue(Brackets.isBalanced("[a]"));
    assertTrue(Brackets.isBalanced("{a}"));
    assertTrue(Brackets.isBalanced("a(bb)c"));
    assertTrue(Brackets.isBalanced("a[ddd]dd"));
    assertTrue(Brackets.isBalanced("aaa{eee}fff"));
    assertTrue(Brackets.isBalanced("a(b(c)d)e"));
    assertTrue(Brackets.isBalanced("a{b[c]d}e"));
    assertTrue(Brackets.isBalanced("(((((((((())))))))))"));
    assertTrue(Brackets.isBalanced("[][][][][][][]{}[]{}"));
    assertTrue(Brackets.isBalanced("{[]{()[]}[[[]]]}()"));
    assertFalse(Brackets.isBalanced("("));
    assertFalse(Brackets.isBalanced("["));
    assertFalse(Brackets.isBalanced("{"));
    assertFalse(Brackets.isBalanced(")"));
    assertFalse(Brackets.isBalanced("}"));
    assertFalse(Brackets.isBalanced("]"));
    assertFalse(Brackets.isBalanced("[]]"));
    assertFalse(Brackets.isBalanced("(]"));
    assertFalse(Brackets.isBalanced("(}"));
    assertFalse(Brackets.isBalanced("[}"));
    assertFalse(Brackets.isBalanced("{)"));
    assertFalse(Brackets.isBalanced("([)]"));
    assertFalse(Brackets.isBalanced("{[}]"));
    assertFalse(Brackets.isBalanced("({)}"));
    assertFalse(Brackets.isBalanced("[{]}"));
    assertFalse(Brackets.isBalanced("([{}]()]"));
    assertFalse(Brackets.isBalanced("aaaa("));
    assertFalse(Brackets.isBalanced("bbbb{"));
    assertFalse(Brackets.isBalanced("cccc["));
    assertFalse(Brackets.isBalanced("c()("));
    assertFalse(Brackets.isBalanced("x)(x"));
  }
}

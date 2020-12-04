package irvine.math.expression;

import java.util.Arrays;
import java.util.TreeSet;

import org.antlr.v4.runtime.Vocabulary;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GrammarLexerTest extends TestCase {

  public void testLiterals() {
    assertEquals("0", Sircon.parse("0").toString());
    assertEquals("x", Sircon.parse("x").toString());
  }

  public void testParentheses() {
    assertEquals("1", Sircon.parse("(1)").toString());
  }
  
  public void testUnaryMinus() {
    assertEquals("-1", Sircon.parse("-1").toString());
    assertEquals("1", Sircon.parse("+1").toString());
  }

  public void testAdd() {
    assertEquals("3", Sircon.parse("1+2").toString());
  }

  public void testSubtract() {
    assertEquals("-1", Sircon.parse("0-1").toString());
  }

  public void testMultiply() {
    assertEquals("6", Sircon.parse("2*3").toString());
  }

  public void testDivision() {
    assertEquals("2", Sircon.parse("6/3").toString());
  }

  public void testPowers() {
    assertEquals("2^3", Sircon.parse("2^3").toString());
  }

  public void testMod() {
    assertEquals("6 (mod 4)", Sircon.parse("6%4").toString());
  }

  public void testFunctions() {
    assertEquals("diff(x, x)", Sircon.parse("diff(x, x)").toString());
    assertEquals("log(x)", Sircon.parse("log(x)").toString());
    assertEquals("sinh(x)", Sircon.parse("sinh(x)").toString());
    assertEquals("cosh(x)", Sircon.parse("cosh(x)").toString());
  }

  public void testName() {
    assertEquals("Grammar.g4", new GrammarLexer(null).getGrammarFileName());
    assertNotNull(new GrammarLexer(null).getSerializedATN());
  }

  public void testModes() {
    assertEquals("[DEFAULT_MODE]", Arrays.toString(new GrammarLexer(null).getModeNames()));
  }

  public void testVocab() {
    final Vocabulary vocabulary = new GrammarLexer(null).getVocabulary();
    final TreeSet<String> vocab = new TreeSet<>();
    int k = 0;
    String s;
    while ((s = vocabulary.getLiteralName(++k)) != null) {
      vocab.add(s);
    }
    assertEquals("['!', '##', '#', '%', '(', ')', '*', '+', ',', '-', '..', '/', '=', '^', 'cosh', 'diff', 'exp', 'fibonacci', 'log', 'lucas', 'sinh', 'subs', 'sum', 'tanh']", vocab.toString());
    assertNull(new GrammarLexer(null).getVocabulary().getSymbolicName(2));
  }

  public void testRuleNames() {
    final String[] ruleNames = new GrammarLexer(null).getRuleNames();
    boolean sawInteger = false;
    boolean sawWs = false;
    boolean sawIdentifier = false;
    for (final String s : ruleNames) {
      if ("INTEGER".equals(s)) {
        sawInteger = true;
      } else if ("WS".equals(s)) {
        sawWs = true;
      } else if ("IDENTIFIER".equals(s)) {
        sawIdentifier = true;
      }
    }
    assertTrue(sawInteger);
    assertTrue(sawWs);
    assertTrue(sawIdentifier);
  }
}

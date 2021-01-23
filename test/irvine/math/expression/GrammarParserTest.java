package irvine.math.expression;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class GrammarParserTest extends TestCase {

  public void testLiterals() {
    assertEquals("0", Sircon.parse("0").eval().toString());
    assertEquals("1", Sircon.parse("1").eval().toString());
    assertEquals("x", Sircon.parse("x").eval().toString());
  }

  public void testParentheses() {
    assertEquals("1", Sircon.parse("(1)").eval().toString());
    assertEquals("x", Sircon.parse("((x))").eval().toString());
  }
  
  public void testUnaryMinus() {
    assertEquals("0", Sircon.parse("-0").eval().toString());
    assertEquals("-1", Sircon.parse("-1").eval().toString());
    assertEquals("-x", Sircon.parse("-x").eval().toString());
    assertEquals("1", Sircon.parse("-(-1)").eval().toString());
    assertEquals("x", Sircon.parse("--x").eval().toString());
  }

  public void testUnaryPlus() {
    assertEquals("0", Sircon.parse("+0").eval().toString());
    assertEquals("1", Sircon.parse("+1").eval().toString());
    assertEquals("x", Sircon.parse("+x").eval().toString());
    assertEquals("-1", Sircon.parse("+(-1)").eval().toString());
  }

  public void testAdd() {
    assertEquals("3", Sircon.parse("1+2").eval().toString());
    assertEquals("1 + x", Sircon.parse("1+x").eval().toString());
    assertEquals("1 + x", Sircon.parse("x+1").eval().toString());
    assertEquals("2 * x", Sircon.parse("x+x").eval().toString());
    assertEquals("0", Sircon.parse("-1+1").eval().toString());
    assertEquals("-2 * x", Sircon.parse("-x+(-x)").eval().toString());
    assertEquals("5 + y + 3 * x", Sircon.parse("x+2+x+3+x+y").eval().toString());
  }

  public void testSubtract() {
    assertEquals("-1", Sircon.parse("0-1").eval().toString());
    assertEquals("2", Sircon.parse("3-1").eval().toString());
    assertEquals("0", Sircon.parse("x-x").eval().toString());
    assertEquals("-2 * x", Sircon.parse("-x-x").eval().toString());
    assertEquals("1 - x", Sircon.parse("1-x").eval().toString());
    assertEquals("x - 1", Sircon.parse("x-1").eval().toString());
    assertEquals("-x", Sircon.parse("x-x-x").eval().toString());
    assertEquals("-y", Sircon.parse("x-y-x").eval().toString());
  }

  public void testMixedAddSubtract() {
    assertEquals("y", Sircon.parse("x+y-x").eval().toString());
    assertEquals("0", Sircon.parse("x-y-x+y").eval().toString());
    assertEquals("x", Sircon.parse("y + x - y").eval().toString());
  }

  public void testMultiply() {
    assertEquals("6", Sircon.parse("2*3").eval().toString());
    assertEquals("6", Sircon.parse("-2*-3").eval().toString());
    assertEquals("0", Sircon.parse("x*0").eval().toString());
    assertEquals("x", Sircon.parse("1*x").eval().toString());
    assertEquals("-2 * x", Sircon.parse("-2*x").eval().toString());
    assertEquals("2 * x", Sircon.parse("x*2").eval().toString());
    assertEquals("x^2", Sircon.parse("x*x").eval().toString());
    assertEquals("y * x^2", Sircon.parse("x*y*x").eval().toString());
    assertEquals("7", Sircon.parse("1+2*3").eval().toString());
    assertEquals("7", Sircon.parse("2*3+1").eval().toString());
  }

  public void testDivision() {
    assertEquals("2", Sircon.parse("6/3").eval().toString());
    assertEquals("2", Sircon.parse("-6/-3").eval().toString());
    assertEquals("-2", Sircon.parse("6/-3").eval().toString());
    assertEquals("-2", Sircon.parse("-6/3").eval().toString());
    assertEquals("1/2", Sircon.parse("1/2").eval().toString());
    assertEquals("1/2", Sircon.parse("2/4").eval().toString());
    assertEquals("x / y", Sircon.parse("x/y").eval().toString());
    assertEquals("1", Sircon.parse("x/x").eval().toString());
    assertEquals("1 / x", Sircon.parse("x/x/x").eval().toString());
    assertEquals("x", Sircon.parse("x/(x/x)").eval().toString());
    assertEquals("x", Sircon.parse("x/1").eval().toString());
    assertEquals("0", Sircon.parse("0/x").eval().toString());
    try {
      Sircon.parse("x/0").eval();
      fail();
    } catch (final ArithmeticException e) {
      // expected
    }
  }

  public void testDivisionCombos() {
    assertEquals("1", Sircon.parse("(x/y)*(y/x)").eval().toString());
    assertEquals("1", Sircon.parse("(x*y)/(y*x)").eval().toString());
    assertEquals("1", Sircon.parse("x*y/x/y").eval().toString());
    assertEquals("x", Sircon.parse("(x*x)/x").eval().toString());
  }

  public void testPowers() {
    assertEquals("8", Sircon.parse("2^3").eval().toString());
    assertEquals("64", Sircon.parse("(2^3)^2").eval().toString());
    assertEquals("512", Sircon.parse("2^3^2").eval().toString());
    assertEquals("1", Sircon.parse("x^0").eval().toString());
    assertEquals("x", Sircon.parse("x^1").eval().toString());
    assertEquals("0", Sircon.parse("0^x").eval().toString());
    assertEquals("1", Sircon.parse("1^x").eval().toString());
    assertEquals("1", Sircon.parse("1^(-1)").eval().toString());
    assertEquals("-4", Sircon.parse("-2^2").eval().toString());
    assertEquals("4", Sircon.parse("(-2)^2").eval().toString());
  }

  public void testMod() {
    assertEquals("2", Sircon.parse("6%4").eval().toString());
    assertEquals("2", Sircon.parse("12/2%4").eval().toString());
  }

  public void test() {
    assertEquals("2", Sircon.parse("+2--0").eval().toString());
    assertEquals("2", Sircon.parse("+-2-2+2++4").eval().toString());
    assertEquals("-120", Sircon.parse("-5!").eval().toString());
    assertEquals("64", Sircon.parse("2^3!").eval().toString());
    assertEquals("14400", Sircon.parse("5!^2").eval().toString());
  }
}

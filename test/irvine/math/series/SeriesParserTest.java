package irvine.math.series;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SeriesParserTest extends TestCase {

  private void check(final String expected, final String expression) {
    final String result = SeriesRing.SQ.toString(new SeriesParser().parse(expression), 10);
    if (expected.equals(result)) {
      return;
    }
    assertEquals("Expression: " + expression + "\nTokens: " + new SeriesParser().tokenize(expression).toString(), expected, result);
  }

  public void testSimple() {
    check("1", "1");
    check("x", "x");
    check("x^2", "x^2");
    check("1+x", "x+1");
    check("1+x", "1+x");
    check("1+x", "(1+x)");
    check("(1/2)*x^2", "(1/2)*x^2");
    check("(1/2)*x^2", "(1/2)x^2");
  }

  public void testArithmeticOnSeries() {
    check("1+3*x+3*x^2+x^3", "(1+x)^3");
    check("1-x+x^2-x^3+x^4-x^5+x^6-x^7+x^8-x^9+x^10", "1/(1+x)");
    check("1+x+x^2+x^3+x^4+x^5+x^6+x^7+x^8+x^9+x^10", "1/(1-x)");
    check("3+3*x+9*x^4", "3*(1+x+3*x^4)");
    check("3+3*x+9*x^4", "(1+x+3*x^4)*3");
  }

  public void testRationalPowers() {
    check("1+10*x+(105/2)*x^2+210*x^3+(5775/8)*x^4+(9009/4)*x^5+(105105/16)*x^6+(36465/2)*x^7+(6235515/128)*x^8+(8083075/64)*x^9+(81800719/256)*x^10", "(1+3*x)/(1-2*x)^(7/2)");
  }

  public void testFunctions() {
    check("1+x+(1/2)*x^2+(1/6)*x^3+(1/24)*x^4+(1/120)*x^5+(1/720)*x^6+(1/5040)*x^7+(1/40320)*x^8+(1/362880)*x^9+(1/3628800)*x^10", "exp(x)");
    check("x-(1/2)*x^2+(1/3)*x^3-(1/4)*x^4+(1/5)*x^5-(1/6)*x^6+(1/7)*x^7-(1/8)*x^8+(1/9)*x^9-(1/10)*x^10", "log1p(x)");
    check("x-(1/2)*x^2+(1/3)*x^3-(1/4)*x^4+(1/5)*x^5-(1/6)*x^6+(1/7)*x^7-(1/8)*x^8+(1/9)*x^9-(1/10)*x^10", "log(1+x)");
    check("1+(1/2)*x-(1/8)*x^2+(1/16)*x^3-(5/128)*x^4+(7/256)*x^5-(21/1024)*x^6+(33/2048)*x^7-(429/32768)*x^8+(715/65536)*x^9-(2431/262144)*x^10", "sqrt(1+x)");
    check("x-(1/6)*x^3+(1/120)*x^5-(1/5040)*x^7+(1/362880)*x^9", "sin(x)");
    check("1-(1/2)*x^2+(1/24)*x^4-(1/720)*x^6+(1/40320)*x^8-(1/3628800)*x^10", "cos(x)");
    check("x+(1/3)*x^3+(2/15)*x^5+(17/315)*x^7+(62/2835)*x^9", "tan(x)");
    check("1+(1/2)*x^2+(5/24)*x^4+(61/720)*x^6+(277/8064)*x^8+(50521/3628800)*x^10", "sec(x)");
    check("1-(1/3)*x^2-(1/45)*x^4-(2/945)*x^6-(1/4725)*x^8-(2/93555)*x^10", "xcot(x)");
    check("1-(1/3)*x^2-(1/45)*x^4-(2/945)*x^6-(1/4725)*x^8-(2/93555)*x^10", "x * cot(x)");
    check("1+(1/6)*x^2+(7/360)*x^4+(31/15120)*x^6+(127/604800)*x^8+(73/3421440)*x^10", "xcsc(x)");
    check("1+(1/6)*x^2+(7/360)*x^4+(31/15120)*x^6+(127/604800)*x^8+(73/3421440)*x^10", "x * csc(x)");
    check("x+(1/6)*x^3+(3/40)*x^5+(5/112)*x^7+(35/1152)*x^9", "asin(x)");
  }

  public void testArgumentsToFunctions() {
    check("1+x+(3/2)*x^2+(7/6)*x^3+(25/24)*x^4+(27/40)*x^5+(331/720)*x^6+(1303/5040)*x^7+(1979/13440)*x^8+(5357/72576)*x^9+(19093/518400)*x^10", "exp(x+x^2)");
    check("x+x^2+(3/2)*x^3+(13/6)*x^4+(73/24)*x^5+(167/40)*x^6+(4051/720)*x^7+(37633/5040)*x^8+(43817/4480)*x^9+(4596553/362880)*x^10", "x*exp(x/(1-x))");
  }
}

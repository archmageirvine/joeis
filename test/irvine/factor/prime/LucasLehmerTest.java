package irvine.factor.prime;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the Lucas-Lehmer implementation.
 * @author Sean A. Irvine
 */
public class LucasLehmerTest extends TestCase {

  private static final Z[] BAD_FORM = {
    new Z("2"),
    new Z("4"),
    new Z("5"),
    new Z("254"),
    new Z("24823453755734757537"),
    new Z("0"),
    new Z("-1"),
    new Z("-3"),
  };

  public void testInvalid() {
    // try some numbers not of the form 2^m-1
    final LucasLehmer ll = new LucasLehmer();
    for (final Z badForm : BAD_FORM) {
      try {
        ll.isPrime(badForm);
        fail("Number not of form 2^m-1 accepted by Lucas-Lehmer");
      } catch (final ArithmeticException e) {
        // ok
      }
    }
  }

  private static final Z[] BAD_FORM2 = {
    new Z("15"),
    new Z("63"),
    new Z("511"),
    new Z("3369993333393829974333376885877453834204643052817571560137951281151"),
    new Z("994646472819573284310764496293641680200912301594695434880927953786318994025066751066111"),
  };

  public void testExponentNotPrime() {
    // try some numbers not of the form 2^m-1
    final LucasLehmer ll = new LucasLehmer();
    for (final Z badForm : BAD_FORM2) {
      try {
        assertTrue(String.valueOf(badForm), !ll.isPrime(badForm));
      } catch (final ArithmeticException e) {
        fail("Number " + badForm + " had valid form but Lucas-Lehmer said it did not");
      }
    }
  }

  private static final Z[] BAD_FORM3 = {
    new Z("2047"),
    new Z("8388607"),
    new Z("536870911"),
    new Z("8796093022207"),
    new Z("27459190640522438859927603196325572869077741200573221637577853836742172733590624208490238562645818219909185245565923432148487951998866575250296113164460228607"),
  };

  public void testNonMersennePrime() {
    // try some numbers not of the form 2^m-1
    final LucasLehmer ll = new LucasLehmer();
    for (final Z badForm : BAD_FORM3) {
      try {
        assertTrue(!ll.isPrime(badForm));
      } catch (final ArithmeticException e) {
        fail("Number " + badForm + " had valid form but Lucas-Lehmer said it did not");
      }
    }
  }

  private static final Z[] MERSENNE = {
    new Z("7"),
    new Z("31"),
    new Z("8191"),
    new Z("131071"),
    new Z("524287"),
    new Z("2147483647"),
    new Z("2305843009213693951"),
    new Z("618970019642690137449562111"),
    new Z("162259276829213363391578010288127"),
    new Z("170141183460469231731687303715884105727"),
    new Z("6864797660130609714981900799081393217269435300143305409394463459185543183397656052122559640661454554977296311391480858037121987999716643812574028291115057151"),
    new Z("531137992816767098689588206552468627329593117727031923199444138200403559860852242739162502265229285668889329486246501015346579337652707239409519978766587351943831270835393219031728127"),
    new Z("10407932194664399081925240327364085538615262247266704805319112350403608059673360298012239441732324184842421613954281007791383566248323464908139906605677320762924129509389220345773183349661583550472959420547689811211693677147548478866962501384438260291732348885311160828538416585028255604666224831890918801847068222203140521026698435488732958028878050869736186900714720710555703168729087"),
  };

  public void testMersennePrime() {
    // try some numbers not of the form 2^m-1
    final LucasLehmer ll = new LucasLehmer();
    for (final Z m : MERSENNE) {
      try {
        assertTrue(String.valueOf(m), ll.isPrime(m));
      } catch (final ArithmeticException e) {
        fail("Number " + m + " had valid form but Lucas-Lehmer said it did not");
      }
    }
  }

}

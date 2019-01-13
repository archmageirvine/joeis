package irvine.math.r;

import junit.framework.TestCase;

import static irvine.TestUtils.assertEqualsLocal;
import static irvine.math.r.Zeta.zeta;
import static irvine.math.r.Zeta.zetaComplement;
import static java.lang.Double.NaN;
import static java.lang.Double.POSITIVE_INFINITY;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class ZetaTest extends TestCase {

  public void testZeta() {
    // THIS TEST DOES NOT YET COVER ENOUGH POSSIBILITIES
    // The implementation is not full analytic either
    /* double NaN */
    assertEqualsLocal(NaN, zeta(NaN, NaN), 0.0);

    /* x = 1 */
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, Double.NEGATIVE_INFINITY), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, 1.0), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, 0.0), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, -1.0), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, 0.5), 0.0);
    assertEqualsLocal(POSITIVE_INFINITY, zeta(1.0, Double.MAX_VALUE), 0.0);

    assertEquals(10.58444846495080982638640079356, zeta(1.1, 1.0), 1E-12);
    assertEquals(5.59158244117775077653656319442, zeta(1.2, 1.0), 1E-12);
    assertEquals(3.93194921180954422697490751125, zeta(1.3, 1.0), 1E-12);
    assertEquals(3.105547277977580399782927216150, zeta(1.4, 1.0), 1E-12);
    assertEquals(2.61237534868548834334856756827, zeta(1.5, 1.0), 1E-12);
    assertEquals(2.285765665680129876625734075226, zeta(1.6, 1.0), 1E-12);
    assertEquals(2.0542887568377512392810153731435, zeta(1.7, 1.0), 1E-12);
    assertEquals(1.88222961810282204666594624820, zeta(1.8, 1.0), 1E-12);
    assertEquals(1.74974643512506081397949100015, zeta(1.9, 1.0), 1E-12);
    assertEquals(1.64493406684822643647241516682, zeta(2.0, 1.0), 1E-12);
    assertEquals(1.56021653350336208371051676983, zeta(2.1, 1.0), 1E-12);
    assertEquals(1.490543256506893508253446495662, zeta(2.2, 1.0), 1E-12);
    assertEquals(1.432417799315323715922350216096, zeta(2.3, 1.0), 1E-12);
    assertEquals(1.383342858840735728160817869556, zeta(2.4, 1.0), 1E-12);
    assertEquals(1.341487257250917179756769693462, zeta(2.5, 1.0), 1E-12);
    assertEquals(1.305477809072780593880569785911, zeta(2.6, 1.0), 1E-12);
    assertEquals(1.274264644443679949598823522584, zeta(2.7, 1.0), 1E-12);
    assertEquals(1.247031422317253247251470450063, zeta(2.8, 1.0), 1E-12);
    assertEquals(1.115989079123337644682801975456, zeta(3.6, 1.0), 1E-12);
    assertEquals(1.106288241464679260669076884140, zeta(3.7, 1.0), 1E-12);
    assertEquals(1.097510576459004258700817563356, zeta(3.8, 1.0), 1E-12);
    assertEquals(1.089552184670321268720460242559, zeta(3.9, 1.0), 1E-12);
    assertEquals(1.082323233711138191516003696580, zeta(4.0, 1.0), 1E-12);
    assertEquals(1.075745690343503522810101227711, zeta(4.1, 1.0), 1E-12);
    assertEquals(1.069751477233809409416855896300, zeta(4.2, 1.0), 1E-12);
    assertEquals(1.064280964325840010056817639145, zeta(4.3, 1.0), 1E-12);
    assertEquals(1.0341854746874896233263340239242, zeta(5.1, 1.0), 1E-12);
    assertEquals(1.0316598766779166098678253268638, zeta(5.2, 1.0), 1E-12);
    assertEquals(1.0293322056832193503164328474597, zeta(5.3, 1.0), 1E-12);
    assertEquals(1.0271855389203538255266179377901, zeta(5.4, 1.0), 1E-12);
    assertEquals(1.0252045799546856945924058281976, zeta(5.5, 1.0), 1E-12);
    assertEquals(1.0233754792270299108604178810407, zeta(5.6, 1.0), 1E-12);
    assertEquals(1.0216856774262200614681750494943, zeta(5.7, 1.0), 1E-12);
    assertEquals(1.0129170887121840111700639077876, zeta(6.4, 1.0), 1E-12);
    assertEquals(1.0120058998885247961007849168076, zeta(6.5, 1.0), 1E-12);
    assertEquals(1.0111610141542709642731253226705, zeta(6.6, 1.0), 1E-12);
    assertEquals(1.0103773705263809288038146192124, zeta(6.7, 1.0), 1E-12);
    assertEquals(1.0096503223447118864972587888378, zeta(6.8, 1.0), 1E-12);
    assertEquals(1.0089755999933342287193683245807, zeta(6.9, 1.0), 1E-12);
    assertEquals(1.00582672753652280770224164440504, zeta(7.5, 1.0), 1E-12);
    assertEquals(1.00542413598796348989572439339326, zeta(7.6, 1.0), 1E-12);
    assertEquals(1.00504987929596499812178165124730, zeta(7.7, 1.0), 1E-12);
    assertEquals(1.00470190481646950322655593867752, zeta(7.8, 1.0), 1E-12);
    assertEquals(1.00437831526665277479985152043737, zeta(7.9, 1.0), 1E-12);
    assertEquals(1.00407735619794433937868523851231, zeta(8.0, 1.0), 1E-12);
    assertEquals(1.00379740456819558452702414641969, zeta(8.1, 1.0), 1E-12);
    assertEquals(1.00200839282608221441785276923490, zeta(9.0, 1.0), 1E-12);
    assertEquals(1.00187171915112747463883954250375, zeta(9.1, 1.0), 1E-12);
    assertEquals(1.00174443349958976311533618905686, zeta(9.2, 1.0), 1E-12);
    assertEquals(1.00162588147493727184164563992226, zeta(9.3, 1.0), 1E-12);
    assertEquals(1.00151545534805135210064592322825, zeta(9.4, 1.0), 1E-12);
    assertEquals(1.00141259061217366227120986538949, zeta(9.5, 1.0), 1E-12);
    assertEquals(1.00131676280526472869030427286074, zeta(9.6, 1.0), 1E-12);
    assertEquals(1.00070084264173615521950374058876, zeta(10.5, 1.0), 1E-12);
    assertEquals(1.00065351241408491600915011433692, zeta(10.6, 1.0), 1E-12);
    assertEquals(1.00060939402273428314344941086098, zeta(10.7, 1.0), 1E-12);
    assertEquals(1.000348655883491759901169167789938, zeta(11.5, 1.0), 1E-12);
    assertEquals(1.000325178276194589402348597931603, zeta(11.6, 1.0), 1E-12);
    assertEquals(1.000303286563969261686538423182537, zeta(11.7, 1.0), 1E-12);
    assertEquals(1.000173751733643178193389049608895, zeta(12.5, 1.0), 1E-12);
    assertEquals(1.000162073788746101733147802520648, zeta(12.6, 1.0), 1E-12);
    assertEquals(1.000151182338367225558892207610361, zeta(12.7, 1.0), 1E-12);
    assertEquals(1.000141024242209008473498646884361, zeta(12.8, 1.0), 1E-12);
    assertEquals(1.000131549968615238174689836651234, zeta(12.9, 1.0), 1E-12);
    assertEquals(1.000122713347578489146751836504843, zeta(13.0, 1.0), 1E-12);
    assertEquals(1.000070376597450450153281631699459, zeta(13.8, 1.0), 1E-12);
    assertEquals(1.000065653703472056129792702598255, zeta(13.9, 1.0), 1E-12);
    assertEquals(1.000061248135058704829258545097502, zeta(14.0, 1.0), 1E-12);
    assertEquals(1.0000571385317306639795916114793338, zeta(14.1, 1.0), 1E-12);
    assertEquals(1.0000533049750668926783602917437252, zeta(14.2, 1.0), 1E-12);
    assertEquals(1.0000497288909063980771815701521099, zeta(14.3, 1.0), 1E-12);
    assertEquals(1.0000463929582293614393457509435377, zeta(14.4, 1.0), 1E-12);
    assertEquals(1.0000432810242567730308566395546961, zeta(14.5, 1.0), 1E-12);
    assertEquals(1.0000403780253397029516072170543080, zeta(14.6, 1.0), 1E-12);
    assertEquals(1.0000376699132393913058362675977214, zeta(14.7, 1.0), 1E-12);
    assertEquals(1.0000351435864272399674955147168379, zeta(14.8, 1.0), 1E-12);
    assertEquals(1.0000327868260596899141313526574705, zeta(14.9, 1.0), 1E-12);
    assertEquals(1.0000305882363070204935517284980904, zeta(15.0, 1.0), 1E-12);

  }

  public void testzetacomplement() {
    // positive tests against zeta
    for (double x = 1.1; x < 100.0; x += 0.1) {
      assertEqualsLocal("x=" + x, zeta(x, 1.0) - 1.0, zetaComplement(x), 1.0E-7);
    }
    // extra tests from magma
    assertEqualsLocal(-1.00228785, zetaComplement(-9.87), 1.0E-7);
    assertEqualsLocal(-1.00420153, zetaComplement(-9.74), 1.0E-7);
    assertEqualsLocal(-1.00571364, zetaComplement(-9.61), 1.0E-7);
    assertEqualsLocal(-1.00681497, zetaComplement(-9.48), 1.0E-7);
    assertEqualsLocal(-1.00751229, zetaComplement(-9.35), 1.0E-7);
    assertEqualsLocal(-1.00782599, zetaComplement(-9.22), 1.0E-7);
    assertEqualsLocal(-1.00778765, zetaComplement(-9.09), 1.0E-7);
    assertEqualsLocal(-1.00743751, zetaComplement(-8.96), 1.0E-7);
    assertEqualsLocal(-1.00682207, zetaComplement(-8.83), 1.0E-7);
    assertEqualsLocal(-1.00599187, zetaComplement(-8.7), 1.0E-7);
    assertEqualsLocal(-1.00499931, zetaComplement(-8.57), 1.0E-7);
    assertEqualsLocal(-1.00389683, zetaComplement(-8.44), 1.0E-7);
    assertEqualsLocal(-1.00273525, zetaComplement(-8.31), 1.0E-7);
    assertEqualsLocal(-1.00156235, zetaComplement(-8.18), 1.0E-7);
    assertEqualsLocal(-1.00042175, zetaComplement(-8.05), 1.0E-7);
    assertEqualsLocal(-0.999352015614, zetaComplement(-7.92), 1.0E-7);
    assertEqualsLocal(-0.998386019133, zetaComplement(-7.79), 1.0E-7);
    assertEqualsLocal(-0.997550508745, zetaComplement(-7.66), 1.0E-7);
    assertEqualsLocal(-0.996865903056, zetaComplement(-7.53), 1.0E-7);
    assertEqualsLocal(-0.996346267877, zetaComplement(-7.4), 1.0E-7);
    assertEqualsLocal(-0.9959994593, zetaComplement(-7.27), 1.0E-7);
    assertEqualsLocal(-0.995827408861, zetaComplement(-7.14), 1.0E-7);
    assertEqualsLocal(-0.995826527259, zetaComplement(-7.01), 1.0E-7);
    assertEqualsLocal(-0.995988203591, zetaComplement(-6.88), 1.0E-7);
    assertEqualsLocal(-0.99629937807, zetaComplement(-6.75), 1.0E-7);
    assertEqualsLocal(-0.996743167601, zetaComplement(-6.62), 1.0E-7);
    assertEqualsLocal(-0.997299525265, zetaComplement(-6.49), 1.0E-7);
    assertEqualsLocal(-0.997945916625, zetaComplement(-6.36), 1.0E-7);
    assertEqualsLocal(-0.998657997823, zetaComplement(-6.23), 1.0E-7);
    assertEqualsLocal(-0.999410282467, zetaComplement(-6.1), 1.0E-7);
    assertEqualsLocal(-1.00017679, zetaComplement(-5.97), 1.0E-7);
    assertEqualsLocal(-1.00093164, zetaComplement(-5.84), 1.0E-7);
    assertEqualsLocal(-1.00164967, zetaComplement(-5.71), 1.0E-7);
    assertEqualsLocal(-1.00230692, zetaComplement(-5.58), 1.0E-7);
    assertEqualsLocal(-1.00288116, zetaComplement(-5.45), 1.0E-7);
    assertEqualsLocal(-1.00335229, zetaComplement(-5.32), 1.0E-7);
    assertEqualsLocal(-1.00370276, zetaComplement(-5.19), 1.0E-7);
    assertEqualsLocal(-1.0039179, zetaComplement(-5.06), 1.0E-7);
    assertEqualsLocal(-1.00398623, zetaComplement(-4.93), 1.0E-7);
    assertEqualsLocal(-1.00389969, zetaComplement(-4.8), 1.0E-7);
    assertEqualsLocal(-1.00365387, zetaComplement(-4.67), 1.0E-7);
    assertEqualsLocal(-1.00324822, zetaComplement(-4.54), 1.0E-7);
    assertEqualsLocal(-1.00268616, zetaComplement(-4.41), 1.0E-7);
    assertEqualsLocal(-1.00197525, zetaComplement(-4.28), 1.0E-7);
    assertEqualsLocal(-1.00112731, zetaComplement(-4.15), 1.0E-7);
    assertEqualsLocal(-1.00015851, zetaComplement(-4.02), 1.0E-7);
    assertEqualsLocal(-0.999089559688, zetaComplement(-3.89), 1.0E-7);
    assertEqualsLocal(-0.997945753624, zetaComplement(-3.76), 1.0E-7);
    assertEqualsLocal(-0.996757199601, zetaComplement(-3.63), 1.0E-7);
    assertEqualsLocal(-0.995558988665, zetaComplement(-3.5), 1.0E-7);
    assertEqualsLocal(-0.994391448481, zetaComplement(-3.37), 1.0E-7);
    assertEqualsLocal(-0.993300460727, zetaComplement(-3.24), 1.0E-7);
    assertEqualsLocal(-0.992337867094, zetaComplement(-3.11), 1.0E-7);
    assertEqualsLocal(-0.991561988166, zetaComplement(-2.98), 1.0E-7);
    assertEqualsLocal(-0.991038284977, zetaComplement(-2.85), 1.0E-7);
    assertEqualsLocal(-0.990840200423, zetaComplement(-2.72), 1.0E-7);
    assertEqualsLocal(-0.991050227535, zetaComplement(-2.59), 1.0E-7);
    assertEqualsLocal(-0.991761264934, zetaComplement(-2.46), 1.0E-7);
    assertEqualsLocal(-0.99307833782, zetaComplement(-2.33), 1.0E-7);
    assertEqualsLocal(-0.995120787641, zetaComplement(-2.2), 1.0E-7);
    assertEqualsLocal(-0.998025067896, zetaComplement(-2.07), 1.0E-7);
    assertEqualsLocal(-1.00194833, zetaComplement(-1.94), 1.0E-7);
    assertEqualsLocal(-1.00707306, zetaComplement(-1.81), 1.0E-7);
    assertEqualsLocal(-1.01361311, zetaComplement(-1.68), 1.0E-7);
    assertEqualsLocal(-1.02182161, zetaComplement(-1.55), 1.0E-7);
    assertEqualsLocal(-1.0320015, zetaComplement(-1.42), 1.0E-7);
    assertEqualsLocal(-1.04451969, zetaComplement(-1.29), 1.0E-7);
    assertEqualsLocal(-1.05982632, zetaComplement(-1.16), 1.0E-7);
    assertEqualsLocal(-1.07848159, zetaComplement(-1.03), 1.0E-7);
    assertEqualsLocal(-1.1011935, zetaComplement(-0.9), 1.0E-7);
    assertEqualsLocal(-1.12887233, zetaComplement(-0.77), 1.0E-7);
    assertEqualsLocal(-1.16271104, zetaComplement(-0.64), 1.0E-7);
    assertEqualsLocal(-1.2043073, zetaComplement(-0.51), 1.0E-7);
    assertEqualsLocal(-1.25585436, zetaComplement(-0.38), 1.0E-7);
    assertEqualsLocal(-1.32045126, zetaComplement(-0.25), 1.0E-7);
    assertEqualsLocal(-1.4026289, zetaComplement(-0.12), 1.0E-7);
    assertEqualsLocal(-1.50929071, zetaComplement(0.01), 1.0E-7);
    assertEqualsLocal(-1.65150649, zetaComplement(0.14), 1.0E-7);
    assertEqualsLocal(-1.84822293, zetaComplement(0.27), 1.0E-7);
    assertEqualsLocal(-2.13479778, zetaComplement(0.4), 1.0E-7);
    assertEqualsLocal(-2.58569724, zetaComplement(0.53), 1.0E-7);
    assertEqualsLocal(-3.38926352, zetaComplement(0.66), 1.0E-7);
    assertEqualsLocal(-5.20019074, zetaComplement(0.79), 1.0E-7);
    assertEqualsLocal(-12.92864043, zetaComplement(0.92), 1.0E-7);
  }

}

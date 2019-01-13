package irvine.math.r;

import junit.framework.TestCase;

import static irvine.TestUtils.assertEqualsLocal;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class GammaTest extends TestCase {

  public void testLgamma() {
    assertEqualsLocal(Double.NaN, Gamma.lgamma(Double.NaN), 0);
    assertEquals(1, Gamma.sLGammaSign);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(Double.NEGATIVE_INFINITY), 0);
    assertEquals(1, Gamma.sLGammaSign);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(0), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-1), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-1E8), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(Double.POSITIVE_INFINITY), 0);
    assertEquals(1, Gamma.sLGammaSign);
    assertEquals("lgamma of 1", 0, Gamma.lgamma(1), 1E-15);
    assertEquals(1, Gamma.sLGammaSign);
    assertEquals("lgamma of 2", 0, Gamma.lgamma(2), 1E-15);
    assertEquals(1, Gamma.sLGammaSign);
    assertEquals(0.449461741820067667002507816558, Gamma.lgamma(Math.E), 1E-15);
    assertEquals(1, Gamma.sLGammaSign);
    assertEquals(4.5951701775E202, Gamma.lgamma(1E200), 1E197);
    assertEquals(2.252712651734205959869701646391, Gamma.lgamma(0.1), 1E-12);
    assertEquals(1.52406382243078452488105649393, Gamma.lgamma(0.2), 1E-12);
    assertEquals(1.095797994818075521677168142385, Gamma.lgamma(0.3), 1E-12);
    assertEquals(0.79667781770178376654473596240, Gamma.lgamma(0.4), 1E-12);
    assertEquals(0.57236494292470008707171367568, Gamma.lgamma(0.5), 1E-12);
    assertEquals(0.398233858069234899616854220407, Gamma.lgamma(0.6), 1E-12);
    assertEquals(0.260867246531666514385732417030, Gamma.lgamma(0.7), 1E-12);
    assertEquals(0.152059678399837588778292602310, Gamma.lgamma(0.8), 1E-12);
    assertEquals(0.066376239734742971188716739887, Gamma.lgamma(0.9), 1E-12);
    assertEquals(-0.0498724412598397241482898082963, Gamma.lgamma(1.1), 1E-12);
    assertEquals(-0.085374090003315849719702839280, Gamma.lgamma(1.2), 1E-12);
    assertEquals(-0.108174809507860470945578075375, Gamma.lgamma(1.3), 1E-12);
    assertEquals(-0.095807697407065864526906294257, Gamma.lgamma(1.7), 1E-12);
    assertEquals(-0.071083872914372166988002488072, Gamma.lgamma(1.8), 1E-12);
    assertEquals(-0.0389842759230833300387842410452, Gamma.lgamma(1.9), 1E-12);
    assertEquals(0.0454377385444851358956623148317, Gamma.lgamma(2.1), 1E-12);
    assertEquals(0.096947466790638776492015185693, Gamma.lgamma(2.2), 1E-12);
    assertEquals(0.60286961024931144595225173584, Gamma.lgamma(2.9), 1E-12);
    assertEquals(0.69314718055994530941723212102, Gamma.lgamma(3), 1E-12);
    assertEquals(0.78737508327386244837826884018, Gamma.lgamma(3.1), 1E-12);
    assertEquals(3.178053830347945619646941599920, Gamma.lgamma(5), 1E-12);
    assertEquals(4.119913457533529765327962022505, Gamma.lgamma(5.6), 1E-12);
    assertEquals(4.283967655031579585025444554690, Gamma.lgamma(5.7), 1E-12);
    assertEquals(4.449939193815090411578004549175, Gamma.lgamma(5.8), 1E-12);
    assertEquals(7.147892523022249032777057151701, Gamma.lgamma(7.3), 1E-12);
    assertEquals(7.340404976284927624092321607119, Gamma.lgamma(7.4), 1E-12);
    assertEquals(7.53436423675873295515836762967, Gamma.lgamma(7.5), 1E-12);
    assertEquals(7.72974970430701317552344915622, Gamma.lgamma(7.6), 1E-12);
    assertEquals(11.252022385979146717308655319132, Gamma.lgamma(9.3), 1E-12);
    assertEquals(11.470116682344319625176728709330, Gamma.lgamma(9.4), 1E-12);
    assertEquals(11.68933342079726848256944257030, Gamma.lgamma(9.5), 1E-12);
    assertEquals(11.90966015485876061922103255184, Gamma.lgamma(9.6), 1E-12);
    assertEquals(15.81418068137394705736568427990, Gamma.lgamma(11.3), 1E-12);
    assertEquals(16.0526321777676048176841123908529, Gamma.lgamma(11.4), 1E-12);
    assertEquals(16.292000476567241320244603732946, Gamma.lgamma(11.5), 1E-12);
    assertEquals(19.987214495661885, Gamma.lgamma(13), 1E-12);
    assertEquals(20.74858266947061375317384146695, Gamma.lgamma(13.3), 1E-12);
    assertEquals(21.00394200577904577523326283197978, Gamma.lgamma(13.4), 1E-12);
    assertEquals(24.65773699309628173050146428728, Gamma.lgamma(14.8), 1E-12);
    assertEquals(24.92413200221727735252938451062, Gamma.lgamma(14.9), 1E-12);
    assertEquals(25.191221182738681500093434666799, Gamma.lgamma(15), 1E-12);
    assertEquals(51.60667556776438, Gamma.lgamma(24), 1E-12);
    assertEquals(54.78472939811232, Gamma.lgamma(25), 1E-12);
    assertEquals(5905.220423209181, Gamma.lgamma(1000), 1E-9);
    assertEquals(5912.128178488164, Gamma.lgamma(1001), 1E-9);
    assertEquals(82099.71749644238, Gamma.lgamma(10000), 1E-9);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(2.556349E305), 0);
    double sum = 0;
    int signSum = 0;
    for (double x = 0.323124; x < 50; x += 0.1) {
      sum += Gamma.lgamma(-x);
      signSum += Gamma.lgammaSign();
    }
    assertEquals(-30406.499670767767, sum, 1E-6);
    assertEquals(3, signSum);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-3), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-4), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-5), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-34), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-35), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-36), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-35.000000000000001), 0);
    assertEqualsLocal(-59.558258117369675, Gamma.lgamma(-35.00000000000001), 1E-10);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.lgamma(-36.000000000000001), 0);
    assertEqualsLocal(-63.141777055825784, Gamma.lgamma(-36.00000000000001), 1E-10);
    assertEqualsLocal(-341666.389960053, Gamma.lgamma(ConstantsTest.bump(-36000)), 1E-7);
  }

  public void testGamma() {
    assertEqualsLocal(Double.NaN, Gamma.gamma(Double.NaN), 0);
    assertEqualsLocal(Double.NaN, Gamma.gamma(Double.NEGATIVE_INFINITY), 0);
    assertEqualsLocal(Double.NaN, Gamma.gamma(0), 0);
    assertEqualsLocal(Double.NaN, Gamma.gamma(-1E8), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.gamma(Double.POSITIVE_INFINITY), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.gamma(Double.MAX_VALUE), 0);
    assertEqualsLocal(1, Gamma.gamma(1), 1E-15);
    assertEqualsLocal(3.8543707171800725E247, Gamma.gamma(144), 1E240);
    for (int i = 2, j = 1; i < 13; j *= i, ++i) {
      assertEquals((double) j, Gamma.gamma(i), 1E-10);
      assertEqualsLocal(Double.NaN, Gamma.gamma(-i), 0);
    }
    for (double x = 1.0; x < 180; x *= 1.1) {
      final double a = Gamma.gamma(x);
      final double b = Math.exp(Gamma.lgamma(x));
      if (a != b) {
        assertEquals(0, (a - b) / (a + b), 1E-10);
      }
    }
    double sum = 0;
    for (double x = 0.1232132; x < 150; x += 3.434) {
      sum += Gamma.gamma(-x);
    }
    assertEquals(0, Gamma.gamma(-5000.0000000008085), 0);
    assertEquals(9.51334242537717E38, Gamma.gamma(35.33), 1E27);
    assertEquals(8.986365759964845E-35, Gamma.gamma(-37.0000000008085), 1E-45);
    assertEquals(3.7149225081822204E-44, Gamma.gamma(-37.5000000008085), 1E-50);
    assertEquals(-2.3648330946772757E-36, Gamma.gamma(-38.0000000008085), 1E-45);
    assertEquals(-9.64914937169924E-46, Gamma.gamma(-38.5000000008085), 1E-50);
    assertEquals(9.900990093237743E8, Gamma.gamma(1.01E-9), 1);
    assertEquals(4.999999994227844E8, Gamma.gamma(2E-9), 1);
    assertEquals(9.999999942278434E7, Gamma.gamma(1E-8), 1);
    assertEquals(9.999999994227842E8, Gamma.gamma(1E-9), 1);
    assertEquals(9.999999999422785E9, Gamma.gamma(1E-10), 1);
    assertEquals(1.1111111105338955E9, Gamma.gamma(0.9E-9), 1);
    assertEquals(-9.900990104782058E8, Gamma.gamma(-1.01E-9), 1);
    assertEquals(-5.0000000057721555E8, Gamma.gamma(-2E-9), 1);
    assertEquals(-1.0000000057721569E8, Gamma.gamma(-1E-8), 1);
    assertEquals(-1.0000000005772154E9, Gamma.gamma(-1E-9), 1);
    assertEquals(-1.0000000000577215E10, Gamma.gamma(-1E-10), 1);
    assertEquals(-1.1111111116883268E9, Gamma.gamma(-0.9E-9), 1);
    assertEquals(-8.60051423197669, sum, 1E-10);
    assertEquals(99.432585119150603713532988871520, Gamma.gamma(0.01), 1E-12);
    assertEquals(24.460955022856118121501985351557, Gamma.gamma(0.04), 1E-12);
    assertEquals(13.77360060773380641242141244560, Gamma.gamma(0.07), 1E-12);
    assertEquals(9.51350769866873183629248717755, Gamma.gamma(0.1), 1E-12);
    assertEquals(7.230241921011987158186547496788, Gamma.gamma(0.13), 1E-12);
    assertEquals(5.81126916645612695510818112296, Gamma.gamma(0.16), 1E-12);
    assertEquals(4.84676335333494474406905224424, Gamma.gamma(0.19), 1E-12);
    assertEquals(4.150481579592778577826351133603, Gamma.gamma(0.22), 1E-12);
    assertEquals(3.62560990822190831193068515600, Gamma.gamma(0.25), 1E-12);
    assertEquals(3.216851701829623234742103040942, Gamma.gamma(0.28), 1E-12);
    assertEquals(2.89033605401171446747396246312, Gamma.gamma(0.31), 1E-12);
    assertEquals(2.62416325649848356773843677906, Gamma.gamma(0.34), 1E-12);
    assertEquals(2.403550020078653248455913516184, Gamma.gamma(0.37), 1E-12);
    assertEquals(2.218159543757688223059054022007, Gamma.gamma(0.4), 1E-12);
    assertEquals(1.085307787467719509160240310380, Gamma.gamma(0.88), 1E-12);
    assertEquals(1.0606931055726903521285009113623, Gamma.gamma(0.91), 1E-12);
    assertEquals(1.0384030930559639345325884612863, Gamma.gamma(0.94), 1E-12);
    assertEquals(1.0182319420865892477404544497833, Gamma.gamma(0.97), 1E-12);
    assertEquals(-100.58719796441077919341265592520, Gamma.gamma(-0.01), 1E-12);
    assertEquals(-25.61829532168975730849711034024, Gamma.gamma(-0.04), 1E-12);
    assertEquals(-14.93697262340040809631955202523, Gamma.gamma(-0.07), 1E-12);
    assertEquals(-3.57842981927705889885790232754, Gamma.gamma(-0.55), 1E-12);
    assertEquals(-3.63857056489705316374349031548, Gamma.gamma(-0.58), 1E-12);
    assertEquals(-3.73204830511277779195407635823, Gamma.gamma(-0.61), 1E-12);
    assertEquals(-3.86364814390675980791511050494, Gamma.gamma(-0.64), 1E-12);
    assertEquals(-4.0406063024107329089858539287444, Gamma.gamma(-0.67), 1E-12);
    assertEquals(-4.273669982410843754732166450984, Gamma.gamma(-0.7), 1E-12);
    assertEquals(-4.57890951022580512227032158708, Gamma.gamma(-0.73), 1E-12);
    assertEquals(-4.98092685493398815381131833105, Gamma.gamma(-0.76), 1E-12);
    assertEquals(-5.51884564800095722995282287108, Gamma.gamma(-0.79), 1E-12);
    assertEquals(-6.258318525054449356715587378422, Gamma.gamma(-0.82), 1E-12);
    assertEquals(-7.317968087117503079303517263848, Gamma.gamma(-0.85), 1E-12);
    assertEquals(-8.93551312134378471350243284379, Gamma.gamma(-0.88), 1E-12);
    assertEquals(-11.66617201678633993613819758290, Gamma.gamma(-0.91), 1E-12);
    assertEquals(-17.176305842404935535614948417267, Gamma.gamma(-0.94), 1E-12);
    assertEquals(-33.79896737298364534255921681065, Gamma.gamma(-0.97), 1E-12);
  }

  public void testdigamma() {
    /* zero and negative integers are undefined */
    for (int i = 1; i < 100000; i *= 3) {
      assertEqualsLocal(Double.NaN, Gamma.digamma((double) -i), 0);
    }
    assertEqualsLocal(Double.NaN, Gamma.digamma(Double.NEGATIVE_INFINITY), 0);
    assertEqualsLocal(Double.NaN, Gamma.digamma(Double.NaN), 0);
    assertEqualsLocal(Double.NaN, Gamma.digamma(0), 0);
    assertEquals(11.3929159508926, Gamma.digamma(-5.1), 1E-7);
    assertEquals(-0.4568723049323835, Gamma.digamma(-5.7), 1E-12);
    assertEquals(1.611093149, Gamma.digamma(5.5), 1E-6); // Maple
    assertEquals(39.2392567607031, Gamma.digamma(1.1E17), 1E-8);
    assertEquals(9.210290371142849403571965846077, Gamma.digamma(10000), 1E-12);
    assertEquals(11.512920464961895086756706651802, Gamma.digamma(100000), 1E-12);
    assertEquals(13.81551005796419077077460906013, Gamma.digamma(1000000), 1E-12);
    assertEquals(16.118095600958318954792542994105, Gamma.digamma(10000000), 1E-12);
    assertEquals(18.420680738952365463809958693021, Gamma.digamma(100000000), 1E-12);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.digamma(Double.POSITIVE_INFINITY), 0);
    assertEquals(-10.423754940411076795168216213052, Gamma.digamma(0.1), 1E-12);
    assertEquals(-5.289039896592188295547207960412, Gamma.digamma(0.2), 1E-12);
    assertEquals(-3.50252422220013298896449450651, Gamma.digamma(0.3), 1E-12);
    assertEquals(-2.56138454458511614573067548159, Gamma.digamma(0.4), 1E-12);
    assertEquals(-1.96351002602142347944097633240, Gamma.digamma(0.5), 1E-12);
    assertEquals(-1.54061921389319041476066394839, Gamma.digamma(0.6), 1E-12);
    assertEquals(-1.220023553697934614748607244354, Gamma.digamma(0.7), 1E-12);
    assertEquals(-0.96500856670613845939129763298, Gamma.digamma(0.8), 1E-12);
    assertEquals(-0.75492694994705139188638402708, Gamma.digamma(0.9), 1E-12);
    assertEquals(-0.57721566490153286060651209018, Gamma.digamma(1), 1E-12);
    assertEquals(-0.423754940411076795168216219129, Gamma.digamma(1.1), 1E-12);
    assertEquals(-0.289039896592188295547207962955, Gamma.digamma(1.2), 1E-12);
    assertEquals(-0.169190888866799655631161174301, Gamma.digamma(1.3), 1E-12);
    assertEquals(-0.061384544585116145730675482246, Gamma.digamma(1.4), 1E-12);
    assertEquals(0.0364899739785765205590236666230, Gamma.digamma(1.5), 1E-12);
    assertEquals(0.126047452773476251906002717753, Gamma.digamma(1.6), 1E-12);
    assertEquals(0.208547874873493956679964183980, Gamma.digamma(1.7), 1E-12);
    assertEquals(0.284991433293861540608702366696, Gamma.digamma(1.8), 1E-12);
    assertEquals(0.356184161164059719224727083875, Gamma.digamma(1.9), 1E-12);
    assertEquals(0.422784335098467139393487909968, Gamma.digamma(2), 1E-12);
    assertEquals(0.485335968679832295740874690299, Gamma.digamma(2.1), 1E-12);
    assertEquals(0.54429343674114503778612537074, Gamma.digamma(2.2), 1E-12);
    assertEquals(0.60003988036396957513806959530, Gamma.digamma(2.3), 1E-12);
    assertEquals(0.65290116970059813998361023224, Gamma.digamma(2.4), 1E-12);
    assertEquals(0.70315664064524318722569033365, Gamma.digamma(2.5), 1E-12);
    assertEquals(0.75104745277347625190600271772, Gamma.digamma(2.6), 1E-12);
    assertEquals(0.79678316899114101550349359553, Gamma.digamma(2.7), 1E-12);
    assertEquals(0.84054698884941709616425792225, Gamma.digamma(2.8), 1E-12);
    assertEquals(0.88249995063774392975104287291, Gamma.digamma(2.9), 1E-12);
    assertEquals(0.92278433509846713939348790941, Gamma.digamma(3), 1E-12);
    assertEquals(0.96152644487030848621706516601, Gamma.digamma(3.1), 1E-12);
    assertEquals(0.99883889128659958324067082526, Gamma.digamma(3.2), 1E-12);
    assertEquals(1.0348224890596217490511130730821, Gamma.digamma(3.3), 1E-12);
    assertEquals(1.069567836367264806650276898444, Gamma.digamma(3.4), 1E-12);
    assertEquals(1.103156640645243187225690333314, Gamma.digamma(3.5), 1E-12);
    assertEquals(1.460847740729116344284558667218, Gamma.digamma(4.8), 1E-12);
    assertEquals(1.483737793254896891731591058580, Gamma.digamma(4.9), 1E-12);
    assertEquals(1.50611766843180047272682123910, Gamma.digamma(5), 1E-12);
    assertEquals(1.52800952905598905270014934708, Gamma.digamma(5.1), 1E-12);
    assertEquals(1.54943412938183767847876605498, Gamma.digamma(5.2), 1E-12);
    assertEquals(1.80940334808589330345348894064, Gamma.digamma(6.6), 1E-12);
    assertEquals(1.82562836356981823695787054070, Gamma.digamma(6.7), 1E-12);
    assertEquals(1.84159486716589795347996093002, Gamma.digamma(6.8), 1E-12);
    assertEquals(1.85731095133168692978070894769, Gamma.digamma(6.9), 1E-12);
    assertEquals(1.87278433509846713939348781176, Gamma.digamma(7), 1E-12);
    assertEquals(1.88802238665804626902930381641, Gamma.digamma(7.1), 1E-12);
    assertEquals(1.90303214427017514746139611433, Gamma.digamma(7.2), 1E-12);
    assertEquals(1.91782033563798609836763406257, Gamma.digamma(7.3), 1E-12);
    assertEquals(2.104752224783231689177292648080, Gamma.digamma(8.7), 1E-12);
    assertEquals(2.116858818900437923314047838185, Gamma.digamma(8.8), 1E-12);
    assertEquals(2.128820766044583645979570716178, Gamma.digamma(8.9), 1E-12);
    assertEquals(2.292959128790159232047824910104, Gamma.digamma(10.4), 1E-12);
    assertEquals(2.303001034297686375272584719730, Gamma.digamma(10.5), 1E-12);
    assertEquals(2.312943183403574398368363692910, Gamma.digamma(10.6), 1E-12);
    assertEquals(2.425128591455924764515150977668, Gamma.digamma(11.8), 1E-12);
    assertEquals(2.433933536882537454761123359507, Gamma.digamma(11.9), 1E-12);
    assertEquals(2.54969921330926831147013665159, Gamma.digamma(13.3), 1E-12);
    assertEquals(2.55747743447994200162683578193, Gamma.digamma(13.4), 1E-12);
    assertEquals(2.65344842462957959513500937426, Gamma.digamma(14.7), 1E-12);
    assertEquals(2.66046312228373120028026110359, Gamma.digamma(14.8), 1E-12);
    assertEquals(2.66742897621604231395750125821, Gamma.digamma(14.9), 1E-12);
    assertEquals(2.67434666166079370171990423750, Gamma.digamma(15), 1E-12);
    assertEquals(9.245073050052948608113615974381, Gamma.digamma(-0.1), 1E-12);
    assertEquals(4.0349914332938615406087023656046, Gamma.digamma(-0.2), 1E-12);
    assertEquals(2.113309779635398718584726089188, Gamma.digamma(-0.3), 1E-12);
    assertEquals(0.95938078610680958523933605107, Gamma.digamma(-0.4), 1E-12);
    assertEquals(0.0364899739785765205590236669549, Gamma.digamma(-0.5), 1E-12);
    assertEquals(-0.89471787791844947906400881522, Gamma.digamma(-0.6), 1E-12);
    assertEquals(-2.073952793628704417535923077783, Gamma.digamma(-0.7), 1E-12);
    assertEquals(-4.0390398965921882955472079595033, Gamma.digamma(-0.8), 1E-12);
    assertEquals(-9.312643829299965684057105098194, Gamma.digamma(-0.9), 1E-12);
  }

  public void testincompletegamma() {
    // if either argument is <= 0 then answer is 0
    for (double a = 0.0; a < 15.0; a += 0.1) {
      for (double x = 0.0; x < 15.0; x += 0.1) {
        assertEquals(0, Gamma.incompletegamma(-a, -x), 1E-12);
      }
    }
    assertEquals(0, Gamma.incompletegamma(310, 0.9), 0);
    assertEquals(0, Gamma.incompletegamma(310, 1.1), 0);
    assertEquals(0, Gamma.incompletegamma(Constants.MAXLOG, 1E-308), 0);
    assertEquals(0, Gamma.incompletegamma(-Constants.MAXLOG, 1E-308), 0);
    assertEquals(0.8275517595858505414503134959, Gamma.incompletegamma(0.1, 0.1), 1E-8);
    assertEquals(0.8794196267900568172307385971, Gamma.incompletegamma(0.1, 0.2), 1E-8);
    assertEquals(0.9083579897300342827238499205, Gamma.incompletegamma(0.1, 0.3), 1E-8);
    assertEquals(0.9275738335537044292089832614, Gamma.incompletegamma(0.1, 0.4), 1E-8);
    assertEquals(0.9414024458901335220382674628, Gamma.incompletegamma(0.1, 0.5), 1E-8);
    assertEquals(0.9518321446699073289671421639, Gamma.incompletegamma(0.1, 0.6), 1E-8);
    assertEquals(0.9599447964306321783317290598, Gamma.incompletegamma(0.1, 0.7), 1E-8);
    assertEquals(0.9663946538567283730424974785, Gamma.incompletegamma(0.1, 0.8), 1E-8);
    assertEquals(0.9716069046009709211556954966, Gamma.incompletegamma(0.1, 0.9), 1E-8);
    assertEquals(0.9758726562736722226170305640, Gamma.incompletegamma(0.1, 1), 1E-8);
    assertEquals(0.6760432038153432439715791015, Gamma.incompletegamma(0.2, 0.1), 1E-8);
    assertEquals(0.7644345975029190070627526147, Gamma.incompletegamma(0.2, 0.2), 1E-8);
    assertEquals(0.8165267943336527425841125978, Gamma.incompletegamma(0.2, 0.3), 1E-8);
    assertEquals(0.8523370733142442125133819107, Gamma.incompletegamma(0.2, 0.4), 1E-8);
    assertEquals(0.8787748330362044017215691543, Gamma.incompletegamma(0.2, 0.5), 1E-8);
    assertEquals(0.8991231327293255246275908747, Gamma.incompletegamma(0.2, 0.6), 1E-8);
    assertEquals(0.9152196019563055030834972986, Gamma.incompletegamma(0.2, 0.7), 1E-8);
    assertEquals(0.9282024229938034854868376298, Gamma.incompletegamma(0.2, 0.8), 1E-8);
    assertEquals(0.9388268378948836677479093316, Gamma.incompletegamma(0.2, 0.9), 1E-8);
    assertEquals(0.9476195687209221938452950517, Gamma.incompletegamma(0.2, 1), 1E-8);
    assertEquals(0.5459128495917964831790633019, Gamma.incompletegamma(0.3, 0.1), 1E-8);
    assertEquals(0.6575067242697217163119993660, Gamma.incompletegamma(0.3, 0.2), 1E-8);
    assertEquals(0.7269573437103661905247150829, Gamma.incompletegamma(0.3, 0.3), 1E-8);
    assertEquals(0.7763805810166358058957065695, Gamma.incompletegamma(0.3, 0.4), 1E-8);
    assertEquals(0.8138118046743926580656690639, Gamma.incompletegamma(0.3, 0.5), 1E-8);
    assertEquals(0.8432114320173442496501657488, Gamma.incompletegamma(0.3, 0.6), 1E-8);
    assertEquals(0.8668625855062952408861467327, Gamma.incompletegamma(0.3, 0.7), 1E-8);
    assertEquals(0.8862152066572103739808572718, Gamma.incompletegamma(0.3, 0.8), 1E-8);
    assertEquals(0.9022526480296695373332460418, Gamma.incompletegamma(0.3, 0.9), 1E-8);
    assertEquals(0.9156741562411087622013557419, Gamma.incompletegamma(0.3, 1), 1E-8);
    assertEquals(0.4362364052924729242286731486, Gamma.incompletegamma(0.4, 0.1), 1E-8);
    assertEquals(0.5601037604298112544592008677, Gamma.incompletegamma(0.4, 0.2), 1E-8);
    assertEquals(0.6414901434102418547217638464, Gamma.incompletegamma(0.4, 0.3), 1E-8);
    assertEquals(0.7014412706419403678905542807, Gamma.incompletegamma(0.4, 0.4), 1E-8);
    assertEquals(0.7480185547260105012745138836, Gamma.incompletegamma(0.4, 0.5), 1E-8);
    assertEquals(0.7853504728014384109136286382, Gamma.incompletegamma(0.4, 0.6), 1E-8);
    assertEquals(0.8158923256445068076721155513, Gamma.incompletegamma(0.4, 0.7), 1E-8);
    assertEquals(0.8412453471571475142577798552, Gamma.incompletegamma(0.4, 0.8), 1E-8);
    assertEquals(0.8625210009945015483977423433, Gamma.incompletegamma(0.4, 0.9), 1E-8);
    assertEquals(0.8805261050857103617501941398, Gamma.incompletegamma(0.4, 1), 1E-8);
    assertEquals(0.3452791539814229705967640705, Gamma.incompletegamma(0.5, 0.1), 1E-8);
    assertEquals(0.4729107431344619148675174630, Gamma.incompletegamma(0.5, 0.2), 1E-8);
    assertEquals(0.5614219739190001449497469036, Gamma.incompletegamma(0.5, 0.3), 1E-8);
    assertEquals(0.6289066304773024262098698961, Gamma.incompletegamma(0.5, 0.4), 1E-8);
    assertEquals(0.6681982858168395852397030003, Gamma.incompletegamma(0.6, 0.6), 1E-8);
    assertEquals(0.7099079603598206071141275423, Gamma.incompletegamma(0.6, 0.7), 1E-8);
    assertEquals(0.7455414587599573285460921107, Gamma.incompletegamma(0.6, 0.8), 1E-8);
    assertEquals(0.7762050605279667119959978593, Gamma.incompletegamma(0.6, 0.9), 1E-8);
    assertEquals(0.8027404729150409203419698073, Gamma.incompletegamma(0.6, 1), 1E-8);
    assertEquals(0.2108240757533060546028473805, Gamma.incompletegamma(0.7, 0.1), 1E-8);
    assertEquals(0.3291078997900337239696462173, Gamma.incompletegamma(0.7, 0.2), 1E-8);
    assertEquals(0.4204173688752938661486213650, Gamma.incompletegamma(0.7, 0.3), 1E-8);
    assertEquals(0.4949860082716709625241362824, Gamma.incompletegamma(0.7, 0.4), 1E-8);
    assertEquals(0.7309056955697616152059575669, Gamma.incompletegamma(0.7, 0.9), 1E-8);
    assertEquals(0.7611876235625860530730850486, Gamma.incompletegamma(0.7, 1), 1E-8);
    assertEquals(0.1628397603412923981408010851, Gamma.incompletegamma(0.8, 0.1), 1E-8);
    assertEquals(0.2715526677973401276069579880, Gamma.incompletegamma(0.8, 0.2), 1E-8);
    assertEquals(0.6040209511847419796286538466, Gamma.incompletegamma(0.8, 0.7), 1E-8);
    assertEquals(0.6470323012646407126168499070, Gamma.incompletegamma(0.8, 0.8), 1E-8);
    assertEquals(0.6849859527651700315415243906, Gamma.incompletegamma(0.8, 0.9), 1E-8);
    assertEquals(0.7185707077629332675256020170, Gamma.incompletegamma(0.8, 1), 1E-8);
    assertEquals(0.1248950727287419277325054903, Gamma.incompletegamma(0.9, 0.1), 1E-8);
    assertEquals(0.2225661286466661332389261177, Gamma.incompletegamma(0.9, 0.2), 1E-8);
    assertEquals(0.6389957272835945368418974210, Gamma.incompletegamma(0.9, 0.9), 1E-8);
    assertEquals(0.6753924416740532032510132929, Gamma.incompletegamma(0.9, 1), 1E-8);
    assertEquals(0.09516258196404042683575094053, Gamma.incompletegamma(1, 0.1), 1E-8);
    assertEquals(0.1812692469220181413300644913, Gamma.incompletegamma(1, 0.2), 1E-8);
    assertEquals(0.2591817793182821339331262206, Gamma.incompletegamma(1, 0.3), 1E-8);
    assertEquals(0.3296799539643606992555670747, Gamma.incompletegamma(1, 0.4), 1E-8);
    assertEquals(0.3934693402873665763962004649, Gamma.incompletegamma(1, 0.5), 1E-8);
    assertEquals(0.4511883639059735673715410826, Gamma.incompletegamma(1, 0.6), 1E-8);
    assertEquals(0.5034146962085904852951999065, Gamma.incompletegamma(1, 0.7), 1E-8);
    assertEquals(0.5506710358827784085698976148, Gamma.incompletegamma(1, 0.8), 1E-8);
    assertEquals(0.5934303402594008881165457602, Gamma.incompletegamma(1, 0.9), 1E-8);
    assertEquals(0.6321205588285576784044762297, Gamma.incompletegamma(1, 1), 1E-8);
  }

  public void testincompletegammacomplement() {
    // if either argument is <= 0 then answer is 0
    for (double a = 0.0; a < 15.0; a += 0.1) {
      for (double x = 0.0; x < 15.0; x += 0.1) {
        assertEquals(1, Gamma.incompletegammacomplement(-a, -x), 1E-12);
        assertEquals(1.0 - Gamma.incompletegamma(a, x), Gamma.incompletegammacomplement(a, x), 1E-12);
      }
    }
  }

  public void testinverseigammacomplement() {
    // note function may be broken for values of a > 3
    // I think this whole function may have several bugs
    for (double a = 0.1; a < 3.0; a += 0.1) {
      for (double x = 0.0; x < 15.0; x += 0.3) {
        final double target = Gamma.incompletegammacomplement(a, x);
        assertEquals(x, Gamma.inverseigammacomplement(a, target), 1E-6);
      }
    }
    assertEqualsLocal(Double.NaN, Gamma.inverseigammacomplement(0, 0), 0);
    assertEqualsLocal(Double.NaN, Gamma.inverseigammacomplement(Double.POSITIVE_INFINITY, 0.3), 0);
    assertEqualsLocal(1.1685005376605052E308, Gamma.inverseigammacomplement(Double.NEGATIVE_INFINITY, 0.3), 0);
  }

  public void testrgamma() {
    for (double x = 0.1; x < 34; x += 0.1) {
      assertEqualsLocal(1, Gamma.gamma(x) * Gamma.rgamma(x), 1E-15);
      if (x != Math.floor(x)) {
        assertEqualsLocal(1, Gamma.gamma(-x) * Gamma.rgamma(-x), 1E-15);
      }
    }
    assertEqualsLocal(1 / Double.MAX_VALUE, Gamma.rgamma(34.84425627277176175), 1E-6);
    assertEqualsLocal(1 / Double.MAX_VALUE, Gamma.rgamma(35), 1E-6);
    assertEqualsLocal(3.8003907548547434E-36, Gamma.rgamma(33.0), 1E-45);
    assertEqualsLocal(1.1516335620771947E-37, Gamma.rgamma(34.0), 1E-45);
    assertEqualsLocal(0, Gamma.rgamma(-33), 0);
    assertEqualsLocal(0, Gamma.rgamma(-34), 0);
    assertEqualsLocal(-2.5783519091890812E25, Gamma.rgamma(-35), 1E15);
    assertEqualsLocal(1.9666456125211278E40, Gamma.rgamma(-35.5), 1E30);
    assertEqualsLocal(5.220338070159187E26, Gamma.rgamma(-36), 1E15);
    assertEqualsLocal(5.562684646268003E-309, Gamma.rgamma(1E306), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.rgamma(-1E306), 0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, Gamma.rgamma(-1.1E306), 0);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, Gamma.rgamma(ConstantsTest.bump(-1E306)), 0);
  }

  public void testConstant() {
    assertEqualsLocal(171.624376956302725, Gamma.MAXGAMMA, 1.0E-10);
  }
}

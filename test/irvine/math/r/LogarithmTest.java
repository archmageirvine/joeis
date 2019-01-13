package irvine.math.r;

import static irvine.TestUtils.assertEqualsLocal;
import static irvine.math.r.Logarithm.dilog;
import static irvine.math.r.Logarithm.lg;
import static irvine.math.r.Logarithm.log10;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class LogarithmTest extends TestCase {




  public void testLg() {
    assertEqualsLocal(Double.NEGATIVE_INFINITY, lg(0.0), 0.0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, lg(Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, lg(Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, lg(-1.0), 0.0);
    assertEqualsLocal(Double.NaN, lg(-1.0E-5), 0.0);
    assertEqualsLocal(Double.NaN, lg(-1.0E-12), 0.0);
    assertEqualsLocal(Double.NaN, lg(-1.0E10), 0.0);
    assertEquals(0.0, lg(1.0), 1.0E-15);
    assertEquals(1.0, lg(2.0), 1.0E-15);

    for (double x = 0.01; x < 10.0; x += 0.001) {
      assertEquals(x, lg(Math.pow(2.0, x)), 1.0E-14);
    }
  }

  public void testlog10() {
    assertEqualsLocal(Double.NEGATIVE_INFINITY, log10(0.0), 0.0);
    assertEqualsLocal(Double.POSITIVE_INFINITY, log10(Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, log10(Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, log10(-1.0), 0.0);
    assertEqualsLocal(Double.NaN, log10(-1.0E-5), 0.0);
    assertEqualsLocal(Double.NaN, log10(-1.0E-12), 0.0);
    assertEqualsLocal(Double.NaN, log10(-1.0E10), 0.0);
    assertEquals(0.0, log10(1.0), 1.0E-15);
    assertEquals(1.0, log10(10.0), 1.0E-15);

    for (double x = 0.01; x < 10.0; x += 0.001) {
      assertEquals(x, log10(Math.pow(10.0, x)), 1.0E-14);
    }
  }

  public void testdilog() {
    assertEquals(0.0, dilog(0.0), 1.0E-15);
    assertEquals((Math.PI * Math.PI) / 6.0, dilog(1.0), 1.0E-15);
    assertEqualsLocal(Double.NaN, dilog(Double.NaN), 0.0);
    assertEqualsLocal(Double.NaN, dilog(Double.POSITIVE_INFINITY), 0.0);
    assertEqualsLocal(Double.NaN, dilog(1.00000001), 0.0);
    assertEqualsLocal(Double.NEGATIVE_INFINITY, dilog(Double.NEGATIVE_INFINITY), 0.0);
    assertEquals(-4.198277886858103857912145018984, dilog(-10.0), 1E-12);
    assertEquals(-12.238755177314938921731035458651, dilog(-100.0), 1E-12);
    assertEquals(-25.50247581388996883291656018920, dilog(-1000.0), 1E-12);
    assertEquals(-44.0600189531752994161042351913953, dilog(-10000.0), 1E-12);
    assertEquals(-266.7398395538, dilog(-1.0E10), 1.0E-6);
    assertEquals(-26511.13547515869, dilog(-1.0E100), 1.0E-3);
    assertEqualsLocal(Double.NaN, dilog(2.5), 0);
    assertEqualsLocal(-2.1620967990779754, dilog(-3.5), 1E-11);
    assertEqualsLocal(-2.923856780791902, dilog(-5.5), 1E-11);

    assertEquals(0.0100251117401390945454680544115, dilog(0.01), 1E-12);
    assertEquals(0.0201008990186931955407554124909, dilog(0.02), 1E-12);
    assertEquals(0.0302280516177068271482021311629, dilog(0.03), 1E-12);
    assertEquals(0.0404072753243383071485438846073, dilog(0.04), 1E-12);
    assertEquals(0.050639292464496027121738246659, dilog(0.05), 1E-12);
    assertEquals(0.060924842459884974299798979305, dilog(0.06), 1E-12);
    assertEquals(0.071264682409744567031278310986, dilog(0.07), 1E-12);
    assertEquals(0.081659587698643265198479878554, dilog(0.08), 1E-12);
    assertEquals(0.092110352631786330599637443711, dilog(0.09), 1E-12);
    assertEquals(0.102617791099391131113837369028, dilog(0.1), 1E-12);
    assertEquals(0.113182737271790145958589504284, dilog(0.11), 1E-12);
    assertEquals(0.123806046327036042419159027563, dilog(0.12), 1E-12);
    assertEquals(0.134488595212906634792051531234, dilog(0.13), 1E-12);
    assertEquals(0.145231283445341062927691619270, dilog(0.14), 1E-12);
    assertEquals(0.156035033945483090462280217066, dilog(0.15), 1E-12);
    assertEquals(0.166900793917664072947938365380, dilog(0.16), 1E-12);
    assertEquals(0.177829535770828048736205787262, dilog(0.17), 1E-12);
    assertEquals(0.188822258086085853335161594967, dilog(0.18), 1E-12);
    assertEquals(0.199879986633285587002663155043, dilog(0.19), 1E-12);
    assertEquals(0.211003775439704772611185095983, dilog(0.2), 1E-12);
    assertEquals(0.222194707914206904772243104132, dilog(0.21), 1E-12);
    assertEquals(0.233453898030463794829030055435, dilog(0.22), 1E-12);
    assertEquals(0.244782491573127373574112077754, dilog(0.23), 1E-12);
    assertEquals(0.423933778265871398349749633168, dilog(0.38), 1E-12);
    assertEquals(0.436560691597429400918525796328, dilog(0.39), 1E-12);
    assertEquals(0.449282974471281664464733402036, dilog(0.4), 1E-12);
    assertEquals(0.462102664322756346681347681597, dilog(0.41), 1E-12);
    assertEquals(0.475021874533404081393528930325, dilog(0.42), 1E-12);
    assertEquals(0.488042798559876707492637713535, dilog(0.43), 1E-12);
    assertEquals(0.50116771436156243905590077690, dilog(0.44), 1E-12);
    assertEquals(0.51439898915421193670376876591, dilog(0.45), 1E-12);
    assertEquals(0.52773908451980588377264278950, dilog(0.46), 1E-12);
    assertEquals(0.54119056190632631767872018683, dilog(0.47), 1E-12);
    assertEquals(0.55475608855496136293860234456, dilog(0.48), 1E-12);
    assertEquals(0.56843844389666690925315877379, dilog(0.49), 1E-12);
    assertEquals(0.58224052646501250590265631938, dilog(0.5), 1E-12);
    assertEquals(0.59616536137795074247654439136, dilog(0.51), 1E-12);
    assertEquals(0.82233047064432818045239150373, dilog(0.66), 1E-12);
    assertEquals(0.83877626128917305374725831613, dilog(0.67), 1E-12);
    assertEquals(0.85542740374799771006398362692, dilog(0.68), 1E-12);
    assertEquals(0.87229173264680233121872465686, dilog(0.69), 1E-12);
    assertEquals(0.88937762428603873860100627342, dilog(0.7), 1E-12);
    assertEquals(0.90669405270420987024825270811, dilog(0.71), 1E-12);
    assertEquals(1.203167960860418347404547419496, dilog(0.86), 1E-12);
    assertEquals(1.226320101237829986346002711282, dilog(0.87), 1E-12);
    assertEquals(1.250087584199261871567654759216, dilog(0.88), 1E-12);
    assertEquals(1.274529160416414000382022444898, dilog(0.89), 1E-12);
    assertEquals(1.299714723004958725171060493304, dilog(0.9), 1E-12);
    assertEquals(1.50789904067890696260753509490, dilog(0.97), 1E-12);
    assertEquals(1.54579971203146560971305176072, dilog(0.98), 1E-12);
    assertEquals(1.58862544807637532703122947226, dilog(0.99), 1E-12);

    assertEquals(-0.0099751104900835358647124849672, dilog(-0.01), 1E-12);
    assertEquals(-0.0199008790151368397803429513252, dilog(-0.02), 1E-12);
    assertEquals(-0.0297779503271863122060161222197, dilog(-0.03), 1E-12);
    assertEquals(-0.0396069550965777416444971904716, dilog(-0.04), 1E-12);
    assertEquals(-0.0493885103452178119191006555298, dilog(-0.05), 1E-12);
    assertEquals(-0.059123219862624050751326518605, dilog(-0.06), 1E-12);
    assertEquals(-0.068811674605617320366151966812, dilog(-0.07), 1E-12);
    assertEquals(-0.078454453082443202331042859701, dilog(-0.08), 1E-12);
    assertEquals(-0.088052121722064024472620716212, dilog(-0.09), 1E-12);
    assertEquals(-0.097605235229321583841103341843, dilog(-0.1), 1E-12);
    assertEquals(-0.107114336926631621950510851749, dilog(-0.11), 1E-12);
    assertEquals(-0.116579959082834610114664573320, dilog(-0.12), 1E-12);
    assertEquals(-0.126002623229793222805621260319, dilog(-0.13), 1E-12);
    assertEquals(-0.135382840467294849314621822263, dilog(-0.14), 1E-12);
    assertEquals(-0.144721111756787465592444914912, dilog(-0.15), 1E-12);
    assertEquals(-0.154017928204449018083640434668, dilog(-0.16), 1E-12);
    assertEquals(-0.163273771334064029793397798059, dilog(-0.17), 1E-12);
    assertEquals(-0.172489113350156305978567089007, dilog(-0.18), 1E-12);
    assertEquals(-0.181664417391803282210065270065, dilog(-0.19), 1E-12);
    assertEquals(-0.190800137777535619036913153746, dilog(-0.2), 1E-12);
    assertEquals(-0.199896720241705010756191050963, dilog(-0.21), 1E-12);
    assertEquals(-0.208954602162683753615964017258, dilog(-0.22), 1E-12);
    assertEquals(-0.217974212783241330414586789563, dilog(-0.23), 1E-12);
    assertEquals(-0.226955973423426039147913551862, dilog(-0.24), 1E-12);
    assertEquals(-0.235900297686263453821082793943, dilog(-0.25), 1E-12);
    assertEquals(-0.244807591656568191553058387295, dilog(-0.26), 1E-12);
    assertEquals(-0.253678254093151012069311597920, dilog(-0.27), 1E-12);
    assertEquals(-0.262512676614689638281448110505, dilog(-0.28), 1E-12);
    assertEquals(-0.271311243879518808507088336515, dilog(-0.29), 1E-12);
    assertEquals(-0.280074333759582904230216972269, dilog(-0.3), 1E-12);
    assertEquals(-0.288802317508782997727663222022, dilog(-0.31), 1E-12);
    assertEquals(-0.297495559925939290064512421818, dilog(-0.32), 1E-12);
    assertEquals(-0.306154419512579623414125077846, dilog(-0.33), 1E-12);
    assertEquals(-0.314779248625755016545532916870, dilog(-0.34), 1E-12);
    assertEquals(-0.323370393626073955236684754604, dilog(-0.35), 1E-12);
    assertEquals(-0.331928195021138439164407701754, dilog(-0.36), 1E-12);
    assertEquals(-0.340452987604556514425440802191, dilog(-0.37), 1E-12);
    assertEquals(-0.348945100590698179124418838833, dilog(-0.38), 1E-12);
    assertEquals(-0.357404857745354113082239670492, dilog(-0.39), 1E-12);
    assertEquals(-0.365832577512449627990764219572, dilog(-0.4), 1E-12);
    assertEquals(-0.374228573136959539127275757464, dilog(-0.41), 1E-12);
    assertEquals(-0.382593152784163303335229665097, dilog(-0.42), 1E-12);
    assertEquals(-0.390926619655373730996099147993, dilog(-0.43), 1E-12);
    assertEquals(-0.399229272100266844015098449871, dilog(-0.44), 1E-12);
    assertEquals(-0.407501403725935000424110406743, dilog(-0.45), 1E-12);
    assertEquals(-0.415743303502780223139440376405, dilog(-0.46), 1E-12);
    assertEquals(-0.423955255867359740765617481722, dilog(-0.47), 1E-12);
    assertEquals(-0.432137540822291058100935672571, dilog(-0.48), 1E-12);
    assertEquals(-0.440290434033319410030123365841, dilog(-0.49), 1E-12);
    assertEquals(-0.448414206923646202443064405814, dilog(-0.5), 1E-12);
    assertEquals(-0.58994881259374476391389482417, dilog(-0.68), 1E-12);
    assertEquals(-0.59756583657710489423036796523, dilog(-0.69), 1E-12);
    assertEquals(-0.60515840233770528397442688743, dilog(-0.7), 1E-12);
    assertEquals(-0.61272671000668134424231319956, dilog(-0.71), 1E-12);
    assertEquals(-0.62027095701186353723636752311, dilog(-0.72), 1E-12);
    assertEquals(-0.62779133812898266528296425599, dilog(-0.73), 1E-12);
    assertEquals(-0.63528804553162561763050471015, dilog(-0.74), 1E-12);
    assertEquals(-0.64276126883997887910529040090, dilog(-0.75), 1E-12);
    assertEquals(-0.65021119516839578868206182482, dilog(-0.76), 1E-12);
    assertEquals(-0.65763800917182227352027334492, dilog(-0.77), 1E-12);
    assertEquals(-0.74502106285083174052185946153, dilog(-0.89), 1E-12);
    assertEquals(-0.75216317921726162037269271308, dilog(-0.9), 1E-12);
    assertEquals(-0.75928453373870495306505481622, dilog(-0.91), 1E-12);
    assertEquals(-0.76638527906723937138256798505, dilog(-0.92), 1E-12);
    assertEquals(-0.77346556600725153462502519631, dilog(-0.93), 1E-12);
    assertEquals(-0.78052554354676187296596398220, dilog(-0.94), 1E-12);
    assertEquals(-0.78756535888806547916929507832, dilog(-0.95), 1E-12);
    assertEquals(-0.79458515747770741046036704766, dilog(-0.96), 1E-12);
    assertEquals(-0.80158508303581008694515554424, dilog(-0.97), 1E-12);
    assertEquals(-0.80856527758476991754449333281, dilog(-0.98), 1E-12);
    assertEquals(-0.81552588147733974909457249631, dilog(-0.99), 1E-12);
    assertEquals(-0.82246703342411321823620758323, dilog(-1.0), 1E-12);
  }

}

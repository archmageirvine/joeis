package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class EnglishTest extends TestCase {

  public void testIntToEnglishText() {
    assertEquals("zero", English.toEnglish(0));
    assertEquals("one", English.toEnglish(1));
    assertEquals("two", English.toEnglish(2));
    assertEquals("three", English.toEnglish(3));
    assertEquals("four", English.toEnglish(4));
    assertEquals("five", English.toEnglish(5));
    assertEquals("six", English.toEnglish(6));
    assertEquals("seven", English.toEnglish(7));
    assertEquals("eight", English.toEnglish(8));
    assertEquals("nine", English.toEnglish(9));
    assertEquals("ten", English.toEnglish(10));
    assertEquals("eleven", English.toEnglish(11));
    assertEquals("twelve", English.toEnglish(12));
    assertEquals("thirteen", English.toEnglish(13));
    assertEquals("fourteen", English.toEnglish(14));
    assertEquals("fifteen", English.toEnglish(15));
    assertEquals("sixteen", English.toEnglish(16));
    assertEquals("seventeen", English.toEnglish(17));
    assertEquals("eighteen", English.toEnglish(18));
    assertEquals("nineteen", English.toEnglish(19));
    assertEquals("twenty", English.toEnglish(20));
    assertEquals("twenty-one", English.toEnglish(21));
    assertEquals("twenty-two", English.toEnglish(22));
    assertEquals("twenty-three", English.toEnglish(23));
    assertEquals("twenty-four", English.toEnglish(24));
    assertEquals("twenty-five", English.toEnglish(25));
    assertEquals("twenty-six", English.toEnglish(26));
    assertEquals("twenty-seven", English.toEnglish(27));
    assertEquals("twenty-eight", English.toEnglish(28));
    assertEquals("twenty-nine", English.toEnglish(29));
    assertEquals("thirty", English.toEnglish(30));
    assertEquals("thirty-one", English.toEnglish(31));
    assertEquals("thirty-two", English.toEnglish(32));
    assertEquals("thirty-three", English.toEnglish(33));
    assertEquals("thirty-four", English.toEnglish(34));
    assertEquals("thirty-five", English.toEnglish(35));
    assertEquals("thirty-six", English.toEnglish(36));
    assertEquals("thirty-seven", English.toEnglish(37));
    assertEquals("thirty-eight", English.toEnglish(38));
    assertEquals("thirty-nine", English.toEnglish(39));
    assertEquals("forty", English.toEnglish(40));
    assertEquals("forty-one", English.toEnglish(41));
    assertEquals("forty-two", English.toEnglish(42));
    assertEquals("forty-three", English.toEnglish(43));
    assertEquals("forty-four", English.toEnglish(44));
    assertEquals("forty-five", English.toEnglish(45));
    assertEquals("forty-six", English.toEnglish(46));
    assertEquals("forty-seven", English.toEnglish(47));
    assertEquals("forty-eight", English.toEnglish(48));
    assertEquals("forty-nine", English.toEnglish(49));
    assertEquals("fifty", English.toEnglish(50));
    assertEquals("fifty-one", English.toEnglish(51));
    assertEquals("fifty-two", English.toEnglish(52));
    assertEquals("fifty-three", English.toEnglish(53));
    assertEquals("fifty-four", English.toEnglish(54));
    assertEquals("fifty-five", English.toEnglish(55));
    assertEquals("fifty-six", English.toEnglish(56));
    assertEquals("fifty-seven", English.toEnglish(57));
    assertEquals("fifty-eight", English.toEnglish(58));
    assertEquals("fifty-nine", English.toEnglish(59));
    assertEquals("sixty", English.toEnglish(60));
    assertEquals("sixty-one", English.toEnglish(61));
    assertEquals("sixty-two", English.toEnglish(62));
    assertEquals("sixty-three", English.toEnglish(63));
    assertEquals("sixty-four", English.toEnglish(64));
    assertEquals("sixty-five", English.toEnglish(65));
    assertEquals("sixty-six", English.toEnglish(66));
    assertEquals("sixty-seven", English.toEnglish(67));
    assertEquals("sixty-eight", English.toEnglish(68));
    assertEquals("sixty-nine", English.toEnglish(69));
    assertEquals("seventy", English.toEnglish(70));
    assertEquals("seventy-one", English.toEnglish(71));
    assertEquals("seventy-two", English.toEnglish(72));
    assertEquals("seventy-three", English.toEnglish(73));
    assertEquals("seventy-four", English.toEnglish(74));
    assertEquals("seventy-five", English.toEnglish(75));
    assertEquals("seventy-six", English.toEnglish(76));
    assertEquals("seventy-seven", English.toEnglish(77));
    assertEquals("seventy-eight", English.toEnglish(78));
    assertEquals("seventy-nine", English.toEnglish(79));
    assertEquals("eighty", English.toEnglish(80));
    assertEquals("eighty-one", English.toEnglish(81));
    assertEquals("eighty-two", English.toEnglish(82));
    assertEquals("eighty-three", English.toEnglish(83));
    assertEquals("eighty-four", English.toEnglish(84));
    assertEquals("eighty-five", English.toEnglish(85));
    assertEquals("eighty-six", English.toEnglish(86));
    assertEquals("eighty-seven", English.toEnglish(87));
    assertEquals("eighty-eight", English.toEnglish(88));
    assertEquals("eighty-nine", English.toEnglish(89));
    assertEquals("ninety", English.toEnglish(90));
    assertEquals("ninety-one", English.toEnglish(91));
    assertEquals("ninety-two", English.toEnglish(92));
    assertEquals("ninety-three", English.toEnglish(93));
    assertEquals("ninety-four", English.toEnglish(94));
    assertEquals("ninety-five", English.toEnglish(95));
    assertEquals("ninety-six", English.toEnglish(96));
    assertEquals("ninety-seven", English.toEnglish(97));
    assertEquals("ninety-eight", English.toEnglish(98));
    assertEquals("ninety-nine", English.toEnglish(99));
    assertEquals("one hundred", English.toEnglish(100));
    assertEquals("one thousand", English.toEnglish(1000));
    assertEquals("twenty thousand", English.toEnglish(20000));
    assertEquals("twenty thousand two hundred and two", English.toEnglish(20202));
    assertEquals("forty thousand", English.toEnglish(40000));
    assertEquals("forty thousand and fourteen", English.toEnglish(40014));
    assertEquals("one million", English.toEnglish(1000000));
    assertEquals("thirty-one thousand four hundred and fifteen", English.toEnglish(31415));
    assertEquals("thirty thousand two hundred", English.toEnglish(30200));
    assertEquals("two hundred thousand", English.toEnglish(200000));
    assertEquals("two hundred and one thousand", English.toEnglish(201000));
    assertEquals("two hundred thousand two hundred and two", English.toEnglish(200202));
    assertEquals("one million one hundred", English.toEnglish(1000100));
    assertEquals("one million one thousand", English.toEnglish(1001000));
    assertEquals("one million one thousand and thirty", English.toEnglish(1001030));
    assertEquals("one million two hundred and seventeen thousand three hundred and fourteen", English.toEnglish(1217314));
    assertEquals("nineteen million nine hundred and ninety-nine thousand nine hundred and ninety-nine", English.toEnglish(19999999));
    assertEquals("twenty-one million one hundred and twenty-one thousand one hundred and twenty-one", English.toEnglish(21121121));

    for (int i = 1; i < 1000; ++i) {
      assertEquals("negative " + English.toEnglish(i), English.toEnglish(-i));
    }
  }

  public void testIntToRawEnglishText() {
    assertEquals("zero", English.toRawEnglish(0));
    assertEquals("one", English.toRawEnglish(1));
    assertEquals("two", English.toRawEnglish(2));
    assertEquals("three", English.toRawEnglish(3));
    assertEquals("four", English.toRawEnglish(4));
    assertEquals("five", English.toRawEnglish(5));
    assertEquals("six", English.toRawEnglish(6));
    assertEquals("seven", English.toRawEnglish(7));
    assertEquals("eight", English.toRawEnglish(8));
    assertEquals("nine", English.toRawEnglish(9));
    assertEquals("ten", English.toRawEnglish(10));
    assertEquals("eleven", English.toRawEnglish(11));
    assertEquals("twelve", English.toRawEnglish(12));
    assertEquals("thirteen", English.toRawEnglish(13));
    assertEquals("fourteen", English.toRawEnglish(14));
    assertEquals("fifteen", English.toRawEnglish(15));
    assertEquals("sixteen", English.toRawEnglish(16));
    assertEquals("seventeen", English.toRawEnglish(17));
    assertEquals("eighteen", English.toRawEnglish(18));
    assertEquals("nineteen", English.toRawEnglish(19));
    assertEquals("twenty", English.toRawEnglish(20));
    assertEquals("twentyone", English.toRawEnglish(21));
    assertEquals("twentytwo", English.toRawEnglish(22));
    assertEquals("twentythree", English.toRawEnglish(23));
    assertEquals("twentyfour", English.toRawEnglish(24));
    assertEquals("twentyfive", English.toRawEnglish(25));
    assertEquals("twentysix", English.toRawEnglish(26));
    assertEquals("twentyseven", English.toRawEnglish(27));
    assertEquals("twentyeight", English.toRawEnglish(28));
    assertEquals("twentynine", English.toRawEnglish(29));
    assertEquals("thirty", English.toRawEnglish(30));
    assertEquals("thirtyone", English.toRawEnglish(31));
    assertEquals("thirtytwo", English.toRawEnglish(32));
    assertEquals("thirtythree", English.toRawEnglish(33));
    assertEquals("thirtyfour", English.toRawEnglish(34));
    assertEquals("thirtyfive", English.toRawEnglish(35));
    assertEquals("thirtysix", English.toRawEnglish(36));
    assertEquals("thirtyseven", English.toRawEnglish(37));
    assertEquals("thirtyeight", English.toRawEnglish(38));
    assertEquals("thirtynine", English.toRawEnglish(39));
    assertEquals("forty", English.toRawEnglish(40));
    assertEquals("fortyone", English.toRawEnglish(41));
    assertEquals("fortytwo", English.toRawEnglish(42));
    assertEquals("fortythree", English.toRawEnglish(43));
    assertEquals("fortyfour", English.toRawEnglish(44));
    assertEquals("fortyfive", English.toRawEnglish(45));
    assertEquals("fortysix", English.toRawEnglish(46));
    assertEquals("fortyseven", English.toRawEnglish(47));
    assertEquals("fortyeight", English.toRawEnglish(48));
    assertEquals("fortynine", English.toRawEnglish(49));
    assertEquals("fifty", English.toRawEnglish(50));
    assertEquals("fiftyone", English.toRawEnglish(51));
    assertEquals("fiftytwo", English.toRawEnglish(52));
    assertEquals("fiftythree", English.toRawEnglish(53));
    assertEquals("fiftyfour", English.toRawEnglish(54));
    assertEquals("fiftyfive", English.toRawEnglish(55));
    assertEquals("fiftysix", English.toRawEnglish(56));
    assertEquals("fiftyseven", English.toRawEnglish(57));
    assertEquals("fiftyeight", English.toRawEnglish(58));
    assertEquals("fiftynine", English.toRawEnglish(59));
    assertEquals("sixty", English.toRawEnglish(60));
    assertEquals("sixtyone", English.toRawEnglish(61));
    assertEquals("sixtytwo", English.toRawEnglish(62));
    assertEquals("sixtythree", English.toRawEnglish(63));
    assertEquals("sixtyfour", English.toRawEnglish(64));
    assertEquals("sixtyfive", English.toRawEnglish(65));
    assertEquals("sixtysix", English.toRawEnglish(66));
    assertEquals("sixtyseven", English.toRawEnglish(67));
    assertEquals("sixtyeight", English.toRawEnglish(68));
    assertEquals("sixtynine", English.toRawEnglish(69));
    assertEquals("seventy", English.toRawEnglish(70));
    assertEquals("seventyone", English.toRawEnglish(71));
    assertEquals("seventytwo", English.toRawEnglish(72));
    assertEquals("seventythree", English.toRawEnglish(73));
    assertEquals("seventyfour", English.toRawEnglish(74));
    assertEquals("seventyfive", English.toRawEnglish(75));
    assertEquals("seventysix", English.toRawEnglish(76));
    assertEquals("seventyseven", English.toRawEnglish(77));
    assertEquals("seventyeight", English.toRawEnglish(78));
    assertEquals("seventynine", English.toRawEnglish(79));
    assertEquals("eighty", English.toRawEnglish(80));
    assertEquals("eightyone", English.toRawEnglish(81));
    assertEquals("eightytwo", English.toRawEnglish(82));
    assertEquals("eightythree", English.toRawEnglish(83));
    assertEquals("eightyfour", English.toRawEnglish(84));
    assertEquals("eightyfive", English.toRawEnglish(85));
    assertEquals("eightysix", English.toRawEnglish(86));
    assertEquals("eightyseven", English.toRawEnglish(87));
    assertEquals("eightyeight", English.toRawEnglish(88));
    assertEquals("eightynine", English.toRawEnglish(89));
    assertEquals("ninety", English.toRawEnglish(90));
    assertEquals("ninetyone", English.toRawEnglish(91));
    assertEquals("ninetytwo", English.toRawEnglish(92));
    assertEquals("ninetythree", English.toRawEnglish(93));
    assertEquals("ninetyfour", English.toRawEnglish(94));
    assertEquals("ninetyfive", English.toRawEnglish(95));
    assertEquals("ninetysix", English.toRawEnglish(96));
    assertEquals("ninetyseven", English.toRawEnglish(97));
    assertEquals("ninetyeight", English.toRawEnglish(98));
    assertEquals("ninetynine", English.toRawEnglish(99));
    assertEquals("onehundred", English.toRawEnglish(100));
    assertEquals("onethousand", English.toRawEnglish(1000));
    assertEquals("twentythousand", English.toRawEnglish(20000));
    assertEquals("twentythousandtwohundredtwo", English.toRawEnglish(20202));
    assertEquals("fortythousand", English.toRawEnglish(40000));
    assertEquals("fortythousandfourteen", English.toRawEnglish(40014));
    assertEquals("onemillion", English.toRawEnglish(1000000));
    assertEquals("thirtyonethousandfourhundredfifteen", English.toRawEnglish(31415));
    assertEquals("thirtythousandtwohundred", English.toRawEnglish(30200));
    assertEquals("twohundredthousand", English.toRawEnglish(200000));
    assertEquals("twohundredonethousand", English.toRawEnglish(201000));
    assertEquals("twohundredthousandtwohundredtwo", English.toRawEnglish(200202));
    assertEquals("onemilliononehundred", English.toRawEnglish(1000100));
    assertEquals("onemilliononethousand", English.toRawEnglish(1001000));
    assertEquals("onemilliononethousandthirty", English.toRawEnglish(1001030));
    assertEquals("onemilliontwohundredseventeenthousandthreehundredfourteen", English.toRawEnglish(1217314));
    assertEquals("nineteenmillionninehundredninetyninethousandninehundredninetynine", English.toRawEnglish(19999999));
    try {
      English.toRawEnglish(20000000);
      fail();
    } catch (final UnsupportedOperationException e) {
      //ok
    }
    try {
      English.toRawEnglish(-1);
      fail();
    } catch (final UnsupportedOperationException e) {
      //ok
    }
  }
}

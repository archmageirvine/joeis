
package irvine.oeis.a400;

import java.util.HashMap;
import java.util.Map;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400180 allocated for Ekayan Singh.
 * @author Sean A. Irvine
 */
public class A400180 extends Sequence1 {

  // After Ekayan Singh

  private static final Q HOUR = new Q(1, 24);
  private static final Q ARC_STEP = new Q(15, 4);
  private static final long HINDU_EPOCH = -1132959;
  private static final Q SIDEREAL_YEAR = new Q(365).add(new Q(279457, 1080000));
  private static final Q ANOMALISTIC_YEAR = new Q(1577917828000L, 4320000000L - 387);
  private static final Q SIDEREAL_MONTH = new Q(27).add(new Q(4644439, 14438334));
  private static final Q SYNODIC_MONTH = new Q(29).add(new Q(7087771, 13358334));
  private static final Q ANOMALISTIC_MONTH = new Q(1577917828L, 57753336L - 488199);
  private static final Q CREATION = new Q(HINDU_EPOCH).subtract(new Q(1955880000L).multiply(SIDEREAL_YEAR));
  private static final int LUNAR_ERA = 3044;
  private static final Q UJJAIN_LATITUDE = new Q(23).add(new Q(9, 60));
  private static final long ISLAMIC_EPOCH = 227015;
  private static final int KARTIKA = 8;
  private static final int SHAWWAL = 10;

  private static final Map<Integer, Q> SINE_CACHE = new HashMap<>();
  private static final Map<Long, Q> SUNRISE_CACHE = new HashMap<>();
  private static final Map<Long, LunarDate> LUNAR_CACHE = new HashMap<>();
  private static final Q Q360 = new Q(360);
  private static final Q Q180 = new Q(180);
  private static final Q Q30 = new Q(30);
  private static final Q Q12 = new Q(12);
  private static final Q Q1080 = new Q(1080);
  private static final Q Q90 = new Q(90);
  private static final Q QNEG_HALF = new Q(-1, 2);
  private static final Q Q15 = new Q(15);
  private static final Q QNEG15 = new Q(-15);

  private int mYear = 702; // 703 is first occurrence

  private static final class LunarDate {
    private final long mYear;
    private final int mMonth;
    private final boolean mLeapMonth;
    private final long mDay;
    //private final boolean mLeapDay;

    private LunarDate(final long y, final int m, final boolean lm, final long d, final boolean ld) {
      mYear = y;
      mMonth = m;
      mLeapMonth = lm;
      mDay = d;
      //mLeapDay = ld;
    }
  }

  private static Q modRange(final Q x, final Q a, final Q b) {
    return a.add(x.subtract(a).mod(b.subtract(a)));
  }

  private static long gregorianNewYear(final long year) {
    final long y = year - 1;
    return 365 * y + y / 4 - y / 100 + y / 400 + 1;
  }

  private static long fixedFromIslamic(final long year, final int month, final int day) {
    final long by = 354 * (year - 1) + (3 + 11 * year) / 30;
    final long bm = 29L * (month - 1) + (6L * month - 1) / 11;
    return ISLAMIC_EPOCH - 1 + by + bm + day;
  }

  private static long islamicYearFromFixed(final long date) {
    return (30 * (date - ISLAMIC_EPOCH) + 10646) / 10631;
  }

  private static Q sineTable(final int entry) {
    return SINE_CACHE.computeIfAbsent(entry, e -> {
      final double exact = 3438.0 * Math.sin(Math.toRadians(e * 3.75));
      final double error = 0.215 * Math.signum(exact) * Math.signum(Math.abs(exact) - 1716);
      return new Q((long) Math.rint(exact + error), 3438);
    });
  }

  private static Q hinduSine(final Q theta) {
    final Q entry = theta.divide(ARC_STEP);
    final Q weight = entry.mod(Q.ONE);
    final int lo = Math.toIntExact(entry.floor().longValueExact());
    final int hi = Math.toIntExact(entry.ceiling().longValue());
    return weight.multiply(sineTable(hi)).add(Q.ONE.subtract(weight).multiply(sineTable(lo)));
  }

  private static Q hinduArcsin(final Q amp) {
    if (amp.signum() < 0) {
      return hinduArcsin(amp.negate()).negate();
    }
    int pos = 0;
    while (amp.compareTo(sineTable(pos)) > 0) {
      ++pos;
    }
    final Q below = sineTable(pos - 1);
    return ARC_STEP.multiply(new Q(pos - 1).add(amp.subtract(below).divide(sineTable(pos).subtract(below))));
  }

  private static Q meanPosition(final Q t, final Q period) {
    return Q360.multiply(t.subtract(CREATION).divide(period).mod(Q.ONE));
  }

  private static Q truePosition(final Q t, final Q period, final Q size, final Q anomalistic, final Q change) {
    final Q offset = hinduSine(meanPosition(t, anomalistic));
    final Q equation = hinduArcsin(offset.multiply(size.subtract(offset.abs().multiply(change).multiply(size))));
    return meanPosition(t, period).subtract(equation).mod(Q.valueOf(360));
  }

  private static Q solarLongitude(final Q t) {
    return truePosition(t, SIDEREAL_YEAR, new Q(14, 360), ANOMALISTIC_YEAR, new Q(1, 42));
  }

  private static Q lunarLongitude(final Q t) {
    return truePosition(t, SIDEREAL_MONTH, new Q(32, 360), ANOMALISTIC_MONTH, new Q(1, 96));
  }

  private static int zodiac(final Q t) {
    return (int) (solarLongitude(t).divide(Q30).floor().longValueExact() + 1);
  }

  private static long lunarDayAt(final Q t) {
    return lunarPhase(t).divide(Q12).floor().longValueExact() + 1;
  }

  private static Q lunarPhase(final Q t) {
    return lunarLongitude(t).subtract(solarLongitude(t)).mod(Q.valueOf(360));
  }

  private static Q newMoonBefore(final Q t) {
    final Q estimate = t.subtract(lunarPhase(t).divide(360).multiply(SYNODIC_MONTH));
    Q low = estimate.subtract(Q.ONE);
    Q high = t.compareTo(estimate.add(Q.ONE)) < 0 ? t : estimate.add(Q.ONE);
    final Q margin = new Q(1, 1L << 30);
    while (zodiac(low) != zodiac(high)
      && high.subtract(low).compareTo(margin) >= 0) {
      final Q middle = low.add(high).divide(Q.TWO);
      if (lunarPhase(middle).compareTo(Q180) < 0) {
        high = middle;
      } else {
        low = middle;
      }
    }
    return low.add(high).divide(Q.TWO);
  }

  private static long hinduCalendarYear(final Q t) {
    return new Q(0).add(t.subtract(new Q(HINDU_EPOCH)).divide(SIDEREAL_YEAR).subtract(solarLongitude(t).divide(Q360))).round().longValueExact();
  }

  private static Q dailyMotion(final long date) {
    final Q anomaly = meanPosition(new Q(date), ANOMALISTIC_YEAR);
    final Q epicycle = new Q(14, 360).subtract(hinduSine(anomaly).abs().divide(Q1080));
    final int entry = anomaly.divide(ARC_STEP).floor().intValueExact();
    final Q step = sineTable(entry + 1).subtract(sineTable(entry));
    return Q360.divide(SIDEREAL_YEAR).multiply(Q.ONE.subtract(new Q(3438, 225).multiply(step).multiply(epicycle)));
  }

  private static Q equationOfTime(final long date) {
    final Q offset = hinduSine(meanPosition(new Q(date), ANOMALISTIC_YEAR));
    final Q equationSun = offset.multiply(new Q(57).add(new Q(18, 60))).multiply(new Q(14, 360).subtract(offset.abs().divide(Q1080)));
    return dailyMotion(date).divide(Q360).multiply(equationSun).divide(Q360).multiply(SIDEREAL_YEAR);
  }

  private static Q tropicalLongitude(final Q date) {
    final Z cycle = new Q(27).add(new Q(108L * 600, 1577917828L).multiply(date.subtract(new Q(HINDU_EPOCH)))).mod(108);
    final Q precession = new Q(27).subtract(new Q(54).subtract(cycle).abs());
    return solarLongitude(date).subtract(precession).mod(Q.valueOf(360));
  }

  private static Q risingSign(final Q date) {
    final int[] speeds = {1670, 1795, 1935, 1935, 1795, 1670};
    final int i = tropicalLongitude(date).divide(Q30).floor().intValueExact() % 6;
    return new Q(speeds[i], 1800);
  }

  private static Q ascensionalDifference(final Q date) {
    final Q sinDelta = new Q(1397, 3438).multiply(hinduSine(tropicalLongitude(date)));
    final Q diurnalRadius = hinduSine(Q90.add(hinduArcsin(sinDelta)));
    final Q tanPhi = hinduSine(UJJAIN_LATITUDE).divide(hinduSine(Q90.add(UJJAIN_LATITUDE)));
    return hinduArcsin(sinDelta.negate().multiply(tanPhi).divide(diurnalRadius));
  }

  private static Q sunrise(final long date) {
    return SUNRISE_CACHE.computeIfAbsent(date, d -> {
      final Q toDays = new Q(1577917828L, 1582237828L * 360);
      final Q correction = ascensionalDifference(new Q(d)).add(dailyMotion(d).multiply(risingSign(new Q(d))).divide(new Q(4)));
      return new Q(d).add(new Q(6).multiply(HOUR)).subtract(equationOfTime(d)).add(toDays.multiply(correction));
    });
  }

  private static LunarDate hinduLunarFromFixed(final long date) {
    return LUNAR_CACHE.computeIfAbsent(date, d -> {
      final Q critical = sunrise(d);
      final long day = lunarDayAt(critical);
      final boolean leapDay = day == lunarDayAt(sunrise(d - 1));
      final Q lastNewMoon = newMoonBefore(critical);
      final Q nextNewMoon = newMoonBefore(new Q(lastNewMoon.floor().intValueExact() + 35));
      final int solarMonth = zodiac(lastNewMoon);
      final boolean leapMonth = solarMonth == zodiac(nextNewMoon);
      final int month = solarMonth % 12 + 1;
      final long year = hinduCalendarYear(new Q(d + (month <= 2 ? 180 : 0))) - LUNAR_ERA;
      return new LunarDate(year, month, leapMonth, day, leapDay);
    });
  }

  private static long fixedFromHinduLunar(final long year, final int month, final int day) {
    final Q yearFraction = new Q(month - 1, 12);
    final Q approx = new Q(HINDU_EPOCH).add(SIDEREAL_YEAR.multiply(new Q(year + LUNAR_ERA).add(yearFraction)));
    final Q lag = modRange(solarLongitude(approx).divide(Q360).subtract(yearFraction), QNEG_HALF, Q.HALF);
    final long ingress = approx.subtract(SIDEREAL_YEAR.multiply(lag)).floor().longValueExact();
    final long ingressDay = lunarDayAt(new Q(ingress).add(new Q(6).multiply(HOUR)));
    final long elapsed;
    if (ingressDay > 3 && ingressDay < 27) {
      elapsed = ingressDay;
    } else {
      final LunarDate before = hinduLunarFromFixed(ingress - 15);
      if (before.mMonth != month || before.mLeapMonth) {
        elapsed = modRange(new Q(ingressDay), QNEG15, Q15).floor().longValueExact();
      } else {
        elapsed = modRange(new Q(ingressDay), Q15, new Q(45)).floor().longValueExact();
      }
    }
    final long estimate = ingress - day - elapsed;
    long date = estimate - modRange(new Q(lunarDayAt(new Q(estimate).add(Q.SIX.multiply(HOUR))) - day), QNEG15, Q15).floor().longValueExact() - 1;
    while (lunarDayAt(sunrise(date)) != day && lunarDayAt(sunrise(date)) != day % 30 + 1) {
      ++date;
    }
    return date;
  }

  private static long diwaliInLunarYear(final long year) {
    final long date = fixedFromHinduLunar(year, KARTIKA, 1);
    return hinduLunarFromFixed(date).mDay != 1 ? date - 1 : date;
  }

  private static boolean diwali(final long year, final long eid) {
    final long lunarYear = hinduLunarFromFixed(gregorianNewYear(year)).mYear;
    for (final long y : new long[] {lunarYear, lunarYear + 1}) {
      final long date = diwaliInLunarYear(y);
      if (date >= gregorianNewYear(year) && date < gregorianNewYear(year + 1) && Math.abs(date - eid) <= 1) {
        return true;
      }
    }
    return false;
  }

  private static boolean hasCoincidence(final long year) {
    final long start = gregorianNewYear(year);
    final long end = gregorianNewYear(year + 1);
    final long islamicYear = islamicYearFromFixed(start);
    for (long y = islamicYear; y < islamicYear + 3; ++y) {
      final long eid = fixedFromIslamic(y, SHAWWAL, 1);
      if (eid >= start && eid < end) {
        if (diwali(year, eid)) {
          return true;
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      if (hasCoincidence(++mYear)) {
        return Z.valueOf(mYear);
      }
    }
  }
}

package irvine.util.string;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * Date related string functions.
 *
 * @author Sean A. Irvine
 */
public final class Date {

  private Date() { }

  /**
   * Get the current date and time as a string of the form
   * <code>YYYY-MM-DD hh:mm:ss</code>.
   *
   * @return date string
   */
  public static String now() {
    final StringBuilder sb = new StringBuilder();
    final Calendar cal = new GregorianCalendar();
    sb.append(cal.get(Calendar.YEAR)).append('-');
    final int month = 1 + cal.get(Calendar.MONTH);
    if (month < 10) {
      sb.append('0');
    }
    sb.append(month).append('-');
    final int date = cal.get(Calendar.DATE);
    if (date < 10) {
      sb.append('0');
    }
    sb.append(date).append(' ');
    final int hour = cal.get(Calendar.HOUR_OF_DAY);
    if (hour < 10) {
      sb.append('0');
    }
    sb.append(hour).append(':');
    final int min = cal.get(Calendar.MINUTE);
    if (min < 10) {
      sb.append('0');
    }
    sb.append(min).append(':');
    final int sec = cal.get(Calendar.SECOND);
    if (sec < 10) {
      sb.append('0');
    }
    sb.append(sec).append(' ');
    return sb.toString();
  }

  /**
   * Get the current date in the form <code>YYYY-MM-DD </code>.
   * @param cal calendar
   * @return current date
   */
  public static String getDate(final Calendar cal) {
    final StringBuilder sb = new StringBuilder();
    sb.append(cal.get(Calendar.YEAR)).append('-');
    final int month = 1 + cal.get(Calendar.MONTH);
    if (month < 10) {
      sb.append('0');
    }
    sb.append(month).append('-');
    final int date = cal.get(Calendar.DATE);
    if (date < 10) {
      sb.append('0');
    }
    sb.append(date);
    return sb.toString();
  }

  /**
   * Get the current date in the form <code>YYYY-MM-DD </code>.
   *
   * @return current date
   */
  public static String getDate() {
    return getDate(new GregorianCalendar()) + " ";
  }

  private static final String[] MONTHS = {"jan", "feb", "mar", "apr", "may", "jun", "jul", "aug", "sep", "oct", "nov", "dec"};

  /**
   * The the month number from a string.  If the month cannot be determined
   * then 0 is returned.
   * @param s string
   * @return month number or 0
   */
  public static int getMonth(final String s) {
    final String m = s.toLowerCase(Locale.getDefault());
    for (int k = 0; k < MONTHS.length; ++k) {
      if (m.startsWith(MONTHS[k])) {
        return k + 1;
      }
    }
    return 0;
  }

}

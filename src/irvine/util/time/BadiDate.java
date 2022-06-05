/**
 * Version 2.0
 * Copyright 2015 Soroosh Pezeshki
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package irvine.util.time;

import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * The Badi and Gregorian date converter (from 1900-2064).
 * @author Soroosh Pezeshki
 * @author Sean A. Irvine (cut down functionality)
 */
public class BadiDate {

  private static final byte[] NAW_RUZ_OFFSET = {1, 1, 0, 0, 1, 1, 0, 0, 1,
    1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0,
    0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
  private static final int UPPER_YEAR_LIMIT_BADI = 171 + NAW_RUZ_OFFSET.length - 1;

  private final Calendar mGregDate;

  private BadiDate(final Calendar gregDate) {
    mGregDate = gregDate;
  }

  /**
   * Creates a BadiDate from Badi year, month and day.
   * @param badiYear the Baha'i year
   * @param badiMonth the Baha'i month
   * @param badiDay the Baha'i day of the month
   * @return the Badi date
   * @throws IllegalArgumentException arguments are out of bound
   */
  public static BadiDate createFromBadiDate(final int badiYear, final int badiMonth, final int badiDay) throws IllegalArgumentException {
    checkBadiDayAndMonthForValidity(badiDay, badiMonth);
    checkBadiYearForValidity(badiYear);
    final int yearIndex = badiYear - 171;
    final int badiDoy = getBadiDayOfTheYearFromMonthAndDay(badiMonth, badiDay, yearIndex);
    final Calendar gregorianDate = gregorianDateFromBadiDoyAndYear(badiYear, badiDoy);
    return new BadiDate(gregorianDate);
  }

  public int getGregorianDayOfYear() {
    return mGregDate.get(Calendar.DAY_OF_YEAR);
  }

  public Calendar getCalendar() {
    return (Calendar) mGregDate.clone();
  }

  private static void checkBadiDayAndMonthForValidity(final int badiDay, final int badiMonth) throws IllegalArgumentException {
    if (badiDay < 1) {
      throw new IllegalArgumentException(
        "Badi day has to be greater than or equal to 1.");
    }
    if (badiDay > 19) {
      throw new IllegalArgumentException(
        "Badi day has to be less than or equal to  19.");
    }
    if (badiMonth < 1) {
      throw new IllegalArgumentException(
        "Badi month has to be greater than or equal to 1.");
    }
    if (badiMonth > 20) {
      throw new IllegalArgumentException(
        "Badi month has to be less than or equal to  20.");
    }
  }

  private static void checkBadiYearForValidity(final int badiYear) throws IllegalArgumentException {
    if (badiYear < 1) {
      throw new IllegalArgumentException(
        "Badi year has to be greater than or equal to 1.");
    }
    if (badiYear > UPPER_YEAR_LIMIT_BADI) {
      throw new IllegalArgumentException(
        "Badi year has to be less than  " + UPPER_YEAR_LIMIT_BADI);
    }
  }

  /**
   * Returns the day of the Badi year from Badi month and day.
   */
  private static int getBadiDayOfTheYearFromMonthAndDay(final int badiMonth, final int badiDay, final int yearIndex) {
    final int bdoy;
    final int nawRuz = nawRuzParameter(yearIndex);
    // special case Month of Ala after Ayyam'i'Ha
    if (badiMonth == 20) {
      bdoy = 346 + nawRuzParameter(yearIndex + 1) * (1 - nawRuz) + badiDay;
    } else {
      bdoy = (badiMonth - 1) * 19 + badiDay;
    }
    return bdoy;
  }

  private static int isLeapYear(final int year) {
    return Year.isLeap(year) ? 1 : 0;
  }

  /**
   * Returns 1 if Naw-Ruz for the Gregorian year is on March 21st; 0 if on
   * March 20th.
   */
  private static int nawRuzParameter(final int yearIndex) {
    if (yearIndex < 0) {
      return 1; // Use the western date for Naw-Ruz prior to 172
    }
    if (yearIndex >= NAW_RUZ_OFFSET.length) {
      throw new IllegalArgumentException("Naw-Ruz only defined until " + (2014 + NAW_RUZ_OFFSET.length - 1));
    }
    return NAW_RUZ_OFFSET[yearIndex];
  }

  private static Calendar gregorianDateFromBadiDoyAndYear(final int badiYear, final int bdoy) {
    int gregorianYear = badiYear + 1843;
    final int yearIndex = badiYear - 171;
    final int nawRuz = nawRuzParameter(yearIndex);
    final int leapYear = isLeapYear(gregorianYear);
    int doy = bdoy + 78 + leapYear + nawRuz;
    if (doy > 365 + leapYear) {
      doy = bdoy - 287 + nawRuz;
      gregorianYear = badiYear + 1844;
    }

    final Calendar calendar = new GregorianCalendar();
    calendar.set(Calendar.YEAR, gregorianYear);
    calendar.set(Calendar.DAY_OF_YEAR, doy);

    return calendar;
  }
}

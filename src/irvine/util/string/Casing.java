package irvine.util.string;

import java.util.Locale;

/**
 * Case handling.
 * @author Sean A. Irvine
 */
public enum Casing {
  /** No casing requirement. */
  NONE {
    @Override
    public String apply(final String string) {
      return string;
    }
  },
  /** Lower case. */
  LOWER {
    @Override
    public String apply(final String string) {
      return string.toLowerCase(Locale.getDefault());
    }
  },
  /** Upper case. */
  UPPER {
    @Override
    public String apply(final String string) {
      return string.toUpperCase(Locale.getDefault());
    }
  };

  /**
   * Convert the string to specified casing requirements.
   * @param string string to case appropriately
   * @return string in correct case
   */
  public abstract String apply(final String string);
}

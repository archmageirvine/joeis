package irvine.util;

import java.util.HashMap;

/**
 * A object based multiset.
 *
 * @author Sean A. Irvine
 * @param <T> base type
 */
public class Multiset<T> extends HashMap<T, Multiset.MutableLong> {

  static final class MutableLong {
    private long mValue = 0;

    private MutableLong(final long initialValue) {
      mValue = initialValue;
    }
  }

  /**
   * Increment the count for the specified key with a given value.
   * @param key the key
   * @param increment amount to increment by
   * @return the count after incrementing
   */
  public long increment(final T key, final long increment) {
    final MutableLong t = get(key);
    if (t == null) {
      put(key, new MutableLong(increment));
      return increment;
    }
    t.mValue += increment;
    return t.mValue;
  }

  /**
   * Increment the count for the specified key by one.
   * @param key the key
   * @return the count after incrementing
   */
  public long increment(final T key) {
    return increment(key, 1);
  }

  /**
   * Get the count for the key.
   * @param key the key
   * @return count for the key (or 0 if key not present)
   */
  public long getCount(final T key) {
    final MutableLong t = get(key);
    if (t == null) {
      return 0;
    }
    return t.mValue;
  }
}

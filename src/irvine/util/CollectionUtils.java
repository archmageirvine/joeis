package irvine.util;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utility functions relating to collections.
 *
 * @author Sean A. Irvine
 */
public final class CollectionUtils {

  private CollectionUtils() { }

  @SuppressWarnings({"unchecked", "rawtypes"})
  private static void forceSort(final List<?> list) {
    Collections.sort((List<Comparable>) list);
  }

  /**
   * Sort the supplied list if possible.  That is, if the list is a comparable
   * type, then sort the list according to that comparator; otherwise return
   * the list unmodified.  This generalizes <code>Collections.sort</code>.
   * @param list unsorted list
   * @param <T> type of list
   * @return possibly sorted list
   */
  public static <T> List<T> sort(final List<T> list) {
    // We need to determine if the type of the list is Comparable.
    // Safe to examine first element to determine Comparable status,
    // because we know the list contains at least 2 elements at the
    // time that check is done.
    if (list.size() > 1 && list.get(0) instanceof Comparable<?>) {
      forceSort(list);
    }
    return list;
  }

  /**
   * Invert a map.
   * @param map map to invert
   * @param <V> key type
   * @param <K> value type
   * @return inverted map
   */
  public static <V, K> Map<V, K> invert(final Map<K, V> map) {
    final Map<V, K> inv = new HashMap<>(map.size());
    for (final Map.Entry<K, V> entry : map.entrySet()) {
      final V value = entry.getValue();
      if (inv.put(value, entry.getKey()) != null) {
        throw new IllegalArgumentException("Map is not invertible");
      }
    }
    return inv;
  }

  /**
   * Test if the given list is palindromic.
   * @param lst list to test
   * @return true if the list is a palindrome
   */
  public static boolean isPalindrome(final List<?> lst) {
    for (int k = 0, j = lst.size() - 1; k < j; ++k, --j) {
      if (!lst.get(k).equals(lst.get(j))) {
        return false;
      }
    }
    return true;
  }
}

package irvine.util;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CollectionUtilsTest extends TestCase {

  public void testSort() {
    assertEquals("[a, b, c]", CollectionUtils.sort(Arrays.asList("c", "b", "a")).toString());
    assertEquals("[]", CollectionUtils.sort(Collections.<String>emptyList()).toString());
    final Object o1 = new Object();
    final Object o2 = new Object();
    final Object o3 = new Object();
    final List<Object> list = Arrays.asList(o1, o2, o3);
    final List<Object> afterSort = CollectionUtils.sort(list);
    assertEquals(3, afterSort.size());
    assertEquals(o1, afterSort.get(0));
    assertEquals(o2, afterSort.get(1));
    assertEquals(o3, afterSort.get(2));
  }

  public void testInvert() {
    final Map<String, Integer> map = Collections.singletonMap("hi", 42);
    assertEquals("{42=hi}", CollectionUtils.invert(map).toString());
  }

  public void testInvertIllegal() {
    final Map<String, Integer> map = new HashMap<>();
    map.put("hi", 42);
    map.put("hix", 42);
    try {
      CollectionUtils.invert(map);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }
}


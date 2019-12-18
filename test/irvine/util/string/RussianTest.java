package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class RussianTest extends TestCase {

  public void testIntToText() {
    assertEquals("\u043d\u043e\u043b\u044c", Russian.SINGLETON.toText(0));
    assertEquals("\u043e\u0434\u0438\u043d", Russian.SINGLETON.toText(1));
    assertEquals("\u0434\u0432\u0430", Russian.SINGLETON.toText(2));
    assertEquals("\u0442\u0440\u0438", Russian.SINGLETON.toText(3));
    assertEquals("\u0434\u0435\u0441\u044f\u0442\u044c", Russian.SINGLETON.toText(10));
    assertEquals("\u0434\u0432\u0430\u0434\u0446\u0430\u0442\u044c", Russian.SINGLETON.toText(20));
    assertEquals("\u0434\u0432\u0430\u0434\u0446\u0430\u0442\u044c \u043e\u0434\u0438\u043d", Russian.SINGLETON.toText(21));
    assertEquals("\u0441\u0442\u043e \u0434\u0432\u0430\u0434\u0446\u0430\u0442\u044c \u043f\u044f\u0442\u044c", Russian.SINGLETON.toText(125));
    assertEquals("\u0434\u0432\u0435\u0441\u0442\u0438 \u0441\u0435\u043c\u043d\u0430\u0434\u0446\u0430\u0442\u044c", Russian.SINGLETON.toText(217));
    assertEquals("\u0441\u0435\u043c\u044c\u0441\u043e\u0442 \u0441\u043e\u0440\u043e\u043a \u0442\u0440\u0438", Russian.SINGLETON.toText(743));
  }
}

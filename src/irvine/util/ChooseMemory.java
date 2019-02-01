package irvine.util;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Class to choose a percentage of the available RAM for use in the wrapper script.
 * @author Real Time Genomics
 */
public final class ChooseMemory {

  private ChooseMemory() { }

  private static Class<?> getOperatingSystemMXBeanClass() {
    Class<?> c;
    try {
      c = Class.forName("com.sun.management.OperatingSystemMXBean");
    } catch (ClassNotFoundException e) {
      c = null;
    }
    return c;
  }
  private static final Class<?> OPERATING_SYSTEM_MX_BEAN_CLASS = getOperatingSystemMXBeanClass();

  /**
   * Returns total memory available in the system
   * @return long total memory available in the system
   * @throws IllegalStateException if the total memory could not be determined
   */
  public static long getTotalMemory() {
    final OperatingSystemMXBean bean = ManagementFactory.getOperatingSystemMXBean();
    final Class<?> c = OPERATING_SYSTEM_MX_BEAN_CLASS == null ? bean.getClass() : OPERATING_SYSTEM_MX_BEAN_CLASS;
    try {
      Method m;
      try {
        m = c.getMethod("getTotalPhysicalMemorySize", (Class<?>[]) null);
      } catch (final NoSuchMethodException e) {
        m = c.getMethod("getTotalPhysicalMemory", (Class<?>[]) null);
      }
      return (Long) m.invoke(bean, (Object[]) null);
    } catch (final IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    } catch (final NoSuchMethodException e) {
      throw new IllegalStateException(e);
    }
  }

  /**
   * Main method for getting RAM.
   * @param args the command line arguments.
   */
  public static void main(String[] args) {
    final CliFlags flags = new CliFlags("ChooseMemory", "Program to get the appropriate RAM to use");
    flags.registerRequired(Integer.class, "int", "Percentage of RAM to use (1-100)");
    flags.setValidator(flags1 -> {
      final int percentage = (Integer) flags1.getAnonymousValue(0);
      if (percentage < 1) {
        flags1.setParseMessage("Percentage must be greater than 0.");
        return false;
      } else if (percentage > 100) {
        flags1.setParseMessage("Percentage must be less than or equal to 100.");
        return false;
      }
      return true;
    });
    if (!flags.setFlags(args)) {
      return;
    }
    final double percentage = (Integer) flags.getAnonymousValue(0) / 100.0;
    final int megs;
    try {
      megs = (int) (getTotalMemory() * percentage / 1024.0 / 1024.0);
    } catch (RuntimeException e) {
      System.err.println("Cannot determine system memory!");
      return;
    }
    System.out.println((megs < 1024 ? 1024 : megs) + "m");
  }
}

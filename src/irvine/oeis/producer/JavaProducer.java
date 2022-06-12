package irvine.oeis.producer;

import java.lang.reflect.InvocationTargetException;

import irvine.oeis.Sequence;

/**
 * The standard Producer for sequences backed by a Java implementation.
 * @author Sean A. Irvine
 */
public class JavaProducer implements Producer {

  @Override
  public Sequence getSequence(final String aNumber) {
    if (aNumber.length() != 7) {
      return null;
    }
    try {
      return (Sequence) Class.forName("irvine.oeis.a" + aNumber.substring(1, 4) + '.' + aNumber).getDeclaredConstructor().newInstance();
    } catch (final ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
      return null;
    }
  }
}

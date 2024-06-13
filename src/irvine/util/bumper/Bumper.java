package irvine.util.bumper;

/**
 * Provides a method for stepping through arrangements of an array.
 * @author Sean A. Irvine
 */
public interface Bumper {

  /**
   * Step the supplied array to the next allowable arrangement, or return false
   * if no further arrangements are possible. It is the caller's responsibility
   * to ensure the input is compatible with the bumper.
   * @param a array
   * @return true of the operation was successful.
   */
  boolean bump(final int... a);
}


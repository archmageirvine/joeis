package irvine.util.string;

/**
 * Norwegian (Nynorsk) related string functions.
 * @author Sean A. Irvine
 */
public final class Nynorsk extends Norwegian {

  /** Instance. */
  public static final Nynorsk SINGLETON = new Nynorsk();

  private static final String[] SMALL = {
    "null",
    "\u00e9in",
    "to",
    "tre",
    "fire",
    "fem",
    "seks",
    "sju",
    "\u00e5tte",
    "ni",
    "ti",
    "elleve",
    "tolv",
    "tretten",
    "fjorten",
    "femten",
    "seksten",
    "sytten",
    "atten",
    "nitten"
  };

  @Override
  protected String[] small() {
    return SMALL;
  }
}

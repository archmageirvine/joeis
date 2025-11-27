package irvine.oeis.producer;

/**
 * Encapsulate a header line for a program.
 * It can parse headers like:
 * <code>\\ https://oeis.org/A058824 type=an offset=0 curno=1</code>
 * @author Sean A. Irvine
 */
public class Header {

  private static final String BFIMAX_TAG = "bfimax=";
  private static final String NSTART_TAG = "nstart=";
  private static final String OFFSET_TAG = "offset=";
  private static final String SOURCE_TAG = "source=";
  private static final String TYPE_TAG = "type=";

  private int mBfiMax = 100; // last index in b-file
  private int mNStart = 0; // where to start mN
  private int mOffset = 0; // first index of the sequence
  private String mType = null;
  private String mUrl = null;

  /**
   * Construct a new object capturing information from the header line of a program.
   * @param program program in PARI, Mathematica, etc.
   */
  public Header(final String program) {
    final int endOfline = program.indexOf('\n');
    final String header = endOfline < 0 ? program : program.substring(0, endOfline);
    final String[] parts = header.split("\\s+");
    for (final String p : parts) {
      if (p.startsWith(BFIMAX_TAG)) {
        try {
          mBfiMax = Integer.parseInt(p.substring(BFIMAX_TAG.length()));
        } catch (final NumberFormatException e) {
          mBfiMax = 100;
        }
      } else if (p.startsWith(NSTART_TAG)) {
        try {
          mNStart = Integer.parseInt(p.substring(NSTART_TAG.length()));
        } catch (final NumberFormatException e) {
          mNStart = 0;
        }
      } else if (p.startsWith(OFFSET_TAG)) {
        try {
          mOffset = Integer.parseInt(p.substring(OFFSET_TAG.length()));
        } catch (final NumberFormatException e) {
          mOffset = 0;
        }
      } else if (p.startsWith(SOURCE_TAG)) {
        mUrl = p.substring(SOURCE_TAG.length());
      } else if (p.startsWith(TYPE_TAG)) {
        mType = p.substring(TYPE_TAG.length());
      } else {
        // ignore other tags
      }
    }
  }

  /**
   * Get the last index in the b-file
   * @return max(index)
   */
  public int getBfiMax() {
    return mBfiMax;
  }

  /**
   * Get the starting value for the variable <code>n</code>
   * @return first value
   */
  public int getNStart() {
    return mNStart;
  }

  /**
   * Get the first index
   * @return index of the first term of the sequence
   */
  public int getOffset() {
    return mOffset;
  }

  /**
   * Get the type of the program
   * @return for example: "an", "isok"
   */
  public String getType() {
    return mType;
  }

  /**
   * Get the URL of the sequence where the program is specified
   * @return for example "https://oeis.org/A101907"
   */
  public String getUrl() {
    return mUrl;
  }
}

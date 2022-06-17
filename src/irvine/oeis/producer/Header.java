package irvine.oeis.producer;

/**
 * Encapsulate a header line for a program.
 * It can parse headers like:
 * <code>\\ https://oeis.org/A058824 type=an offset=0 curno=1</code>
 * @author Sean A. Irvine
 */
public class Header {

  private static final String OFFSET_TAG = "offset=";
  private static final String TYPE_TAG = "type=";

  private String mType = null;
  private String mUrl = null;
  private int mOffset = 0;

  /**
   * Construct a new object capturing information from the header line of a program.
   * @param program program in PARI, MMA, etc.
   */
  Header(final String program) {
    final int endOfline = program.indexOf('\n');
    final String header = endOfline < 0 ? program : program.substring(0, endOfline);
    final String[] parts = header.split("\\s+");
    for (final String p : parts) {
      if (p.startsWith(OFFSET_TAG)) {
        try {
          mOffset = Integer.parseInt(p.substring(OFFSET_TAG.length()));
        } catch (final NumberFormatException e) {
          mOffset = 0;
        }
      } else if (p.startsWith(TYPE_TAG)) {
        mType = p.substring(TYPE_TAG.length());
      } else if (p.startsWith("http")) {
        mUrl = p;
      }
    }
  }

  int getOffset() {
    return mOffset;
  }

  String getType() {
    return mType;
  }

  String getUrl() {
    return mUrl;
  }
}

package jmason.poly;

/**
 * Makes a unique string from a <code>CoordSet2T</code>, but according to whether we are looking for free, one-sided polyiamonds
 * @author jmason
 */
public class UniqueMaker2T {

  private final CoordSet2T mCs;
  private final boolean mWithColor;

  UniqueMaker2T(final CoordSet2T cs, final boolean withColor) {
    mCs = cs;
    mWithColor = withColor;
  }

  String uniqString() {
    if (mCs.mFlagFixed) {
      return mCs.makeString(mWithColor);
    } else if (mCs.mFlagOneSided) {
      final String tmp1 = mCs.makeString(mWithColor);
      CoordSet2T ts = mCs.rotate60();

      final String tmp2 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp3 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp4 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp5 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp6 = ts.makeString(mWithColor);

      // ret.compare(tmp) > 0 means ret greater than tmp
      String ret = tmp1;
      if (ret.compareTo(tmp2) > 0) {
        ret = tmp2;
      }
      if (ret.compareTo(tmp3) > 0) {
        ret = tmp3;
      }
      if (ret.compareTo(tmp4) > 0) {
        ret = tmp4;
      }
      if (ret.compareTo(tmp5) > 0) {
        ret = tmp5;
      }
      if (ret.compareTo(tmp6) > 0) {
        ret = tmp6;
      }

      return ret;
    } else {
      final String tmp1 = mCs.makeString(mWithColor);
      CoordSet2T ts = mCs.rotate60();

      final String tmp2 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp3 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp4 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp5 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp6 = ts.makeString(mWithColor);
      ts = ts.mirrorVert();

      final String tmp7 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp8 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp9 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp10 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp11 = ts.makeString(mWithColor);
      ts = ts.rotate60();

      final String tmp12 = ts.makeString(mWithColor);
      String ret = tmp1;
      if (ret.compareTo(tmp2) > 0) {
        ret = tmp2;
      }
      if (ret.compareTo(tmp3) > 0) {
        ret = tmp3;
      }
      if (ret.compareTo(tmp4) > 0) {
        ret = tmp4;
      }
      if (ret.compareTo(tmp5) > 0) {
        ret = tmp5;
      }
      if (ret.compareTo(tmp6) > 0) {
        ret = tmp6;
      }
      if (ret.compareTo(tmp7) > 0) {
        ret = tmp7;
      }
      if (ret.compareTo(tmp8) > 0) {
        ret = tmp8;
      }
      if (ret.compareTo(tmp9) > 0) {
        ret = tmp9;
      }
      if (ret.compareTo(tmp10) > 0) {
        ret = tmp10;
      }
      if (ret.compareTo(tmp11) > 0) {
        ret = tmp11;
      }
      if (ret.compareTo(tmp12) > 0) {
        ret = tmp12;
      }
      return ret;
    }
  }
}

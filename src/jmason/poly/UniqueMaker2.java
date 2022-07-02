package jmason.poly;

/**
 * Makes a unique string from a coordinate set, but according to whether we are looking for free, fixed or one-sided polyominoes.
 * @author jmason
 */
public class UniqueMaker2 {

  private final CoordSet2 mCs;
  private final boolean mWithColor;

  UniqueMaker2(final CoordSet2 cs, final boolean withColor) {
    mCs = cs;
    mWithColor = withColor;
  }

  String uniqString() {
    if (mCs.mFlagFixed) {
      return mCs.makeString(mWithColor);
    } else if (mCs.mFlagOneSided) {
      final String tmp1 = mCs.makeString(mWithColor);

      final CoordSet2 ts = (CoordSet2) (mCs.copySet());
      ts.rotate();
      final String tmp2 = ts.makeString(mWithColor);
      ts.rotate();
      final String tmp3 = ts.makeString(mWithColor);
      ts.rotate();
      final String tmp4 = ts.makeString(mWithColor);

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
      return ret;
    } else {
      /*
       * must compare strings made from the following 8 formations
       * 1  2  3  4  5  6  7  8
       * AB BA AC CA CD DC BD DB
       * CD DC BD DB AB BA AC CA
       *    m     m     m     m
       */

      // AB 1
      // CD
      final String tmp1 = mCs.makeString(mWithColor);
      // BA 2
      // DC
      CoordSet2 ts = mCs.mirrorVert();
      final String tmp2 = ts.makeString(mWithColor);
      // DC 6
      // BA
      ts = ts.mirrorHoriz();
      final String tmp6 = ts.makeString(mWithColor);

      // CD 5
      // AB
      ts = ts.mirrorVert();
      final String tmp5 = ts.makeString(mWithColor);

      // BD 7
      // AC
      ts = ts.mirrorDiag();
      final String tmp7 = ts.makeString(mWithColor);

      // DB 8
      // CA
      ts = ts.mirrorHoriz();
      final String tmp8 = ts.makeString(mWithColor);

      // CA 4
      // DB
      ts = ts.mirrorVert();
      final String tmp4 = ts.makeString(mWithColor);

      // AC 3
      // BD
      ts = ts.mirrorHoriz();
      final String tmp3 = ts.makeString(mWithColor);

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
      if (ret.compareTo(tmp7) > 0) {
        ret = tmp7;
      }
      if (ret.compareTo(tmp8) > 0) {
        ret = tmp8;
      }
      return ret;
    }
  }
}

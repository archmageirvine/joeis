package jmason.poly;

/**
 * Makes a unique string from a coordset2, but according to whether we are looking for free, fixed or one-sided polyominoes.
 * @author jmason
 */
public class UniqueMaker2 {

  private final CoordSet2 mCs;

  UniqueMaker2(final CoordSet2 cs) {
    mCs = cs;
  }

  String uniqString() {
    if (mCs.mFlagFixed) {
      return mCs.makeString();
    } else if (mCs.mFlagOneSided) {
      final String tmp1 = mCs.makeString();

      final CoordSet2 ts = (CoordSet2) (mCs.cloneSet());
      ts.rotate();
      final String tmp2 = ts.makeString();

      ts.rotate();
      final String tmp3 = ts.makeString();

      ts.rotate();
      final String tmp4 = ts.makeString();


      // ret.compareTo(tmp) > 0 means ret greater than tmp
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
      //        System.err.println("uniqueMaker2\r\n" + mCs.makeDiagram());
      //        System.err.println("uniqueMaker2 " + ret);
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
      final String tmp1 = makeString(mCs);
      // BA 2
      // DC
      CoordSet2 ts = mCs.mirrorVert();
      final String tmp2 = makeString(ts);
      // DC 6
      // BA
      ts = ts.mirrorHoriz();
      final String tmp6 = makeString(ts);

      // CD 5
      // AB
      ts = ts.mirrorVert();
      final String tmp5 = makeString(ts);

      // BD 7
      // AC
      ts = ts.mirrorDiag();
      final String tmp7 = makeString(ts);

      // DB 8
      // CA
      ts = ts.mirrorHoriz();
      final String tmp8 = makeString(ts);

      // CA 4
      // DB
      ts = ts.mirrorVert();
      final String tmp4 = makeString(ts);

      // AC 3
      // BD
      ts = ts.mirrorHoriz();
      final String tmp3 = makeString(ts);

      // ret.compareTo(tmp) > 0 means ret greater than tmp
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
      //        System.err.println("uniqueMaker2\r\n" + mCs.makeDiagram());
      //        System.err.println("uniqueMaker2 " + ret);
      return ret;
    }
  }

  private String makeString(final CoordSet2 ts) {
    return ts.makeString(false);
  }
}

package jmason.poly;

/**
 * Makes a unique string from a polyominoid.
 * @author jmason
 */
public class UniqueMaker3s {

  private final PolySide mP;

  public UniqueMaker3s(PolySide p) {
    mP = p;
  }

  public String uniqString() {
    return minMirror(this.mP);
  }

  public String minRotate(PolySide p) {
    final String tmp1 = p.makeString();
    p = p.rotxy();
    final String tmp2 = p.makeString();
    p = p.rotxy();
    final String tmp3 = p.makeString();
    p = p.rotxy();
    final String tmp4 = p.makeString();
    p = p.mirrorz();
    final String tmp5 = p.makeString();
    p = p.rotxy();
    final String tmp6 = p.makeString();
    p = p.rotxy();
    final String tmp7 = p.makeString();
    p = p.rotxy();
    final String tmp8 = p.makeString();

    String ret = tmp1;
    if (ret.compareTo(tmp2) < 0) {
      ret = tmp2;
    }
    if (ret.compareTo(tmp3) < 0) {
      ret = tmp3;
    }
    if (ret.compareTo(tmp4) < 0) {
      ret = tmp4;
    }
    if (ret.compareTo(tmp5) < 0) {
      ret = tmp5;
    }
    if (ret.compareTo(tmp6) < 0) {
      ret = tmp6;
    }
    if (ret.compareTo(tmp7) < 0) {
      ret = tmp7;
    }
    if (ret.compareTo(tmp8) < 0) {
      ret = tmp8;
    }
    return ret;
  }

  private String minMirror(PolySide p) {
    final String tmp1 = minRotate(p);
    p = p.mirrorxy();
    final String tmp2 = minRotate(p);
    p = p.mirrorxz();
    final String tmp3 = minRotate(p);
    p = p.mirrorxy();
    final String tmp4 = minRotate(p);
    p = p.mirrorxz();
    final String tmp5 = minRotate(p);
    p = p.mirrorxy();
    final String tmp6 = minRotate(p);

    String ret = tmp1;
    if (ret.compareTo(tmp2) < 0) {
      ret = tmp2;
    }
    if (ret.compareTo(tmp3) < 0) {
      ret = tmp3;
    }
    if (ret.compareTo(tmp4) < 0) {
      ret = tmp4;
    }
    if (ret.compareTo(tmp5) < 0) {
      ret = tmp5;
    }
    if (ret.compareTo(tmp6) < 0) {
      ret = tmp6;
    }
    return ret;
  }
}

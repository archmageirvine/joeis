package jmason.poly;

import java.util.ArrayList;

/**
 * A counter of polyominoes.
 * @author jmason
 */
public final class ChildGeneratorFactory {

  private ChildGeneratorFactory() { }

  /**
   * A generator for ordinary polyominoes.
   */
  public static final ChildGenerator POLYOMINO_GENERATOR = (polyomino, addOnlyToColour) -> {
    final ArrayList<Polyomino> list = new ArrayList<>();
    final UniquenessTester h = new UniquenessTester();
    final UniquenessTester hc = new UniquenessTester();

    for (int k = 0; k < polyomino.size(); ++k) {
      if (addOnlyToColour != 0 && polyomino.mCs.getColour(k) != addOnlyToColour) {
        continue;
      }
      polyomino.trySquare(k, 1, 0, list, h, hc);
      polyomino.trySquare(k, -1, 0, list, h, hc);
      polyomino.trySquare(k, 0, 1, list, h, hc);
      polyomino.trySquare(k, 0, -1, list, h, hc);
    }
    return list;
  };
}

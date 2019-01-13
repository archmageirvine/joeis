package irvine.math.plantri;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PlantriTest extends Min5ScannerTest {

  public void testPruneEdgeList() {
    assertEquals(42, new Plantri().pruneEdgeList(new Edge[0], 42, 1));
    assertEquals(0, new Plantri().pruneEdgeList(new Edge[0], 0, 2));
  }

  public void testMarkEdgeOrbits() {
    final int[] min = {1, 2, 3, 4};
    new Plantri().markEdgeOrbits(new Edge[0], 3, min, 1);
    assertEquals("[1, 1, 1, 4]", Arrays.toString(min));
  }

  /*
      3-connected planar triangulations (plantri).

     nv  ne  nf            all            O-P

      4   6   4 |              1              1
      5   9   6 |              1              1
      6  12   8 |              2              2
      7  15  10 |              5              6
      8  18  12 |             14             17
      9  21  14 |             50             73
     10  24  16 |            233            389
     11  27  18 |           1249           2274
     12  30  20 |           7595          14502
     13  33  22 |          49566          97033
     */
  public void test3ConnectedPlanarTriangulations() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, -1, false, false, false, false));
    assertEquals(1, plantri.count(5, -1, -1, -1, false, false, false, false));
    assertEquals(2, plantri.count(6, -1, -1, -1, false, false, false, false));
    assertEquals(5, plantri.count(7, -1, -1, -1, false, false, false, false));
    assertEquals(14, plantri.count(8, -1, -1, -1, false, false, false, false));
    assertEquals(50, plantri.count(9, -1, -1, -1, false, false, false, false));
    assertEquals(233, plantri.count(10, -1, -1, -1, false, false, false, false));
    assertEquals(1249, plantri.count(11, -1, -1, -1, false, false, false, false));
    assertEquals(7595, plantri.count(12, -1, -1, -1, false, false, false, false));
    assertEquals("[0, 0, 0, 7595, 0, 0]", Arrays.toString(plantri.mNOut));
  }

  public void test3ConnectedPlanarTriangulationsResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(11, -1, -1, -1, false, false, false, false);
      }
      assertEquals(1249, sum);
    }
  }

  public void test3ConnectedPlanarTriangulationsOP() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, -1, true, false, false, false));
    assertEquals(1, plantri.count(5, -1, -1, -1, true, false, false, false));
    assertEquals(2, plantri.count(6, -1, -1, -1, true, false, false, false));
    assertEquals(6, plantri.count(7, -1, -1, -1, true, false, false, false));
    assertEquals(17, plantri.count(8, -1, -1, -1, true, false, false, false));
    assertEquals(73, plantri.count(9, -1, -1, -1, true, false, false, false));
    assertEquals(389, plantri.count(10, -1, -1, -1, true, false, false, false));
    assertEquals(2274, plantri.count(11, -1, -1, -1, true, false, false, false));
    assertEquals("[0, 0, 0, 2274, 0, 0]", Arrays.toString(plantri.mNOutOp));
  }

  /*
    planar triangulations without 3-connectivity requirement:
  2-connected with minimum degree at least 3 (plantri -c2)
  1-connected with minimum degree at least 3 and no two faces
        sharing more than one edge (plantri -c1)
  1-connected with minimum degree at least 3 (plantri -c1t).
  Those connectivities are lower bounds, not exact values.

                   c2

   nv          all            O-P

    4 |             1              1
    5 |             1              1
    6 |             3              3
    7 |             8              9
    8 |            32             37
    9 |           131            183
   10 |           723           1156
   11 |          4360           7713
   12 |         29632          55436
   13 |        213168         412193
   */
  public void test2ConnectedPlanarTriangulations() {
    assertEquals(1, new Plantri().count(4, -1, 2, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(5, -1, 2, -1, false, false, false, false));
    assertEquals(3, new Plantri().count(6, -1, 2, -1, false, false, false, false));
    assertEquals(8, new Plantri().count(7, -1, 2, -1, false, false, false, false));
    assertEquals(32, new Plantri().count(8, -1, 2, -1, false, false, false, false));
    assertEquals(131, new Plantri().count(9, -1, 2, -1, false, false, false, false));
    assertEquals(723, new Plantri().count(10, -1, 2, -1, false, false, false, false));
    assertEquals(4360, new Plantri().count(11, -1, 2, -1, false, false, false, false));
  }

  public void test2ConnectedPlanarTriangulationsResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(11, -1, 2, -1, false, false, false, false);
      }
      assertEquals(4360, sum);
    }
  }

  public void test2ConnectedPlanarTriangulationsOP() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, 2, -1, true, false, false, false));
    assertEquals(1, plantri.count(5, -1, 2, -1, true, false, false, false));
    assertEquals(3, plantri.count(6, -1, 2, -1, true, false, false, false));
    assertEquals(9, plantri.count(7, -1, 2, -1, true, false, false, false));
    assertEquals(37, plantri.count(8, -1, 2, -1, true, false, false, false));
    assertEquals(183, plantri.count(9, -1, 2, -1, true, false, false, false));
    assertEquals(1156, plantri.count(10, -1, 2, -1, true, false, false, false));
    assertEquals("[0, 0, 767, 389, 0, 0]", Arrays.toString(plantri.mNOutOp));
    assertEquals("[-1, -1]", Arrays.toString(plantri.mEdgeBound));
  }

  /*
    3-connected planar triangulations with minimum degree at least 4,
  (plantri -m4), and 4-connected planar triangulations (plantri -c4).

                               m4                            c4

   nv  ne  nf            all           O-P              all           O-P

    6  12   8 |              1             1 |              1             1
    7  15  10 |              1             1 |              1             1
    8  18  12 |              2             2 |              2             2
    9  21  14 |              5             5 |              4             4
   10  24  16 |             12            14 |             10            12
   11  27  18 |             34            45 |             25            32
   12  30  20 |            130           194 |             87           128
   13  33  22 |            525           891 |            313           519
   14  36  24 |           2472          4499 |           1357          2430
   */
  public void test3ConnectedPlanarTriangulationsMinDeg4() {
    assertEquals(1, new Plantri().count(6, 4, -1, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(7, 4, -1, -1, false, false, false, false));
    assertEquals(2, new Plantri().count(8, 4, -1, -1, false, false, false, false));
    assertEquals(5, new Plantri().count(9, 4, -1, -1, false, false, false, false));
    assertEquals(12, new Plantri().count(10, 4, -1, -1, false, false, false, false));
    assertEquals(34, new Plantri().count(11, 4, -1, -1, false, false, false, false));
    assertEquals(130, new Plantri().count(12, 4, -1, -1, false, false, false, false));
    assertEquals(525, new Plantri().count(13, 4, -1, -1, false, false, false, false));
  }

  public void test3ConnectedPlanarTriangulationsMinDeg4ResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
        long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(13, 4, -1, -1, false, false, false, false);
      }
      assertEquals(525, sum);
    }
  }

  public void test3ConnectedPlanarTriangulationsMinDeg4OP() {
    assertEquals(1, new Plantri().count(6, 4, -1, -1, true, false, false, false));
    assertEquals(1, new Plantri().count(7, 4, -1, -1, true, false, false, false));
    assertEquals(2, new Plantri().count(8, 4, -1, -1, true, false, false, false));
    assertEquals(5, new Plantri().count(9, 4, -1, -1, true, false, false, false));
    assertEquals(14, new Plantri().count(10, 4, -1, -1, true, false, false, false));
    assertEquals(45, new Plantri().count(11, 4, -1, -1, true, false, false, false));
    assertEquals(194, new Plantri().count(12, 4, -1, -1, true, false, false, false));
  }

  public void test3ConnectedPlanarTriangulationsMinConn4() {
    assertEquals(1, new Plantri().count(6, -1, 4, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(7, -1, 4, -1, false, false, false, false));
    assertEquals(2, new Plantri().count(8, -1, 4, -1, false, false, false, false));
    assertEquals(4, new Plantri().count(9, -1, 4, -1, false, false, false, false));
    assertEquals(10, new Plantri().count(10, -1, 4, -1, false, false, false, false));
    assertEquals(25, new Plantri().count(11, -1, 4, -1, false, false, false, false));
    assertEquals(87, new Plantri().count(12, -1, 4, -1, false, false, false, false));
    assertEquals(313, new Plantri().count(13, -1, 4, -1, false, false, false, false));
  }

  public void test3ConnectedPlanarTriangulationsMinConn4OP() {
    assertEquals(1, new Plantri().count(6, -1, 4, -1, true, false, false, false));
    assertEquals(1, new Plantri().count(7, -1, 4, -1, true, false, false, false));
    assertEquals(2, new Plantri().count(8, -1, 4, -1, true, false, false, false));
    assertEquals(4, new Plantri().count(9, -1, 4, -1, true, false, false, false));
    assertEquals(12, new Plantri().count(10, -1, 4, -1, true, false, false, false));
    assertEquals(32, new Plantri().count(11, -1, 4, -1, true, false, false, false));
    assertEquals(128, new Plantri().count(12, -1, 4, -1, true, false, false, false));
    assertEquals(519, new Plantri().count(13, -1, 4, -1, true, false, false, false));
  }

  /*
    3-connected planar Eulerian triangulations (plantri -b),
  and 4-connected planar Eulerian triangulations (plantri -bc4).

                             b                            bc4

   nv  ne  nf           all            O-P            all          O-P

    6  12   8 |             1              1 |            1            1
    7  15  10 |             0              0 |            0            0
    8  18  12 |             1              1 |            1            1
    9  21  14 |             1              1 |            0            0
   10  24  16 |             2              2 |            2            2
   11  27  18 |             2              2 |            1            1
   12  30  20 |             8              9 |            5            6
   13  33  22 |             8             11 |            3            3
   14  36  24 |            32             41 |           18           22
   15  39  26 |            57             89 |           19           25
   16  42  28 |           185            296 |           79          112
   17  45  30 |           466            829 |          134          214
   18  48  32 |          1543           2772 |          501          817
   19  51  34 |          4583           8746 |         1147         2058
   20  54  36 |         15374          29461 |         3976         7188
   */
  public void test3ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(6, -1, -1, -1, false, false, false, false));
    assertEquals(0, plantri.count(7, -1, -1, -1, false, false, false, false));
    assertEquals(1, plantri.count(8, -1, -1, -1, false, false, false, false));
    assertEquals(1, plantri.count(9, -1, -1, -1, false, false, false, false));
    assertEquals(2, plantri.count(10, -1, -1, -1, false, false, false, false));
    assertEquals(2, plantri.count(11, -1, -1, -1, false, false, false, false));
    assertEquals(8, plantri.count(12, -1, -1, -1, false, false, false, false));
    assertEquals(8, plantri.count(13, -1, -1, -1, false, false, false, false));
    assertEquals(32, plantri.count(14, -1, -1, -1, false, false, false, false));
    assertEquals(57, plantri.count(15, -1, -1, -1, false, false, false, false));
    assertEquals(185, plantri.count(16, -1, -1, -1, false, false, false, false));
    assertEquals(466, plantri.count(17, -1, -1, -1, false, false, false, false));
  }

  public void test3ConnectedEulerianTriangulationsResMod() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(17, 4, -1, -1, false, false, false, false);
      }
      assertEquals(466, sum);
    }
  }

  public void test3ConnectedEulerianTriangulationsOP() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(6, -1, -1, -1, true, false, false, false));
    assertEquals(0, plantri.count(7, -1, -1, -1, true, false, false, false));
    assertEquals(1, plantri.count(8, -1, -1, -1, true, false, false, false));
    assertEquals(1, plantri.count(9, -1, -1, -1, true, false, false, false));
    assertEquals(2, plantri.count(10, -1, -1, -1, true, false, false, false));
    assertEquals(2, plantri.count(11, -1, -1, -1, true, false, false, false));
    assertEquals(9, plantri.count(12, -1, -1, -1, true, false, false, false));
    assertEquals(11, plantri.count(13, -1, -1, -1, true, false, false, false));
    assertEquals(41, plantri.count(14, -1, -1, -1, true, false, false, false));
    assertEquals(89, plantri.count(15, -1, -1, -1, true, false, false, false));
    assertEquals(296, plantri.count(16, -1, -1, -1, true, false, false, false));
  }

  public void test4ConnectedEulerianTriangulations() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(6, -1, 4, -1, false, false, false, false));
    assertEquals(0, plantri.count(7, -1, 4, -1, false, false, false, false));
    assertEquals(1, plantri.count(8, -1, 4, -1, false, false, false, false));
    assertEquals(0, plantri.count(9, -1, 4, -1, false, false, false, false));
    assertEquals(2, plantri.count(10, -1, 4, -1, false, false, false, false));
    assertEquals(1, plantri.count(11, -1, 4, -1, false, false, false, false));
    assertEquals(5, plantri.count(12, -1, 4, -1, false, false, false, false));
    assertEquals(3, plantri.count(13, -1, 4, -1, false, false, false, false));
    assertEquals(18, plantri.count(14, -1, 4, -1, false, false, false, false));
    assertEquals(19, plantri.count(15, -1, 4, -1, false, false, false, false));
    assertEquals(79, plantri.count(16, -1, 4, -1, false, false, false, false));
    assertEquals(134, plantri.count(17, -1, 4, -1, false, false, false, false));
  }

  public void test4ConnectedEulerianTriangulationsOP() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(1, plantri.count(6, -1, 4, -1, true, false, false, false));
    assertEquals(0, plantri.count(7, -1, 4, -1, true, false, false, false));
    assertEquals(1, plantri.count(8, -1, 4, -1, true, false, false, false));
    assertEquals(0, plantri.count(9, -1, 4, -1, true, false, false, false));
    assertEquals(2, plantri.count(10, -1, 4, -1, true, false, false, false));
    assertEquals(1, plantri.count(11, -1, 4, -1, true, false, false, false));
    assertEquals(6, plantri.count(12, -1, 4, -1, true, false, false, false));
    assertEquals(3, plantri.count(13, -1, 4, -1, true, false, false, false));
    assertEquals(22, plantri.count(14, -1, 4, -1, true, false, false, false));
    assertEquals(25, plantri.count(15, -1, 4, -1, true, false, false, false));
    assertEquals(112, plantri.count(16, -1, 4, -1, true, false, false, false));
  }

  public void test4ConnectedEulerianTriangulationsOPResMod() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(16, -1, 4, -1, true, false, false, false);
      }
      assertEquals(112, sum);
    }
  }

  /*
     Convex polytopes (3-connected planar simple graphs, plantri -p),
   and convex polytopes with minimum degree at least 4 (plantri -pm4).

                         p                        pm4

   nv            all            O-P             all          O-P

    4                1              1 |
    5                2              2 |
    6                7              8 |             1             1
    7               34             45 |             1             1
    8              257            419 |             4             4
    9             2606           4798 |            14            16
   10            32300          62754 |            67            99
   11           440564         872411 |           428           720
   12          6384634       12728018 |          3515          6531
   13         96262938      192324654 |         31763         61677
   14       1496225352     2991463239 |        307543        607787
   */
  public void test3ConnectedPlanarSimple() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, -1, false, true, false, false));
    assertEquals(2, plantri.count(5, -1, -1, -1, false, true, false, false));
    assertEquals(7, plantri.count(6, -1, -1, -1, false, true, false, false));
    assertEquals(34, plantri.count(7, -1, -1, -1, false, true, false, false));
    assertEquals(257, plantri.count(8, -1, -1, -1, false, true, false, false));
    assertEquals(2606, plantri.count(9, -1, -1, -1, false, true, false, false));
    assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 74, 296, 633, 768, 558, 219, 50, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(plantri.mNOutE));
  }

  public void test3ConnectedPlanarSimpleResMod() {
    final Plantri plantri = new Plantri();
    for (int mod = 7; mod <= 9; ++mod) {
      long sum = 0;
      for (int res = 0; res < mod; ++res) {
        plantri.setResMod(res, mod);
        sum += plantri.count(8, -1, -1, -1, false, true, false, false);
      }
      assertEquals(257, sum);
    }
  }

  public void test3ConnectedPlanarSimpleOP() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, -1, true, true, false, false));
    assertEquals(2, plantri.count(5, -1, -1, -1, true, true, false, false));
    assertEquals(8, plantri.count(6, -1, -1, -1, true, true, false, false));
    assertEquals(45, plantri.count(7, -1, -1, -1, true, true, false, false));
    assertEquals(419, plantri.count(8, -1, -1, -1, true, true, false, false));
    assertEquals(4798, plantri.count(9, -1, -1, -1, true, true, false, false));
    assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 127, 541, 1188, 1441, 1032, 386, 73, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(plantri.mNOutEOp));
  }

  public void test3ConnectedPlanarSimpleOPTooManyFaces() {
    final Plantri plantri = new Plantri();
    plantri.setMaxFaceSize(373);
    try {
      plantri.count(4, -1, -1, -1, true, true, false, false);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("The value 373 of -f must be in [3,372]", e.getMessage());
    } finally {
      plantri.setMaxFaceSize(-1);
    }
  }

  public void test3ConnectedPlanarSimpleOPFixedFaces() {
    final Plantri plantri = new Plantri();
    plantri.setMaxFaceSize(4);
    try {
      assertEquals(300, plantri.count(8, -1, -1, -1, true, true, false, false));
    } finally {
      plantri.setMaxFaceSize(-1);
    }
  }

  public void test3ConnectedPlanarSimpleMinDeg4() {
    assertEquals(1, new Plantri().count(6, 4, -1, -1, false, true, false, false));
    assertEquals(1, new Plantri().count(7, 4, -1, -1, false, true, false, false));
    assertEquals(4, new Plantri().count(8, 4, -1, -1, false, true, false, false));
    assertEquals(14, new Plantri().count(9, 4, -1, -1, false, true, false, false));
    assertEquals(67, new Plantri().count(10, 4, -1, -1, false, true, false, false));
    assertEquals(428, new Plantri().count(11, 4, -1, -1, false, true, false, false));
  }

  public void test3ConnectedPlanarSimpleMinDeg4OP() {
    assertEquals(1, new Plantri().count(6, 4, -1, -1, true, true, false, false));
    assertEquals(1, new Plantri().count(7, 4, -1, -1, true, true, false, false));
    assertEquals(4, new Plantri().count(8, 4, -1, -1, true, true, false, false));
    assertEquals(16, new Plantri().count(9, 4, -1, -1, true, true, false, false));
    assertEquals(99, new Plantri().count(10, 4, -1, -1, true, true, false, false));
    assertEquals(720, new Plantri().count(11, 4, -1, -1, true, true, false, false));
  }

  /*
    Triangulations of a disk: 3-connected (plantri -P), or exactly
  2-connected but without vertices of degree 2 (plantri -Pc2x),
  or exactly 2-connected with vertices of degree 2 on the outer
  face permitted (plantri -Pc2m2).

                     P

   nv           all             O-P

    4               1               1
    5               2               2
    6               7               8
    7              27              37
    8             132             213
    9             773            1386
   10            5017            9524
   11           34861           68057
   12          253676          501858
   13         1903584         3788747
   14        14616442        29170667
   15       114254053       228295618
   16       906266345      1811802818
   17      7277665889     14552804492
   18     59066524810    118124257451
   19    483864411124    967698049455
   20   3996427278475   7992746427963
   21  33250623548406  66500865364037
   */
  public void test3ConnectedPolygons() {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, 0, false, false, false, false));
    assertEquals(2, plantri.count(5, -1, -1, 0, false, false, false, false));
    assertEquals(7, plantri.count(6, -1, -1, 0, false, false, false, false));
    assertEquals(27, plantri.count(7, -1, -1, 0, false, false, false, false));
    assertEquals(132, plantri.count(8, -1, -1, 0, false, false, false, false));
    assertEquals(773, plantri.count(9, -1, -1, 0, false, false, false, false));
    assertEquals("[0, 0, 0, 457, 219, 73, 20, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(plantri.mNOutP));
  }

  private static final String EXPECTED_VERBOSE =
    " With  3-gon: 846 (457 classes)\n"
      + " With  4-gon: 386 (219 classes)\n"
      + " With  5-gon: 122 (73 classes)\n"
      + " With  6-gon: 28 (20 classes)\n"
      + " With  7-gon: 3 (3 classes)\n"
      + " With  8-gon: 1 (1 classes)\n";

  public void test3ConnectedPolygonsOP() throws IOException {
    final Plantri plantri = new Plantri();
    assertEquals(1, plantri.count(4, -1, -1, 0, true, false, false, false));
    assertEquals(2, plantri.count(5, -1, -1, 0, true, false, false, false));
    assertEquals(8, plantri.count(6, -1, -1, 0, true, false, false, false));
    assertEquals(37, plantri.count(7, -1, -1, 0, true, false, false, false));
    assertEquals(213, plantri.count(8, -1, -1, 0, true, false, false, false));
    final PrintStream oldOut = System.out;
    try {
      try (final ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
        try (final PrintStream myOut = new PrintStream(bos)) {
          System.setOut(myOut);
          plantri.setVerbose(true);
          try {
            assertEquals(1386, plantri.count(9, -1, -1, 0, true, false, false, false));
          } finally {
            plantri.setVerbose(false);
          }
        }
        assertEquals(EXPECTED_VERBOSE, bos.toString());
      }
    } finally {
      System.setOut(oldOut);
    }
    assertEquals("[0, 0, 0, 457, 219, 73, 20, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(plantri.mNOutP));
    assertEquals("[0, 0, 0, 846, 386, 122, 28, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]", Arrays.toString(plantri.mNOutPOp));
  }

  /*
                 Pc2x                             Pc2xm2

   nv         all            O-P               all             O-P

    3                               |              1               1
    4                               |              1               1
    5                               |              2               2
    6              1              1 |              9              12
    7              4              5 |             36              56
    8             27             42 |            196             341
    9            163            289 |           1160            2168
   10           1131           2130 |           7616           14732
   11           8030          15631 |          52605          103619
   12          59412         117319 |         379339          753336
   */
  public void test3ConnectedPolygonsC2X() {
    assertEquals(1, new Plantri().count(6, -1, 2, 0, false, false, false, true));
    assertEquals(4, new Plantri().count(7, -1, 2, 0, false, false, false, true));
    assertEquals(27, new Plantri().count(8, -1, 2, 0, false, false, false, true));
    assertEquals(163, new Plantri().count(9, -1, 2, 0, false, false, false, true));
    assertEquals(1131, new Plantri().count(10, -1, 2, 0, false, false, false, true));
  }

  public void test3ConnectedPolygonsC2XOP() {
    assertEquals(1, new Plantri().count(6, -1, 2, 0, true, false, false, true));
    assertEquals(5, new Plantri().count(7, -1, 2, 0, true, false, false, true));
    assertEquals(42, new Plantri().count(8, -1, 2, 0, true, false, false, true));
    assertEquals(289, new Plantri().count(9, -1, 2, 0, true, false, false, true));
    assertEquals(2130, new Plantri().count(10, -1, 2, 0, true, false, false, true));
  }

  public void test3ConnectedPolygonsC2XM2() {
    assertEquals(1, new Plantri().count(3, 2, 2, 0, false, false, false, true));
    assertEquals(1, new Plantri().count(4, 2, 2, 0, false, false, false, true));
    assertEquals(2, new Plantri().count(5, 2, 2, 0, false, false, false, true));
    assertEquals(9, new Plantri().count(6, 2, 2, 0, false, false, false, true));
    assertEquals(36, new Plantri().count(7, 2, 2, 0, false, false, false, true));
    assertEquals(196, new Plantri().count(8, 2, 2, 0, false, false, false, true));
    assertEquals(1160, new Plantri().count(9, 2, 2, 0, false, false, false, true));
  }

  public void test3ConnectedPolygonsC2XM2OP() {
    assertEquals(1, new Plantri().count(3, 2, 2, 0, true, false, false, true));
    assertEquals(1, new Plantri().count(4, 2, 2, 0, true, false, false, true));
    assertEquals(2, new Plantri().count(5, 2, 2, 0, true, false, false, true));
    assertEquals(12, new Plantri().count(6, 2, 2, 0, true, false, false, true));
    assertEquals(56, new Plantri().count(7, 2, 2, 0, true, false, false, true));
    assertEquals(341, new Plantri().count(8, 2, 2, 0, true, false, false, true));
    assertEquals(2168, new Plantri().count(9, 2, 2, 0, true, false, false, true));
  }

  /*
                       quadrangulations

   nv  ne  nf              all            O-P

    8  12   6 |             1              1
    9  14   7 |             0              0
   10  16   8 |             1              1
   11  18   9 |             1              1
   12  20  10 |             3              4
   13  22  11 |             3              3
   14  24  12 |            11             15
   15  26  13 |            18             25
   16  28  14 |            58             92
   17  30  15 |           139            234
   18  32  16 |           451            803
   19  34  17 |          1326           2469
   20  36  18 |          4461           8512
   */
  public void testQuadrangulations() {
    assertEquals(1, new Plantri().count(8, -1, -1, -1, false, false, true, false));
    assertEquals(0, new Plantri().count(9, -1, -1, -1, false, false, true, false));
    assertEquals(1, new Plantri().count(10, -1, -1, -1, false, false, true, false));
    assertEquals(1, new Plantri().count(11, -1, -1, -1, false, false, true, false));
    assertEquals(3, new Plantri().count(12, -1, -1, -1, false, false, true, false));
    assertEquals(3, new Plantri().count(13, -1, -1, -1, false, false, true, false));
    assertEquals(11, new Plantri().count(14, -1, -1, -1, false, false, true, false));
    assertEquals(18, new Plantri().count(15, -1, -1, -1, false, false, true, false));
    assertEquals(58, new Plantri().count(16, -1, -1, -1, false, false, true, false));
    assertEquals(139, new Plantri().count(17, -1, -1, -1, false, false, true, false));
    assertEquals(451, new Plantri().count(18, -1, -1, -1, false, false, true, false));
    assertEquals(1326, new Plantri().count(19, -1, -1, -1, false, false, true, false));
  }

  public void testQuadrangulationsOP() {
    assertEquals(1, new Plantri().count(8, -1, -1, -1, true, false, true, false));
    assertEquals(0, new Plantri().count(9, -1, -1, -1, true, false, true, false));
    assertEquals(1, new Plantri().count(10, -1, -1, -1, true, false, true, false));
    assertEquals(1, new Plantri().count(11, -1, -1, -1, true, false, true, false));
    assertEquals(4, new Plantri().count(12, -1, -1, -1, true, false, true, false));
    assertEquals(3, new Plantri().count(13, -1, -1, -1, true, false, true, false));
    assertEquals(15, new Plantri().count(14, -1, -1, -1, true, false, true, false));
    assertEquals(25, new Plantri().count(15, -1, -1, -1, true, false, true, false));
    assertEquals(92, new Plantri().count(16, -1, -1, -1, true, false, true, false));
    assertEquals(234, new Plantri().count(17, -1, -1, -1, true, false, true, false));
    assertEquals(803, new Plantri().count(18, -1, -1, -1, true, false, true, false));
  }

  public void testQuadrangulationsM3C4() {
    assertEquals(1, new Plantri().count(8, 3, 4, -1, false, false, true, false));
    assertEquals(0, new Plantri().count(9, 3, 4, -1, false, false, true, false));
    assertEquals(1, new Plantri().count(10, 3, 4, -1, false, false, true, false));
    assertEquals(1, new Plantri().count(11, 3, 4, -1, false, false, true, false));
    assertEquals(2, new Plantri().count(12, 3, 4, -1, false, false, true, false));
    assertEquals(2, new Plantri().count(13, 3, 4, -1, false, false, true, false));
    assertEquals(9, new Plantri().count(14, 3, 4, -1, false, false, true, false));
    assertEquals(11, new Plantri().count(15, 3, 4, -1, false, false, true, false));
    assertEquals(37, new Plantri().count(16, 3, 4, -1, false, false, true, false));
    assertEquals(79, new Plantri().count(17, 3, 4, -1, false, false, true, false));
    assertEquals(249, new Plantri().count(18, 3, 4, -1, false, false, true, false));
    assertEquals(671, new Plantri().count(19, 3, 4, -1, false, false, true, false));
  }

  // Unconfirmed numbers in this test
  public void testQuadrangulationsM2C2() {
    assertEquals(4, new Plantri().count(7, 2, 2, -1, false, false, true, false));
    assertEquals(20, new Plantri().count(8, 2, 2, -1, false, false, true, false));
    assertEquals(118, new Plantri().count(9, 2, 2, -1, false, false, true, false));
    assertEquals(1056, new Plantri().count(10, 2, 2, -1, false, false, true, false));
    assertEquals(9844, new Plantri().count(11, 2, 2, -1, false, false, true, false));
  }

  // Unconfirmed numbers in this test
  public void testPlanarM2C2() {
    final Plantri plantri = new Plantri();
    assertEquals(2, plantri.count(5, 2, 2, -1, false, true, false, false));
    assertEquals(61, plantri.count(6, 2, 2, -1, false, true, false, false));
    assertEquals(559, plantri.count(7, 2, 2, -1, false, true, false, false));
    assertEquals(7559, plantri.count(8, 2, 2, -1, false, true, false, false));
    assertEquals("[0, 36]", Arrays.toString(plantri.mEdgeBound));
  }

  public void testPlanarC5() {
    assertEquals(1, new Plantri().count(12, -1, 5, -1, false, false, false, false));
    assertEquals(0, new Plantri().count(13, -1, 5, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(14, -1, 5, -1, false, false, false, false));
    assertEquals(1, new Plantri().count(15, -1, 5, -1, false, false, false, false));
    assertEquals(3, new Plantri().count(16, -1, 5, -1, false, false, false, false));
    assertEquals(4, new Plantri().count(17, -1, 5, -1, false, false, false, false));
    assertEquals(12, new Plantri().count(18, -1, 5, -1, false, false, false, false));
    assertEquals(23, new Plantri().count(19, -1, 5, -1, false, false, false, false));
    assertEquals(71, new Plantri().count(20, -1, 5, -1, false, false, false, false));
    assertEquals(187, new Plantri().count(21, -1, 5, -1, false, false, false, false));
    assertEquals(627, new Plantri().count(22, -1, 5, -1, false, false, false, false));
    assertEquals(1970, new Plantri().count(23, -1, 5, -1, false, false, false, false));
  }

  public void testQuadrangulationsC4() {
    assertEquals(2, new Plantri().count(12, -1, 4, -1, false, false, true, false));
    assertEquals(2, new Plantri().count(13, -1, 4, -1, false, false, true, false));
    assertEquals(9, new Plantri().count(14, -1, 4, -1, false, false, true, false));
    assertEquals(11, new Plantri().count(15, -1, 4, -1, false, false, true, false));
    assertEquals(37, new Plantri().count(16, -1, 4, -1, false, false, true, false));
    assertEquals(79, new Plantri().count(17, -1, 4, -1, false, false, true, false));
    assertEquals(249, new Plantri().count(18, -1, 4, -1, false, false, true, false));
    assertEquals(671, new Plantri().count(19, -1, 4, -1, false, false, true, false));
  }

  public void testBipartiteM1C3() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(5, plantri.count(12, 1, 3, -1, false, true, false, false));
    assertEquals(5, plantri.count(13, 1, 3, -1, false, true, false, false));
    assertEquals(21, plantri.count(14, 1, 3, -1, false, true, false, false));
    assertEquals(40, plantri.count(15, 1, 3, -1, false, true, false, false));
    assertEquals(176, plantri.count(16, 1, 3, -1, false, true, false, false));
  }

  public void testBipartiteM3C5() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    assertEquals(500, plantri.count(17, 3, 3, -1, false, true, false, false));
    assertEquals(2053, plantri.count(18, 3, 3, -1, false, true, false, false));
  }

  public void testBipartiteM3C5ResMod() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    plantri.setResMod(0, 2);
    assertEquals(388, plantri.count(17, 3, 3, -1, false, true, false, false));
    plantri.setResMod(1, 2);
    assertEquals(500 - 388, plantri.count(17, 3, 3, -1, false, true, false, false));
    assertEquals(0, plantri.count(13, 3, 3, -1, false, true, false, false));
    plantri.setResMod(0, 2);
    assertEquals(5, plantri.count(13, 3, 3, -1, false, true, false, false));
  }

  public void testBipartiteM3C3ResMod() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    plantri.setResMod(0, 2);
    assertEquals(388, plantri.count(17, 3, 3, -1, false, true, false, false));
    plantri.setResMod(1, 2);
    assertEquals(112, plantri.count(17, 3, 3, -1, false, true, false, false));
    assertEquals(0, plantri.count(13, 3, 3, -1, false, true, false, false));
    plantri.setResMod(0, 2);
    assertEquals(5, plantri.count(13, 3, 3, -1, false, true, false, false));
  }

  public void testBipartiteM3C5LargeNResMod() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
    plantri.setResMod(0, 27);
    assertEquals(15811, plantri.count(23, 3, 3, -1, false, true, false, false));
    assertEquals(52987, plantri.count(24, 3, 3, -1, false, true, false, false));
  }

  // Somehow the following tests leaves thing in a bad state and subsequent tests lock up.
  // Must be some extra state getting retained in Plantri
  public void testBipartiteStar() {
    final Plantri plantri = new Plantri();
    plantri.setBipartite(true);
   // assertEquals(1, plantri.count(2, 1, 1, -1, false, true, false, false)); // Adding this seems to make later tests lock up
    assertEquals(0, plantri.count(3, 2, 1, -1, false, true, false, false));
    assertEquals(0, plantri.count(3, 2, 2, -1, false, true, false, false));
    assertEquals(1, plantri.count(4, 2, 2, -1, false, true, false, false));
    assertEquals(1, plantri.count(5, 2, 2, -1, false, true, false, false));
  }

  public void testExceptions() {
    try {
      new Plantri().count(1, -1, -1, -1, false, false, false, true);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("-t and -x can only be used in conjunction with -c", e.getMessage());
    }
    try {
      new Plantri().count(65, -1, -1, -1, false, false, false, false);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Number of vertices must be in range 1..64", e.getMessage());
    }
    try {
      new Plantri().count(20, -1, 5, -1, false, true, false, false);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("The value 5 of -c must be in [1,3]", e.getMessage());
    }
    try {
      new Plantri().count(10, 7, 3, -1, false, true, false, false);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("The value 7 of -m must be in [1,5]", e.getMessage());
    }
  }

  public void testConstants() {
    assertEquals(64, Plantri.MAX_VERTICES);
    assertEquals(372, Plantri.MAX_EDGES);
    assertEquals(124, Plantri.MAX_FACES);
    assertEquals(4504, Plantri.NUM_EDGES);
  }

  public void testNoUsefulSplit() {
    assertEquals(0, new Plantri().hasNoUsefulSplit(false).length);
  }
}

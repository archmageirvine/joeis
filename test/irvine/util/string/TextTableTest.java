package irvine.util.string;

import junit.framework.TestCase;

import java.io.IOException;

/**
 * Tests the corresponding class.
 * @author Ross Braithwaite
 * @author Sean A. Irvine
 */
public class TextTableTest extends TestCase {

  private static final String LS = System.lineSeparator();
  private static final String EXPECTED1 = ""
    + " depth  breadth  covered       size  non-N-depth  non-N-breadth  non-N-covered  non-N-size   name" + LS
    + "-------------------------------------------------------------------------------------------------" + LS
    + "0.0097   0.0087  2140198  247249719       0.0107         0.0095        2140198   224999719   chr1" + LS
    + "0.0112   0.0093  1259191  135374737       0.0116         0.0096        1259191   131624728  chr10" + LS
    + "0.0100   0.0093  1256531  134452384       0.0102         0.0096        1256531   131130753  chr11" + LS
    + "0.0093   0.0088  1162746  132349534       0.0095         0.0089        1162746   130303032  chr12" + LS;
  private static final String EXPECTED2 = ""
    + "depth   breadth  covered  size       non-N-depth  non-N-breadth  non-N-covered  non-N-size   name" + LS
    + "-------------------------------------------------------------------------------------------------" + LS
    + "0.0097   0.0087  2140198  247249719    0.0107            0.0095  2140198         224999719   chr1" + LS
    + "0.0112   0.0093  1259191  135374737    0.0116            0.0096  1259191         131624728  chr10" + LS
    + "0.0100   0.0093  1256531  134452384    0.0102            0.0096  1256531         131130753  chr11" + LS
    + "0.0093   0.0088  1162746  132349534    0.0095            0.0089  1162746         130303032  chr12" + LS;

  public void testDefault() throws IOException {
    final TextTable table = new TextTable();
    assertEquals("", table.toString());
    assertEquals(0, table.numRows());

    table.addRow("depth", "breadth", "covered", "size", "non-N-depth", "non-N-breadth", "non-N-covered", "non-N-size", "name");
    table.addSeparator();
    table.addRow("0.0097", "0.0087", "2140198", "247249719", "0.0107", "0.0095", "2140198", "224999719", "chr1");
    table.addRow("0.0112", "0.0093", "1259191", "135374737", "0.0116", "0.0096", "1259191", "131624728", "chr10");
    table.addRow("0.0100", "0.0093", "1256531", "134452384", "0.0102", "0.0096", "1256531", "131130753", "chr11");
    table.addRow("0.0093", "0.0088", "1162746", "132349534", "0.0095", "0.0089", "1162746", "130303032", "chr12");
    assertEquals(6, table.numRows());

    assertEquals(EXPECTED1, table.toString());

    table.setAlignment(TextTable.Align.LEFT, TextTable.Align.RIGHT, TextTable.Align.CENTER, TextTable.Align.LEFT, TextTable.Align.CENTER, TextTable.Align.RIGHT, TextTable.Align.LEFT);
    assertEquals(EXPECTED2, table.toString());
  }

  private static final String EXPECTED3 = ""
    + "       1:     4" + LS
    + "       2:    42" + LS
    + "      10:    24" + LS
    + "  longer:   333" + LS;

  private static final String EXPECTED4 = ""
    + "  1:          4" + LS
    + "  2:         42" + LS
    + "  10:        24" + LS
    + "  longer:   333" + LS;

  private static final String EXPECTED5 = ""
    + "    1:        4" + LS
    + "    2:       42" + LS
    + "    10:      24" + LS
    + "  longer:   333" + LS;

  public void testIndent() throws IOException {
    final TextTable table = new TextTable(3, 2, TextTable.Align.RIGHT);
    table.addRow("1:", "4");
    table.addRow("2:", "42");
    table.addRow("10:", "24");
    table.addRow("longer:", "333");

    assertEquals(EXPECTED3, table.toString());

    table.setAlignment(TextTable.Align.LEFT);
    assertEquals(EXPECTED4, table.toString());

    table.setAlignment(TextTable.Align.CENTER);
    assertEquals(EXPECTED5, table.toString());
  }

  public void testSingleRowAndColumn() {
    final TextTable table = new TextTable();
    table.addRow("1");
    assertEquals("1" + System.lineSeparator(), table.toString());
  }

  public void testErrors() {
    final TextTable table = new TextTable();
    table.addRow("1", "2");
    try {
      table.addRow("1", "2", "3");
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Mismatching number of columns in table formatter", e.getMessage());
    }
    try {
      table.addRow("1", null);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Null provided as value in table formatters", e.getMessage());
    }
  }
}

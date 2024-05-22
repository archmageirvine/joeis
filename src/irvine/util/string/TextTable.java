package irvine.util.string;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.function.Functions;

/**
 * A class to format a table of data using aligned columns.
 * Will make human readable tables in output, not necessarily machine readable.
 * @author Ross Braithwaite
 * @author Sean A. Irvine
 */
public class TextTable {

  /**
   * Specifies possible column alignment options
   */
  public enum Align {
    /** Left justifies the cell */
    LEFT {
      @Override
      void appendCell(final StringBuilder sb, final int maxSize, final String cell) {
        sb.append(cell);
        appendSpaces(sb, maxSize - cell.length());
      }
    },
    /** Center justifies the cell */
    CENTER {
      @Override
      void appendCell(final StringBuilder sb, final int maxSize, final String cell) {
        final int toAdd = maxSize - cell.length();
        final int left = toAdd / 2;
        appendSpaces(sb, left);
        sb.append(cell);
        appendSpaces(sb, toAdd - left);
      }
    },
    /** Right justifies the cell */
    RIGHT() {
      @Override
      void appendCell(final StringBuilder sb, final int maxSize, final String cell) {
        appendSpaces(sb, maxSize - cell.length());
        sb.append(cell);
      }
    };

    /**
     * Append a cell to the text representation.
     * @param sb accumulating the text representation
     * @param maxSize the output width of the column
     * @param cell the input cell contents
     */
    abstract void appendCell(final StringBuilder sb, final int maxSize, final String cell);

  }

  private static final ArrayList<String> SEPARATOR = new ArrayList<>();
  private static final String LS = System.lineSeparator();

  private final int mTabWidth;
  private final int mInitialIndent;
  private final Align mDefaultAlignment;
  private final ArrayList<ArrayList<String>> mTableContents = new ArrayList<>();
  private int[] mColumnWidths = null;

  private Align[] mAlignment = new Align[0];

  /**
   * Default constructor with tab width set to two.
   */
  public TextTable() {
    this(2, 0, Align.RIGHT);
  }

  /**
   * Constructor
   * @param tabWidth the width of the tab spacing
   * @param initialIndent the number of spaces to have as a base indent at start of each line
   * @param defaultAlignment the alignment used for cells by default
   */
  public TextTable(final int tabWidth, final int initialIndent, final Align defaultAlignment) {
    mTabWidth = tabWidth;
    mInitialIndent = initialIndent;
    mDefaultAlignment = defaultAlignment;
  }

  /**
   * Set the column alignments
   * @param alignment the alignment for each column. If there are more columns than provided alignments, the table default is used.
   */
  public void setAlignment(final Align... alignment) {
    if (mTableContents.size() > 0 && mTableContents.get(0).size() < alignment.length) {
      throw new IllegalArgumentException("Too many alignment values supplied for number of columns in table formatter");
    }
    mAlignment = Arrays.copyOf(alignment, alignment.length);
  }

  /**
   * Add a row of entries to the table
   * Each row must be the same length and contain no nulls
   * @param cells the cells to add
   */
  public void addRow(final String... cells) {
    if (mTableContents.size() > 0 && mTableContents.get(0).size() != cells.length) {
      throw new IllegalArgumentException("Mismatching number of columns in table formatter");
    }
    if (cells.length < mAlignment.length) {
      throw new IllegalArgumentException("Too many alignment values supplied for number of columns supplied in row");
    }
    if (mColumnWidths == null) {
      mColumnWidths = new int[cells.length];
    }
    final ArrayList<String> cellList = new ArrayList<>(cells.length);
    int col = 0;
    for (final String cell : cells) {
      if (cell == null) {
        throw new IllegalArgumentException("Null provided as value in table formatters");
      }
      cellList.add(cell);
      mColumnWidths[col] = Math.max(mColumnWidths[col], cell.length());
      ++col;
    }
    mTableContents.add(cellList);
  }

  /**
   * Add a separator line to the table.
   */
  public void addSeparator() {
    mTableContents.add(SEPARATOR);
  }

  /**
   * Get the number of rows that have been added to the table.
   * @return the number of rows added.
   */
  public int numRows() {
    return mTableContents.size();
  }

  /**
   * Reset the table so it can be used to format a new set of rows
   */
  public void reset() {
    mTableContents.clear();
  }

  private static void appendSpaces(final StringBuilder sb, final int number) {
    for (int i = 0; i < number; ++i) {
      sb.append(' ');
    }
  }

  // Takes care to handle case of empty columns at end of table
  private long getTotalWidth() {
    long totalWidth = Functions.SUM.l(mColumnWidths) + mTabWidth * (mColumnWidths.length - 1L);
    for (int j = mColumnWidths.length - 1; j >= 0 && mColumnWidths[j] == 0; --j) {
      totalWidth -= mTabWidth;
    }
    return totalWidth;
  }

  /**
   * Add formatted table to string builder
   * @param sb string builder to append to
   */
  public void toString(final StringBuilder sb) {
    final int rows = mTableContents.size();
    if (rows > 0) {
      final int columns = mTableContents.get(0).size();
      if (columns > 0) {
        final int[] maxLengths = mColumnWidths;
        final long totalWidth =  getTotalWidth();
        for (final ArrayList<String> row : mTableContents) {
          if (row == SEPARATOR) {
            for (long j = 0; j < totalWidth; ++j) {
              sb.append('-');
            }
          } else {
            for (int j = 0; j < columns; ++j) {
              if (j == 0) {
                appendSpaces(sb, mInitialIndent);
              } else {
                appendSpaces(sb, mTabWidth);
              }
              final Align align = j < mAlignment.length ? mAlignment[j] : mDefaultAlignment;
              align.appendCell(sb, maxLengths[j], row.get(j));
            }
          }
          sb.append(LS);
        }
      }
    }
  }


  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    toString(sb);
    return sb.toString();
  }

}

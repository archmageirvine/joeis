package irvine.util.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Process lines of a stream or file.
 *
 * @author Sean A. Irvine
 */
public abstract class StreamProcessor {

  /**
   * Process all the non-empty non-comment lines of a stream, by passing them
   * one at a time to a process method.
   *
   * @param is input stream
   * @exception IOException if an I/O error occurs
   */
  public void process(final InputStream is) throws IOException {
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(is))) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          process(line);
        }
      }
    }
  }

  /**
   * Process all the non-empty non-comment lines of a stream, by passing them
   * one at a time to a process method.
   *
   * @param file file to read
   * @exception IOException if an I/O error occurs
   */
  public void process(final File file) throws IOException {
    try (final FileInputStream is = new FileInputStream(file)) {
      process(is);
    }
  }

  /**
   * Process a line.
   *
   * @param line the line
   * @exception IOException if input was invalid
   */
  public abstract void process(final String line) throws IOException;

  private static class ListStreamProcessor extends StreamProcessor {

    private final List<String> mList = new ArrayList<>();

    @Override
    public void process(final String line) {
      mList.add(line);
    }
  }

  /**
   * Return a list of string comprising non-comment lines from the input.
   *
   * @param is input stream
   * @return list of strings
   * @exception IOException if an I/O error occurs.
   */
  public static List<String> list(final InputStream is) throws IOException {
    final ListStreamProcessor lsp = new ListStreamProcessor();
    lsp.process(is);
    return lsp.mList;
  }
}

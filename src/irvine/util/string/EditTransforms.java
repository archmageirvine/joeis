package irvine.util.string;

import java.util.ArrayList;

/**
 * Transforms.
 * @author Stuart Inglis
 * @author Sean A. Irvine
 */
public class EditTransforms {

  private ArrayList<Character> mActions = new ArrayList<>();
  private ArrayList<Character> mChars = new ArrayList<>();
  private boolean mReversed = false;

  void add(final char action, final char ch) {
    mActions.add(action);
    mChars.add(ch);
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    for (int i = 0; i < mActions.size(); ++i) {
      sb.append(mActions.get(i));
      sb.append(mChars.get(i));
    }
    return sb.toString();
  }

  String toSimpleString() {
    final StringBuilder sb = new StringBuilder();
    for (final Character mAction : mActions) {
      sb.append(mAction);
    }
    return sb.toString();
  }

  void reverse() {
    if (mReversed) {
      throw new RuntimeException("Already reversed!");
    }
    mReversed = true;
    final ArrayList<Character> ac1 = mActions;
    final ArrayList<Character> ch1 = mChars;

    mActions = new ArrayList<>();
    mChars = new ArrayList<>();

    for (int i = ac1.size() - 1; i >= 0; --i) {
      final char ac = ac1.get(i);
      final char ch = ch1.get(i);
      add(ac, ch);
    }
  }

  ArrayList<Character> getActions() {
    return mActions;
  }
}

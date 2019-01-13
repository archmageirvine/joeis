package irvine.util;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * A limited length priority queue where items are scored by a double.
 * Supports both ascending and descending queues.
 *
 * @author Sean A. Irvine
 * @param <T> underlying comparable type
 */
public class LimitedLengthPriorityQueue<T extends Comparable<T>> extends TreeSet<LimitedLengthPriorityQueue.Node<T>> {

  /**
   * Class holding an item and score.
   * @param <T> underlying type
   */
  public static final class Node<T extends Comparable<T>> implements Comparable<Node<T>> {

    private final T mValue;
    private final double mScore;

    private Node(final T value, final double score) {
      mValue = value;
      mScore = score;
    }

    @Override
    public int compareTo(final Node<T> c) {
      if (this == c) {
        return 0;
      }
      final int cmp = Double.compare(getScore(), c.getScore());
      if (cmp == 0) {
        return getValue().compareTo(c.getValue());
      }
      return cmp;
    }

    public T getValue() {
      return mValue;
    }

    public double getScore() {
      return mScore;
    }

    @Override
    public boolean equals(final Object o) {
      if (!(o instanceof Node)) {
        return false;
      }
      final Node<?> n = (Node<?>) o;
      final int cmp = Double.compare(getScore(), n.getScore());
      return cmp == 0 && getValue().equals(n.getValue());
    }

    @Override
    public int hashCode() {
      return (int) Double.doubleToRawLongBits(mScore);
    }

    @Override
    public String toString() {
      return String.format("%4.4g", getScore()) + " " + getValue();
    }
  }

  private final int mMaximumLength;
  private final boolean mBiggerIsBetter;

  /**
   * Construct a new length limited priority queue.
   * @param maxLength maximum length of queue
   * @param biggerIsBetter direction of queue
   */
  public LimitedLengthPriorityQueue(final int maxLength, final boolean biggerIsBetter) {
    mMaximumLength = maxLength;
    mBiggerIsBetter = biggerIsBetter;
  }

  /**
   * Add an value with the given score into the queue.  If the score is too
   * small compared to the existing values and the length of the queue has
   * reached its limit, then the add request is ignored.
   *
   * @param score score of the value
   * @param value value to add
   * @return true if value was added
   */
  public boolean add(final double score, final T value) {
    if (size() < mMaximumLength) {
      add(new Node<>(value, score));
      return true;
    }
    final Node<T> q = mBiggerIsBetter ? first() : last();
    if ((q.mScore < score) == mBiggerIsBetter) {
      remove(q);
      add(new Node<>(value, score));
      return true;
    }
    return false;
  }

  /**
   * Return the current contents of the priority queue as a map from item to score.
   * @return map of contents
   */
  public Map<T, Double> map() {
    final HashMap<T, Double> map = new HashMap<>(size());
    for (final Node<T> n : this) {
      map.put(n.getValue(), n.getScore());
    }
    return map;
  }
}

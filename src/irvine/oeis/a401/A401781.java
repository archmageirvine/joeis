
package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401781 allocated for Paul Sampson.
 * @author Sean A. Irvine
 */
public class A401781 extends Sequence1 {

  // ChatGPT designed the multithreading here

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));

  /**
   * A task representing a subtree of the partition-generation tree.
   */
  private static class PartitionTask extends RecursiveTask<Z> {

    private final int mN;
    private final int mPos;
    private final int mBlocks;
    private final int[] mBlock;
    private final int[] mSizes;
    private final int mSplitDepth;

    PartitionTask(final int n, final int pos, final int blocks, final int[] block, final int[] sizes, final int splitDepth) {
      mN = n;
      mPos = pos;
      mBlocks = blocks;
      mBlock = block;
      mSizes = sizes;
      mSplitDepth = splitDepth;
    }

    @Override
    protected Z compute() {
      if (mPos >= mN || mPos >= mSplitDepth) {
        return generate(mN, mPos, mBlocks, mBlock, mSizes);
      }

      final List<PartitionTask> tasks = new ArrayList<>();

      // Add the next element to each existing block.
      for (int b = 0; b < mBlocks; ++b) {
        final int[] block = mBlock.clone();
        final int[] sizes = mSizes.clone();
        block[mPos] = b;
        ++sizes[b];
        tasks.add(new PartitionTask(mN, mPos + 1, mBlocks, block, sizes, mSplitDepth));
      }

      // Create a new block.
      {
        final int[] block = mBlock.clone();
        final int[] sizes = mSizes.clone();
        block[mPos] = mBlocks;
        sizes[mBlocks] = 1;
        tasks.add(new PartitionTask(mN, mPos + 1, mBlocks + 1, block, sizes, mSplitDepth));
      }

      invokeAll(tasks);

      Z count = Z.ZERO;
      for (final PartitionTask task : tasks) {
        count = count.add(task.join());
      }
      return count;
    }
  }

  /*
   * Sequentially enumerate a subtree of the partition tree.
   */
  private static Z generate(final int n, final int pos, final int blocks, final int[] block, final int[] sizes) {
    if (pos == n) {
      return hasTransversal(n, blocks, block, sizes) ? Z.ZERO : Z.ONE;
    }
    Z count = Z.ZERO;

    // Put the next element in each existing block.
    for (int b = 0; b < blocks; ++b) {
      block[pos] = b;
      ++sizes[b];
      count = count.add(generate(n, pos + 1, blocks, block, sizes));
      --sizes[b];
    }

    // Alternatively, create a new block.
    block[pos] = blocks;
    sizes[blocks] = 1;
    count = count.add(generate(n, pos + 1, blocks + 1, block, sizes));
    return count;
  }

  /**
   * Test whether some permutation of the block sizes and
   * some starting point produce a transversal.
   */
  private static boolean hasTransversal(final int n, final int blocks, final int[] block, final int[] sizes) {
    final int[] sorted = Arrays.copyOf(sizes, blocks);
    Arrays.sort(sorted);
    final boolean[] used = new boolean[blocks];
    final boolean[] blockUsed = new boolean[blocks];
    for (int start = 0; start < n; ++start) {
      if (permute(n, blocks, block, sorted, used, blockUsed, 0, start)) {
        return true;
      }
    }
    return false;
  }

  /**
   * Search for a transversal, constructing the size permutation
   * and checking block membership simultaneously.
   */
  private static boolean permute(final int n, final int blocks, final int[] block, final int[] sorted, final boolean[] used, final boolean[] blockUsed, final int depth, final int cur) {
    if (depth == blocks) {
      return true;
    }
    final int b = block[cur];
    if (blockUsed[b]) {
      return false;
    }

    blockUsed[b] = true;

    for (int i = 0; i < blocks; ++i) {
      if (used[i] || (i > 0 && sorted[i] == sorted[i - 1] && !used[i - 1])) {
        continue;
      }
      used[i] = true;
      if (permute(n, blocks, block, sorted, used, blockUsed, depth + 1, (cur + sorted[i]) % n)) {
        used[i] = false;
        blockUsed[b] = false;
        return true;
      }
      used[i] = false;
    }
    blockUsed[b] = false;
    return false;
  }

  private int mN;

  @Override
  public Z next() {
    ++mN;
    // Number of assigned elements at which to stop splitting.
    final int splitDepth = Math.max(1, Math.min(mN, Integer.getInteger("oeis.a401781.splitDepth", 7)));
    final int[] block = new int[mN];
    final int[] sizes = new int[mN];
    block[0] = 0;
    sizes[0] = 1;
    final ForkJoinPool pool = new ForkJoinPool(THREADS);
    try {
      return pool.invoke(new PartitionTask(mN, 1, 1, block, sizes, splitDepth));
    } finally {
      pool.shutdown();
    }
  }
}


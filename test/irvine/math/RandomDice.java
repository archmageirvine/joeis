package irvine.math;

/**
 * Generate graphs appearing in documentation.
 *
 * @author Sean A. Irvine
 */
public final class RandomDice {

  private RandomDice() { }

  private static void binomial(final String[] args) {
    final int[] counts = new int[40];
    final int t = Integer.parseInt(args[1]);
    final double p = Double.parseDouble(args[2]);
    for (int i = 0; i < 1000000; ++i) {
      counts[RandomUtils.binomial(t, p)]++;
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println(i + "\t" + counts[i]);
      }
    }
  }

  private static void nbinomial(final String[] args) {
    final int[] counts = new int[1000000];
    final int t = Integer.parseInt(args[1]);
    final double p = Double.parseDouble(args[2]);
    for (int i = 0; i < 1000000; ++i) {
      final int h = RandomUtils.negativeBinomial(t, p);
      if (h < counts.length) {
        counts[h]++;
      } else {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println(i + "\t" + counts[i]);
      }
    }
  }

  private static void geometric(final String[] args) {
    final int[] counts = new int[10000];
    final double p = Double.parseDouble(args[1]);
    for (int i = 0; i < 1000000; ++i) {
      final int h = RandomUtils.geometric(p);
      if (h < counts.length) {
        counts[h]++;
      } else {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println(i + "\t" + counts[i]);
      }
    }
  }

  private static void poisson(final String[] args) {
    final int[] counts = new int[10000];
    final double lambda = Double.parseDouble(args[1]);
    for (int i = 0; i < 1000000; ++i) {
      final int h = RandomUtils.poisson(lambda);
      if (h < counts.length) {
        counts[h]++;
      } else {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println(i + "\t" + counts[i]);
      }
    }
  }

  private static void normal(final String[] args) {
    final int[] counts = new int[1000000];
    final double mu = Double.parseDouble(args[1]);
    final double sigma = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 50;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.normal(mu, sigma) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void lnormal(final String[] args) {
    final int[] counts = new int[1000000];
    final double mu = Double.parseDouble(args[1]);
    final double sigma = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 50;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.lognormal(mu, sigma) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void exponential(final String[] args) {
    final int[] counts = new int[500000];
    final double lambda = Double.parseDouble(args[1]);
    final int limit = 5000000;
    final double scale = 50;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.exponential(lambda) * scale);
      try {
        counts[h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println(i / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void erlang(final String[] args) {
    final int[] counts = new int[1000000];
    final int shape = Integer.parseInt(args[1]);
    final double lambda = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 50;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.erlang(shape, lambda) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void gamma(final String[] args) {
    final int[] counts = new int[1000000];
    final double shape = Double.parseDouble(args[1]);
    final double theta = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 50;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.gamma(shape, theta) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void beta(final String[] args) {
    final int[] counts = new int[1000000];
    final double shape = Double.parseDouble(args[1]);
    final double theta = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 250;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.beta(shape, theta) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void weibull(final String[] args) {
    final int[] counts = new int[1000000];
    final double shape = Double.parseDouble(args[1]);
    final double theta = Double.parseDouble(args[2]);
    final int limit = 5000000;
    final double scale = 100;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.weibull(shape, theta) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  private static void triangular(final String[] args) {
    final int[] counts = new int[1000000];
    final double a = Double.parseDouble(args[1]);
    final double b = Double.parseDouble(args[2]);
    final double c = Double.parseDouble(args[3]);
    final int limit = 5000000;
    final double scale = 100;
    for (int i = 0; i < limit; ++i) {
      final int h = (int) Math.round(RandomUtils.triangular(a, b, c) * scale);
      try {
        counts[500000 + h]++;
      } catch (final ArrayIndexOutOfBoundsException e) {
        System.out.println("# Big result " + h);
      }
    }
    for (int i = 0; i < counts.length; ++i) {
      if (counts[i] != 0) {
        System.out.println((i - 500000) / scale + "\t" + (counts[i] / (limit / scale)));
      }
    }
  }

  /**
   * Perform a million trials of the specified distribution, producing a
   * summary.
   *
   * @param args sides
   */
  public static void main(final String[] args) {
    if ("-s".equals(args[0])) {
      final int[] d4 = {4};
      final int[] d8 = {8};
      final int[] d12 = {12, 12};
      final int[] counts = new int[1000];
      for (int i = 0; i < 1000000; ++i) {
        final int rd4 = RandomUtils.rollDice(d4);
        final int rd8 = RandomUtils.rollDice(d8);
        final int rd12 = RandomUtils.rollDice(d12);
        final int x = rd4 * rd8 - rd12;
        counts[x + 24]++;
      }
      for (int i = 0; i < counts.length; ++i) {
        if (counts[i] != 0) {
          System.out.println((i - 24) + "\t" + counts[i]);
        }
      }
    } else if ("-b".equals(args[0])) {
      binomial(args);
    } else if ("-nb".equals(args[0])) {
      nbinomial(args);
    } else if ("-g".equals(args[0])) {
      geometric(args);
    } else if ("-p".equals(args[0])) {
      poisson(args);
    } else if ("-n".equals(args[0])) {
      normal(args);
    } else if ("-ln".equals(args[0])) {
      lnormal(args);
    } else if ("-e".equals(args[0])) {
      exponential(args);
    } else if ("-E".equals(args[0])) {
      erlang(args);
    } else if ("-G".equals(args[0])) {
      gamma(args);
    } else if ("-B".equals(args[0])) {
      beta(args);
    } else if ("-w".equals(args[0])) {
      weibull(args);
    } else if ("-t".equals(args[0])) {
      triangular(args);
    } else {
      final int[] sides = new int[args.length];
      int max = 0;
      for (int i = 0; i < args.length; ++i) {
        sides[i] = Integer.parseInt(args[i]);
        max += sides[i];
      }
      final int[] counts = new int[max + 1];
      for (int i = 0; i < 1000000; ++i) {
        counts[RandomUtils.rollDice(sides)]++;
      }
      for (int i = 0; i < counts.length; ++i) {
        if (counts[i] != 0) {
          System.out.println(i + "\t" + counts[i]);
        }
      }
      System.out.println("#min " + (sides.length - 1));
      System.out.println("#max " + (max + 1));
    }
  }
}

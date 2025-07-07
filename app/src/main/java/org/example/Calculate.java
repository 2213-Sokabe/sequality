package org.example;

public class Calculate {
  public static int sum(int x, int y) {
    return x + y;
  }

  public static int sum2(int x, int y) {
    int total = 0;
    for (int i = x; i <= y; i++) {
      total += i;
    }
    return total;
  }

  public static double average(int x, int y) {
    return (x + y) / 2.0;
  }

  public static int Sum_odd(int x, int y) {
    int total = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        total += i;
      }
    }
    return total;
  }

  public static int Sum_even(int x, int y) {
    int total = 0;
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        total += i;
      }
    }
    return total;
  }

}

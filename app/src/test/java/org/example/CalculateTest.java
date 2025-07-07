package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculateTest {
  @Test
  public void testSum() {
    int expected = 5;
    assertEquals(expected, Calculate.sum(2, 3));
  }

  @Test
  public void testAverage() {
    assertEquals(2.5, Calculate.average(2, 3), 0.001);
  }

  @Test
  public void testSum2() {
    assertEquals(55, Calculate.sum2(1, 10));
  }

  @Test
  public void testAverage2() {
    assertEquals(5.5, Calculate.average(1, 10), 0.001);
  }

  @Test
  public void testSum_odd() {
    assertEquals(25, Calculate.Sum_odd(1, 10));
  }

  @Test
  public void testSum_even() {
    assertEquals(30, Calculate.Sum_even(1, 10));
  }

}

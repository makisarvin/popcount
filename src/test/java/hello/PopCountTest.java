package hello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Testing the PopCount functionality
 * Created by jerry on 25/09/14.
 */
public class PopCountTest {

  @Test
  public void count0() {
    assertEquals(0, PopCount.population_count(0));
  }

  @Test
  public void count8() {
    assertEquals(1, PopCount.population_count(8));
  }

  @Test
  public void count15() {
    assertEquals(4, PopCount.population_count(15));
  }

  @Test
  public void count19() {
    assertEquals(3, PopCount.population_count(19));
  }

  @Test(expected = AssertionError.class)
  public void countminus() {
    PopCount.population_count(-1);
  }

  @Test
  public void countMax() {
    assertEquals(31, PopCount.population_count(Integer.MAX_VALUE));
  }
}

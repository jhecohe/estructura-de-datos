package com.danielblanco.algoritmosestructuras.arraysstringshashtables._02_two_sum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

  @Test
  public void twoSumTest() {
    int[] array = new int[] {9, 2, 5, 6};
    int[] array2 = new int[] {9, 2, 5, 6, 4};
    TwoSum twoSum = new TwoSum();
//    int[] result = twoSum.twoSum(array2, 7);
//    assertTrue((result[0] == 1 && result[1] == 2) || (result[0] == 2 && result[1] == 1));
//    assertEquals(null, twoSum.twoSum(array, 50));
    int[] result2 = twoSum.twoSum(array, 10);
    assertTrue((result2[0] == 6 && result2[1] == 4) || (result2[0] == 4 && result2[1] == 6));
  }
}

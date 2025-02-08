package com.danielblanco.algoritmosestructuras.arraysstringshashtables._02_two_sum;

import java.util.HashMap;

/*
 * Dado un array de números enteros y un target, retorna los índices de dos
 * números para los que la suma de ambos sea igual al target.
 *
 * Puedes asumir que hay solamente una solución.
 *
 * Ejemplo 1:
 *  Input: nums = [9,2,5,6], target = 7
 *  Output: [1,2]
 *  Explicación: nums[1] + nums[2] == 7, devolvemos [1, 2].
 *
 * Ejemplo 2:
 *  Input: nums = [9,2,5,6], target = 100
 *  Output: null
 */
public class TwoSum {

  public int[] twoSum(int[] nums, int target) {
    // We could use two cycles On*2
    // [9,2,5,6] ->
    // [0,1] = target
    // [0,2] = target It is not efficient

    // We have to iterate all the elements in the array -> O*n
    // store values in hashmap key -> num / value -> postion in the array
    // evary item we substract the num to the taget and validate if the result
    // it is in the hashmap

    HashMap<Integer, Integer> valores = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      Integer subs = target - nums[i];
      if (valores.containsKey(subs)) {
        return new int[]{i, valores.get(subs)};
      }
      valores.put(nums[i], i);
    }
    return null;
  }
}

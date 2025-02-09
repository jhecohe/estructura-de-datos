package com.danielblanco.algoritmosestructuras.arraysstringshashtables._03_group_anagrams;

import java.util.*;

/*
 * Un anagrama es una palabra creada a partir de la reordenación de las letras de otra palabra. Ej: saco - caso
 * Dado un array de strings, devuelve los anagramas agrupados. Cualquier orden es válido.
 *
 * Ejemplo:
 *  Input: words = ["saco", "arresto", "programa", "rastreo", "caso"].
 *  Output: [["saco", "caso"], ["arresto", "rastreo"], ["programa"]].
 */
public class GroupAnagrams {

  public List<List<String>> groupAnagrams(String[] words) {
    // We could iterate the array the words and in another nested cycle iterate each world
    // in the nested array go adding the sum of the characters in array and stored in other array

    // Use two separate cycles in the firstone count the letters of the word
    // in the second create the pairs in a array

    // Best solution
    // Create a method that return the word in a order way to compare with the other words
    // Create a method that sort the words by anagrams and return a list of wich each one
    // of the anagrams

    HashMap<String, List<String>> anagrams = getListAnagrams(words);
    return new ArrayList<>(anagrams.values());
  }

  HashMap<String, List<String>> getListAnagrams(String[] words) {
    HashMap<String, List<String>> anagrams = new HashMap<>();
    for (String w: words) {
      String order = getOrderWord(w);
      if (!anagrams.containsKey(order)) {
        anagrams.put(order, new ArrayList<String>());
      }
      anagrams.get(order).add(w);
    }
    return anagrams;
  }

  String getOrderWord( String word ){
    int[] countLetras = new int[26];
    for (int i = 0; i < word.length(); i++) {
      countLetras[word.charAt(i) - 'a'] = countLetras[word.charAt(i) - 'a'] + 1;
    }
    String wordOrd = Arrays.toString(countLetras);

    return wordOrd;
  }
}

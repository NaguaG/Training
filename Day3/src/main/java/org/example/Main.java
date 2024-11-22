package org.example;

public class Main {
    public static void main(String[] args) {
        //find the first non-repeated character in a string
        String str = "hhPaaipoPPkhdt";
        System.out.println("Problem1: First Non Repeated Character - " + FirstNonRepeatedCharacter.findFirstNonRepeatedCharacter(str));
        //Sum of unique elements
        int[] elements = {2, 3, 5, 3, 5, 7, 8, 2, 1};
        System.out.println("Problem2: Sum of Unique Elements - " + SumOfUniqueElements.sumOfUniqueEl(elements));

        // top K frequency words
        String[] input = {"i","love","leetcode","i","love","coding"};
        int k = 2;

        System.out.println("Problem3: Top k Frequency words - " + TopKFrequencyWords.topKFrequent(input, k));
    }
}
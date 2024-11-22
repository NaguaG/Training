package org.example;

import java.util.Arrays;

public class SumOfUniqueElements {
    public static int sumOfUniqueEl(int[] input){
        return Arrays.stream(input).distinct().sum();
    }

}

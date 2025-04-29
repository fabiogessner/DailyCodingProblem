package org.example;

import java.util.List;

public class Main {

    /**
     * This problem was recently asked by Google.     *
     * Given a list of numbers and a number k, return whether any two numbers from the list add up to k.     *
     * For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
     */
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 6, 3, 7);
        int k = 13;
        System.out.println("Result: " + verifySum(numbers, k));
    }

    public static boolean verifySum(List<Integer> numbers, int k) {
        for (int i = 0; i < numbers.size(); i++) {
            int firstNumber = numbers.get(i);
            for (int z = i + 1; z < numbers.size(); z++) {
                int secondNumber = numbers.get(z);
                int sum = firstNumber + secondNumber;
                if (sum == k)
                    return true;
            }
        }
        return false;
    }
}
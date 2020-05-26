package test_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * There is a list of integers. Find the sum of numbers that are repeated at least n times in m consecutive numbers.
 * Each number that satisfies the condition is counted only 1 time.
 * Example: 344620045000, n = 2, m = 3;
 * Solving: [344], [446], [462], [620], [200], [000] <- 4x2, 4x2, -, -, 0x2, 0x2;
 * unique numbers 4 and 0 => sum = 4+0 = 4.
 * Output: 4
 */

public class AppSumOfUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers. Numbers must be entered with a space.");
        String[] line = in.nextLine().split(" ");
        List<Integer> sequence = new ArrayList<>();
        for (String s : line) {
            sequence.add(Integer.parseInt(s));
        }

        System.out.println("How many numbers will be in the segment?");
        int m = in.nextInt();
        System.out.println("How many times should a number be repeated?");
        int n = in.nextInt();
        SumOfUnique sum = new SumOfUnique();
        System.out.println("The sum of unique numbers satisfying the condition in this sequence is " +
                + sum.sumOfUnique(sequence, m, n));
    }
}

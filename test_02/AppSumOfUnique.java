package test_02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Дан список целых чисел. Найти сумму чисел, которые повторяются не менее n раз в m подряд идущих числах. Каждое число,
 * удовлетворяющее условию, учитывается только 1 раз.
 * Пример: 344620045000, n = 2, m = 3;
 * [344], [446], [462], [620], [200], [000] <- 4x2, 4x2, -, -, 0x2, 0x3;
 * угикальные чилса 4 и 0 => sum = 4+0 = 4.
 */

public class AppSumOfUnique {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последоватьельность чисел. Числа нужно вводить через пробел. ");
        String[] line = in.nextLine().split(" ");
        List<Integer> sequence = new ArrayList<>();
        for (String s : line) {
            sequence.add(Integer.parseInt(s));
        }

        System.out.println("Сколько чисел будет в отрезке?");
        int m = in.nextInt();
        System.out.println("Сколько раз должно повторяться число? ");
        int n = in.nextInt();
        SumOfUnique sum = new SumOfUnique();
        System.out.println("Сумма уникальных чисел удовлетворяющих условию задачи " +
                "в данной последовательности = " + sum.sumOfUnique(sequence, m, n));
    }
}

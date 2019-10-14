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

public class SumOfUnique {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите последоватьельность чисел. Числа нужно вводить через пробел. ");
        String [] line = in.nextLine().split(" ");
        System.out.println(line);
        List <Integer> sequence = new ArrayList<>(); //todo считать список чисел
        for (int i = 0; i<line.length; i++) {
            sequence.add(Integer.getInteger(line[i]));
        }
        System.out.println(sequence);
        //todo regex на ввод int
        System.out.println("Сколько чисел будет в отрезке?");
        int m = in.nextInt();
        // todo если отрезок больше списка, то return 0
        System.out.println("Сколько раз должно повторяться число? ");
        int n = in.nextInt();
        // todo если повторов больше чем отрезок, то return 0
        System.out.println(sumOfUnique (sequence, m, n));
    }

    private static int sumOfUnique(List<Integer> sequence, int m, int n) {
        int result = 0;


        return result;
    }
}

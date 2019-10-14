package test_02;

import java.util.ArrayList;
import java.util.List;

class SumOfUnique {

    /**
     * @param sequence последоватьельность (список) чисел для анализа
     * @param m        длина отрезка для подсчета повторений
     * @param n        количество повторений
     * @return сумма уникальных чисел, которые повторяются не менее n раз в m подряд идущих числах
     * внутри последовательности
     */
    int sumOfUnique(List<Integer> sequence, int m, int n) {
        int result = 0;
        List<Integer> uniqueNumbers = new ArrayList<>();
        if (m > sequence.size()) {                      // если отрезок больше списка
            m = sequence.size();
        }
        if (n > m) {                                    // если повторов больше чем отрезок
            return 0;
        }

        for (int i = 0; i <= sequence.size() - m; i++) {
            int count = checkSubSubSequence(sequence.subList(i, i + m - 1));
            if (count >= n) {
                addToUnique(uniqueNumbers, sequence.get(i));
            }
        }

        for (int number : uniqueNumbers) {
            result += number;
        }
        return result;
    }

    /**
     * @param uniqueNumbers список для добавления элемента
     * @param i             элемент, который добавляется, если такого еще нет в списке
     */
    private void addToUnique(List<Integer> uniqueNumbers, Integer i) {
        if (!uniqueNumbers.contains(i))                 // добавляем число, если его еще нет в списке
            uniqueNumbers.add(i);
    }

    /**
     * @param subSequence последоватьельность (список) чисел для анализа
     * @return количество повторений первого элемента внутри последовательности
     */
    private int checkSubSubSequence(List<Integer> subSequence) {
        int count = 1;
        for (int k = 1; k < subSequence.size(); k++) {
            if ((int) subSequence.get(0) == subSequence.get(k)) {
                count++;
            }
        }
        return count;
    }
}






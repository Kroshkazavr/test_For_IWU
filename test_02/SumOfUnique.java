package test_02;

import java.util.ArrayList;
import java.util.List;

class SumOfUnique {

    /**
     * @param sequence given sequence
     * @param m        segment length
     * @param n        number of repetitions
     * @return sum of unique numbers that are repeated at least n times in m consecutive numbers in given sequence
     */
    int sumOfUnique(List<Integer> sequence, int m, int n) {
        int result = 0;
        List<Integer> uniqueNumbers = new ArrayList<>();
        if (m > sequence.size()) {                      // if segment is more than sequence length
            m = sequence.size();
        }
        if (n > m) {                                    // if number of repetitions is more than segment length
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
     * @param uniqueNumbers list to add an item
     * @param i             item to add
     */
    private void addToUnique(List<Integer> uniqueNumbers, Integer i) {
        if (!uniqueNumbers.contains(i))
            uniqueNumbers.add(i);
    }

    /**
     * @param subSequence segment for analysis
     * @return the number of repetitions of the first element within the segment
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






package test_04;

import java.util.Comparator;
import java.util.List;

class TacoBudget {

    /**
     * @param price    list of taco prices at nearby cafes
     * @param budget   Mika's budget
     * @param quantity quantity of tacos Mika wants
     * @return maximum amount Mika can spend to buy as many tacos as he wants
     */
    int takeMyMany(List<Integer> price, int budget, int quantity) {
        int maxBudget = 0;
        price.sort(Comparator.reverseOrder());
        for (int i = 0; i < price.size() - quantity; i++) {
            maxBudget = price.get(i);
            for (int q = 1; q < quantity; q++) {
                maxBudget += price.get(i + q);
            }
            if (maxBudget > budget) {
                maxBudget = 0;
            } else {
                break;
            }
        }
        if (maxBudget == 0) {
            System.out.println("It is impossible to buy " + quantity + " tacos within the budget in " + budget + " euros");
        }
        return maxBudget;
    }
}

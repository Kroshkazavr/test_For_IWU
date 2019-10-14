package test_04;

import java.util.Comparator;
import java.util.List;

class TacoBudget {

    /**
     * @param price    список с ценами на шаурму в ближайших кафе
     * @param budget   количество Мишиных денег
     * @param quantity количество штук шаурмы, которое хочет купить Миша
     * @return максимальнуая сумма которую может потратить Миша, чтобы приобрести столько шаурм, сколько ему хочется
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
            System.out.println("В рамках бюджета в " + budget + " руб. невозможно купить " + quantity + " шт. шав.");
        }
        return maxBudget;
    }
}

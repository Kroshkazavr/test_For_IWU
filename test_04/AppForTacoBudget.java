package test_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Миша хочет quantity штук шаурмы и у него есть budget денег. Также известен список цен на шаурму в ближайших кафе.
 * Какую максимальную сумму может потратить Миша, чтобы приобрести столько шаурм, сколько ему хочется?
 */
public class AppForTacoBudget {

    public static void main(String[] args) {
        List<Integer> price = new ArrayList<>();
        price.add(500);
        price.add(750);
        price.add(300);
        price.add(900);
        price.add(100);
        price.add(150);
        int budget = 2000;
        int quantity = 4;

        TacoBudget tb = new TacoBudget();
        System.out.println("Максимально можно потратить " + tb.takeMyMany(price, budget, quantity) + " руб.");
    }
}

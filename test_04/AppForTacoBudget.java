package test_04;

import java.util.ArrayList;
import java.util.List;

/**
 * Mika wants a “quantity” of tacos and he has a “budget” of money.
 * There is also a list of taco prices at nearby cafes.
 * What is the maximum amount Mika can spend to buy as many tacos as he wants?
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
        System.out.println("The maximum amount is " + tb.takeMyMany(price, budget, quantity) + " euros.");
    }
}

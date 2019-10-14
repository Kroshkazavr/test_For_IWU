package test_03;

/**
 * Приложение для подсчета слов с заданным количеством букв.
 */
public class AppForLettersCounter {

    public static void main(String[] args) {
        String phrase = "Муха села на варенье вот и все стихотворенье";
        int quantity = 3;
        LettersCounter lc = new LettersCounter();
        System.out.println("Слов из " + quantity + " букв в фразе: <" + phrase + "> - " + lc.checkPhrase(phrase, quantity) + ".");
    }
}

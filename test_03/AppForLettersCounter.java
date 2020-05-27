package test_03;

/**
 * Application for counting words with a given number of letters in the entered line.
 */
public class AppForLettersCounter {

    public static void main(String[] args) {
        String phrase = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris " +
                "nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit " +
                "esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt " +
                "in culpa qui officia deserunt mollit anim id est laborum.";
        int quantity = 3; /*number of letters in the word*/
        LettersCounter lc = new LettersCounter();
        System.out.println("There is " + lc.checkPhrase(phrase, quantity) + " words with " + quantity + " letters in the line: <" + phrase + ">.");
    }
}

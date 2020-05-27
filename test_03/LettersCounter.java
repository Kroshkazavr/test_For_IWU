package test_03;

/**
 * A class with a method for counting words with a given number of letters.
 */
class LettersCounter {

    /**
     * @param phrase   line for counting words that satisfy the condition
     * @param quantity given number of letters in a word
     * @return number of words satisfying the condition
     */
    int checkPhrase(String phrase, int quantity) {
        int counter = 0;
        String[] arrPhrase = phrase.split(" ");
        for (String word : arrPhrase) {
            if (word.length() == quantity) {
                counter++;
            }
        }
        return counter;
    }
}

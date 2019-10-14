package test_03;

/**
 * Класс с методом для подсчета слов с заданным количеством букв.
 */
class LettersCounter {

    /**
     * @param phrase   строка для подсчета слов, соотвующих условию
     * @param quantity количество букв в искомом слове
     * @return количество слов с заданным количеством букв
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

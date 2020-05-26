package test_01;

import java.util.List;

/**
 * Class Robot with a word list output formatting method
 */

class Robot {

    /**
     * Output: all non-empty words separated by commas, the last with 'and'.
     * Example: "Cat, Dog, Crocodile, Fly and Bat"
     *
     * @param speach list of words for formatted output
     */
    void talk(List<String> speach) {
        for (int i = 0; i < speach.size(); i++) {
            if (speach.get(i) != null) {
                if (i == 0) {
                    System.out.print(speach.get(i));
                } else {
                    if (i == speach.size() - 1) {
                        System.out.print(" and " + speach.get(i));
                    } else {
                        System.out.print(", " + speach.get(i));
                    }
                }

            }
        }
    }
}

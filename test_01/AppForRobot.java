package test_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Application for formatting the output of a list of words.
 * Print all non-empty words separated by commas, the last with 'and'.
 * Output Example: "Cat, Dog, Crocodile, Fly and Bat"
 */

public class AppForRobot {

    public static void main(String[] args) {
        List<String> speach = new ArrayList<>();
        speach.add("Bird");
        speach.add(null);
        speach.add("Fish");
        speach.add("Owl");
        speach.add(null);
        speach.add("Cat");
        speach.add("Fluffy");

        Robot robo = new Robot();
        robo.talk(speach);
    }
}

package test_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Приложения для форматированного вывода списка слов.
 * Вывести все непустые слова через запятую, последнее через 'и'.
 * Пример: "Кошка, Собака, Крокодил, Муха и Летучая мышь!"
 */

public class AppForRobot {

    public static void main(String[] args) {
        List<String> speach = new ArrayList<>();
        speach.add("Лебедь");
        speach.add(null);
        speach.add("Рак");
        speach.add("Щука");
        speach.add(null);
        speach.add("Кошка");
        speach.add("Барбос");

        Robot robo = new Robot();
        robo.talk(speach);
    }
}

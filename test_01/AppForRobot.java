package test_01;

import java.util.ArrayList;
import java.util.List;

public class AppForRobot {

    public static void main(String[] args) {
        List <String> speach = new ArrayList<>();
        speach.add("Кошка");
        speach.add("Собака");
        speach.add(null);
        speach.add("Крокодил");
        speach.add(null);
        speach.add("Муха");
        speach.add("Летучая мышь");

        Robot robo = new Robot();
        robo.talk(speach);
    }
}

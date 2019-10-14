package test_01;

import java.util.List;

class Robot {
    void talk(List<String> speach) {
        for (int i = 0; i < speach.size(); i++) {
            if (speach.get(i) != null) {
                if (i == 0) {
                    System.out.print(speach.get(i));
                } else {
                    if (i == speach.size()-1) {
                        System.out.print(" и " + speach.get(i) + "!");
                    } else {
                        System.out.print(", " + speach.get(i));
                    }
                }

            }
        }
    }
}

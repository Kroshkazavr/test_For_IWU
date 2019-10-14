package test_01;

import java.util.List;

/**
 * Класс робот с методом форматированного вывода списка слов
 */

class Robot {

    /**
     * Формат вывода: все !null слова через запятую, последнее через 'и'.
     * Пример: "Кошка, Собака, Крокодил, Муха и Летучая мышь!"
     *
     * @param speach список слов для форматированного вывода
     */
    void talk(List<String> speach) {
        for (int i = 0; i < speach.size(); i++) {
            if (speach.get(i) != null) {
                if (i == 0) {
                    System.out.print(speach.get(i));
                } else {
                    if (i == speach.size() - 1) {
                        System.out.print(" и " + speach.get(i) + "!");
                    } else {
                        System.out.print(", " + speach.get(i));
                    }
                }

            }
        }
    }
}

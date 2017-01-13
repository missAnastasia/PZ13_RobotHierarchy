package project.structure;

import java.awt.*;

/**
 * Класс Eye описывает глаз робота, выполняющий функцию глаза человека, т.е. реализующий возможность восприятия
 * изображения.
 */
class Eye extends Sensor {

    private Color color;

    public Eye(Color color) {
        this.color = color;
    }

    @Override
    public void lookAt() {}
}

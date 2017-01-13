package project.robot;

import project.ability.Action;
import project.ability.Mooving3D;

/**
 * Супер-класс Robot реализует возможность движения в пространстве и выполнения определенных действий.
 */

public abstract class Robot implements Mooving3D, Action {

    protected String model; // Модель робота
    protected int serialNumber; // Серийный номер

    public Robot(String model, int serialNumber) {
        this.model = model;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }
}

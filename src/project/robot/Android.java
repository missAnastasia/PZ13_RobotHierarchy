package project.robot;

import project.structure.Body;

/**
 * Класс Android описывает автономный человекообразный тип роботов, схожих по строению с человеком.
 */

public class Android extends AutonomousRobot {

    private Body body; // Тело робота
    private String name; // Имя робота, так как он имеет образ человека

    public Android(String model, int serialNumber, Body body, String name) {
        super(model, serialNumber);
        this.body = body;
        this.name = name;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}

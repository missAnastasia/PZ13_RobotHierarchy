package project.structure;

import project.ability.Mooving3D;

/**
 * Класс Neck описывает шею робота, которая способна выполнять определенные движения
 * в пространстве, свойственные для шеи человека.
 */
class Neck implements Mooving3D {

    @Override
    public void moveUp() {}

    @Override
    public void moveDown() {}

    @Override
    public void moveForward() {}

    @Override
    public void moveBack() {}

    @Override
    public void moveLeft() {}

    @Override
    public void moveRight() {}

    @Override
    public void twistLeft() {}

    @Override
    public void twistRight() {}
}

package project.structure;

import project.ability.Action;

/**
 * Класс Leg описывает ногу робота, включающую в себя ступню. Помимо движения в пространстве добавлена возможность выполнения
 * свойственных для ноги действий.
 */
class Leg extends Limb implements Action {

    private Foot foot;

    public Leg(Foot foot) {
        this.foot = foot;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

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

    @Override
    public void push() {}

    @Override
    public void knock() {}
}

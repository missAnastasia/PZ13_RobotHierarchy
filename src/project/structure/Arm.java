package project.structure;

import project.ability.Action;

/**
 * Класс Arm описывает руку робота, включающую в себя кисть. Помимо движения в пространстве добавлена возможность выполнения
 * свойственных для руки действий.
 */
class Arm  extends Limb implements Action{

    private Wrist wrist;

    public Arm(Wrist wrist) {
        this.wrist = wrist;
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
    public void putUp() {}

    @Override
    public void putDown() {}

    @Override
    public void pull() {}

    @Override
    public void push() {}

    @Override
    public void knock() {}
}

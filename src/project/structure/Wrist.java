package project.structure;

/**
 * Класс Wrist описывает кисть робота, включающую в себя набор пальцев, которая способна выполнять определенные движения
 * в пространстве, свойственные для кисти человека.
 */
class Wrist extends Limb {

    private Finger[] fingers;

    public Wrist(Finger[] fingers) {
        this.fingers = fingers;
    }

    public Finger[] getFingers() {
        return fingers;
    }

    public void setFingers(Finger[] fingers) {
        this.fingers = fingers;
    }

    @Override
    public void moveUp() {}

    @Override
    public void moveDown() {}

    @Override
    public void moveLeft() {}

    @Override
    public void moveRight() {}

    @Override
    public void twistLeft() {}

    @Override
    public void twistRight() {}
}

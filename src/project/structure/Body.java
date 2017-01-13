package project.structure;

import project.ability.Action;
import project.ability.Mooving3D;

/**
 * Класс Body описывает строение тела робота, состоящее из головы, шеи и конечностей, прикрепленных к туловищу. Во внимание
 * были взяты только те части тела, с помощью которых робот может осуществлять какие-либо действия. Реализует возможность
 * свойственным человеку образом перемещаться в пространстве, а также выполнять свойственные человеку действия.
 */

public class Body implements Mooving3D, Action{

    private Arm leftArm; // Левая рука
    private Arm rightArm; // Правая рука
    private Leg leftLeg; // Левая нога
    private Leg rightLeg;  // Правая нога
    private Head head; // Голова
    private Neck neck; // Шея

    public Body(Arm leftArm, Arm rightArm, Leg leftLeg, Leg rightLeg, Head head, Neck neck) {
        this.leftArm = leftArm;
        this.rightArm = rightArm;
        this.leftLeg = leftLeg;
        this.rightLeg = rightLeg;
        this.head = head;
        this.neck = neck;
    }

    public Arm getLeftArm() {
        return leftArm;
    }

    public void setLeftArm(Arm leftArm) {
        this.leftArm = leftArm;
    }

    public Arm getRightArm() {
        return rightArm;
    }

    public void setRightArm(Arm rightArm) {
        this.rightArm = rightArm;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Neck getNeck() {
        return neck;
    }

    public void setNeck(Neck neck) {
        this.neck = neck;
    }

    // Метод для поддержания равновесия тела робота в вертикальном положении
    public void bodyBalance() {}


    // Методы переопределяются с точки зрения движения и действий всего тела

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
    public void standUpright() {}

    @Override
    public void lieDown() {}

    @Override
    public void sitDown() {}

    @Override
    public void jump() {}
}

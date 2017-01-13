package project.structure;

import project.structure.Ear;
import project.structure.Eye;
import project.structure.Mouth;
import project.structure.Nose;

/**
 * Класс Head описывает голову робота, включающую в себя сенсоры - аналоги органов чувств человека (глаза, нос, уши, рот),
 * с помощью которых робот может обмениваться информацией с внешним миром.
 */
class Head {

    private Eye leftEye;
    private Eye rightEye;
    private Nose nose;
    private Mouth mouth;
    private Ear leftEar;
    private Ear rightEar;

    public Head(Eye leftEye, Eye rightEye, Nose nose, Mouth mouth, Ear leftEar, Ear rightEar) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.nose = nose;
        this.mouth = mouth;
        this.leftEar = leftEar;
        this.rightEar = rightEar;
    }

    public Eye getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(Eye leftEye) {
        this.leftEye = leftEye;
    }

    public Eye getRightEye() {
        return rightEye;
    }

    public void setRightEye(Eye rightEye) {
        this.rightEye = rightEye;
    }

    public Nose getNose() {
        return nose;
    }

    public void setNose(Nose nose) {
        this.nose = nose;
    }

    public Mouth getMouth() {
        return mouth;
    }

    public void setMouth(Mouth mouth) {
        this.mouth = mouth;
    }

    public Ear getLeftEar() {
        return leftEar;
    }

    public void setLeftEar(Ear leftEar) {
        this.leftEar = leftEar;
    }

    public Ear getRightEar() {
        return rightEar;
    }

    public void setRightEar(Ear rightEar) {
        this.rightEar = rightEar;
    }
}

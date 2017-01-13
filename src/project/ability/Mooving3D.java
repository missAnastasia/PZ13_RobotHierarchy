package project.ability;

/**
 * Интерфейс Mooving3D содержит набор методов для движения в пространстве какой-либо частью "тела" робота.
 * Например, движение рукой робота. Может быть применимо не только для человекоподобных роботов, а также для
 * промышленного робота, имеющего руку.
 */
public interface Mooving3D {

    // Двигаться вверх
    default void moveUp() {}

    // Двигаться вниз
    default void moveDown() {}

    // Двигаться вперед
    default void moveForward() {}

    // Двигаться назад
    default void moveBack() {}

    // Двигаться влево
    default void moveLeft() {}

    // Двигаться вправо
    default void moveRight() {}

    // Крутиться (проворачиваться) влево
    default void twistLeft() {}

    // Крутиться (проворачиваться) вправо
    default void twistRight() {}
}

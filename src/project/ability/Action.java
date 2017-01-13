package project.ability;

/**
 * Интерфейс Action содержит набор методов для осуществления каких-либо действий роботом либо частью его "тела".
 * Например, робот с помощью руки может взять какой-либо предмет рядом. Либо толкнуть его ногой.
 */

public interface Action {

    // Взять предмет
    default void putUp() {}

    // Положить предмет
    default void putDown() {}

    // Тянуть предмет к себе
    default void pull() {}

    // Толкать предмет от себя
    default void push() {}

    // Встать в вертикальном положении
    default void standUpright() {}

    // Лечь горизонтально
    default void lieDown() {}

    // Сесть
    default void sitDown() {}

    // Прыгать
    default void jump() {}

    // Стучать
    default void knock() {}
}

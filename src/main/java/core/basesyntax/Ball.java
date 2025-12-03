package core.basesyntax;

public class Ball {
    private final String color;
    private final int number;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    public enum Color {
        YELLOW,
        RED,
        BLUE,
        GREEN,
        BLACK,
        WHITE,
        ORANGE
    }

    @Override
    public String toString() {
        return "Ball [color=" + color + ", number=" + number + "]";
    }
}

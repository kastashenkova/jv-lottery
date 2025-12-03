package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random random = new Random();
    private final int number = random.nextInt(101);
    ColorSupplier colorSupplier = new ColorSupplier();

    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(), number);
    }
}

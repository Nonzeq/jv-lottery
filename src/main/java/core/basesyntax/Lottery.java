package core.basesyntax;

import java.util.Random;

public class Lottery {
    private static final int RANGE_NUMBER = 101;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    
    public Ball getRandomBall() {
        return new Ball(colorSupplier.getRandomColor(),random.nextInt(RANGE_NUMBER));
    }
}

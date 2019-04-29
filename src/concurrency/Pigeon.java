package concurrency;

import java.util.Random;

public class Pigeon{
    private int id;
    private static Random random = new Random(40);
    public Pigeon() {
        id = random.nextInt(20);
    }

    @Override
    public String toString() {
        return "Pigeon "+ id;
    }
}

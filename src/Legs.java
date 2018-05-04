import java.util.Random;

public enum Legs {
    CROSSED,
    RELAXED,
    BENT;

    public static Legs getRandomPosition() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public String toString() {
        if (this.equals(CROSSED)) return "скрещены";
        else if (this.equals(RELAXED)) return "расслаблены";
        else if (this.equals(BENT)) return "согнуты";

        else return null;
    }
}

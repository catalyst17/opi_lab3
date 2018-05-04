
import java.util.Random;

public enum Arms {
    CROSSED,
    RELAXED,
    ON_CHEST;

    public static Arms getRandomPosition() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }

    @Override
    public String toString() {
        if (this.equals(CROSSED)) return "скрещены";
        else if (this.equals(RELAXED)) return "расслаблены";
        else if (this.equals(ON_CHEST)) return "на груди кренделем";

        else return null;
    }
}

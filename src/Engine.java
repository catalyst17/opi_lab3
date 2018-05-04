
public class Engine implements Speaking {

    private int power;
    private boolean isWorking = true;

    public Engine() {
        power = 100;
    }

    public Engine(int power) {
        this.power = power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    @Override
    public void saySmth() {
        if (isWorking) System.out.println(sayChaf());
    }

    public static String sayChaf() {
        return "Чаф-чафчаф-чаф!";
    }

    public void turnOn() {
        isWorking = true;
    }

    public void turnOff() {
        isWorking = false;
    }

    @Override
    public String toString() {
        return "Двигатель";
    }

    @Override
    public int hashCode() {
        return getPower();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Engine other = (Engine) obj;
        return getPower() == other.getPower();
    }
}

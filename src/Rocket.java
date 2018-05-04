
import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private int price;
    private List<Engine> engines = new ArrayList<Engine>();
    private boolean isRunning = true;

    public Rocket() {
        price = 1000;
        engines.add(new Engine());
    }

    public Rocket(int price) {
        this.price = price;
        engines.add(new Engine(70));
    }

    public Rocket(int price, int count) {
        this.price = price;
        for (int i = 0; i < count; i++) {
            engines.add(new Engine());
        }
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public boolean checkEngines() {
        for (Engine e : engines)
            e.saySmth();
        return isRunning;
    }

    public void turnOnAll() {
        for (Engine e : engines)
            e.turnOn();
        isRunning = true;
    }

    public void turnOffAll() {
        for (Engine e : engines)
            e.turnOff();
        isRunning = false;
    }

    @Override
    public String toString() {
        return "Ракета";
    }

    @Override
    public int hashCode() {
        return getPrice();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Rocket other = (Rocket) obj;
        return getPrice() == other.getPrice();
    }
}

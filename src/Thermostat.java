
import java.util.ArrayList;
import java.util.List;

public class Thermostat {

    private List<Food> list;
    private int dia;

    public Thermostat(int kisselCount, int soupCount, int rollsCount) {
        dia = 15;
        list = new ArrayList<Food>(); 
        for(int i=0; i<kisselCount; i++)
            list.add(Food.KISSEL);
        for(int i=0; i<soupCount; i++)
            list.add(Food.SOUP);
        for(int i=0; i<rollsCount; i++)
            list.add(Food.CABBAGE_ROLLS);
    }

    public Thermostat(int kisselCount, int soupCount, int rollsCount, int dia) {
        this.dia = dia;
        list = new ArrayList<Food>();
        for(int i=0; i<kisselCount; i++)
            list.add(Food.KISSEL);
        for(int i=0; i<soupCount; i++)
            list.add(Food.SOUP);
        for(int i=0; i<rollsCount; i++)
            list.add(Food.CABBAGE_ROLLS);
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }
    
    public boolean contains(Food f) {
        return list.contains(f);
    }
    
    protected Food returnTube() {
        if (list.size() != 0) {
            Food f = list.get(0);
            list.remove(f);
            return f;
        } else return null;
    }
    
    protected Food returnTube(Food f) {
        list.remove(f);
        return f;
    }

    @Override
    public String toString() {
        return "Термостат";
    }

    @Override
    public int hashCode() {
        return getDia();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Thermostat other = (Thermostat) obj;
        return getDia() == other.getDia();
    }
}

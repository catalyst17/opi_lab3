
public class Donut extends Person{

     public Donut() {
        setFavouriteDish(Food.KISSEL);
        setHeight(35);
        setWeight(25);
         arms = Arms.getRandomPosition();
         legs = Legs.getRandomPosition();
    }

    public Donut(int height, int weight) {
        setFavouriteDish(Food.KISSEL);
        setHeight(height);
        setWeight(weight);
        arms = Arms.getRandomPosition();
        legs = Legs.getRandomPosition();
    }

    @Override
    public void saySmth() {
        System.out.println(this + ": уфф, я такой кругленький");;
    }

    @Override
    public void prepareToSleep() {
        System.out.println(this + ": для правильного пищеварения после обеда нужно немножко всхрапнуть");
        sleep();
    }

    @Override
    public void sleep() {
        System.out.println(this + " тут же заснул, хотя руки у него были " + arms + ", а ноги " + legs);
    }

    @Override
    public String toString() {
         return "Пончик";
    }
}


public class Neznaika extends Person {

    public Neznaika() {
        setFavouriteDish(Food.SOUP);
        setHeight(100);
        setWeight(50);
        arms = Arms.getRandomPosition();
        legs = Legs.getRandomPosition();
    }

    public Neznaika(int height, int weight) {
        setFavouriteDish(Food.SOUP);
        setHeight(height);
        setWeight(weight);
        arms = Arms.getRandomPosition();
        legs = Legs.getRandomPosition();
    }

    private void prepareArms() {
        arms = Arms.ON_CHEST;
        System.out.println(this + " сложил руки на груди кренделем");
    }

    private void prepareLegs() {
        legs = Legs.CROSSED;
        System.out.println(this + " заложил ногу за ногу");
    }

    @Override
    public void saySmth() {
        System.out.println(this + ": уфф, я такой глупенький");
    }

    @Override
    public void prepareToSleep() {
        System.out.println(this + ": было бы неплохо поесть после сна... ой, наоборот");
        if (arms != Arms.ON_CHEST || legs != Legs.CROSSED) {
            System.out.println(this + ": ооох, надо ещё принять позу поудобнее >_<");
            if (arms != Arms.ON_CHEST) prepareArms();
            if (legs != Legs.CROSSED) prepareLegs();
        } else
            System.out.println(this + ": фигаси, рандом рулед, ноги с руками уже готовы ^_^");
        sleep();
    }

    @Override
    public void sleep() {
        if (this.rocket.checkEngines())
            System.out.println("Звуки двигателя вскоре убаюкали Незнайку, и он заснул");
        else
            System.out.println(this + " очень долго не мог заснуть без привычных \"" + Engine.sayChaf() + "\"" +
                    ", но через час всё равно вырубился");
    }

    @Override
    public String toString() {
        return "Незнайка";
    }
}


public abstract class Person implements Sleeping, Eating, Speaking {

    private int height;
    private int weight;
    private Food favouriteDish;
    private boolean isHungry = true;
    protected Person friend;
    protected Thermostat thermostat;
    protected Arms arms;
    protected Legs legs;
    protected Rocket rocket;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {

        return height;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void makeFriends(Person person) {
        if (friend == null) {
            friend = person;
            person.friend = this;
            System.out.println(this + " и " + person + " подружились");
        } else
            System.out.println(this + ": у меня уже есть друзья (воображаемые)");
    }

    public void becomeTheOwnerOfThermostat(Thermostat thermostat) {
        if (this.thermostat == null) {
            this.thermostat = thermostat;
            System.out.println(this + ": у меня теперь есть термостат, кек");
        }
    }

    void takeTubes() {
        if (thermostat != null) {
            Food fDish = null;
            if (friend != null) {
                if (thermostat.contains(friend.favouriteDish))
                    fDish = thermostat.returnTube(friend.favouriteDish);
                else
                    fDish = thermostat.returnTube();
            }

            Food dish;

            if (thermostat.contains(favouriteDish))
                dish = thermostat.returnTube(favouriteDish);
            else
                dish = thermostat.returnTube();

            if (fDish != null) System.out.println(this + " достаёт своему другу трубочку, в которой " + fDish);
            if (dish != null) System.out.println(this + " достаёт себе трубочку, в которой " + dish);
            if (fDish != null) friend.eat(fDish);
            if (dish != null) eat(dish);
        }
    }

    @Override
    public abstract void sleep();

    @Override
    public void eat(Food dish) {
        if (dish == favouriteDish)
            System.out.println(this + " с удовольствием ест " + dish);
        else System.out.println(this + " давится, но ест " + dish);
        isHungry = false;
    }

    void setFavouriteDish(Food favouriteDish) {
        this.favouriteDish = favouriteDish;
    }

    @Override
    public abstract void saySmth();

    public abstract void prepareToSleep();

    public void doTheSchedule(Rocket rocket) {
        this.rocket = rocket;
        if (friend != null) {
            friend.rocket = rocket;
            saySmth();
            friend.saySmth();
            takeTubes();
            friend.takeTubes();
            if (!isHungry()) {
                prepareToSleep();
            } else System.out.println(this + ": походу еды не осталось. Значит и уснуть не получится :(");
            if (!friend.isHungry) {
                friend.prepareToSleep();
            } else System.out.println(friend + ": походу еды не осталось. Значит и уснуть не получится :(");
        } else {
            saySmth();
            takeTubes();
            if (!isHungry()) {
                prepareToSleep();
            } else System.out.println(this + ": походу еды не осталось. Значит и уснуть не получится :(");
        }
    }

    @Override
    public int hashCode() {
        return 17*getHeight() + getWeight();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (this.getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        return getHeight() == other.getHeight() && getWeight() == other.getWeight();
    }
}

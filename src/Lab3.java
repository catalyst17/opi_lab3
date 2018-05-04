
public class Lab3 {
    public static void main(String[] args) {
        Person don = new Donut();
        Person nez = new Neznaika();

        Tthermostat therm = new Thermostat(1,0,10);
        Rocket rocket = new Rocket();

        don.makeFriends(nez);
        nez.becomeTheOwnerOfThermostat(therm);

        don.doTheSchedule(rocket);
    }
}
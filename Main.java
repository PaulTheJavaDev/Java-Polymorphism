public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        AudiR6 audiR6 = new AudiR6();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car, audiR6, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }

}

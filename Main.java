public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        RealLifeCar realLifeCar = new RealLifeCar();
        Boat boat = new Boat();
        Bike bike = new Bike();

        Vehicle[] vehicles = {car, realLifeCar, bike, boat};

        for (Vehicle vehicle : vehicles) {
            vehicle.go();
        }

    }

}

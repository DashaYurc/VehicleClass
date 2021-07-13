package lv.sda;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setBrand("BMW");
        vehicle.setCurrentSpeed(40);
        vehicle.setLength(2933);
        vehicle.setSeatNumber(4);
        vehicle.setTireNumber(4);

        vehicle.startEngine(true);
        vehicle.stopEngine(false);
        vehicle.slowDown();
        vehicle.speedUp();
        vehicle.speedUp();
        vehicle.slowDown();
        System.out.println("Car's brand is: " + vehicle.getBrand());
        System.out.println("Car's length is: " + vehicle.getLength());
        System.out.println("Car's current speed is: " + vehicle.getCurrentSpeed());
        System.out.println("Car's number of seats are: " + vehicle.getSeatNumber());
        System.out.println("Car's number of tires are: " + vehicle.getTireNumber());

    }
}

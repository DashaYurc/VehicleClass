package lv.sda;

public class Vehicle {
    private float length;
    private int seatNumber;
    private int tireNumber;
    private String brand;
    private float currentSpeed;

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getSeatNumber() {
        return this.seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getTireNumber() {
        return this.tireNumber;
    }

    public void setTireNumber(int tireNumber) {
        this.tireNumber = tireNumber;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getCurrentSpeed() {
        return this.currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void speedUp(){
        this.currentSpeed *= 5;
        System.out.println("Current speed now is: " + currentSpeed);
    }

    public void slowDown(){
        this.currentSpeed /= 5;
        System.out.println("Current speed now is: " + currentSpeed);
    }

    public void startEngine(boolean key){
        if(true){
            System.out.println("The engine has started!");
        } else {
            System.out.println("Put key in the ignition!");
        }
    }

    public void stopEngine(boolean keyOff){
        if(true){
            System.out.println("The engine has stopped!");
        } else {
            System.out.println("Turn off the key!");
        }

    }
}

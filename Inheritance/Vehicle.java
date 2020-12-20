package Inheritance;

public class Vehicle {

    private String name;
    private int size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, int size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int dirction){
        this.currentDirection += dirction;
        System.out.println("Vehicle.steer() : Steering at " + currentDirection + " degree");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("Vehicle.move(): Moving on " + currentDirection + " in direction " + currentVelocity + " velocity");
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        System.out.println("Car is getting Stopped !!");
    }
}

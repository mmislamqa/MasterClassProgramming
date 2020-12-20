package Inheritance;

public class Car extends Vehicle {
    private int wheels;
    private int doors;
    private int gear;
    private boolean isManual;

    private int currentGear;
    public Car(String name, int size, int wheels, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear  =  gear;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear){
        this.currentGear = currentGear;
        System.out.println("Car.setCurrentGear(): change to " + this.currentGear + " gear.");
    }
    public void changetVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction" + direction);
    }

}

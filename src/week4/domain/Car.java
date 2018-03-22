package week4.domain;

public class Car extends Vehicle {
    private int passengersCount;
    private int identNumber;

    public Car(int number) {
        this.identNumber = number;
    }

    public void accelerate() {
        System.out.println("Accelerating fast!");
    }

    @Override
    public void beep() {
        System.out.println("Car beeped!");
    }

    @Override
    public int hashCode() {
        return identNumber;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car c = (Car)obj;
            return this.identNumber==c.identNumber;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Ident number is " + identNumber;
    }
}

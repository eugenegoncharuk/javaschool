package week4.domain;

public class Bicycle extends Vehicle implements HumanPowered {

    public void beep() {
        System.out.println("Ding-dong!");
    }

    public void run() {
        System.out.println("Running with average speed " + AVERAGE_SPEED_KM_H + " km/h");
    }

}

package week4.domain;

import week4.utils.TruckFactory;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(1);
        final TruckFactory factory = new TruckFactory();
        final Vehicle truck = factory.create();

        car.setup();
        truck.setup();

        System.out.println(HumanPowered.AVERAGE_SPEED_KM_H);
    }
}

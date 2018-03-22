package week4.utils;

import week4.domain.Scooter;
import week4.domain.Truck;
import week4.domain.Vehicle;

public class TruckFactory extends AbstractVehicleFactory {
    @Override
    public Vehicle create() {
        Truck truck = new Truck();
        return truck;
    }

}
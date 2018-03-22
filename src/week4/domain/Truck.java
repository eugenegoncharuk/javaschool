package week4.domain;

public class Truck extends Vehicle {
    private long loadingCapacity;

    @Override
    public void beep() {
        System.out.println("Truck beeped loudly!");
    }


    public long getLoadingCapacity() {
        return loadingCapacity;
    }

    public void setLoadingCapacity(long loadingCapacity) {
        this.loadingCapacity = loadingCapacity;
    }
}

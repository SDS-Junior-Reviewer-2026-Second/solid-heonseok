package vehicle;

public class Station {
    private final Vehicle vehicle;

    public Station(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    // this is not a car's responsibility.
    public void reFuel() {
        vehicle.setRemainingFuel(vehicle.getMaxFuel());
    }
}
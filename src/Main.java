public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", 120, 4);
        Motorcycle myBike = new Motorcycle("Harley-Davidson", 100, false);

        myCar.displayInfo();
        myCar.drive();

        myBike.displayInfo();
        myBike.drive();

        VehicleService service = new VehicleService();
        service.updateVehicleDetails(myCar);
        service.updateVehicleDetails(myBike);
    }
}

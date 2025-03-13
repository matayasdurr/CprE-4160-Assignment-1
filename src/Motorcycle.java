class Motorcycle extends Vehicle implements Drivable {
    boolean hasSidecar;

    Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    void displayInfo() {
        System.out.println(brand + " Motorcycle - Speed: " + speed + "km/h, Sidecar: " + hasSidecar);
    }

    @Override
    public void drive() {
        System.out.println(brand + " Motorcycle is driving.");
    }
}

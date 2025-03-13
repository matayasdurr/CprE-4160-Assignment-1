class Car extends Vehicle implements Drivable {
    int numberOfDoors;

    Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        System.out.println(brand + " Car - Speed: " + speed + "km/h, Doors: " + numberOfDoors);
    }

    @Override
    public void drive() {
        System.out.println(brand + " Car is driving.");
    }
}

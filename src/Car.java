class Car extends Vehicle {
    String carType;
    String transmission;
    public Car(String carType,
            String transmission,
            int speed) {
        super(speed);
        this. carType = carType;
        this.transmission = transmission;
    }
}


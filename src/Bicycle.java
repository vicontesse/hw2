class Bicycle extends Vehicle {
    public final int id = 1;
    protected int gear = 0;
    //typeNum overloaded
    public int typeNum;
    public Bicycle(int id, int gear, int typeNum, int speed) {
        super(speed);
    };
    public void changeGear(int gear) {
        this.gear = gear;
        System.out.println ("Gear is changed to " + gear);
    }

    @Override
    public void move(){
        System.out.println ("Bike rules:)");
    }
}
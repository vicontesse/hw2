class RoadBicycle extends Bicycle {
    private int rudderDepth = 7;
    int speed = 70;
    void setRudderDepth(int value) {
        this.rudderDepth = rudderDepth;
    }
    int getRudderDepth(){return rudderDepth;}
    RoadBicycle (int id, int gear, int typeNum, int speed){
        super (id, gear, typeNum, speed);
    }
}


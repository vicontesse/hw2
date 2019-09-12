class MountainBicycle extends Bicycle {
    private int seatHeight = 100;
    void setSeatHeight(int value) {
        this.seatHeight = seatHeight;
    }
    int getSeatHeight(){return seatHeight;}
    MountainBicycle (int id, int gear, int typeNum, int speed){
        super (id, gear, typeNum, speed);
    }
}
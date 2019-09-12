class Vehicle {
    int speed = 5;
    int up;
    int brake;
    private String model = "theNewOne";
    public Vehicle (int speed) {
        this.speed=speed;
    }
    void speedUp(int up) {
        this.up= up;
        speed = speed+up;
        System.out.println ("SpeedUp ="+up);
    }
    void applyBrake(int brake) {
        this.brake = brake;
        speed = speed -brake;
        System.out.println ("Brake On ="+brake);
    }
    void setModel(String model) {
        this.model = model;
    }
    String getModel(){return model;
    }
    public void move(){System.out.println ("Let's Go!");
    }

    final void stop(){
        System.out.println ("That's all!");
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + speed;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Vehicle other = (Vehicle) obj;
        if (speed != speed)
            return false;
        return true;
    }
}


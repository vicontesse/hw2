class Helicopter extends Vehicle {
    int amountOfPassangers;
    int maxHeight;
    int tankSize;
    public Helicopter (int speed){
        super(speed);
    }

    public void move(){}


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amountOfPassangers;
        result = prime * result + maxHeight;
        result = prime * result + tankSize;
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
        Helicopter other = (Helicopter) obj;
        if (amountOfPassangers != other.amountOfPassangers)
            return false;
        if (maxHeight != other.maxHeight)
            return false;
        if (tankSize != other.tankSize)
            return false;
        return true;
    }
}
public class Runner {
    public static void main(String[] args) {
        MountainBicycle mountB = new MountainBicycle(0, 0, 4,65);
        System.out.println ("Mountain Bicycle info:");
        mountB.move();
        int mountBSpeed = mountB.speed;
        int mountUP = mountB.up;
        mountB.speedUp(3);
        int mountSUp = mountB.speed;
        mountB.applyBrake(1);
        int mountSBrake = mountB.speed;
        mountB.setModel("MountBike");
        String mountModel = mountB.getModel();
        int mountId = mountB.id;
        int mountGear = mountB.gear;
        mountB.changeGear(108);
//mountB.setSeatHeight(60);
        int mountBSH= mountB.getSeatHeight();
        System.out.println (mountModel +" "+ mountBSpeed+ " "+mountId+" "+mountGear+ " "+mountBSH+ " "+mountSUp+ " "+mountSBrake);
        mountB.stop();
        System.out.println ("Road Bicycle info:");
        RoadBicycle roadB = new RoadBicycle(0, 0, 3, 70);
        roadB.move();
        int roadBSpeed = roadB.speed;
        int roadUP = roadB.up;
        roadB.speedUp(9);
        int roadSUp = roadB.speed;
        roadB.applyBrake(2);
        int roadSBrake = roadB.speed;
        roadB.setModel("RoadBike");
        String roadModel = roadB.getModel();
        int roadId = roadB.id;
        int roadGear = roadB.gear;
        roadB.changeGear(108);
        int roadBRD= roadB.getRudderDepth();
        System.out.println (roadModel +" "+ roadBSpeed+ " "+roadId+" "+roadGear+ " "+roadBRD+ " "+ roadUP+ " "+roadSUp+ " "+ roadSBrake);
        roadB.stop();

//OVERRIDE, OVERLOAD
        Bicycle bike = new Bicycle (0,3, 5, 52);
        System.out.println("Override:");
        bike.move();
        System.out.println("Super.move():");
        Vehicle veh = new Vehicle (220);
        veh.move();

//HASHCODE & EQUALS
        Helicopter heli1 = new Helicopter(300);

        Helicopter heli2 = new Helicopter(300);

        heli1.equals(heli2);
        System.out.println(heli1);
        System.out.println(heli2);
        System.out.println(heli1.equals(heli2));
        System.out.println(heli1.hashCode());
        System.out.println(heli2.hashCode());

        RoadBicycle road1 = new RoadBicycle(100, 111, 11, 66);

        RoadBicycle road2 = new RoadBicycle(100,111, 11, 66);

        road1.equals(road2);
        System.out.println(road1);
        System.out.println(road2);
        System.out.println(road1.equals(road2));
        System.out.println(road1.hashCode());
        System.out.println(road2.hashCode());

//CAR VARIABLES
        Car car = new Car("Chevrolet","Mech", 200 );

        System.out.println("Car Type= " + car.carType +"   "+ "Transmission = "+"   "+car.transmission+ "   "+"Car speed = "+car.speed);
    }
}
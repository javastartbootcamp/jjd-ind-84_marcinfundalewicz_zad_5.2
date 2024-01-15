package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Room livingRoom = new Room(20, 28, true);
        Room kitchen = new Room(15, 20, false);
        Room bathroom = new Room(10, 23, false);
        livingRoom.setCriticTemperature(26);
        System.out.println(livingRoom.reduceTemperature());
        System.out.println(livingRoom.reduceTemperature());
        System.out.println(kitchen.reduceTemperature());
        System.out.println(bathroom.reduceTemperature());
    }
}

package pl.javastart.task;

public class Test {

    public static void main(String[] args) {
        Room livingRoom = new Room(20, 22.1, 19, true);
        Room kitchen = new Room(15, 20, 26, false);
        Room bathroom = new Room(10, 23, 26, false);

        System.out.println(livingRoom.reduceTemperature());
        System.out.println(livingRoom.reduceTemperature());
        System.out.println(livingRoom.reduceTemperature());
        System.out.println(livingRoom.reduceTemperature());
//        System.out.println(livingRoom.reduceTemperature());
        System.out.println(livingRoom.currentTemperature);

    }
}

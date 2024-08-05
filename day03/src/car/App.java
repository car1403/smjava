package car;

public class App {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car);
        System.out.println(car.getCurrentFuel());
        car.setCurrentFuel(50);
        System.out.println(car.getCurrentFuel());
        car.go(10);
        car.stop();
        System.out.println(car.getCurrentFuel());
    }
}

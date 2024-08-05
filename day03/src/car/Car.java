package car;

public class Car {
    private String name;
    private String color;
    private int fuelSize;
    private int currentFuel;

    // default Constructor
    public Car() {
        this.name = "Default Car";
        this.color = "White";
        this.fuelSize = 50;
        this.currentFuel = 0;
    }

    public Car(String name, String color, int fuelSize, int currentFuel) {
        this.name = name;
        this.color = color;
        this.fuelSize = fuelSize;
        this.currentFuel = currentFuel;
    }

    public int getCurrentFuel() {
        return currentFuel;
    }

    public void setCurrentFuel(int currentFuel) {
        this.currentFuel = currentFuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", fuelSize=" + fuelSize +
                ", currentFuel=" + currentFuel +
                '}';
    }

    public void go(int distance){
        if(this.currentFuel <= 0){
            System.out.println("기름이 없습니다. ");
            return;
        }
        this.currentFuel -= distance/10;
        System.out.println("Car got " + distance + " Km");
    }
    public void stop(){
        System.out.println("Car stopped");
    }
}

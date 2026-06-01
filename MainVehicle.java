class Vehicle {
    void start() {
        System.out.println("Vehicle Starting");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car Starting");
    }
}

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
    }
}

package OOPS.Abstraction;

public class Car implements Vehicle {

    @Override
    public void start() {
        System.out.println("BMW car started.");
    }

    @Override
    public void stop() {
        System.out.println("BMW car stopped.");
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        car.start();
        car.stop();
    }
}

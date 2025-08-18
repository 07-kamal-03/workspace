package OOPS.Inheritance;

public class Vehicle {
    public void getCar(){
        System.out.println("I would like to buy supra");
    }
}

class Supra extends Vehicle{
    public void makeSound(){
        System.out.println("RATTA RATTA TA");
    }
}

class Main{
    public static void main(String[] args) {
        Supra supra = new Supra();
        supra.getCar();
        supra.makeSound();
    }
}
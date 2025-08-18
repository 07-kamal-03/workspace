package OopsTasks.oopsTask2;

public class Cat extends Pet{

    @Override
    public void makeSound() {
        System.out.println("Meow Meow!");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping.");
    }

    public void scratchSofa(){
        System.out.println("Cat is scratching the sofa.");
    }
}

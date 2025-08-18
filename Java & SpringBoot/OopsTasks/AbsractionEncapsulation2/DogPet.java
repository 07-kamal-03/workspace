package OopsTasks.AbsractionEncapsulation2;

public class DogPet extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping in kennel.");
    }
}

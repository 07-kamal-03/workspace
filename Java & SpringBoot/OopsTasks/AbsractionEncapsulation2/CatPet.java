package OopsTasks.AbsractionEncapsulation2;

public class CatPet extends Pet{
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating fish.");
    }

    @Override
    void sleep() {
        System.out.println("Cat is sleeping on sofa.");
    }
}

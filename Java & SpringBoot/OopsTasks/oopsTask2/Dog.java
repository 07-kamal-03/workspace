package OopsTasks.oopsTask2;

public class Dog extends Pet{

    @Override
    public void makeSound() {
        System.out.println("woof woof!");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bones.");
    }

    @Override
    void sleep() {
        System.out.println("Dog is sleeping in kennel.");
    }

    public void fetchBall(){
        System.out.println("Dog fetches the ball.");
    }
}

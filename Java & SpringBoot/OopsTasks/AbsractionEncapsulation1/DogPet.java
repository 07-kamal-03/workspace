package OopsTasks.AbsractionEncapsulation1;

public class DogPet implements Pet {
    @Override
    public void makeSound(){
        System.out.println("woof woof");
    }
}

class CatPet implements Pet{
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
}

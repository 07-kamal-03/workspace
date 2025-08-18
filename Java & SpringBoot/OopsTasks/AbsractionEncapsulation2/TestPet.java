package OopsTasks.AbsractionEncapsulation2;

public class TestPet {
    public static void main(String[] args) {
        Pet dog = new DogPet();
        Pet cat = new CatPet();

        dog.setName("Rocky");
        dog.setAge(-2);
        System.out.println("Dog name: "+dog.getName());
        System.out.println("Dog age: "+dog.getAge());
        dog.makeSound();
        dog.eat();
        dog.sleep();
        System.out.println("\n");
        cat.setName("Kitty");
        cat.setAge(2);
        System.out.println("Cat name: "+cat.getName());
        System.out.println("Cat age: "+cat.getAge());
        cat.makeSound();
        cat.eat();
        cat.sleep();
    }
}

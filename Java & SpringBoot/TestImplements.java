interface Animal {
    default void Sound(){
        System.out.println("kamal");
    }; // No body — just declaration
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class TestImplements {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound(); // ✅ Must implement logic
    }
}

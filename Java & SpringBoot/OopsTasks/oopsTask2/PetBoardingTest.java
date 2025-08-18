package OopsTasks.oopsTask2;

public class PetBoardingTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Cat dog2 = new Cat();

        dog1.setName("Rocky");
        dog1.setAge(0);
        dog1.setWeight(0.0);

        dog2.setName("Kitty");
        dog2.setAge(5);
        dog2.setWeight(8.5);

        Pet []pets = {dog1, dog2};

        for (Pet pet:pets){
            System.out.println(pet.getClass().getSimpleName()+" name: "+pet.getName());
            System.out.println(pet.getClass().getSimpleName()+" age: "+pet.getAge());
            System.out.println(pet.getClass().getSimpleName()+" weight: "+pet.getWeight());
            pet.makeSound();
            pet.eat();
            pet.sleep();
            if(pet instanceof Dog){
                ((Dog) pet).fetchBall();
            }
            else{
                ((Cat) pet).scratchSofa();
            }
        }
    }
}

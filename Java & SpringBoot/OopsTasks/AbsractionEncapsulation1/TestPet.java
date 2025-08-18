package OopsTasks.AbsractionEncapsulation1;

public class TestPet {
    public static void main(String[] args) {
        Pet dog = new DogPet();
        Pet cat = new CatPet();

        PetData dogData = new PetData();
        PetData catData = new PetData();


        dogData.setName("Rocky");
        dogData.setAge("1");
        System.out.println("Dog name: "+ dogData.getName()+"\n"+"Dog age: "+dogData.getAge());
        dog.makeSound();
        System.out.println();

        catData.setName("Kitty");
        catData.setAge("2");
        System.out.println("Cat name: "+ catData.getName()+"\n"+"Cat age: "+catData.getAge());
        cat.makeSound();

    }
}

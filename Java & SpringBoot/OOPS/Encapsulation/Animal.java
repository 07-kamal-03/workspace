package OOPS.Encapsulation;

public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setColor("Black with yellowish brown");
        dog.setBread("German shepherd");
        dog.setAge(2);
        System.out.println("Animal: "+  dog.getAge());

        Demo.demoAge(dog);
    }
}

class Demo {
    public static void demoAge(Dog dog){
        System.out.println("Demo: "+ dog.getBread());
    }
//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        System.out.println(dog.getAge());
//    }
}

package OOPS.Abstraction;

abstract class Animal {
    public abstract void cat();
    public void dog(){
        System.out.println("WOW WOW");
    }

}

class CatSound extends Animal {
    @Override
    public void cat() {
        System.out.println("MEOW MEOW");
    }
}

class Main {
    public static void main(String[] args) {
        Animal animal = new CatSound();
        animal.cat();
        animal.dog();
    }
}
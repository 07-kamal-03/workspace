package OopsTasks.AbsractionEncapsulation2;

public abstract class Pet implements PetActions {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Invalid age! Setting to 0.");
            this.age=0;
        }
        else{
            this.age = age;
        }
    }

    abstract void sleep();
}

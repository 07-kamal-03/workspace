package OopsTasks.oopsTask2;

public abstract class Pet implements PetActions{
    private String name;
    private int age;
    private double weight;

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
        if (age<=0){
            System.out.println("The entered age is Invalid");
        }
        else{
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<=0){
            System.out.println("The entered weight is Invalid");
        }
        else {
            this.weight = weight;
        }
    }

    abstract void sleep();
}

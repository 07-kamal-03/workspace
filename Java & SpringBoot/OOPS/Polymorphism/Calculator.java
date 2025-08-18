package OOPS.Polymorphism;

public class Calculator {
    public void doSum(int a, int b){
        System.out.println("add: "+(a+b));
    }

    public void doSum(String first, String last){
        System.out.println(first+last);
    }
}

class diff extends Calculator{
    @Override
    public void doSum(int a, int b) {
        super.doSum(a,b);
        System.out.println("sub: "+ (a-b));
    }

    public static void main(String[] args) {
        diff d = new diff();
        d.doSum(5,5);
        d.doSum("kamal","raj");
    }
}
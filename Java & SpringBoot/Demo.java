import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }

    public void Set(){
        int []arr = {100, 100, 200, 1, 3, 2, 4};
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : arr){
            set.add(num);
        }
        System.out.println(set);
    }
}

public class Demo {

    public static void main(String[] args) {
        WeakReference<Person> p = new WeakReference<>(new Person("Kamal"));
        System.out.println(p.get().name);
        p.get().Set();
        System.gc();
        System.out.println(p.get());

    }
}

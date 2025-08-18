package MemoryManagement;

import java.lang.ref.WeakReference;

class Person{
    String name;
    Person(String name){
        this.name = name;
    }
}

public class weak_reference {

    public static void main(String[] args) {
        WeakReference<Person> p = new WeakReference<>(new Person("Kamal"));
        System.out.println(p.get().name);
        System.gc();
        System.out.println(p.get());
    }
}

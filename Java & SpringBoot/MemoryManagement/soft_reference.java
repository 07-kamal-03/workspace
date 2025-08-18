package MemoryManagement;


import java.lang.ref.SoftReference;
import java.util.ArrayList;

class demo{
}
public class soft_reference {
    public static void main(String[] args) {
        SoftReference<demo> d = new SoftReference<>(new demo());
        System.out.println("before: "+d.get());
        System.gc();
        System.out.println("after gc: "+d.get());

        ArrayList<byte[]> list = new ArrayList<>();
        try {
            for (int i = 0; i < 100; i++) {
                list.add(new byte[1024 * 512]); // 0.5 MB
                System.gc(); // give GC chance
                if (d.get() == null) {
                    System.out.println("Soft reference cleared at iteration " + i);
                    break;
                }
            }
        } catch (OutOfMemoryError e) {
            System.out.println("OOM triggered!");
        }

        System.out.println("after memory press: "+d.get());
    }
}

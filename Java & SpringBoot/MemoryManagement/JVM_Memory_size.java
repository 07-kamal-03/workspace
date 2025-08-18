package MemoryManagement;
import java.util.ArrayList;
import java.util.List;

public class JVM_Memory_size {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        testing();

        long totalMemory = runtime.totalMemory(); // Total memory currently allocated to the JVM
        long freeMemory = runtime.freeMemory();   // Free memory within the allocated JVM memory
        long usedMemory = totalMemory - freeMemory; // Used memory within the allocated JVM memory
        long maxMemory = runtime.maxMemory();     // Maximum memory the JVM can attempt to use

        System.out.println("JVM Memory Usage:");
        System.out.println("Total Memory (allocated): " + totalMemory / (1024 * 1024) + " MB");
        System.out.println("Free Memory: " + freeMemory / (1024 * 1024) + " MB");
        System.out.println("Used Memory: " + usedMemory / (1024 * 1024) + " MB");
        System.out.println("Max Memory (available to JVM): " + maxMemory / (1024 * 1024) + " MB");
    }

    public static void testing(){
        List<int[]> list = new ArrayList<>();
        while (true) {
            list.add(new int[1_0]); // Allocate ~4MB each time
        }
    }
}

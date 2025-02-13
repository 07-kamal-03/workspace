public class Recursion {
    static int count = 0;
    public static void infinite(){
        if (count == 100) return ;
        System.out.println(count);
        count++;
        infinite();
    }
    public static void main (String [] args){
        infinite();
    }
}
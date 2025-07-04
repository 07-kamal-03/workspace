public class Pattern {
    public static void Problem1(){
        int start = 1;
        int increment = 2;
        for(int i=0;i<4;i++){
            int current = start;
            for(int j=0;j<4-i;j++){
               System.out.print(current+" ");
               current+=increment+j;
           }
           start+=i+1;
           increment++;
           System.out.println();
        }
    }
    public static void Problem2(){
        String str = "Zohocorporationteam";
        int index = 0;
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(i==0 || i==6){
                    System.out.print(str.charAt(index++)+" ");
                }
                else if(j==6-i){
                    System.out.print(str.charAt(index++)+" ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void Problem3(){
        int n =6;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("."+" ");
            }
            System.out.println();
        }
    }
    public static void main(String []args){
        Problem3();
    }
}
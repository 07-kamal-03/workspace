package Strings;

public class Escapechar {


    public static void main(String[] args) {
     String str = "!#!#!!y#b#w!wp!#!lhu!l!uef!lj!!lfmsuyj!!#!#o!!!x#b";

     //   System.out.println( numberOfCharactersEscaped(str));
     boolean ishash = false;
     boolean isexal = false;
     int count = 0;


        for (int i = 0; i < str.length(); i++) {
           if(str.charAt(i) == '#'){
               ishash = !ishash;
           }
           if(ishash && str.charAt(i)=='!'){
               isexal = true;
           }

           if(!ishash){
               isexal = false;
           }

           if(isexal && ishash && (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')  && str.charAt(i-1)=='!'){
               count++;
           }
        }

        System.out.println(count);

    }


    public static int numberOfCharactersEscaped(String expression) {
        int escapedCount = 0;
        boolean insideHash = false;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '#') {
                insideHash = !insideHash; // Toggle inside/outside #
            }

            if (insideHash && c >= 'a' && c <= 'z') {
                if (i > 0 && expression.charAt(i - 1) == '!') {
                    escapedCount++;
                }
            }
        }

        return escapedCount;
    }

}

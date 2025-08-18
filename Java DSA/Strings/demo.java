package Strings;

public class demo {

    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length()-needle.length();i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "a";
        System.out.println(strStr(s1, s2));
    }
}

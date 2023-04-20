import java.util.*;

public class AAAAM_usingRegularExpressions{
    public static void  main(String[] arg){

        String str1="c";
        System.out.println(str1.matches(".")); // exactly one character

        String str2="d";
        System.out.println(str2.matches("[^abc]")); //except abc 

        String str3="a0";
        System.out.println(str3.matches("[a-z][1-7]")); // between a to z and between 1-7.

        String str4="c";
        System.out.println(str4.matches("c|b")); // c or b

        String str5="yz";
        System.out.println(str5.matches("yz")); // exactly yz

        String str6="abd";
        System.out.println(str6.matches("[abd]")); // exactly given letters.

        String str7="5";
        System.out.println(str7.matches("\\d"));//digits

        String str8="12";
        System.out.println(str8.matches("\\D"));// not digits

        String str9=" ";
        System.out.println(str9.matches("\\s"));//checks for space

        String str10="s";
        System.out.println(str10.matches("\\w"));// alpahbets or digits

        String str11=" ";
        System.out.println(str11.matches("\\W"));// neither alphabets nor digits
    }
}
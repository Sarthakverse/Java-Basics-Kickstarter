import java.util.*;

public class AAAAL_methodOfStringClass {
       public static void main(String[] arg)
       {
            String Str="  WElcome  ";

            //using diff string methods in java

            int length=Str.length();  // finds the length in integer nos.
            System.out.println(length);

            String Str1=Str.toLowerCase();// converts every character to lower case
            System.out.println(Str1);

           String Str4=Str.toUpperCase(); // converts every character to upper case 
           System.out.println( Str4);

          String Str5=Str.trim(); // removes all the existing white spaces.
           System.out.println(Str5);

           String Str2=Str.substring(3);//begins to disply characters from c
           System.out.println(Str2);

           String Str3=Str.substring(3,6);//begins to display characters from C to index(6-1) ie. 5th ie.
           System.out.println(Str3);

           String Str6 =Str.replace('o','u');
           System.out.println(Str6);

           Str=Str.trim();// FOR GETTING O/P:- Welcome...without white spaces
           System.out.println(Str);

            System.out.println(Str.startsWith("WE")); // Checks for prefix if true then returns 'true' else return 'false'.

            System.out.println(Str.charAt(4));// character at index 4

            System.out.println(Str.indexOf("lc")); // Return the index of begin of lc.

            System.out.println(Str.lastIndexOf('l'));// checks index from right to left direction.

            System.out.println(Str.lastIndexOf('o',6));// checks from 6th index to left side.

            String str_ing="java";
            String is_tring="JAVA";
            System.out.println(str_ing.equals(is_tring));// return whether s_tring is equal to is_tring or not?

            System.out.println(str_ing.compareTo(is_tring));// compares to str_ing with is_tring lexicographhically.

            System.out.println(str_ing.compareToIgnoreCase(is_tring));// ignores the upper and lower cases

            String huihui="Shivaji was a great warrior ";

            System.out.println(huihui.contains("warrior"));// prints true if found

            String abcd=",he established hindutva in india once again";
          
            System.out.println(huihui.concat(abcd));// concatenation
            //OR
            System.out.println(huihui+abcd);


       }

}

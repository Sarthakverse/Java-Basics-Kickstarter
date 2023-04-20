 import java.lang.*;  //same as standard librairies ,not necessary to write in code, java by defa
 //-ult considers this line even if u dont wirite it.
import java.util.*;  


//everything in java is inside of class

class AAAAAadding_two_numbers
{
    /* public means ==> availaible globally
      static ==> used when we are using class without making an object
      void==> return type 
      main==> main function is called as 'main method' in java 
      (String arg[])== array of strings that represents any command-line arguments. */
    public static void main(String arg[])
    {
      // Scanner is a class that is used to take input from the standard input stream
      // System.in --> standard input stream

      Scanner s=new Scanner(System.in);
        int a,b,c;
        System.out.println("enter two numbers : ");
        a=s.nextInt();
        
        b=s.nextInt();
        
        c=a+b;
        
        System.out.println("sum of a and b is "+c);


    }
}


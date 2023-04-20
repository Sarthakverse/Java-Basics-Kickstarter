import java.util.*;

public class AAAAI_storingTwoNumbersInOnebyte {
       public static void main(String arg[])
       {
          Scanner s=new Scanner(System.in);

          byte a=9, b=12, c;

          // to store and b within c
          c=(byte)(a<<4); System.out.println(Integer.toBinaryString(c));
          
          c=(byte)(c|b);  System.out.println(Integer.toBinaryString(c));

          System.out.println((c&0b11110000)>>4);
          System.out.println(c&0b00001111);
        
       }

}

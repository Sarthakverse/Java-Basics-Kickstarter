import java.util.*;
public class AAAAJ_printingInJava {
     public static void main(String[] arg)
     {
        int x=10;
        char c='A';
        float f=12.40f;
        
        // diff methods of printing.
        System.out.println("HELLO WORLD ");

        System.out.print("hello world ");

        System.out.printf("heloo world %d %c %f \n",x,c,f);

        System.out.printf("%3$f %1$c %2$d\n",c,x,f);

        System.out.format("hello world");
     } 
}

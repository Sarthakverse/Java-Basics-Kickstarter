import java.lang.*;
import java.util.Scanner;

public class AAADA_arithmaticProgression {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner (System.in);

        System.out.print("enter the number n = ");
        int n = s.nextInt();
        
        System.out.print("enter the difference d = ");
         int d = s.nextInt();
       
       // System.out.print(n);
        for(;n<=50;n=n+d){
            System.out.print(n+" ");
        }

    }
}

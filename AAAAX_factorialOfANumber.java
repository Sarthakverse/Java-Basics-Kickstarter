import java.lang.*;
import java.util.*;


public class AAAAX_factorialOfANumber {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        System.out.print("enter the number n whose factorial u want to find :--> ");
        int n=s.nextInt();

        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial of " +n+ " is "+fact);
    }
}

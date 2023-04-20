import java.lang.*;
import java.util.Scanner;

public class AAAEA_displayGPseries {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        System.out.print("enter the number n : ");
        int n=s.nextInt();

        System.out.print("enter the ratio r : ");
        int r=s.nextInt();

        for(int i=n;i<=10000;i=i*r){
            System.out.print(i+", ");
        }


    }
}

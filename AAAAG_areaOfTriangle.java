import java.util.Scanner;
// have not used '*', because form util 
//package i only need Scanner.


public class AAAAG_areaOfTriangle {
     public static void main(String arg[])
     {
        Scanner s=new Scanner(System.in);

        System.out.print("eneter a b and c :-> ");
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        float S=(a+b+c)/2;

        double area = Math.sqrt(S*(S-a)*(S-b)*(S-c));

        System.out.print("area is: "+area);
     }
}

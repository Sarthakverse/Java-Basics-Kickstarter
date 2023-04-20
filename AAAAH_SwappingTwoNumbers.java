import java.util.*;

public class AAAAH_SwappingTwoNumbers {
    public static void main(String arg[]){
        Scanner s=new Scanner(System.in);
        int a , b;
        System.out.println("enter a and b: ");
        a = s.nextInt();
        b = s.nextInt();

        a=a^b;  //System.out.println(a);
        b=a^b;  //System.out.println(b);
        a=a^b;  //System.out.println(a);

        System.out.print(a+" "+b);
       
    }

}

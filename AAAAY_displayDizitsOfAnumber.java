import java.lang.*;
import java.util.*;

public class AAAAY_displayDizitsOfAnumber {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);

        System.out.print("enter n : ");
        int n=s.nextInt();
        int sum=0;int count=0;
        while(n!=0){
            int remainder=n%10;
             count++;
             System.out.print(remainder);
             n/=10;
        }
        System.out.printf("\n%d",count);
    }
}

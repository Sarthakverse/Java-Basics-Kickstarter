import java.lang.*;
import java.util.*;

public class AAAAW_additionOfTwoNumbers {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        System.out.print("enter n : ");

        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("sum of n numbers using for loop is : "+sum);
    }
}

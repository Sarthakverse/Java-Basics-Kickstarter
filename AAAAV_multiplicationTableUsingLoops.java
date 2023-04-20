import java.lang.*;
import java.util.*;

public class AAAAV_multiplicationTableUsingLoops {
    public static void main(String[] arg){

        Scanner s=new Scanner(System.in);
       
        System.out.print("enter number whose table u want : ");
        int x=s.nextInt();

        //using while loop
        int n=1;
        while(n<=10)
        {
            System.out.println(x*n);
            n++;
        }
        System.out.println("using for loop -->");
        // using for loop
        for(int n1=1;n1<=10;n1++){
            System.out.println(x*n1);
        }
        System.out.println("using do while loop -->");

        //using do while loop
        int n2=1;
        do{
             System.out.println(x*n2);
             n2++;
        }while(n2<=10);
        

        System.out.println("using for each loop");

        //using for each loop
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        for(int n3:arr)
        {
            System.out.println(x*n3);
        }
    }
}

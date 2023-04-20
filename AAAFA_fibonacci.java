import java.lang.*;
import java.util.*;

public class AAAFA_fibonacci {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
       //fibonacci
       for(int i=0;i<=20;i++){
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
           
       }
    }
}

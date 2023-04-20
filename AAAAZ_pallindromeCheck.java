import java.lang.*;
import java.util.*;

public class AAAAZ_pallindromeCheck{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);

        System.out.println("enter the number bro : ");
        String n=s.nextLine();
      
        int leng=n.length();
        //System.out.println(leng);

        for(int i=0;i<(leng/2);i++)
        {
            if(n.charAt(i)==n.charAt(leng-i-1)){
                continue;
            }
            else{
                System.out.println("not pallindrome");
                System.exit(0);
            }
        }
        System.out.println("yes its a pallindrome");


    }
}
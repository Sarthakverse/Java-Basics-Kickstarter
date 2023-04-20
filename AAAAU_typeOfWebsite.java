import java.lang.*;
import java.util.*;

public class AAAAU_typeOfWebsite {
     
    public static void main(String[] arg)
    {
         Scanner s=new Scanner(System.in);

         String website=s.nextLine(); //takes input 

         String protocol=website.substring(website.lastIndexOf(".")+1);//finds index of . from right side
         
        // System.out.println(protocol);

         switch(protocol){
             case ("com"): System.out.println("com is the protocol");
                           break;
             case ("org"): System.out.println("org is the protocol");
                           break;
             case ("in"): System.out.println("in is the protocol");
                           break;
            default: System.out.println("type correctly"); 
         }


    }
}

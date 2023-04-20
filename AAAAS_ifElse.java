import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class AAAAS_ifElse {
    public static void main(String[] arg)
    {
         Scanner s=new Scanner(System.in);

         System.out.println("enter the whole website adress: ");
         String url=s.nextLine();

         String substring=url.substring(0,url.indexOf(":"));
        // System.out.println(substring);

         
         String protocol= url.substring(url.lastIndexOf(".")+1); //+! is for adding 1 to the index of dot

         //System.out.println(protocol);

        if(substring.equals("https"))
         {
             System.out.println("https is the url");
         }
         else
        {
            System.out.println("https is not the url");
        }

        if(protocol.equals("com"))
        {
            System.out.println("com is the url");
        }
        else{
            System.out.println("com is not url");
        }
    }
}

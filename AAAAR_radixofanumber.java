import java.util.*;

public class AAAAR_radixofanumber{
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        
        if(str.matches("[01]+"))
        {
            System.out.println("radix is 2");
        }
        else
        {
            System.out.println("radix is not 2");
        }

        
    }
}
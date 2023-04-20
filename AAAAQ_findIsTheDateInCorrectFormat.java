import java.util.*;

public class AAAAQ_findIsTheDateInCorrectFormat {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter the date : ");
        String date=s.nextLine();
        System.out.println(date.matches("[0-3][1-9]/[0-1][0-9]/[2][0][0-2][0-9]"));



    }
}

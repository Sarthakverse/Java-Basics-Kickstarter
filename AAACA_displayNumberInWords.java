import java.lang.*;
import java.util.Scanner;

public class AAACA_displayNumberInWords {
    public static void main(String[] arg)
    {
        Scanner s=new Scanner(System.in);

        System.out.println("enter n : ");
        int n=s.nextInt();
        String str=Integer.toString(n);
        int leng=str.length();
        int i=0;
        while(i<=(leng-1)){
           
            int y=(str.charAt(i)-'0');//THIS LINE IS VERY VERY IMP to understand
               switch(y){
                
                case 0:System.out.print("zero ");
                i++;
                break;
                case 1:System.out.print("one ");
                i++;
                break;
                case 2:System.out.print("two ");
                i++;
                break;
                case 3:System.out.print("three ");
                i++;
                break;
                case 4:System.out.print("four ");
                i++;
                break;
                case 5:System.out.print("five ");
                i++;
                break;
                case 6:System.out.print("six ");
                i++;
                break;
                case 7:System.out.print("seven ");
                i++;
                break;
                case 8:System.out.print("eight ");
                i++;
                break;
                case 9:System.out.print("nine ");
                i++;
                break;
            }
           
        }
    }
}

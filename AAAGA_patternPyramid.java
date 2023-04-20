/*        *
         ***
        *****
       *******
      *********
 */

import java.lang.*;
import java.util.Scanner;

public class AAAGA_patternPyramid {
    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);

        System.out.print("enter n: ");
        int n=s.nextInt();
        
        //for spaces
      

        //for stars
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                if(j>n-i&&j<5+i)
                {
                    System.out.print("*");
                }
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    } 
}

import java.util.Scanner;

public class AAALA_rotatingArray {
    public static void main(String[] arg){
       
        Scanner  s=new Scanner(System.in);
        int arr[]={7,8,3,4,2};
        int key=4;
        int newarr[]=new int[key];
        
        for(int i=0;i<key;i++){
             newarr[i]=arr[i];
        }

        for(int i=key;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<key;i++){
            System.out.print(newarr[i]+" ");
        }
        

    }
}

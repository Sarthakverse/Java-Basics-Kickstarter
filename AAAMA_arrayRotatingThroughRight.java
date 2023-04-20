import java.lang.*;

public class AAAMA_arrayRotatingThroughRight {
    public static void main(String[] arg){

        int arr[]={7,8,3,4,2};
        int key=2;
        
        //we have to rotate it such that arr={3,4,2,7,8}

        int newarr[]=new int[arr.length-key];
        for(int i=0;i<(arr.length-key);i++){
            newarr[i]=arr[i+key];
        }
        for(int i=0;i<(arr.length-key);i++){
            System.out.print(newarr[i]+" ");
        }

        for(int i=arr.length-key;i<arr.length;i++)
        {
            System.out.print(arr[i-newarr.length]+" ");
        }
       

    }
}

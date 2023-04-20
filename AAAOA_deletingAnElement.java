public class AAAOA_deletingAnElement {
    public static void main(String[] arg){
        int arr[]=new int[5];

        arr[0]=7;
        arr[1]=8;
        arr[2]=3;
        arr[3]=4;
        arr[4]=2;

        //element deleted is 8
        
        for(int i=0;i<arr.length;i++){
           if(i==1)
           continue;
           else
           System.out.print(arr[i]+" ");

           
        }
    }
}

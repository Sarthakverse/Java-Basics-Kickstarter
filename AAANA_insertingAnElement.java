import javax.lang.model.util.ElementScanner14;

public class AAANA_insertingAnElement {
    public static void main(String[] arg){
        int arr[]=new int[6];
        arr[0]=7;
        arr[1]=8;
        arr[2]=3;
        arr[3]=4;
        arr[4]=2;
        
        int index=2;
        
        //we want to insert new element at index 2
        // suppose its 12 then newarr[]={7,8,12,3,4,2}
        
        for(int i=0;i<arr.length;i++){
            if(i<index){
                System.out.print(arr[i]+" ");
            }
            else if(i==index){
                System.out.print(" 12 ");
            }
            else{
                System.out.print(arr[i]+" ");
            }

            }
            /*OR
             for(int i=arr.length-1;i>=index;i++){
                arr[i]=arr[i-1];
                arr[index]=12
                
             }
            */
    }
}
    


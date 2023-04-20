public class AAAJA_maximumElement {
   public static void main(String[] arg){

    int arr[]={8,4,3,7,9,61,4,79,165,23,5,667,43,32,4,65};
    
    //finding max element
    int max=0;
    for(int i=0;i<16;i++){
        if(arr[i]>max)
        max=arr[i];
        else
        continue;
        
    }
    System.out.print("max element in the given array ");
    System.out.println("{8,4,3,7,9,61,4,79,165,23,5,667,43,32,4,65,} is : ");
    System.out.print(max);
   } 
}

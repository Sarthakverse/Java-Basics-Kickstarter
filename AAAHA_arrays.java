public class AAAHA_arrays {
   public static void main(String[] arg){

    int A[]={1,2,3,4,5}; //1st method of declaration

    int B[]=new int[10];//second method of declayring array
    
    int C[];
    C=new int[10];// 3rd method

   int []D = new int[10];//4th method

   //some basic operations
   A[2]=15;
   for(int i=0;i<A.length;i++){
    System.out.print(A[i]+" ");
   }
   System.out.println();
   // now i will increment value of each element by 1 
   for(int i=0;i<A.length;i++){
    System.out.print(++A[i]+" ");
   }

} 
}

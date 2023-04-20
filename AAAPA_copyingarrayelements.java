public class AAAPA_copyingarrayelements {
    public static void main(String[] arg){
        int A[]={1,2,3,4,5,6,7,8};
        int B[]=new int[8];

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }

        //storing by reversing now
        for(int i=0,j=B.length-1;i<A.length;i++,j--)
        {
            B[j]=A[i]; 
        }
        System.out.println();
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
    }
}

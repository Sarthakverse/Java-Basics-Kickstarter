public class AAATA_addingTwoMatrices {
    public static void main( String[] arg ){

        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};

        int C[][]=new int[3][3];

        for( int i=0 ; i<C.length ; i++ ){
            
            for( int j=0 ; j<C[0].length ; j++){

                C[i][j]=A[i][j]+B[i][j];
            }
        }
        for( int i=0 ; i<C.length ; i++ ){
            
            for( int j=0 ; j<C[0].length ; j++){

               System.out.print(C[i][j]+" ");
            }
            System.out.println();
    }
    }
}

public class AAAWA_sortingTheArrayOfStrings {
    public static void main(String[] arg){
           
        String arr[] = {"java" , "python" , "c" ,"pascal" , "ruby" , "javascript" , "mongodb"};

        java.util.Arrays.sort(arr);

        for(String x : arr){
            System.out.print(x+" ");
        }
    }
}

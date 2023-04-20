public class AAAIA_findingTheElement {
    public static void main(String[] arg){

        int arr[]={1,2,3,4,5,6,7,8,9,0};
        // to search =7
        for(int i=0;i<=10;i++){
            if(arr[i]==7)
            {
                System.out.print("index of 7 is "+i);
                System.exit(0);
            }


            else
            continue;
        }
        System.out.print("element not found");

    }
}

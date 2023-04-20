public class AAAKA_SecondLargestElement {
    public static void main(String[] arg){
        int arr[]={8,4,3,7,9,61,4,79,165,23,5,667,43,32,4,65};

        //finding  largest element
        int largest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest)
            largest=arr[i];
            else
            continue;
        }
        System.out.println("largest element is : "+largest);

        //finding second largest element
        int secondLargest=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secondLargest&&arr[i]<largest){
                secondLargest=arr[i];
            }
            else
            continue;
        }
        System.out.print("second largest element is : "+secondLargest);
    }
}

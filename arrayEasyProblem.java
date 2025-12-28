public class arrayEasyProblem{

    // Largest element in array 

    public static int LargestElement(int arr[]){
        
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args){
        int [] arr={1,8,9,4,11};
        System.out.println(LargestElement(arr));
        
    }

}
    


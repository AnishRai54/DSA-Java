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




    // Second Largest Elememt in array;
    
    public static int SecondLargest(int [] arr){

        int max=arr[0];
        int second=arr[0];

        if(arr.length==1){
            return -1;
        }
        if(arr.length==2){
            if(arr[0]>arr[1]){
                max=arr[0];
                second=arr[1];
            }

            else{
                max=arr[1];
                second=arr[0];
            }
        }
        if(arr.length>2){

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }

            else if(arr[i]>second && arr[i]!=max){
                second=arr[i];
            }
        }
        
    }
    return second;
        

        
    }



    public static void main(String[] args){
        int [] arr={1};
        System.out.println(LargestElement(arr));
        System.out.println(SecondLargest(arr));
        
    }

}


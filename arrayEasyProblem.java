import java.util.*;

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



    // Check if the array is Sorted or not


    public static boolean CheckSorted(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                return true;
            }

            
        }

        return true;
        
        }


    // remove Duplicate in sorted array
     
// 0(n2)
    public static int[] RemoveDuplicat(int[] arr){


        
        List<Integer> list=new ArrayList<>();
        for(int i:arr){
            if(!list.contains(i)){
                list.add(i);

            }

        }

        int count=list.size();
        int []ans=new int[count];

        for(int i=0;i<count;i++){
            ans[i]=list.get(i);
        }
        

       


        return ans;
    }

    // 0(n) 

    public static int RemoveDuplicate(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[++i]=arr[j];
                
            }
        }

        return ++i;
    }


    // Left Rotate array

    public static int [] LeftRoate(int[] arr){

         int temp=arr[0];
        for (int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
            

        }
        arr[arr.length-1]=temp;



        return arr;
    }



    public static void main(String[] args){
        int [] arr={1,2,3,4};
        System.out.println(LargestElement(arr));
        System.out.println(SecondLargest(arr));
        System.out.println(CheckSorted(arr));
        int[] result = RemoveDuplicat(arr);
System.out.println(Arrays.toString(result));
System.out.println(RemoveDuplicate(arr));


        
        
    }
}


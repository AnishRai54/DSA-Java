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



    // left rotate the array by d place

    // O(n) and space is also O(n)

    public static int [] LeftRoateByD(int[] arr,int d){
        int n=arr.length;
         d=d%n;
        int [] temp=new int[d];

        for (int i=0;i<d;i++){
            temp[i]=arr[i];


        }

        for (int i=d;i<n;i++){
            arr[i-d]=arr[i];
        }

        for(int i=n-d; i<n;i++){
            arr[i]=temp[i-(n-d)];
        }


        return arr;
    }


  // m=optimum O(n) and space is O(1)


  public static void reverseArray(int[] arr,int start,int end){
     while(start<=end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;

     }
  }
 

  public static int[] LeftRoateByd(int[] arr,int d) {

    int n=arr.length;
    d=d%n;
    reverseArray(arr, 0, d-1);
    reverseArray(arr, d, n-1);
    reverseArray(arr, 0, n-1);




    return arr;
    
  }



  // Move Zero T0 end

  // [1,0,2,3,0,0,5]

  // brute approach 

  public static int[] moveZeroToEnd(int[] arr ){

    int n =arr.length;
    int []temp=new int[n];
    int count=0;
    int index=0;

    for(int i=0; i<n;i++ ){
        if (arr[i]!=0){
            temp[index++]=arr[i];
        }
        else{
            count++;
        }

    }


    return temp;
  }

  

   // linear Search

   public static int search(int[] arr,int d){
int i=0;
    while ( i<arr.length) {
        if (arr[i]==d){
           return i;
        }

        i++;

        
    }

    return -1;
   }


   


      





    public static void main(String[] args){
        int [] arr={1,0,2,3,0,0,5};
        // System.out.println(LargestElement(arr));
        // System.out.println(SecondLargest(arr));
        // System.out.println(CheckSorted(arr));
        // int[] result = RemoveDuplicat(arr);
        // int [] rotate=LeftRoateByd(arr,2);
        // System.out.println(Arrays.toString(result));
        // System.out.println(RemoveDuplicate(arr));
        // System.out.println(Arrays.toString(rotate));
        // int result[]=moveZeroToEnd(arr);
        // System.out.println(Arrays.toString(result));

        System.out.println(search(arr, 5));

        
        
    }
}


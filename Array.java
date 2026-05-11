import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
 int [] marks={90,78,98,100};
 int [] arr= new int[5];
 System.out.println(marks[2]);

System.out.println(arr.toString());


// input using for loop
// for(int i=0;i<arr.length;i++){
//     arr[i]=sc.nextInt();
// }

for (int i : marks){
    System.out.print(i+ " ");
}


System.out.println(Arrays.toString(arr));



// to string method 



// Array List

ArrayList <Integer> list =new ArrayList<>();
list.add(10);
list.add(20);
list.add(30);

System.out.println(list);



// MultiArray List

ArrayList<ArrayList<Integer>> list2= new ArrayList<>();

// initialisation

for (int i=0;i<3;i++){
    list2.add(new ArrayList());
}

for (int i=0;i<3;i++){
    for (int j=0;j<3;j++){
        list2.get(i).add(sc.nextInt());
    }
}

System.out.println(list2);




// Swap a two number in array

int [] arr1 = {1,2,4,6,7};
SwapNumArray(arr1,1,4);
System.out.println(Arrays.toString(arr1));

}

static void SwapNumArray(int[]arr,int index1,int index2){
     int temp=arr[index1];
     arr[index1]=arr[index2];
     arr[index2]=temp;

}



import java.util.Scanner;

public class conditionalLoop {
    public static void main(String[] args) {
      // larget of three number
      
      
    // Scanner sc =new Scanner(System.in);

    // int a = sc.nextInt();
    // int b=sc.nextInt();
    // int c=sc.nextInt();
      
    // int max = a;
    // if (b>max){
    //     max=b;
    // }
    // if (c>max){
    //     max=c;
    // }

    // System.out.println(max);

    // int max1= Math.max(c,Math.max(a, b));
    // System.out.println(max1);




    // Check case of character 

//     Scanner sc=new Scanner(System.in);
//     char a = sc.next().trim().charAt(0);
//     if ( a>'a' && a<='z'){
//    System.out.println("lowercase");
//     }
//     else  {
//         System.out.println("Uppercase");
//     }


// print fibonnaci of nnumber 

// Scanner sc =new Scanner(System.in);
// int n= sc.nextInt();
// int first=0;
// int second=1;
// if(n==1){
//     System.out.println(0);


// }
// if (n==2) {
//     System.out.println(1);
// }
// if(n>2){
// for(int i=2;i<n;i++){
//     int temp=second;
//      second= temp+ first;
//      first=temp;
 
// }
// }
// System.out.println(second);




//  count the occurence of digit in a number

int n=787796;
int target=7;
int z;
int count=0;

while(n!=0){
    z=n%10;
    if (z==target) {
        count++;
        
    }
    n=n/10;
}
System.out.println(count);





    }
}

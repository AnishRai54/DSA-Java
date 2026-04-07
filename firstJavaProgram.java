import java.util.Scanner;

public class firstJavaProgram {
    public static void main(String[] args) {
       System.out.println("Hello World");
       Scanner input =new Scanner(System.in);
        int num=input.nextInt();

       System.out.println(num);


       // type conversion and casting

       float number= 23.34f;
       double nums=number;
       System.out.println(nums);
 
       // type casting
       int n=(int)(67.56f);
         
     byte a =40;
     byte b=50;
     byte c=100;
     int d =a*b/c;
     System.out.println(d);



    
     System.out.println(n);


     int Num= 'A';
     System.out.println(Num);    



    }
}

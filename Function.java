public class Function {
    public static void main(String[] args) {
      // take   input two number and return a sum
      int a=sum(23,45);
      System.out.println(a);
      String b=greet();
      System.out.println(b);
      int[] s = swap(20, 30);
      System.out.println(s[0] + " " + s[1]);
      Swap(20,45);
      CheckPrime(37);
      System.out.println(Armstong(153));
    }


    static int sum(int a,int b){
      return a+b;
    }

    // 
    static String greet(){
       String S="HEllo How are You";
       return S;
    }

    // pass the value of number when you are calling the method in main
      
    static int[] swap(int a , int b){
      int temp= a;
      a=b;
      b=temp;
      return new int[]{a, b};

    }

    static void Swap(int a ,int b){
      int temp =a;
      a=b;
      b=temp;
    }



    // Scoping 



    // variable and arguments


    static void random(){
      int num =67;
      System.out.println(num);  // you cannot acced num outside the num
    }

    // Check prime or not
    static void CheckPrime(int a){
      int count=0;
      for (int i=1;i<a;i++){
        if (a%i==0){
          count+=1;
        }

      }
      if (count>1){
        System.out.println("Not Prime");
      }
      else{
        System.out.println("Prime");
      }
    }


    // print 3 digit all armstong number
    static boolean Armstong(int a){
      int original =a;
      int cube=0;
      while (a>0) {
        int rem=a%10;
        cube+=rem*rem*rem;
        a=a/10;

        
      }
      if (cube==original){
        return true;
      }
      else{
        return false;
      }
    }



}

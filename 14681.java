import java.util.Scanner;

class 14681 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A, B;
    A=sc.nextInt();
    B=sc.nextInt();
    if (A > 0 && B>0){
      System.out.println("1");
    }
    else if (A < 0 && B>0){
      System.out.println("2");
    }
     else if (A < 0 && B<0){
      System.out.println("3");
    }  
    else
       System.out.println("4");
    sc.close();
  }
}
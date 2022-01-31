import java.util.Scanner;
public class Task_3{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    try{
      int x,n=sc.nextInt();
      int a[]=new int[n];
      a[5]=99;
      x=n/0;
    }
    catch(ArithmeticException ae){
      System.out.println("Arithmetic Exception");
    }
    catch(ArrayIndexOutOfBoundsException ai){
      System.out.println("Array Index Out Of Bounds Exception");
    }
    finally{
      System.out.println("The End");
    }
  }
}
import java.util.Scanner;
public class Task_4{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    try{
      int x,n=sc.nextInt();
      int a[]=new int[n];
      a[5]=99;
      x=n/0;
    }
    catch(Exception e){
      System.out.println("Exception found");
    }
    finally{
      System.out.println("The End");
    }
    
  }
}
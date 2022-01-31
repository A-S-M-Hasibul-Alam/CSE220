import java.util.*;
public class Part01_Task05{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[15];
    int b[] = new int[10];
    for(int i=0; i<a.length; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
    for(int i=0; i<a.length; i++){
      b[a[i]]++;
    }
    for(int i=0; i<b.length; i++){
      System.out.println(i+" have been enterd "+b[i]+" times");
    }
  }
}
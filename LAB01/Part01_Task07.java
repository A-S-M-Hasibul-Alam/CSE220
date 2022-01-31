import java.util.*;
public class Part01_Task07{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<a.length; i++){
      a[i] = sc.nextInt();
    }
    System.out.println("Enter a number");
    int n = sc.nextInt();
    for(int i=1; i<a[n]; i++){
      System.out.print("*");
    }
    System.out.println();
  }
}

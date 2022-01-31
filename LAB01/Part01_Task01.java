import java.util.*;
public class Part01_Task01{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<a.length; i++){
      System.out.println("Give a number");
      a[i] = sc.nextInt();
    }
    if(a[0]==6 || a[a.length-1]==6){
      System.out.println("True");
    }
    else{
      System.out.println("False");
    }
  }
}
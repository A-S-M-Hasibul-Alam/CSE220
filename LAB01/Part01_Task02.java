import java.util.*;
public class Part01_Task02{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<a.length; i++){
      System.out.println("Give a number");
      a[i] = sc.nextInt();
    }
    int max = a[0];
    int maxind = 0;
    for(int i=1; i<a.length; i++){
      if(max<a[i]){
        max = a[i];
        maxind = i;
      }
    }
    int min = a[0];
    int minind = 0;
    for(int i=1; i<a.length; i++){
      if(min>a[i]){
        min = a[i];
        minind = i;
      }
    }
    int temp = max;
    a[maxind] = min;
    a[minind] = temp;
    for(int i=0; i<a.length; i++){
      if(i==a.length-1){
        System.out.print(a[i]+".");
      }
      else{
        System.out.print(a[i]+", ");
      }
    }
  }
}
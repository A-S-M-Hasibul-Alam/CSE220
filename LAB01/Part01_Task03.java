import java.util.*;
public class Part01_Task03{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter array length");
    int n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0; i<a.length; i++){
      System.out.println("Give a number");
      a[i] = sc.nextInt();
    }
    int temp;
    for(int i=0; i<a.length; i++){
      for(int j=i+1; j<a.length; j++){
        if(a[j]>a[i]){
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    for(int i=0; i<a.length; i++){
      System.out.print(a[i]+", ");
    }
    for(int i=0; i<a.length; i++){
      if(a[i]%2==0){
        System.out.print(a[i]+", ");
      }
    }
  }
}

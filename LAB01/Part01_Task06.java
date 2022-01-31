import java.util.*;
public class Part01_Task06{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int n = s.length();
    int a[] = new int[n];
    for(int i=0; i<a.length; i++){
      a[i] = s.charAt(i);
    }
    int k=0;
    for(int i=0, j=a.length-1; i<a.length; i++,j--){
      if(a[i] !=a[j]){
        k=1;
      }
    }
    if(k==0){
      System.out.println("Palindrome");
    }
    else{
      System.out.println("Not Palindrome");
    }
  }
}
import java.util.*;
public class Pat01_Task04{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    for(int i=0; i<10; i++){
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
      boolean f = false;
      for(int k=0; k<i; k++){
        if(a[k]==a[i]){
          f = true;
          break;
        }
      }
      if(f == true){
        System.out.println("Enter another number");
        i--;
      }
    }
  }
}
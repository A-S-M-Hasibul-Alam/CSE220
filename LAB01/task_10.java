import java.util.Scanner;
public class task_10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = {1, 4, 8, 16, 25, 36, 49, 64, 81, 100};
    for(int i=0; i<a.length; i++){
      if((i+n)>=a.length){
        a[i] = a[i-(n+2)];
      System.out.print(a[i]+", ");
      }
      else{
        a[i] = a[i+n];
      System.out.print(a[i]+", ");
      }
    }
  }
}
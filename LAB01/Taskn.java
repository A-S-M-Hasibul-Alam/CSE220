import java.util.*;
public class Taskn{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    try{
      if(a<0){
        NegativeNumberException n = new NegativeNumberException();
        throw n;
      }
      else{
      }
    }
    catch(NegativeNumberException ne){
      System.out.println("Negative number found");
    }
    finally{
      System.out.println("The End");
    }
  }
}
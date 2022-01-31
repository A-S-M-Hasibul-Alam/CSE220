//import java.util.*;
public class Tester{
  public static void main(String args[]){
    Recursion t = new Recursion();
    System.out.println(t.factorial(5));
    System.out.println(t.fibonacci(5));
    int b[] = {12, 13, 14, 15, 16};
    t.ArrayRecursion(b);
    t.binary(5);
    System.out.println();
    System.out.println(t.power(5,5));
  }
}
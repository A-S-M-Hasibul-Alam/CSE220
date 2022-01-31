import java.util.Arrays;
public class Tester{
  public static void main (String args[]){
    Sorting s = new Sorting();
    int x[] = {5,4,2,1,3,6};
    System.out.println(Arrays.toString(s.sort(x,0)));
  }
}
import java.util.*;
public class InsertionSortTester{
  public static void main(String args[]){
    int a[] = {10, 15, 12, 13, 11, 14};
    InsertionSort is = new InsertionSort();
    System.out.println(Arrays.toString(is.InsertionSort(a,1)));
  }
}
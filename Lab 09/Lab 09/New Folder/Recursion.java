public class Recursion{
  public int factorial(int x){
    if(x>1){
      return x*factorial(x-1);
    }
    else{
      return 1;
    }
  }
  public int fibonacci(int i){
    if(i>2){
      return fibonacci(i-1)+fibonacci(i-2);
    }
    else if(i==2){
      return 1;
    }
    else{
      return 0;
    }
  }
  int i=0;
  public void ArrayRecursion(int a[]){
    if(i<a.length){
      System.out.println(a[i]);
      i++;
      ArrayRecursion(a);
    }
  }
  public void binary(int n){
    if(n==0){
      System.out.print(0);
    }
    else if(n>1){
      int q = n/2;
      int r = n%2;
      binary(q);
      System.out.print(r);
    }
    else{
      System.out.print(1);
    }
  }
  public int power (int i, int j){
    if(j==0){
      return 1;
    }
    else if(j>1){
      int res = i*power(i, j-1);
      return res;
    }
    else{
      return i;
    }
  }
  int sum=0;
  public int Sum(Node h);
  if(h != null){
    sum = sum+h.element;
    h = h.next;
    Sum(h);
    return sum;
  }
}
public class Sorting{
   public int findminI(int[]b, int minI, int r){
     //System.out.println("r = "+r+" minI "+minI );
     if(r<b.length){
      if(b[r]<b[minI]){
        minI = r;
      }
      minI = findminI(b, minI, r+1);
    }
    return minI;
  }
  //FindMinIndex f = new FindMinIndex();
  public int[] sort(int []a, int x){
    
    if(x<a.length){
      //int minI=x;
      int minI = findminI(a,x,x);
   // System.out.println(minI);
    int temp = a[minI];
    a[minI] = a[x];
    a[x] = temp;
    sort(a,x+1);
    
    }
    return a;
  }
}
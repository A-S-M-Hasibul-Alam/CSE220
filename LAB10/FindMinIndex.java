public class FindMinIndex{
  public int findminI(int[]a,int x,int minI){
    if(x<a.length){
      if(a[x]<a[minI]){
        minI = x;
      }
      findminI(a, x+1, minI);
    }
    return minI;
  }
}
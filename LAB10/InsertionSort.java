public class InsertionSort{
  public static int[] InsertionSort(int[]a, int index){
    if(index >= a.length){
    return null;
    }
    else{
      int backup = a[index];
      int j = recursive(a,backup,index-1);
      a[j+1] = backup;
      InsertionSort(a, index+1);
    return a;
    }
  }
  public static int recursive(int a[],int backup,int index){
      if(index>=0 && a[index]>backup){
        a[index+1] = a[index];
        index = recursive(a, backup, index-1);
        return index;
      }
      else{
        return index;
      }
    }
  }

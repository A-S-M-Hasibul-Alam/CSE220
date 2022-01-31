public class quiz1SetA{
  public static void main (String [] args){
    
    
    int [] lin = {10,-5,-2,4,1,-9,-6,10,-5,4};
    
    int [] lin1 = {20,5,12,4,1,9,6,10,15,4}; 
    
    int [] lin2 = {-1,-15,-12,14,10,9,-60,1,-55,40};
    
    
    //Test 1
    lin = removeByShiftLeft(lin);
    
    for(int i : lin){
      System.out.print(i+" ");  // Output: {10 4 1 10 4 0 0 0 0 0}
    }
    System.out.println();
    
    //Test 2
    lin1 = removeByShiftLeft(lin1);
    
    for(int i : lin1){
      System.out.print(i+" ");  // Output: {20 5 12 4 1 9 6 10 15 4}
    }
    System.out.println();
    
    //Test 3
    lin2 = removeByShiftLeft(lin2);
    
    for(int i : lin2){
      System.out.print(i+" ");  // Output: {14 10 9 1 40 0 0 0 0 0}
    }
    System.out.println();
    
  }
  
  
  //Remove the negative values in the array by left shift
  public static int[] removeByShiftLeft(int [] v){
    int j=0;
    for(int i=0; i<v.length; i++){
      if(v[i]>0){
        //System.out.print(v[i]+" ");
        j++;
      }
    }
    for(int i=0;i<j; i++){
      for(int i=0; i<v.length; i++){
        if(v[i]>0){
        }
        else{ 
          v[i] = v[i+1];
        }
        v[v.length-1] = 0;
      }
    }
    
    
  }
   return v;
  
}
}

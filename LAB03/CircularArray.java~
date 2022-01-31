public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    cir = new Object[lin.length];
    start = st;
    size = sz;
    for(int i=0; i<cir.length; i++){
      cir[st] = lin[i];
      st = (st+1)%cir.length;
    }
  }
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
    for(int i=0; i<cir.length; i++){
      if(i==cir.length-1){
        System.out.print(cir[i] +".");
      }
      else{
        System.out.print(cir[i] +", ");
      }
    }
    System.out.println();
  }
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    //To DO
    int k = start;
    int j = size;
    for(int i=0; i<j; i++){
      if(i==j-1){
        System.out.print(cir[k]+".");
      }
      else{
        System.out.print(cir[k]+", ");
      }
      k = (k+1)%cir.length;
    }
    System.out.println();
  }
  
  
  public void printBackward(){
    //TO DO
    int k = (start+size-1)%cir.length;
    int j = size;
    for(int i=0; i<j; i++){
      if(k==-1){
        k = cir.length-1;
      }
      System.out.print(cir[k]+", ");
      k--; 
    }
    
  }
  
  
  // With no null cells
  public void linearize(){
    //TO DO
    int k = start;
    int j = size;
    Object lar[] = new Object[j];
    for(int i=0; i<j; i++){
      lar[i] = cir[k];
      k = (k+1)%cir.length;
    }
    cir = lar;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    //TO DO
    int k = start; 
    int j = size;
    int r = 0;
    Object resized[] = new Object[newcapacity];
    for(int i=k; i<resized.length-1; i++){
      resized[i] = cir[r];
      r = (r+1)%cir.length;
    }
    cir = resized;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    //TO DO
    int k = start; 
    int j = size;
    Object resized[] = new Object[newcapacity];
    for(int i=0; i<j; i++){
      resized[i] = cir[k];
      k = (k+1)%cir.length;
    }
    cir = resized;
  }
  
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
 public void insertByRightShift(Object elem, int pos){
    if(size==cir.length){
    resizeStartUnchanged(cir.length+3);
     for(int i=0;i<=size-pos;i++){
      if(start+size-i==cir.length){}
      else
    cir[start+size-i]=cir[start+size-i-1];
    }
    cir[start+pos]=elem;
    size++;
    }
    else{
     for(int i=0;i<=size-pos;i++){
      if(size-i==cir.length){}
      else
    cir[size-i]=cir[size-i-1];
    }
    cir[pos]=elem;
    size++;
    }
  }
  
  public void insertByLeftShift(Object elem, int pos){
     if(size==cir.length){
    resizeStartUnchanged(cir.length+3);
     for(int i=0;i<= pos;i++){
      if(start-1+i<0){}
      else
    cir[start-1+i]=cir[start+i];
    }
    cir[start+pos]=elem;
    size++;
    start--;
    }
    else{
    for(int i=0;i<= pos;i++){
      if(start-1+i<0){}
      else
    cir[start-1+i]=cir[start+i];
    }
    cir[start+pos]=elem;
    size++;
    start--;
    }
  }
}
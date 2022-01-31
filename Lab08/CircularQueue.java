public class CircularQueue implements Queue{
  private int size;
  private int start;
  private Object c[];
  
  CircularQueue(){
    size =0;
    start = 0; 
    c = new Object[10];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(size==0){
      return true;
    }
    else{
      return false;
    }
  }
  public void Enqueue(Object o) throws QueueOverflowException{
    if(size==c.length){
      throw new QueueOverflowException();
    }
    else{
      c[size] = o;
    size++;
    }
  }
  public Object Dequeue() throws QueueUnderflowException{
    if(size==c.length){
      throw new QueueUnderflowException();
    }
    else{
      int n = start;
      start++;
      size--;
      return c[n];
    }
  }
  
  public Object Peek() throws QueueUnderflowException{
    if(size==c.length){
      throw new QueueUnderflowException();
    }
    else{
      return c[0];
    }
  }
  public String toString(){
    String s="[";
    for(int i=start; i<=size; i++){
      s += c[(i+1)%c.length];
    }
    s+="]";
    if(s.equals("[]")) return "Empty";
    else return s;
  }
  public Object[] toArray(){
    Object a[] = new Object[size];
    int j = start;
    for(int i=0; i<=size; i++){
      a[i] = c[j];
      j = (j+1)%c.length;
    }
    return a;
  }
  public Object Search(Object o){
    int index =-1;
    for(int i=start; i<start+size-1;i++){
      if(c[i%c.length]==o){
        index = i-start;
        break;
      }
    }
    return index;
  }
}

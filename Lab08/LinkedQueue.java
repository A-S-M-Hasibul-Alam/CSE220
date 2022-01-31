public class LinkedQueue implements Queue{
  Node head;
  int size;
  
  LinkedQueue(){
    head  = null;
    size = 0;
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
    public void Enqueue(Object o){
      Node h = new Node(o,null);
      if(size==0){
        head = h;
      size++;
      }
      else{
        for(Node n = head; n!=null; n = n.next){
          if(n.next==null){
            n.next = h;
          }
        }
        size++;
      }
    }
    public Object Dequeue() throws QueueUnderflowException{
      if(size==0){
        throw new QueueUnderflowException();
      }
      else{
        Object e = head.element;
        head = head.next;
        size--;
        return e;
      }
    }
    public Object Peek() throws QueueUnderflowException{
      if(size==0){
      throw new QueueUnderflowException();
    }
    else{
      return head.element;
    }
  }
    public String toString(){
      String s="[";
    for(Node n = head; n != null; n = n.next){
      s += n.element;
    }
    s+="]";
    if(s.equals("[]")) return "Empty";
    else return s;
    }
    public Object[] toArray(){
      Object a[] = new Object[size];
    
    Node n = head;
    for(int i=0; i<=size; i++){
      a[i] = n.element;
      n = n.next;
    }
    return a;
  }
      
      public Object Search(Object o){
      int index =-1;
    Node n = head;
      for(int i=0; i<size; i++){
      if(n.element==o){
        index = i;
        break;
      }
      else{
        n = n.next;
    }
      }
    return index;
  }
}
      
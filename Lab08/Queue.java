public interface Queue{
  public int size();
  
  public boolean isEmpty();
  
  public void Enqueue(Object o) throws QueueOverflowException;
  
  public Object Dequeue() throws QueueUnderflowException;
  
  public Object Peek() throws QueueUnderflowException;
  
  public String toString();
  
  public Object[] toArray();
  
  public Object Search(Object o);
}
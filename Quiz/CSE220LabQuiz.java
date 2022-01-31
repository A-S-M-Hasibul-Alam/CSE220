//EDIT THIS FILE
public class CSE220LabQuiz{
  
  Node head;
  
  public CSE220LabQuiz(Node h){
    head = h;
  }
  
  /* Parameters: 
   * h - contains the head of a SORTED DOUBLY LINKED LIST
   * KEY - the value to add in the list
   * 
   * create a Node with key and insert in the correct postion
   * so that the linked list remains sorted, return true 
   */
  
  public boolean add(int key){
    // TO DO
    for(Node n = head; n.next!=null;n = n.next){
      if(key<n.item){
        Node ni = new Node(null, null, key);
        n.next = ni;
        ni.prev = n;
        n = n.next;
        
      }
    }
    
    
    return true; 
  }
  
  /* Print the items of the linked list in reverse manner */
  public void printReverse(){
    // To DO
    
    for(Node n = head.prev; n.prev != head; n = n.prev){
      System.out.print(n.item+" ");
      System.out.println();
    }
    
    
  }
}
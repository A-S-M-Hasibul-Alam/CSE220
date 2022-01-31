public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){
   head=new Node(a[0],null);
  Node tail=head;
  for(int i=1;i<a.length;i++){
  Node n=new Node(a[i],null);
  tail.next=n;
   tail=n; 
  }
  
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    head=h;
  }
  

  /* prints the elements in the list */
  public void printList(){
    for(Node i=head;i!=null;i=i.next){
    System.out.print(i.element+" ");
  }
    System.out.println("");
  }

  /* Counts the number of Nodes in the list */
  public int countNode(){
    int count=0;
    for(Node i=head;i!=null;i=i.next){
    count++;
  }
    return count; // please remove this line!
  }
  

  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){
    int count=0;
    int f=0;
    Node y=null;
      for(Node i=head;i!=null;i=i.next){
    count++;
       }
      if(idx<0 || idx>=count ){
      return null;
      }
      else{
      for(Node i=head;f<=idx;i=i.next){
         y=i;
         f++;
       }
      }
    return y;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    Node n = head;
    for(int i=0; i<=idx; i++){
      n = n.nex;
    }
    return n.element; 
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
     Node n = head;
     Object x;
     for(int i=0;i<=idx;i++){
       n = n.next;
     }
     x = n.element;
       n.element = elem;
       return x;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){
    int count=0;
      for(Node i=head;i!=null;i=i.next){
        if(i.element==elem){
        return count;
        }
        count++;
       }
      
    return -1;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
      for(Node i=head;i!=null;i=i.next){
        if(i.element==elem){
        return true;
        }
       }
      return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    Node n =head;
    Node tail=n;
  for(Node i=head.next;i!=null;i=i.next){
    tail.next=i;
    tail=tail.next;
  }
  return n;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){
    Node n = head;
    Node prev = null; 
        Node current = node; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        node = prev; 
        return node; 
   
  }   
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
     int count=0,f=0;
     Node z=null;
      for(Node i=head;i!=null;i=i.next){
    count++;
       }
      if(idx<0 || idx>count){
      System.out.println("Invalid index");
      }
     else if(idx==0){
     Node n=new Node(elem,head); 
     head=n;
     count++;
    }
    else if(idx==count){
     Node n=new Node(elem,null); 
     for(Node j=head;f<count;j=j.next){
         z=j;
         f++;
       }
      z.next=n;
      count++;
    }
    else{
      f=0;
      Node n=new Node(elem,null); 
       for(Node j=head;f<idx;j=j.next){
         z=j;
         f++;
       }
      n.next=z.next;
    z.next=n;
   count++;
    }
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
   int count=0,f=0;
     Node z=null;
      for(Node i=head;i!=null;i=i.next){
    count++;
       }
      if(index<0 || index>count){
      return null;
      }
       else if(index==0){
         Object p=head.element;
     head=head.next;
     count--;
     return p;
    }
    else if(index==count){
     for(Node j=head;f<count-1;j=j.next){
         z=j;
         f++;
       }
       z.next=null;
      count--;
      return (z.next).element;
    }
    else{
      f=0;
       for(Node j=head;f<index;j=j.next){
         z=j;
         f++;
       }
       Object q=(z.next).element;
     z.next=(z.next).next;
   count--;
   return q; 
    }
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
     int count=0,f=0;
     Node z=null;
      for(Node i=head;i!=null;i=i.next){
    count++;
       }
       for(Node j=head;f<count;j=j.next){
         z=j;
         f++;
       }
       Node x=head.next;
       head.next=null;
       z.next=head;
      head=x;
      
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
     int count=0,f=0;
     Node z=null;
      for(Node i=head;i!=null;i=i.next){
    count++;
       }
       for(Node j=head;f<count-1;j=j.next){
         z=j;
         f++;
       }
       Node x=z.next;
       z.next=null;
       x.next=head;
      head=x;
      
  }
}
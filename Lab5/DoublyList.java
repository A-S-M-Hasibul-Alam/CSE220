public class DoublyList{
    public Node head;
    
    
    /* First Constructor:
     * Creates a linked list using the values from the given array. head will refer
     * to the Node that contains the element from a[0]
     */ 
    public DoublyList(Object [] a){
        head = new Node(null, null, null);//dummy eta..but jodi dummy chara korte bole tahole eikhane first null ta a[0] hoto,
        Node tail = head;
        
        for(int i = 0; i<a.length; i++){//i=1hobe
            Node mn = new Node(a[i], null, null);
            tail.next = mn;
            mn.prev=tail;
            tail=tail.next;
        }
        tail.next=head; // Making it circular
        head.prev=tail;
    }
    
    /* Second Constructor:
     * Sets the value of head. head will refer
     * to the given LinkedList
     */
    public DoublyList(Node h){
        head = h;
    }
    
    /* Counts the number of Nodes in the list */
    public int countNode(){
        Node n=head;int count=0;
        while(n.next!=head){//dubly circular er jonno eta lkhsi nahole n!=null i likhtam/
        n=n.next;
        count++;}
        
        return count; // please remove this line!
    }
    
    /* prints the elements in the list */
    public void forwardprint(){
        Node n=head.next;//head er element null chilo so porer theke start krsi amra
        while(n!=head){//n!=null na bcz list ta circular kokhonoi null hbe na
        System.out.println(n.element);
        n=n.next;
        }
    }
    
    public void backwardprint(){
       Node n=head.prev; // just backward head.prev=tail in circular
       while(n!=head){
         System.out.println(n.element);
         n=n.prev;
       }
    }
    
    
    // returns the reference of the Node at the given index. For invalid index return null.
    public Node nodeAt(int idx){
        Node n=head.next;int count=0;
        while(n!=head)// Circular dummy to, so head jehetu null ultimately n!=null
        {if(count==idx){
          return n;}//return n disi cz Node return type.
        n=n.next;
          count++;
        }
        
        return null; // please remove this line!
    }
    
    
    
    /* returns the index of the Node containing the given element.
     if the element does not exist in the List, return -1.
     */
    public int indexOf(Object elem){
        Node n=head.next; int count=0;
        while(n!=head){
          if(n.element==elem){
          return count;
        } n=n.next;
          count++;}
        return -1; // please remove this line!
    }
    
    
    
    /* inserts Node containing the given element at the given index
     * Check validity of index.
     */
public void insert(Object elem, int idx){
        if(idx>=0&&idx<=countNode()){
                Node temp=nodeAt(idx);
                if(temp==null){//null=head samme kotha
                    temp=head;
                }
                Node nN=new Node(elem,null,null);
                temp.prev.next=nN;
                nN.next=temp;
                nN.prev=temp.prev;
                temp.prev=nN;
        }
        /*
         * 2nd way(Much Better)
         * int count=0;
         * Node temp=head.next;
         * for(; ;){
         * if(count==idx){
         * break;
         * }
         * temp=temp.next;
         * count++;
         * }
         */
        
        else{
            System.out.println("Sorry invalid index");
        }
    } 
    /* removes Node at the given index. returns element of the removed node.
     * Check validity of index. return null if index is invalid.
     */
     public Object remove(int index){
        if(index>=0&&index<countNode()){
            Node temp=nodeAt(index);
            Object elem=temp.element;
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            return elem;
        }
        else{
            System.out.println("Invalid index");
            return null; // please remove this line!
        }
    }
    
    
    //{
//      if (idx<0||idx>countNode()){
//        System.out.println("Dure Giya Mor!");}
//      else{
//        Node mn=new Node(elem,null,null);
//        if (idx==0){
//          mn.next=head.next;
//          mn.prev=head;
//          head.next=mn;
//          }
//        else{
//          Node n=head.next;int count=0;
//          while(n!=head){
//            if (count==idx){
//            Node temp=n;
//            temp.prev.next=mn;
//            mn.next=temp.next;
//            
//            break;}
//            count++;n=n.next;
//          }
//        }      
//      }
//    }
}
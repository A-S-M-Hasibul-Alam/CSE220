public class LinkedList{
  public Node head;
  public LinkedList(int [] a){
    head=new Node(a[0],null);
    Node tail=head;
    for(int i=1;i<a.length;i++){
      Node n=new Node(a[i],null);
      tail.next=n;
      tail=n; 
    }
  }
  void BubbleSort(int [] a){
    for(Node n = head; n != null; n = n.next){
      for(Node n1 = head; n1.next != null; n1 = n1.next){
        if(n1.element > n1.next.element){
          int temp = n1.element;
          n1.element = n1.next.element;
          n1.next.element = temp;
        }
      }
    }
      for(Node i=head;i!=null;i=i.next){
        System.out.print(i.element+" ");
      }
      System.out.println("");
    }
  void SelectionSort(int [] a){
    
}
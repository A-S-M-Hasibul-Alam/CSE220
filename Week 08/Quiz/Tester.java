// DO NOT EDIT THIS FILE
import java.util.*;
public class Tester{
  public static void main(String[]args){
    
    int [] a = new int[5];
    for(int i = 0;i<5;i++){
      a[i] = (int)((Math.random()+i)*100);
    }
    Arrays.sort(a);
    
    // Creating a sorted linked List with 5 Random Numbers
    Node head = new Node(null,null,a[0]);
    Node h = head;
    for(int i = 1;i<5;i++){
      Node n = new Node(null,null,a[i]);
      h.next = n;
      n.prev = h;
      h = h.next;
    }
    
    h = head;
    while(h!=null){
      System.out.print(h.item+" ");
      h = h.next;
    }
    System.out.println();
    
    CSE220LabQuiz q = new CSE220LabQuiz(head);
    Scanner sc = new Scanner(System.in);
      
    System.out.println("Enter a number");
    int num = sc.nextInt();
    System.out.println(q.add(num)); // This should print true
    
    q.printReverse(); // This should print then numbers in reverse
  }
  
  
}
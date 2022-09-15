public class main{

public static void main(String[] args) {
    
System.out.println("hello");
MyLinkedList l = new MyLinkedList();
l.addAtHead(7);
l.addAtHead(2);
l.addAtHead(1);
l.addAtIndex(3, 0);
l.deleteAtIndex(2);
l.addAtHead(6);
l.addAtTail(4);
l.get(4);
l.Stringer();

}
}

import java.util.*;

class MyLinkedList {

    class Node {
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index>=size || index<0){
            return -1;
        }
        Node p =head;
        for (int i = 0; i < index; i++) {
            p = p.next;
        }
        return p.val;
    }
    
    public void addAtHead(int val) {
        Node n = new Node(val);
        if(head==null){
            head = n;
            tail = head;
            size++;
            return;
        }
        else if(head.next==null){
            n.next=head;
            tail=head;
            head=n;
            size++;
            return;
        }
        n.next=head;
        head=n;
        size++;
    }
    
    public void addAtTail(int val) {
        Node n = new Node(val);
        if(head==null){
            head = n;
            tail=head;
            size++;
            return;
        }
        tail.next=n;
        tail=n;
        size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index+1>size||index<0){
            return;
        }
        else if(index==0){
            addAtHead(val);
        }
        else if(index==size){
            addAtTail(val);
        }
        Node n = new Node(val);
        Node p = head;
        p = head;
        for (int i = 0; i < index-1; i++) {
            p=p.next;
        }
        n.next = p.next;
        p.next = n;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if(index>size||index<0||size==0){
            return;
        }

        if(index==0){
            head.next=head;
            size--;
            if(size==0){
                tail=null;
            }
            return;
        }
        Node p = head;
        for (int i = 0; i < index-1; i++) {
            p=p.next;
        }
        p.next = p.next.next;
        size--;
        }

    public void Stringer(){//overriding the toString() method  
        List<Integer> list = new ArrayList<Integer>();
        Node n=head;
        for (int i = 0; i < size; i++) {
            list.add(n.val);
            n = n.next;
        }
        System.out.println(list);
       }  
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */

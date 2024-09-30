public class CustomLinkedList {
    public static class Node {
        int data;
        Node next;
        
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
public static int size;
    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail .next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("The linked list is empty");
            return;
        }
        
        Node temp = head;
        while (temp!= null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data){
        if(idx==0){
            addFirst(data);
            return;
        }
        Node newnode=new Node(data);
        size++;
        Node temp=head;
        int i=0;
        while(i<idx-1){
temp=temp.next;
i++;
        }
        newnode.next=temp.next;
        temp.next=newnode;

    }
    public int removefirst(){
        if (size==0){
            System.out.println("ll is empty");
            return -1;
        }
        if(size==1){
int val=head.data;
head=tail=null;
return val;
        }
      int value=head.data;
      head=head.next;
size--;
        return value;
    }
    public int removeLAST(){
        if (size==0){
            System.out.println("ll is empty");
            return -1;
        }
        if(size==1){
int val=head.data;
head=tail=null;
size --;
return val;
        }
       Node prev=head;
       for(int i=0;i<size-2;i++){
        prev=prev.next;
       }
       int value=prev.next.data;
       prev.next=null;
       tail=prev;
        size--;
        return value;
    }
    public static void main(String[] args) {
        CustomLinkedList ll = new CustomLinkedList();
        ll.addFirst(3 );
        ll.addLast(4);
        ll.addFirst(2);
    
        ll.add(0 , 1);
        ll.print(); 
        System.out.println(ll.size);
        ll.removefirst();
        ll.print();
        System.out.println(ll.size);
        ll.removeLAST();
        ll.print();
    }
}

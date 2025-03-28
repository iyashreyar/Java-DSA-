public class CircularLL {
    public static void main(String[] args) {
        CircularLL ls = new CircularLL();
        ls.insert(4);
        ls.insert(5);
        ls.insert(6);
        ls.insert(7);
        ls.display();
    }

    private Node head;
    private Node tail;
    private int size;

    public CircularLL() {
        this.head = null;
        this.tail = null;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if (head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }

    public void display(){
        if (head == null){
            System.out.println("No elements exists");
            return;
        } else {
            Node node = head;
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            } while (node!=head);
        }
    }
}

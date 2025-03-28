public class DoublyLL {
    public static void main(String[] args) {
        DoublyLL ls = new DoublyLL();
        ls.insertFirst(23);
        ls.insertFirst(33);
        ls.insertLast(86);
        ls.insert(9, 3);
        ls.display();
        System.out.println(ls.deleteFirst());
        ls.display();
        //ls.displayRev();
    }

    private Node head;
    private Node tail;
    private int size;

    private class Node {
        int val;
        Node prev;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(Node next, Node prev, int val) {
            this.next = next;
            this.prev = prev;
            this.val = val;
        }

    }

    public void insert(int val, int index){

        if (index == 0){
            insertFirst(val);
            return;
        }

        if (index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val);
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next.prev = node;
        size++;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) { // If list is empty, set both head and tail
            head = node;
            tail = node;
        } else {
            head.prev = node;
            node.next = head;
            head = node;
        }
        size++;
    }

    public void insertLast(int val){           // In case, you cannot use tail
                                               // Use this method 
        if (head == null){
            insertFirst(val);
            return;
        } else {
            Node node = head;
            Node last = null;
            while(node != null){
                last = node;
                node = node.next;
            }
            Node a = new Node(val);
            last.next = a;
            a.prev = last;
            a.next = null;
            tail = a;
            size++;
        }
        
    }

    // public void insertLast(int val) {
    //     Node node = new Node(val);
    //     if (head == null) { // If list is empty, set both head and tail
    //         head = node;
    //         tail = node;
    //     } else {
    //         tail.next = node; // Connect last node to new node
    //         node.prev = tail; // Set previous pointer of new node
    //         tail = node; // Move tail to new node
    //     }
    //     size++;
    // }

    public int deleteFirst(){
        int val = head.val;
        if (head != null){
            head = head.next;
            head.prev = null;
            size--;
        }
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayRev() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.prev;
        }
        System.out.println("START");
    }

    /*

    In case, you cannot use tail
    Use this method

    public void displayRev(){
        Node node = head;
        Node last = null;
        while(node!=null){
            last = node;
            node = node.next;
        }
        while (last != null){
            System.out.print(last.val + " <-> ");
            last = last.prev;
        }
        System.out.println("START");
    }
     */
}

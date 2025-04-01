

public class LinkedListt {
    public static void main(String[] args) {
        LinkedListt ls = new LinkedListt();
        ls.insertFirst(23);
        ls.insertLast(34);
        ls.insertLast(13);
        ls.insert(99, 1);

        ls.display();
        ls.delete(1);
        ls.display();
    }

        private Node head;
        private Node tail;
        private int size;
        public LinkedListt() {
            this.size = 0;
        }

    private class Node{

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insert(int val, int index){

        if (index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    //insert using recursion
    public void insertRec(int val, int index){
        head = insertRec(val, index, head);
    }

    private Node insertRec(int val, int index, Node node){
        if (index == 0){
            Node temp = new Node(val, node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null){
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val){
        if (tail == null){                      //no elements in linked list / empty linked list
            insertFirst(val);
            return;                             //do not execute the remaining code of method because no elements except the one we added
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public int deleteFirst(){
        if (head == null){                      //it means there are no elements in LL, so making the tail null as well
            tail = head;
        }
        int val = head.value;
        head = head.next;
        size--;
        return val;
    }

    public Node get(int index){                     // Method to find a node at particular index
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteLast(){
        if (size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index){
        if (index == 0){
            return deleteFirst();
        }
        if (index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return val;
    }

    public Node find(int value){                // Method to find node of required value
        Node node = head;
        while (node != null){
            if (node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}


public class BubbleSortLL {
    public static void main(String[] args) {
        BubbleSortLL list = new BubbleSortLL();
        for (int i = 8; i > 0; i--) {
            list.insertLast(i);
        }

        list.display();
        list.bubbleSort();
        list.display();
    }

    private Node head;
        private Node tail;
        private int size;
        public BubbleSortLL() {
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

    public void bubbleSort(){
        bubbleSort(size - 1, 0);
    }
    private void bubbleSort(int r, int c){
        if (r == 0){
            return;
        }

        if (r > c){
            Node first = get(c);
            Node second = get(c+1);

            if (first.value > second.value){
                //swap
                if (first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                } else if (second == tail){
                    Node prev = get(c-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = tail;
                } else {
                    Node prev = get(c-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(r, c+1);
        } else {
            bubbleSort(r-1, 0);
        }
    }
    public Node get(int index){
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
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

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

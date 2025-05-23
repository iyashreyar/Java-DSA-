

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




    //Reverse a LL using recursion
    private void reverse(Node node){
        if (node == tail){
            head = tail;
            return;
        }

        reverse(node.next);

        tail.next = node;
        tail = node;
        node.next = null;
    }




    //In place reversal of a LL
    //google, microsoft, amazon, apple 
    //ques - https://leetcode.com/problems/reverse-linked-list/description/
    public void inPlaceReversal(){
        if (size < 2){
            return;
        }
        Node prev = null;
        Node present = head;
        Node next = present.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        head = prev;
    }





    //Reverse LL in between of two nodes 
    //Reverse LL - II 
    // Ques - https://leetcode.com/problems/reverse-linked-list-ii/description/

    public Node reverseBetween(Node head, int left, int right){
        if (left == right){
            return head;
        }

        //skip the first left-1 nodes
        Node prev = null;
        Node current = head;
        for (int i = 0; current != null && i < left-1; i++) {
            prev = current;
            current= current.next;
        }
        Node last = prev;
        Node newEnd = current;

        //reverse bw left and right
        Node next = current.next;
        for (int i = 0; current != null && i < right-left+1; i++) {
            current.next = prev;
            prev = current;
            current = next;
            if (next != null){
                next = next.next;
            }
        }
        if (last != null){
            last.next = prev;
        } else {
            head = prev;
        }

        newEnd.next = current;
        return head;
    }





    // LL is palindrome or not 
    // Ques - https://leetcode.com/problems/palindrome-linked-list/description/
    public boolean isPalindrome(Node head){
        Node mid = middleNode(head);
        Node headSecond = reverseList(mid);
        Node rereverseHead = headSecond;

        //compare both the halves
        while (head != null && headSecond != null){
            if (head.value != headSecond.value){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(rereverseHead);
        if (head == null || headSecond == null){
            return true;
        } 
        return false;   
    }

    public Node reverseList(Node head) {
        if (head == null){
            return head;
        }

        Node prev = null;
        Node present = head;
        Node next = present.next;
        
        while(present != null){
            present.next = prev;
            prev = present;
            present = next;
            if (next != null){
                next = next.next;
            }
        }
        return prev;
    }
    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }




    // Reorder list
    // Ques - https://leetcode.com/problems/reorder-list/description/
    public void reorderList(Node head){
        Node mid = middleNode(head);
        Node hs = reverseList(mid);
        Node hf = head;

        //rearrange 
        while (hf != null && hs != null){
            Node temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp = hs.next;
            hs.next = hf;
            hs = temp;
        }

        //point next of tail to null
        if (hf != null){
            hf.next = null;
        }
    }



    // Reverse nodes in a k group
    // Ques - https://leetcode.com/problems/reverse-nodes-in-k-group/
    // Google, Amazon, Apple, Microsoft
    public Node reverseKGroup(Node head, int k) {

        if(k == 1 || head == null){
            return head;
        }

        Node prev = null;
        Node current = head;

        int remaininglength = listLength(head);

        while(remaininglength >= k){

            Node last = prev;
            Node newEnd = current;

            Node next = current.next;

            for(int i = 0; (current!= null) && i < k; i++){
                current.next = prev;
                prev = current;
                current = next;
                if (next != null){
                    next = next.next;
                }
            }

            if(last == null){
                head = prev;   
            } else{
                last.next = prev;
            }

            newEnd.next = current;
            prev = newEnd;

            remaininglength = remaininglength - k;
        }
        return head;
    }

    //finding the length of the List
    public int listLength(Node head){
        if(head == null){
            return 0;
        }

        Node temp = head;
        int length = 0;

        while(temp != null){
            length += 1;
            temp = temp.next; 
        }
        return length;
    }




    // Reverse alternate k nodes in a group
    // Ques - https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
    
    public Node ReversekAlternatively(Node head, int k) {
        if (k == 1 || head == null) {
            return head;
        }
    
        Node prev = null;
        Node current = head;
    
        boolean reverse = true;
    
        while (current != null) {
            Node last = prev;
            Node newEnd = current;
            Node next = null;
    
            int count = 0;
    
            if (reverse) {
                // Reverse k nodes
                while (current != null && count < k) {
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                    count++;
                }
    
                if (last != null) {
                    last.next = prev;
                } else {
                    head = prev;
                }
    
                newEnd.next = current;
                prev = newEnd;
            } else {
                // Skip k nodes
                while (current != null && count < k) {
                    prev = current;
                    current = current.next;
                    count++;
                }
            }
            reverse = !reverse; // Toggle
        }
    
        return head;
    }
    
    
    //                            OR


    // public Node ReversekAlternatively(Node head, int k){
    //     if(k == 1 || head == null){
    //         return head;
    //     }

    //     Node prev = null;
    //     Node current = head;

    //     int remaininglength = listLength(head);

    //     while(remaininglength >= k){

    //         Node last = prev;
    //         Node newEnd = current;

    //         Node next = current.next;

    //         for(int i = 0; (current!= null) && i < k; i++){
    //             current.next = prev;
    //             prev = current;
    //             current = next;
    //             if (next != null){
    //                 next = next.next;
    //             }
    //         }

    //         if(last == null){
    //             head = prev;   
    //         } else{
    //             last.next = prev;
    //         }

    //         newEnd.next = current;
    //         remaininglength = remaininglength - k;

    //         //skip the k nodes 
    //         if (remaininglength >= k){
    //             for (int i = 0; i < k; i++) {
    //                 prev = current;
    //                 current = current.next;
    //             }
    //         }

    //         remaininglength = remaininglength - k;

    //     }
    //     return head;
    // }
    



    // Rotate list 
    // Ques - https://leetcode.com/problems/rotate-list/description/
    public Node rotateRight(Node head, int k){
        if (k <= 0 || head == null || head.next == null){
            return head;
        }
        Node last = head;
        int length = 1;
        while (last.next != null){
            last = last.next;
            length++;
        }
        last.next = head;
        int rotations = k % length;
        int skip = length - rotations;
        Node newLast = head;
        for (int i = 0; i < skip-1; i++) {
            newLast = newLast.next;
        }
        head = newLast.next;
        newLast.next = null;

        return head;
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

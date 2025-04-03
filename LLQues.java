public class LLQues {
    public static void main(String[] args) {

        // // Answer 1
        // LLQues ls = new LLQues();
        // ls.insertLast(1);
        // ls.insertLast(1);
        // ls.insertLast(2);
        // ls.insertLast(3);
        // ls.insertLast(3);
        // ls.display();
        // ls.removeDuplicates();
        // ls.display();

        // Answer 2
        LLQues first = new LLQues();
        LLQues second = new LLQues();
        first.insertLast(1);
        first.insertLast(3);
        first.insertLast(5);
        second.insertLast(1);
        second.insertLast(2);
        second.insertLast(9);
        second.insertLast(14);
        LLQues ans = LLQues.MergeSort(first, second);
        ans.display();

    }

    private Node head;
        private Node tail;
        private int size;
        public LLQues() {
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

    // Questions

    // Q1 - Remove duplicates values from a LL
    public void removeDuplicates(){
        Node temp = head;
        while (temp.next != null){
            if (temp.value == temp.next.value){
                temp.next = temp.next.next;
                size--;
            } else {
                temp = temp.next;
            }
        }
        tail = temp;
        temp.next = null;
    }

    // Q2 - Merge two sorted lists
    public static LLQues Merge(LLQues first, LLQues second){
        Node f = first.head;
        Node s = second.head;

        LLQues ans = new LLQues();
        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
        }
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        return ans;
    }

    // Q3 - Link list cycle / Cycle detection
    // https://leetcode.com/problems/linked-list-cycle/description/
    public boolean hasCycle() {

        if(head == null){           // Edge case: empty list
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }

        return false;
    }

    // Q4 - Find the length of cycle
    public int cycleLength() {

        if (head == null){
            return 0;
        }
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                Node temp = slow;
                int count = 0;
                do {
                    temp = temp.next;
                    count++;
                } while(temp != fast);
                return count;
            }
        }
        return 0;
    }


    // Q5 - Find the beginning node of the cycle 
    // https://leetcode.com/problems/linked-list-cycle-ii/description/
    public Node beginOfCycle(){
        
        Node slow = head;
        Node fast = head;
        int count = 0;

        while(fast != null && slow != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                count = cycleLength();
                break;
            }
        }

        // If no cycle exists
        if (count == 0){
            return null;
        }
        
        // find the start node
        Node f = head;
        Node s = head;

        // Move first node f forward by length times
        while (count > 0){
            f = f.next;
            count--;
        }

        // Move both nodes forward until they meet at a common point and thats begin node of cycle
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    // Q6 - https://leetcode.com/problems/happy-number/description/
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do { 
            slow = Sq(slow);
            fast = Sq(Sq(fast));
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }

    private int Sq(int num){
        int ans = 0;
        while(num > 0){
            int rem = num % 10;
            ans += rem*rem;
            num = num / 10;
        }
        return ans;
    }


    // Q7 - Find the middle of the LL
    // https://leetcode.com/problems/middle-of-the-linked-list/description/

    public Node middleNode() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    
    }

    // Q8 - Sort LL
    // https://leetcode.com/problems/sort-list/description/
    

    public static LLQues MergeSort(LLQues first, LLQues second){
        LLQues ans = new LLQues();
        Node f = first.head;
        Node s = second.head;
        while (f != null && s != null){
            if (f.value < s.value){
                ans.insertLast(f.value);
                f = f.next;
            } else {
                ans.insertLast(s.value);
                s = s.next;
            }
        }
        while (f != null){
            ans.insertLast(f.value);
            f = f.next;
        }
        while (s != null){
            ans.insertLast(s.value);
            s = s.next;
        }
        return ans;
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

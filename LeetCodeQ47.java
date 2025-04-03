
// Ques - https://leetcode.com/problems/sort-list/description/
//MERGE SORT IN LL

public class LeetCodeQ47 {
    public ListNode sortList(ListNode head) {

        if (head == null || head.next == null){
            return head;                            // Handle empty or single-node list
        }

        ListNode mid = getMid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummyHead = new ListNode();
        ListNode node = dummyHead;

        while(list1 != null && list2 != null){
            if (list1.val < list2.val){
                node.next = list1;
                list1 = list1.next;
                node = node.next;
            } else {
                node.next = list2;
                list2 = list2.next;
                node = node.next;
            }
        }
        node.next = (list1 != null) ? list1 : list2;
        return dummyHead.next;
    }

    ListNode getMid(ListNode head) {
        if (head == null || head.next == null){
            return head;                            // Handle empty or single-node list
        }
        
        ListNode midPrev = null;
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if (midPrev != null){
            midPrev.next = null;                     // Break the list
        }
        
        return slow;
    }
    

    class ListNode {
        int val;
        ListNode next;

        public ListNode() {
        }

        ListNode(int x){
            val = x;
            next = null;
        }
    }
}

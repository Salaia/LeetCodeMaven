public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        /*if (head.next == null) {
            return head;
        }
        ListNode oldHead = head;
        ListNode result = new ListNode();
        int length = 1;
        while (head.next != null) {
            head = head.next;
            length++;
        }
        int midIndex = length / 2;

        head = oldHead;
        for (int i = 1; i <= midIndex; i++) {
            if (head.next != null && i != midIndex) {
                head = head.next;
            } else if(i == midIndex && head.next != null) {
                result = head.next;
            }
        }
        return result;*/

        ListNode midNode = head;
        ListNode endNode = head;
        while (endNode != null && endNode.next != null) {
            midNode = midNode.next;
            endNode = endNode.next.next;
        }

        return midNode;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}

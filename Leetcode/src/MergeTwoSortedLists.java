import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {

    private static ListNode head;
    private static ListNode last;

    public static void main(String[] args) {

       ListNode l1_3 = new ListNode(4);
       ListNode l1_2 = new ListNode(2, l1_3);
       ListNode l1_1 = new ListNode(1, l1_2);
       ListNode l2_3 = new ListNode(4);
       ListNode l2_2 = new ListNode(3, l2_3);
       ListNode l2_1 = new ListNode(1, l2_2);

       ListNode retHead = solution(l1_1, l2_1);

    //    ListNode l1_1 = null;
    //    ListNode l2_1 = new ListNode(0);
    //    ListNode retHead = solution(l1_1, l2_1);

        write();

    }

    public static ListNode solution(ListNode list1, ListNode list2) {

        while (true) {

            if (list1 != null && list2 != null) {

                if (list1.val < list2.val) {
                    addNode(list1.val);
                    list1 = list1.next;
                } else if (list1.val > list2.val) {
                    addNode(list2.val);
                    list2 = list2.next;
                } else {
                    addNode(list1.val);
                    addNode(list2.val);
                    list1 = list1.next;
                    list2 = list2.next;
                }

                continue;
            }

            if (list1 != null) {
                addNode(list1.val);
                list1 = list1.next;
                continue;
            }

            if (list2 != null) {
                addNode(list2.val);
                list2 = list2.next;
                continue;
            }
            break;
        }

        return head;
    }

    public static void addNode(int value) {

        ListNode newLastNode = new ListNode(value);
        if (head == null) {
            head = newLastNode;
            last = head;
        }

        last.next = newLastNode;
        last = newLastNode;
        last.next = null;
    }

    public static void write() {

        ListNode temp = head;

        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
        ;
    }
}

class ListNode {
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



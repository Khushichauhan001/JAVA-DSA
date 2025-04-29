import java.util.*;

public class CriticalMaxMin {

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static int[] nodesBetweenCriticalPoints(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            int[] result = new int[2];
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        List<Integer> criticalIndices = new ArrayList<>();
        int index = 1; // starting from second node
        ListNode prev = head;
        ListNode curr = head.next;

        while (curr.next != null) {
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {
                criticalIndices.add(index);
            }
            prev = curr;
            curr = curr.next;
            index++;
        }

        if (criticalIndices.size() < 2) {
            int[] result = new int[2];
            result[0] = -1;
            result[1] = -1;
            return result;
        }

        int minDist = Integer.MAX_VALUE;
        for (int i = 1; i < criticalIndices.size(); i++) {
            minDist = Math.min(minDist, criticalIndices.get(i) - criticalIndices.get(i - 1));
        }

        int maxDist = criticalIndices.get(criticalIndices.size() - 1) - criticalIndices.get(0);

        int[] result = new int[2];
        result[0] = minDist;
        result[1] = maxDist;
        return result;
    }

    public static void main(String[] args) {
        // Example: 1 -> 3 -> 2 -> 2 -> 3 -> 2 -> 2 -> 2 -> 7
        ListNode head = new ListNode(1);
        head.next = new ListNode(3);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next = new ListNode(2);
        head.next.next.next.next.next.next.next.next = new ListNode(7);

        int[] result = nodesBetweenCriticalPoints(head);
        System.out.println("Min Distance: " + result[0]);
        System.out.println("Max Distance: " + result[1]);
    }
}

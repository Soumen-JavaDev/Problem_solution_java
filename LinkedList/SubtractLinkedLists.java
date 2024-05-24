package LinkedList;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class SubtractLindedLists {
    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int val = sc.nextInt();
        Node first = new Node(val);
        Node tail = first;
        for (int i = 0; i < n - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }
        int m = sc.nextInt();
        val = sc.nextInt();
        Node second = new Node(val);
        tail = second;
        for (int i = 0; i < m - 1; i++) {
            val = sc.nextInt();
            tail.next = new Node(val);
            tail = tail.next;
        }

        Solution g = new Solution();
        Node res = g.subtract(first, second);
        printList(res);
        sc.close();
    }
}

class Solution {
    public static Node reverse(Node head) {
        Node prev = null;
        Node nextnode = null;
        while (head != null) {
            nextnode = head.next;
            head.next = prev;
            prev = head;
            head = nextnode;
        }
        return prev;
    }

    static int size(Node head) {
        Node temp = head;
        int n = 0;
        while (temp != null) {
            n++;
            temp = temp.next;
        }
        return n;
    }

    static boolean isbigger(Node l1, Node l2) {
        if (size(l1) > size(l2)) {
            return true;
        } else if (size(l2) > size(l1)) {
            return false;
        } else {
            while (l1 != null && l2 != null) {
                if (l1.data > l2.data) {
                    return true;
                } else if (l2.data > l1.data) {
                    return false;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            return false;
        }
    }

    Node subtract(Node l1, Node l2) {
        if (!isbigger(l1, l2)) {
            Node temp = l2;
            l2 = l1;
            l1 = temp;
        }

        l1 = reverse(l1);
        l2 = reverse(l2);
        Node domy = new Node(0);
        Node t = domy;
        int d = 0;
        while (l1 != null) {
            int ans = l1.data - d;
            if (l2 != null) {
                ans -= l2.data;
            }
            if (ans < 0) {
                d = 1;
                ans += 10;
            } else {
                d = 0;
            }
            t.next = new Node(ans);
            t = t.next;
            l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        Node c = reverse(domy.next);
        while (c != null && c.data == 0) {
            c = c.next;
        }
        if (c == null) return new Node(0);
        return c;
    }
}

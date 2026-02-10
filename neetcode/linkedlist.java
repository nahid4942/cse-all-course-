import java.util.*;
import java.util.Collections;

public class linkedlist {
    public static class Node {
        int data;
        Node next;

        public Node() {
        }

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void addfirst(int data) {
        if (head == null) {
            Node newnode = new Node(data);
            size++;
            head = newnode;
            tail = newnode;
            return;
        }

        Node newnode = new Node(data);
        size++;
        newnode.next = head;
        head = newnode;
    }

    public static void nodestoarray(Node head) {

        for (int i = 0; i < ll.size(); i++) {
            System.out.println(ll.get(i));
        }

    }
    /*
     * public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
     * return null;
     * }
     */

    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.addfirst(10);
        list.addfirst(11);
        list.addfirst(12);
        list.addfirst(13);
        list.addfirst(14);
        list.addfirst(15);

        nodestoarray(head);

    }
}

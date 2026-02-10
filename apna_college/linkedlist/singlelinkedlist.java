import java.util.ArrayList;
import java.util.Collections;
import java.util.collectins;

public class singlelinkedlist {
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

    // add first
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

    // add last
    public static void addlast(int data) {
        if (head == null) {
            Node newnode = new Node(data);
            size++;
            head = newnode;
            tail = newnode;
            return;
        }

        Node newnode = new Node(data);
        size++;
        tail.next = newnode;
        tail = newnode;
    }

    // add in midde
    public static void addmiddle(int data, int idx) {
        Node newnode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newnode.next = temp.next;
        temp.next = newnode;

    }

    // remove first
    public static int removefirst() {
        int val = head.data;
        head = head.next;
        return val;

    }

    // remove last
    public static int removelast() {

        int val = tail.data;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return val;

    }

    // find tail
    public static Node findtail(Node n) {
        Node temp = n;
        while (temp.next != null) {
            temp = temp.next;
        }
        System.out.println(temp.data);
        return temp;

    }

    // search key
    public static void search(int key) {
        if (head == null) {
            return;
        }
        int i = 0;
        while (head != null) {
            if (head.data == key) {
                System.out.println("key found");

            }
        }
    }

    // reverse a list
    public static Node revereselist(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        Node reverse = head;
        return reverse;

    }

    public static void Arraytolist(int arr[]) {

        Node newNode = new Node(arr[0]);
        head = newNode;
        head.next = newNode;

        for (int i = 1; i < arr.length; i++) {
            Node newnode = new Node(arr[i]);
            newnode = newnode.next;
        }

    }

    public static void printlist(Node n) {

        Node head = n;

        while (head != null) {
            System.out.print(head.data + "-->");
            head = head.next;
        }
    }

    // remove nth node from list from front
    public static void remove_nth_node(int n, Node head) {
        Node temp = head;
        for (int i = 0; i < n - 1; i++) {
            temp = temp.next;

        }
        Node temp2 = temp.next.next;
        temp.next = temp2;
    }

    // remove nth node from last
    public static void remove_nth_node_fromlast(int n, Node head) {
        remove_nth_node(n, revereselist(head));

    }

    // sort a linked list
    public static void sortlist(Node head) {
        Node temp = head;
        ArrayList<Integer> ll = new ArrayList<>();

        while (temp != null) {
            ll.add(temp.data);

        }
        Collections.sort(ll);
        for (int i = 0; i < ll.size(); i++) {

            Node newnNode = new Node(ll.get(i));
            newnNode.next = head;
            head = newnNode;
        }
    }

    public static void main(String[] args) {
        // Node newnode = new Node(10);
        // System.out.println(newnode.data);
        // int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // singlelinkedlist list = new singlelinkedlist();
        // list.Arraytolist(arr);
        // list.printlist(head);
        singlelinkedlist list = new singlelinkedlist();

        list.addfirst(10);
        list.addfirst(20);
        list.addfirst(30);
        list.addfirst(40);
        list.addfirst(50);
        list.addfirst(60);
        list.addlast(11);
        list.addlast(12);
        // list.printlist(head);
        // System.out.println("size :" + size);
        // System.out.println(list.removefirst());
        // System.out.println(list.removelast());
        // list.printlist(head);
        // System.out.println();
        // list.findtail(head);

        // System.out.println("before reverse");
        // list.printlist(head);
        // list.remove_nth_node_fromlast(3, head);
        // System.out.println("after removing nTh");
        // list.printlist(head);
        // list.printlist(list.revereselist(head));
        list.sortlist(head);
        list.printlist(head);

    }

}

import java.util.LinkedList;
import java.util.Collections;
class ReverseLinkedList {
    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Reverse linked list iteratively
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;  // store next
            current.next = prev;  // reverse the link
            prev = current;       // move prev forward
            current = next;       // move current forward
        }
        head = prev;
    }

    // Print linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Driver code
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original LinkedList: " + list);

        Collections.reverse(list);

        System.out.println("Reversed LinkedList: " + list);
    }

}

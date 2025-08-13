import java.util.LinkedList;

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
        LinkedList<> list = new LinkedList();
        list.head = new Node(1);
        list.head.next = new Node(2);
        list.head.next.next = new Node(3);
        list.head.next.next.next = new Node(4);

        System.out.println("Original Linked List:");
        list.printList();

        list.reverse();

        System.out.println("Reversed Linked List:");
        list.printList();
    }
}

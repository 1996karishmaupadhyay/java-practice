package LinkedList;

public class Main {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        head.next = third;
        third.next = second;
        System.out.println("Linked List: ");

        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data + " ");
            System.out.println("----------------");

            System.out.println("Current Data: " + currentNode.data);

            System.out.println("Current Node Identity: "
                    + System.identityHashCode(currentNode));

            System.out.println("Next Node Identity: "
                    + (currentNode.next == null
                            ? "null"
                            : System.identityHashCode(currentNode.next)));

            currentNode = currentNode.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
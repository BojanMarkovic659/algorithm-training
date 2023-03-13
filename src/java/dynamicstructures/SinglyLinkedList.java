package dynamicstructures;

import java.util.HashSet;
import java.util.Set;

public class SinglyLinkedList {
    private Node head;

    private class Node {
        private int data;
        private Node next;

        private Node(int data) {
            this.data = data;

        }
    }

    public void addElement(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }


    public void displayList() {
        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void removeDuplicatesSortedList() {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void removeDuplicatesUnsortedList() {
        if (head == null) {
            return;
        }
        Node current = head;
        Set<Integer> set = new HashSet<>();
        set.add(current.data);
        while (current.next != null) {
            if (set.contains(current.next.data)) {
                current.next = current.next.next;
            } else {
                set.add(current.next.data);
                current = current.next;
            }
        }
    }

    public void removeAll() {
        if (head == null) {
            return;
        }
        head = null;
    }
}


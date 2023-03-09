package dynamicstructures;

import staticstructures.StaticStack;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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

    public int findMiddle() throws Exception {
        if (head == null) {
            throw new Exception("List is empty");
        }
        Node slow = head;
        Node fast = head;
        Node prev = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if (fast == null) {
            return prev.data;
        } else {
            return slow.data;
        }
    }

    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        Node slow = head;
        Node fast = head;
        Stack<Integer> stack = new Stack<>();
        while (fast != null && fast.next != null) {
            stack.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        while (slow != null) {
            if (slow.data != stack.pop()) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public void removeAll() {
        if (head == null) {
            return;
        }
        head = null;
    }
}


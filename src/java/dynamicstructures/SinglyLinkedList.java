package dynamicstructures;


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

    public void removeDuplicatesSortedList() throws Exception {
        if (head == null) {
            return;
        }
        Node current = head;
        while (current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                if (current.data > current.next.data) {
                    throw new Exception("List is not sorted");
                }
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

    public void removeLastOccurrence(int element) throws Exception {
        if (head == null) {
            throw new Exception("List is empty");
        }
        Node current = head;
        Node prev = head;

        while (current.next != null) {
            if (current.next.data == element) {
                prev = current;
            }
            current = current.next;
        }
        if (prev != head) {
            prev.next = prev.next.next;
        } else if (head.data == element) {
            head = head.next;
        }
    }

    public void removeAll() {
        if (head == null) {
            return;
        }
        head = null;
    }
}


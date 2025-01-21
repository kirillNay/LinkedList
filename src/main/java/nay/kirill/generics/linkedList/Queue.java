package nay.kirill.generics.linkedList;

public class Queue<T> {

    Node back;

    Node head;

    int size;

    void enqueue(T data) {
        Node node = new Node(data);

        if (back == null) {
            head = node;
        } else {
            back.next = node;
        }

        size++;
        back = node;
    }

    T dequeue() {
        if (head == null) {
            return null;
        }

        T value = head.value;

        size--;
        head = head.next;
        return value;
    }

    T peek() {
        if (head == null) {
            return null;
        }

        return head.value;
    }

    int size() {
        return size;
    }

    boolean isEmpty() {
        return head == null;
    }

    int count(Predicate<T> predicate) {
        int counter = 0;
        for (Node node = head; node != null; node = node.next) {
            T value = node.value;
            if (predicate.check(value)) {
                counter++;
            }
        }

        return counter;
    }

    private class Node {

        T value;
        Node next;

        Node(T value) {
            this.value = value;
            next = null;
        }

    }

}

package com.company.task2;

public class doublyLinked {
    Link first;
    Link last;

    public doublyLinked() {
        first = null;
        last = null;
    }

    public void insertFirst(long key) {
        Link newLink = new Link(key);
        if (isEmpty()) {
            last = newLink;
        } else {
            first.previous = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(long key) {
        Link newLink = new Link(key);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
            newLink.previous = last;
        }
        last = newLink;
    }

    public void display() {
        Link current = first;
        System.out.println("DoubleLinkedList: ");
        while (current != null) {
            current.display();
            current = current.next;
        }
        System.out.println(" ");
    }

    public long deleteFirst() {
        Link temp = first;
        if (first.next == null) {
            last = null;
        } else {
            first.next.previous = null;
        }
        first = first.next;
        return temp.getdData();
    }

    public long deleteLast() {
        Link temp = last;
        if (first.next == null) {
            last = null;
        } else {
            last.previous.next = null;
        }
        last = last.previous;
        return temp.getdData();
    }

    public long deleteKey(long key) {
        return 0;
    }

    public boolean isEmpty() {
        return first == null;
    }
}

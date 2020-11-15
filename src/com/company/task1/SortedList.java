package com.company.task1;

public class SortedList {
    private Link first;

    public Link getFirst() {
        return first;
    }

    public SortedList() {
        first = null;
    }

    public void insert(long key) {
        Link newLink = new Link(key);
        Link current = first;
        Link previous = null;
        while (current != null && key > current.dData) {
            previous = current;
            current = current.next;
        }
        if (previous == null) {
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    public long delete(long key) {
        Link current = first;
        Link previous = null;
        while (current != null) {
            if (current.dData == key) {
                if (previous == null) {
                    first = first.next;
                } else {
                    previous.next = current.next;
                }
                return current.dData;
            }
            previous = current;
            current = current.next;
        }
        return 0;
    }

    public void display() {
        Link current = first;
        while (current != null) {
            System.out.print(current.dData + " ");
            current = current.next;
        }
        System.out.println("");
    }

    public boolean isEmpty() {
        return first == null;
    }
}

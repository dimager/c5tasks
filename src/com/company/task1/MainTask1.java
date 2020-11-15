package com.company.task1;

public class MainTask1 {
    public static void main(String[] args) {
        {
//        SortedList sl = new SortedList();
//        sl.insert(10);
//        sl.insert(20);
//        sl.insert(30);
//        sl.delete(9);
//        sl.insert(25);
//        sl.insert(15);
//        sl.display();
//
//        sl.delete(30);
//
//        sl.display();
            PriorityQ pq = new PriorityQ();
            pq.insert(6);
            pq.insert(14);
            pq.insert(8);
            pq.insert(11);
            pq.insert(22);
            pq.insert(3);
            pq.display();
            System.out.println("pq.remove() = " + pq.remove());
            pq.display();
        }
    }
}

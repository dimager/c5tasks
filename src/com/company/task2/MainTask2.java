package com.company.task2;

public class MainTask2 {
    public static void main(String[] args) {
        doublyLinked dl = new doublyLinked();
        dl.insertFirst(12);
        dl.display();
        dl.insertFirst(7);
        dl.insertFirst(9);
        dl.insertFirst(16);
        dl.display();
        dl.insertLast(44);
        dl.insertLast(34);
        dl.insertLast(23);
        dl.insertFirst(11);
        dl.display();


    }


}

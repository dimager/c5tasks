package com.company.task1;

public class PriorityQ {
    SortedList sr = new SortedList();
    public void insert (long key){
        sr.insert(key);
    }

    public long remove(){
        long key = sr.getFirst().dData;
        sr.delete(key);
        return key;
    }

    public void display (){
        System.out.println("PriorityQ: ");
        sr.display();
    }

}

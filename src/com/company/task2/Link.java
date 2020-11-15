package com.company.task2;

public class Link {
    public long dData;
    public Link next;
    public Link previous;

    public Link(long key) {
        dData=key;
    }

    public long getdData() {
        return dData;
    }

    public void display (){
        System.out.print(dData + " ");
    }

}

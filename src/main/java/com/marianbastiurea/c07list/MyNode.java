package com.marianbastiurea.c07list;

public class MyNode<E> {
    public E data;
    public MyNode<E> next;
    public MyNode<E> previous;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

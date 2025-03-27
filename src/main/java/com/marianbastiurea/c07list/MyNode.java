package com.marianbastiurea.c07list;

class MyNode<E> {
    private E data;
    private MyNode<E> next;
    private MyNode<E> previous;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}

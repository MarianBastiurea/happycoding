package com.marianbastiurea.c07list;


public class MyLinkedList<E> {
    private static class MyNode<E> {
        private E data;
        private MyNode<E> next;
        private MyNode<E> previous;

        private MyNode(E data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }

    private MyNode<E> head;
    private MyNode<E> tail;
    private int size;

    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public void addLast(E data) {
        MyNode<E> newNode = new MyNode<>(data);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        size++;
    }

    public void addFirst(E data) {
        MyNode<E> newNode = new MyNode<>(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
            head = newNode;
        }
        size++;
    }

    public void insertAt(int index, E data) {
        if (index <= 0) {
            addFirst(data);
            return;
        }
        if (index >= size) {
            addLast(data);
            return;
        }

        MyNode<E> newNode = new MyNode<>(data);
        MyNode<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        newNode.next = current;
        newNode.previous = current.previous;
        if (current.previous != null) {
            current.previous.next = newNode;
        }
        current.previous = newNode;

        if (index == 0) {
            head = newNode;
        }

        size++;
    }

    public boolean search(E data) {
        MyNode<E> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public void remove(E data) {
        MyNode<E> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current.previous != null) {
                    current.previous.next = current.next;
                } else {
                    head = current.next;
                }

                if (current.next != null) {
                    current.next.previous = current.previous;
                } else {
                    tail = current.previous;
                }

                size--;
                return;
            }
            current = current.next;
        }
    }

    public void reverse() {
        MyNode<E> temp = null;
        MyNode<E> current = head;
        tail = head;
        while (current != null) {
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        if (temp != null) {
            head = temp.previous;
        }
    }
}

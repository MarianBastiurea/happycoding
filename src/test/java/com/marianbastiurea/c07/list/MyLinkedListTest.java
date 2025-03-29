package com.marianbastiurea.c07.list;

import com.marianbastiurea.c07list.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList<>();
    }

    @Test
    void add10AsFirstElementInEmptyListSizeShouldBe1() {
        list.addFirst(10);

        assertEquals(1, list.getSize());
        assertEquals(10, list.getHead());
        assertEquals(10, list.getTail());
    }

    @Test
    void testAdd20AsFirstElementThan10ShouldBeLastElement() {
        list.addFirst(10);
        list.addFirst(20);

        assertEquals(20, list.getHead());
        assertEquals(10, list.getTail());
    }

    @Test
    void add40AsLastElement() {
        list.addFirst(30);
        list.addLast(40);

        assertEquals(30, list.getHead());
        assertEquals(40, list.getTail());
    }

    @Test
    void insertAtIndex1() {
        list.addFirst(10);
        list.addFirst(30);
        list.insertAt(1, 20);

        assertEquals(30, list.getHead());
        assertEquals(10, list.getTail());
    }

    @Test
    void searchFor10ShouldReturnTrue() {
        list.addLast(10);
        list.addLast(20);

        assertTrue(list.search(10));
        assertTrue(list.search(20));
    }

    @Test
    void searchFor30ShouldReturnFalse() {
        list.addLast(10);
        list.addLast(20);

        assertFalse(list.search(30));
    }

    @Test
    void removeFirstElementThanSecondElementBecomeFirst() {
        list.addFirst(10);
        list.addLast(20);
        list.remove(10);

        assertFalse(list.search(10));
        assertEquals(20, list.getHead());
    }

    @Test
    void ifReverseAListLastElementBecomeFirstElement() {
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();

        assertEquals(30, list.getHead());
        assertEquals(10, list.getTail());
    }
}

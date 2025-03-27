package com.marianbastiurea.c07.list;

import com.marianbastiurea.c07list.MyLinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;

import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    private MyLinkedList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new MyLinkedList<>();
    }

    private <T> T getPrivateField(Object obj, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = obj.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        return (T) field.get(obj);
    }

    @Test
    void add10AsFirstElementInEmptyListSizeShouldBe1() throws NoSuchFieldException, IllegalAccessException {
        list.addFirst(10);

        Object head = getPrivateField(list, "head");
        Integer size = getPrivateField(list, "size");

        assertEquals((Integer) 10, getPrivateField(head, "data"));
        assertEquals((Integer) 1, size);
    }

    @Test
    void testAdd20AsFirstElementThan10ShouldBeLastElement() throws NoSuchFieldException, IllegalAccessException {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addFirst(20);

        Object head = getPrivateField(list, "head");
        Object tail = getPrivateField(list, "tail");

        assertEquals((Integer) 20, getPrivateField(head, "data"));
        assertEquals((Integer) 10, getPrivateField(tail, "data"));
    }

    @Test
    void add40AsLastElement() throws NoSuchFieldException, IllegalAccessException {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(30);
        list.addLast(40);

        Object head = getPrivateField(list, "head");
        Object tail = getPrivateField(list, "tail");

        assertEquals((Integer) 30, getPrivateField(head, "data"));
        assertEquals((Integer) 40, getPrivateField(tail, "data"));
    }

    @Test
    void insertAtIndex1() throws NoSuchFieldException, IllegalAccessException {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addFirst(30);
        list.insertAt(1, 20);

        Object head = getPrivateField(list, "head");
        Object nextNode = getPrivateField(head, "next");
        assertEquals((Integer) 20, getPrivateField(nextNode, "data"));

    }

    @Test
    void searchFor10ShouldReturnTrue() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        assertTrue(list.search(10));
    }

    @Test
    void searchFor30ShouldReturnFalse() {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        assertTrue(list.search(10));
        assertFalse(list.search(30));
    }

    @Test
    void removeFirstElementThanSecondElementBecomeFirst() throws NoSuchFieldException, IllegalAccessException {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addFirst(10);
        list.addLast(20);
        list.remove(10);

        Object head = getPrivateField(list, "head");
        int size = getPrivateField(list, "size");

        assertFalse(list.search(10));
        assertEquals(1, size);
        assertEquals((Integer) 20, getPrivateField(head, "data"));
    }

    @Test
    void ifReverseAListLastElementBecomeFirstElement() throws NoSuchFieldException, IllegalAccessException {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.reverse();

        Object head = getPrivateField(list, "head");
        Object tail = getPrivateField(list, "tail");

        assertEquals((Integer) 30, getPrivateField(head, "data"));
        assertEquals((Integer) 10, getPrivateField(tail, "data"));
    }


}

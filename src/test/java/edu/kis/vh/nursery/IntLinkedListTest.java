package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.nursery.list.IntLinkedList;

public class IntLinkedListTest {

    public static final int TEST_VALUE = 4;
    public static final int EMPTY_VALUE = IntLinkedList.EMPTY;

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();

        Assert.assertTrue(list.isEmpty());

        list.push(1);

        Assert.assertFalse(list.isEmpty());
    }

    @Test
    public void testPushAndTop() {
        IntLinkedList list = new IntLinkedList();

        list.push(TEST_VALUE);

        int result = list.top();
        Assert.assertEquals(TEST_VALUE, result);
    }

    @Test
    public void testTopOnEmpty() {
        IntLinkedList list = new IntLinkedList();

        int result = list.top();
        Assert.assertEquals(EMPTY_VALUE, result);
    }

    @Test
    public void testPopSingleElement() {
        IntLinkedList list = new IntLinkedList();

        list.push(TEST_VALUE);

        int result = list.pop();
        Assert.assertEquals(TEST_VALUE, result);

        Assert.assertTrue(list.isEmpty());
    }

    @Test
    public void testPopOnEmpty() {
        IntLinkedList list = new IntLinkedList();

        int result = list.pop();
        Assert.assertEquals(EMPTY_VALUE, result);
    }

    @Test
    public void testLifoOrder() {
        IntLinkedList list = new IntLinkedList();

        list.push(1);
        list.push(2);
        list.push(3);

        Assert.assertEquals(3, list.pop());
        Assert.assertEquals(2, list.pop());
        Assert.assertEquals(1, list.pop());
    }

    @Test
    public void testTopDoesNotRemoveElement() {
        IntLinkedList list = new IntLinkedList();

        list.push(TEST_VALUE);

        int first = list.top();
        int second = list.top();

        Assert.assertEquals(TEST_VALUE, first);
        Assert.assertEquals(TEST_VALUE, second);
    }
}
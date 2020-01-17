package data_structures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoublyCircularLinkedListTest {

    @Test
    public void testAddMethodShouldIncreaseTheSizeOfTheList() {
        DoublyCircularLinkedList<String> myLinkedList = new DoublyCircularLinkedList<>();

        myLinkedList.add("sdsdf");
        myLinkedList.add("dsdf");
        myLinkedList.add("hello");

        assertEquals(3, myLinkedList.size());
    }

    @Test
    public void testToString() {
        DoublyCircularLinkedList<String> myLinkedList = new DoublyCircularLinkedList<>();

        myLinkedList.add("world");
        myLinkedList.add("hello");
        myLinkedList.add("gat");

        assertEquals("[world, hello, gat]", myLinkedList.toString());
    }
}
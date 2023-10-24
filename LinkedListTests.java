import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests { 
    @Test
    public void testFirst() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        assertEquals(1, list.first());
    }

    @Test
    public void testLast() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        assertEquals(1, list.last());
    }
    
    @Test
    public void testFirst2() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        assertEquals(2, list.first());
    }

    @Test
    public void testLast2() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        assertEquals(1, list.last());
    }

    @Test
    public void testPrepend() {
        LinkedList list = new LinkedList();
        list.prepend(1);
        list.prepend(2);
        assertEquals(2, list.first());
        assertEquals(1, list.last());
    }

    @Test
    public void testAppend() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        assertEquals(1, list.first());
        assertEquals(2, list.last());
    }

    @Test
    public void testAppend2() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(1, list.first());
        assertEquals(3, list.last());
    }

    @Test
    public void testLength() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        assertEquals(2, list.length());
    }

    @Test
    public void testLength2() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.length());
    }

    @Test
    public void testLength3() {
        LinkedList list = new LinkedList();
        assertEquals(0, list.length());
    }

    @Test
    public void testToString() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        assertEquals("1 2 ", list.toString());
    }

    @Test
    public void testToString2() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals("1 2 3 ", list.toString());
    }

    @Test
    public void testToString3() {
        LinkedList list = new LinkedList();
        assertEquals("", list.toString());
    }


}

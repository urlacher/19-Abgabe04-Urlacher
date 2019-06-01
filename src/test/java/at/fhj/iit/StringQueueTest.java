package at.fhj.iit;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.NoSuchElementException;


/**
 * StringQueueTests for the Queue Implementation.
 * @author Thomas Urlacher
 * @version 1.0
 */
public class StringQueueTest {

    private StringQueue queueDefault;
    private StringQueue queueSizeTwo;
    private StringQueue queueSizeZero;
    private StringQueue queueSizeNegative;


    /**
     * Create new Instances:
     * - Default Value (maxsize 5)
     * - queueSizeTwo (maxsize 2)
     * @throws Exception
     */
    @Before
    public void setUp() throws Exception {
        queueDefault = new StringQueue();
        queueSizeTwo = new StringQueue(2);
    }


    /**
     * New Object with maxSize = 0
     * @throws Exception
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void queueSizeZero() throws Exception {
        queueSizeNegative = new StringQueue(0);
    }


    /**
     * New Object with maxSize = -2
     * @throws Exception
     */
    @Test (expected = IndexOutOfBoundsException.class)
    public void queueSizeNegative() throws Exception {
        queueSizeZero = new StringQueue(-2);
    }


    /**
     * Test with Default Constructor. More than 5 Elements
     */
    @Test
    public void offerDefault() {
        assertTrue(queueDefault.offer("Teststring"));
        assertTrue(queueDefault.offer("Teststring"));
        assertTrue(queueDefault.offer("Teststring"));
        assertTrue(queueDefault.offer("Teststring"));
        assertTrue(queueDefault.offer("Teststring"));
        assertFalse(queueDefault.offer("Teststring"));
        assertFalse(queueDefault.offer("Teststring"));
    }


    /**
     * Test with Queue Size 2.
     */
    @Test
    public void offerQueueSizeTwo() {
        assertTrue(queueSizeTwo.offer("Teststring"));
        assertTrue(queueSizeTwo.offer("Teststring"));
        assertFalse(queueSizeTwo.offer("Teststring"));
        assertFalse(queueSizeTwo.offer("Teststring"));
    }

    /**
     * Inserting 5 Strings into Default Queue. Testing the right order when removing.
     */
    @Test
    public void pollDefault() {
        assertTrue(queueDefault.offer("Teststring1"));
        assertTrue(queueDefault.offer("Teststring2"));
        assertTrue(queueDefault.offer("Teststring3"));
        assertTrue(queueDefault.offer("Teststring4"));
        assertTrue(queueDefault.offer("Teststring5"));
        assertEquals(queueDefault.remove(),"Teststring1");
        assertEquals(queueDefault.remove(),"Teststring2");
        assertEquals(queueDefault.remove(),"Teststring3");
        assertEquals(queueDefault.remove(),"Teststring4");
        assertEquals(queueDefault.remove(),"Teststring5");
        assertNull(queueDefault.peek());
    }

    /**
     * Inserting 2 Strings into Default Queue. Testing the right order when removing.
     */
    @Test
    public void QueueSizeTwo() {
        assertTrue(queueSizeTwo.offer("Teststring1"));
        assertTrue(queueSizeTwo.offer("Teststring2"));
        assertEquals(queueSizeTwo.remove(),"Teststring1");
        assertEquals(queueSizeTwo.remove(),"Teststring2");
        assertNull(queueSizeTwo.peek());
    }

    /**
     * Removing element form empty queue.
     */
    @Test (expected = NoSuchElementException.class)
    public void removeDefault() throws Exception {
        queueDefault.remove();
    }

    /**
     * Removing element form empty queue.
     */
    @Test (expected = NoSuchElementException.class)
    public void removeQueueSizeTwo() throws Exception {
        queueSizeTwo.remove();
    }

    /**
     * Get next Item from Queue, Remove Item and than check if return null
     * Test with Default Size 5
     */
    @Test
    public void peekDefault() {
        queueDefault.offer("Test1");
        assertEquals(queueDefault.peek(),"Test1");
        queueDefault.offer("Test2");
        assertEquals(queueDefault.peek(),"Test1");
        queueDefault.offer("Test3");
        assertEquals(queueDefault.peek(),"Test1");
        queueDefault.offer("Test4");
        assertEquals(queueDefault.peek(),"Test1");
        queueDefault.offer("Test5");
        assertEquals(queueDefault.peek(),"Test1");
        queueDefault.remove();
        assertEquals(queueDefault.peek(),"Test2");
        queueDefault.remove();
        assertEquals(queueDefault.peek(),"Test3");
        queueDefault.remove();
        assertEquals(queueDefault.peek(),"Test4");
        queueDefault.remove();
        assertEquals(queueDefault.peek(),"Test5");
        queueDefault.remove();
        assertNull(queueDefault.peek());
    }

    /**
     * Get next Item from Queue, Remove Item and than check if return null
     * Test with Size 2
     */
    @Test
    public void peekQueueSizeTwo() {
        queueSizeTwo.offer("Test1");
        assertEquals(queueSizeTwo.peek(),"Test1");
        queueSizeTwo.offer("Test2");
        assertEquals(queueSizeTwo.peek(),"Test1");
        queueSizeTwo.remove();
        assertEquals(queueSizeTwo.peek(),"Test2");
        queueSizeTwo.remove();
        assertNull(queueSizeTwo.peek());
    }

    /**
     * Testing Element with empty queue.
     */
    @Test (expected = NoSuchElementException.class)
    public void elementDefault() throws Exception {
        queueDefault.element();
    }

    /**
     * Testing Element with empty queue.
     */
    @Test (expected = NoSuchElementException.class)
    public void elementQueueSizeTwo() throws Exception {
        queueSizeTwo.element();
    }

    /**
     * Teardown
     * @throws Exception
     */
    @After
    public void tearDown() throws Exception {
        queueDefault = queueSizeTwo = null;
    }

}

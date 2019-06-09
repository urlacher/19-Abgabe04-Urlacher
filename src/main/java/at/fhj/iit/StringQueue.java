package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * StingQueue implementation of the {@link Queue} Interface.
 * <p>
 * A Queue is a Data structure working on the FIFO (First in Fist Out) principal. This Queue is based on a
 * {@link java.util.ArrayList ArrayList}.
 *
 * @author Thomas Urlacher
 * @version 1.0
 */
public class StringQueue implements Queue {

    private static final Logger logger = LogManager.getLogger(StringQueue.class);
    private List<String> elements = new ArrayList<>();
    private int maxSize = 5;

    /**
     * Default Constructor. Maximum of 5 Strings could be stored in this Queue
     */
    public StringQueue() {
        logger.info("CONSTRUCTOR Default Constructor (maxSize 5)");

    }

    /**
     * Constructor sets maximum Size of Queue.
     *
     * @param maxSize Maximum Amount of String entries
     * @throws IllegalArgumentException Size must be greater than 0
     */
    public StringQueue(int maxSize) {
        logger.info("CONSTRUCTOR maxSize: " + maxSize);
        if (maxSize <= 0) {
            logger.error("CONSTRUCTOR New IndexOutOfBoundsException thrown: Size <= 0");
            throw new IllegalArgumentException("Size must be greater than 0");
        }
        this.maxSize = maxSize;
    }

    /**
     * Inserts a new queue element.
     *
     * @param obj Requires a new String
     * @return True if queue size smaller than maximum
     */
    @Override
    public boolean offer(String obj) {
        logger.info("OFFER new item: " + obj);
        if (elements.size() != maxSize) {
            elements.add(obj);
            return true;
        } else {
            logger.error("OFFER maxSize reached!");
            return false;
        }

    }

    /**
     * Return and Remove next queue element.
     *
     * @return String Value of the next Queue Item.
     */
    @Override
    public String poll() {
        String element = peek();
        logger.info("POLL Element: " + element);

        if (elements.size() > 0) {
            elements.remove(0);
        } else {
            logger.error("POLL No Element in Queue!");
        }

        return element;
    }

    /**
     * Return and Remove next queue element.
     *
     * @return String Value of the next Queue Item.
     * @throws NoSuchElementException If there is no element in the queue
     */
    @Override
    public String remove() {
        String element = poll();
        logger.info("REMOVE Element removed: " + element);
        if (element == null) {
            logger.error("REMOVE NoSuchElementException thrown");
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    /**
     * Examine the next queue element. (Does not remove Entry)
     *
     * @return String Value of the next Queue Item.
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
            logger.error("PEEK no peek element!");
        }
        logger.info("PEEK element: " + element);

        return element;
    }

    /**
     * Examine the next queue element. (Does not remove Entry)
     *
     * @return String Value of the next Queue Item.
     * @throws NoSuchElementException If there is no element in the queue
     */
    @Override
    public String element() {
        String element = peek();
        logger.info("ELEMENT element: " + element);
        if (element == null) {
            logger.error("ELEMENT NoSuchElementException");
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

}
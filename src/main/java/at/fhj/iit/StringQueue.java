package at.fhj.iit;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * StingQueue implementation of the {@link Queue} Interface.
 *
 * A Queue is a Data structure working on the FIFO (First in Fist Out) principal. This Queue is based on a
 * {@link java.util.ArrayList ArrayList}.
 *
 * @author Thomas Urlacher
 * @version 1.0
 *
 */
public class StringQueue implements Queue {
	
	private List<String> elements = new ArrayList<>();
	private int maxSize = 5;

	/**
	 * Default Constructor. Maximum of 5 Strings could be stored in this Queue
	 */
	public StringQueue(){

	}

	/**
	 *  Constructor sets maximum Size of Queue.
	 * @param maxSize Maximum Amount of String entries
	 */
	public StringQueue(int maxSize){
		this.maxSize = maxSize;
	}

	/**
	 * Inserts a new queue element.
	 * @param obj Requires a new String
	 * @return True if queue size smaller than maximum
	 */
	@Override
	public boolean offer(String obj) {
		if(elements.size()!= maxSize)
			elements.add(obj);
		else
			return false;
		
		return true;
	}

	/**
	 * Return and Remove next queue element.
	 * @return String Value of the next Queue Item.
	 */
	@Override
	public String poll() {
		String element = peek();

		if(elements.size() > 0){
			elements.remove(0);
		}

		return element;
	}

	/**
	 * Return and Remove next queue element.
	 * @throws NoSuchElementException If there is no element in the queue
	 * @return String Value of the next Queue Item.
	 */
	@Override
	public String remove() {
		String element = poll();		
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

	/**
	 * Examine the next queue element. (Does not remove Entry)
	 * @return String Value of the next Queue Item.
	 */
	@Override
	public String peek() {
		String element;
		if(elements.size() > 0)
			element = elements.get(0);
		else
			element = null;
		
		return element;
	}

	/**
	 * Examine the next queue element. (Does not remove Entry)
	 * @throws NoSuchElementException If there is no element in the queue
	 * @return String Value of the next Queue Item.
	 */
	@Override
	public String element() {
		String element = peek();
		if(element == null)
			throw new NoSuchElementException("there's no element any more");
		
		return element;
	}

}
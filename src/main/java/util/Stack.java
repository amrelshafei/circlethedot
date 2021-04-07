package util;

/**
 * The interface <b>Stack</b> for defining the abstraction of a stack data 
 * structure.
 *
 * @author  Amr ElShafei
 * @version 2.0
 * @since   March 28th, 2016
 */
public interface Stack<E> {

	/**
	 * Puts an element onto the top of this stack.
	 * @param element The element be put onto the top of this stack.
	 */
	void push(E element);
	
	/**
	 * Removes and returns the element at the top of the stack.
	 * @return The top element of the stack.
	 */
	E pop();
	
	/**
	 * Checks if the Stack is empty.
	 * @return true if this Stack is empty; and false otherwise.
	 */
    boolean isEmpty();
	
	/**
	 * Returns a reference to the top element.
	 * @return The top element of this stack without removing it.
	 */
	E peek();
	
	/**
	 * Returns the size of the elements in the stack.
	 * @return size of stack's elements.
	 */
    int size();
	
	/**
	 * Clears the stack from all elements.
	 */
	void clear();
	
}

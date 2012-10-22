/**
 * A basic Stack of Strings
 */
public interface IntStack {
    /*
     * Pushes a new int onto the stack
     */
    void push(int newInt);

    /*
     * Retrieves the last element from the stack and returns it. 
     * If the stack is empty, returns null.
     */
    int pop();

    /*
     * Returns the last element from the stack (does not remove it).
     * If the stack is empty, returns null.
     */
    int peek();

    /* 
     * Returns true if the stack contains no elements, 
     * false otherwise. 
     */
    boolean isEmpty();
}
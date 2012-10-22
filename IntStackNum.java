/**
 * A node in a dynamic singly-linked list of Int's
 */
public class IntStackNum {
    private int number;
    private IntStackNum next;

    public IntStackNum(int num) {
	  number = num;
	  next = null;
    }

    /**
     * Returns the int in this node
     */
    public int getNum() {
	  return number;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(IntStackNum num) {
	  next = num;		
    }

    /**
     * Set the next node to point to the given node
     */
    public IntStackNum getNext() {
	  return next;		
    }
}
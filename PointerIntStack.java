/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerIntStack implements IntStack {
    /**
     * The head of the stack: the visible node
     */
    private IntStackNum head;

    public PointerIntStack() {
	  head = null;
    }

    public void push(int newInt) {
	  IntStackNum newNum = new IntStackNum(newInt);
	  if (head != null) {
		newNum.setNext(head);
	  }
	  head = newNum;	  
    }

    public int pop() {
	  if (head == null) {
		return 0;
	  }
	  int result = head.getNum();
	  head = head.getNext();
	  return result;
    }

    public int peek() {
	  if (head == null) {
		return 0;
	  } else {
		return head.getNum();
	  }
    }

    public boolean isEmpty() {
	  if (getSize() == 0) {
		return true;
	  } else {
		return false;
	  }
    }

    /**
     * Returns the number of string in the stack
     */
    public int getSize() {
	  int result = 0;
	  IntStackNum currentNum = head;
	  while (currentNum != null) {
		currentNum = currentNum.getNext();
		result++;
	  }
	  return result;
    }
}
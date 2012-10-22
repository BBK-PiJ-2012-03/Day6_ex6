public class IntStackScript {
    public static void main(String[] args) {
	  IntStackScript script = new IntStackScript();
	  script.launch();
    }

    public void launch() {
	  IntStack firstStack = new PointerIntStack();
	  testStack(firstStack);

    }

    private void testStack(IntStack stack) {
	  System.out.println("Testing the stack..."); 
	  stack.push(1);
	  stack.push(2);
	  stack.push(3);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.push(4);
	  stack.push(5);
	  stack.push(6);
	  stack.push(7);
	  System.out.println("Visible element in the stack: '" + stack.peek() + "'");
	  stack.pop();
	  stack.pop();
	  stack.push(66);
	  stack.push(77);
	  stack.push(88);
	  stack.push(99);
	  stack.push(1010);
	  stack.push(1111);
	  System.out.println("Now let's see all the elements in the stack: ");
	  while (!stack.isEmpty()) {
		System.out.println("Next element: '" + stack.pop() + "'");
	  }
    }
}
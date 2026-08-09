class MinStack {
    private class Node {
        int data;
        int min; // Track the minimum value at this point in the stack
        Node next;
        
        Node(int data, int min) { 
            this.data = data; 
            this.min = min;
        }
    }

    private Node stackTop = null;

    public MinStack() {
        // Constructor remains empty
    }
    
    public void push(int val) {
        if (isEmpty()) {
            // If the stack is empty, the new value is the absolute minimum
            stackTop = new Node(val, val);
        } else {
            // The minimum at this node is the lesser of the new value and the previous minimum
            int currentMin = Math.min(val, stackTop.min);
            Node newNode = new Node(val, currentMin);
            newNode.next = stackTop;
            stackTop = newNode;
        }
    }
    
    public void pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        stackTop = stackTop.next;
    }
    
    public int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return stackTop.data;
    }
    
    public int getMin() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is Empty");
        }
        return stackTop.min; // O(1) constant time look up
    }

    public boolean isEmpty() {
        return stackTop == null;
    }
}

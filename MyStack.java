// stack implementation using arrays
public class MyStack {
    private Object[] elements;
    private int capacity; //size of the stack
    private int top; //index of the top of the stack

    public MyStack(int stackSize){
        elements = new Object[stackSize];
        capacity = stackSize;
        top = -1;
    }

    public void push(Object element){
        // check if the stack is full
        if(top == capacity - 1){
            // increase the size of the stack by 2x
            resize(capacity*2);
        }
        // increments the top and adds the new element at the top index
        elements[++top] = element;
    }

    public Object pop(){
        // checks if the stack is empty
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        Object popped = elements[top];
        // sets the current top to be null
        elements[top] = null;
        top--;
        // shrinks the stack size if the stack is less than a quarter full
        if (top < capacity / 4) {
            resize(capacity / 2);
        }
        return popped;
    }

    public Object peek(){
        // checks if the stack is empty
        if(top == -1){
            System.out.println("Stack is empty");
            return null;
        }
        return elements[top];
    }

    public boolean empty(){
        return top == -1;
    }

    // private method to resize the array if the elements inside reaches the limit
    private void resize(int newCapacity){
        // Initializes a new array
        Object[] newArray = new Object[newCapacity];
        // Copies the elements from the old array to the new array
        System.arraycopy(elements, 0, newArray, 0, top+1);
        // updates the current array to the new array
        elements = newArray;
        // updates the current capacity to the new capacity
        capacity = newCapacity;
    }
}
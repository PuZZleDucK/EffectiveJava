// 
import java.util.*;

public class ForgetToForget{
  public static void main(String args[]) {
    System.out.println("ForgetToForget");
    
    
    
  }
  
  
  public class Stack {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;
    public Stack() {
      elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }
    public void push(Object e) {
      ensureCapacity();
      elements[size++] = e;
    }
    public Object pop() {
      if (size == 0)
        throw new EmptyStackException();
//      return elements[--size];
// returning here could leak references if the stack grows before GC, lets null out the references first
      Object retVal = elements[--size];
      elements[size] = null;
      return retVal;
    }
    private void ensureCapacity() {
      if (elements.length == size)
        elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }//stack

  
}//class
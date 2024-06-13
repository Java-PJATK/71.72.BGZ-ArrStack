# BGZ-ArrStack

Another popular implementation of the stack is based on an array. This is illustrated in the program below. In the constructor, we allocate an array (with fixed size) and a field `top` which corresponds to the index of the first free ‘slot’ in the array (0 at the beginning). 

When pushing a new value, we insert it into the array at the position `top` and increment `top` by 1. When popping, we first decrement `top` and return the value from this position (which will then be treated as the first free ‘slot’). The downside of this implementation is the fact that the capacity of the stack will be limited.

### Listing 71: BGZ-ArrStack/ArrStack.java

```java
public class ArrStack {
    private int[] elems;
    private int top = 0;
    
    public ArrStack(int maxSize) {
        elems = new int[maxSize];
    }
    
    public void push(int e) {
        // throws if stack full
        elems[top++] = e;
    }
    
    public int pop() {
        // throws if stack empty
        return elems[--top];
    }
    
    public boolean empty() {
        return top == 0;
    }
}
```

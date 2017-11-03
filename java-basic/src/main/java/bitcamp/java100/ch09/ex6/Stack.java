package bitcamp.java100.ch09.ex6;

public class Stack {

    // 중첩클래스
    private class Box {
        Object value;
        Box next;
        
        public Box() {}
        
        public Box(Object value) {
            this.value = value;
        }
    }

    Box top;
    int len; //전체상자개수,길이
    
    
    public void push(Object value) {
        Box box = new Box(value);
        box.next = top;
        
        top = box;
        len++;
    }
    
    public int size() {
        return len;
    }

    public Object pop() {
        if (len ==  0)
            return null;

        Box box = top;
        
        top = top.next;
        
        len--;
        
        return box.value; 
    }

}    
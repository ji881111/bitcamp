package bitcamp.java100.ch09.ex2;

public class LinkedList {
    Box head;
    Box tail; //추가할때 빨리 찾기위해 마지막 박스주소를 따로 저장
    int len;

    public void add(Object value) {
        Box box = new Box();
        box.value = value;
        if (tail == null) {
            head = box;
            tail = box;

        } else {
            tail.next = box; // 현재 꼬리에서 상자를 가르키고 (첫번째 아니면)
            tail = box; // 꼬리값에 상자줌
        }
        len++;
    }

    public int size() {
        return len;
    }

    public Object get(int index) {
        if (index < 0 || index >= len)
            return null;

        Box box = head;
        for (int count = 1; count <= index; count++) { // 이동 count
            box = box.next;
        }
        return box.value; // 0번째라면, 기본이 0이닌깐
    }
    
    public void insert(int index, Object value) {
        if(index < 0 || index >= len)
            return;
        
        Box box = new Box();
        box.value = value;
        
        len++;
        
        if(index == 0) {
            box.next = head;
            head = box;
            return;
        }
        
        Box pre = head; //일단 처음엔 null, head > head를 알아야 그다음주소도 알수 있으닌깐
        for(int count = 1; count < index; count++) { //3을 알아내고 싶으면 그앞인 2를 알아야 함
           //기본이 head (0)이닌깐 1부터 한번
            pre = pre.next;
        }
        
        box.next = pre.next;
        pre.next = box;
    }
    
    public Object remove(int index) {
        if(index < 0 || index >= len)
            return null;
        
        len--;
        Box removedBox;
        
        if(index == 0) {
            removedBox = head;
            head = head.next;
            return removedBox.value;
        }
        
        Box pre = head;
        
        for(int count = 1; count < index; count++) {
            pre = pre.next;
        }
        removedBox = pre.next;
        pre.next = pre.next.next;
        
        if(index == len -1) {
            tail = pre;
        }
        return removedBox.value;
    }
}
    //public Object remove(int index) {
        
   // }

    /*
     public void insert(int index, Object value) {
     
        Box pre = head;
        Box aft;
        Box inser = new Box();
        inser.value = value;

        if (index == 0) {
            inser.next = head;
            head = inser;
        } else {
            for (int i = 0; i < index - 1; i++)
                pre = pre.next;
            aft=pre.next;
            inser.next = aft;
            pre.next = inser;
        }
        len++;
    }

    public Object remove(int index) {

        Box pre = head;
        Box aft;
        Box del = new Box();
        if (index == 0) {
            head = head.next;
        } else {
            for (int i = 0; i < index - 1; i++)
                pre = pre.next;
            del = pre.next;
            aft = del.next;
            pre.next = aft;
        }
        len--;
        return del.value;
    }
    */


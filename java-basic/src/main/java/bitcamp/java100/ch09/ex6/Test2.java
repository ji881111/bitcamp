package bitcamp.java100.ch09.ex6;

public class Test2 {

    public static void main(String[] args) {
        
        Stack2<Contact> contacts = new Stack2<>();
        contacts.push(new Contact("홍길동","hong@test.com", "1111-1111"));
        contacts.push(new Contact("임꺽정","leem@test.com", "1111-1112"));
        contacts.push(new Contact("유관순","yoo@test.com", "1111-1113"));
        
        //contacts.push(new String("안중근"));
        //contacts.push(new Boolean(true));
        
        Contact c = contacts.pop();
        
        Stack2<Book> bookStack = new Stack2<>();
        bookStack.push(new Book());
        bookStack.push(new Book());
        
        //bookStack.push(new String()); 다른타입 컴파일 오류
        
        Book b1 = bookStack.pop();
        Book b2 = bookStack.pop();
        
        
        Stack2<Score> scoreStack = new Stack2<>();
        scoreStack.push(new Score());
        scoreStack.push(new Score());
        
        
        Score s1 = scoreStack.pop();
        Score s2 = scoreStack.pop();
        
    }
}

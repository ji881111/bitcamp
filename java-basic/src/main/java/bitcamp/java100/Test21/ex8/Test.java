package bitcamp.java100.Test21.ex8;

import java.io.Console;

public class Test {

    static Console console;

    static void printContacts() {
        for (int i = 0; i < ContactArray.size(); i++) {
            Contact contact = ContactArray.get(i);
            System.out.printf("%s,%s,%s\n", contact.name, contact.email, contact.tel);
        }
    }

    static boolean confirm(String message) {
        String input = console.readLine(message + "(y/n)");
        if ((input.toLowerCase().equals("y") || input.toLowerCase().equals("yes")))
            return true;
        return false;
    }

    static Contact inputContact() {
        Contact contact = new Contact();

        contact.name = console.readLine("이름? ");
        contact.email = console.readLine("이메일? ");
        contact.tel = console.readLine("전화? ");

        return contact;
    }

    public static void main(String[] args) {

        console = System.console();

        if (console == null) {
            System.err.println("콘솔을 지원하지 않습니다.");
            System.exit(1); // JVM종료
        }

        while (true) {

            Contact contact = inputContact();

            if (confirm("저장하시겠습니까?")) {
                try {
                    ContactArray.add(contact);
                } catch (RuntimeException e) {
                    System.err.println("최대 저장 개수를 초과하였습니다.");
                    break;
                }
            }

            if (!confirm("계속 입력하시겠습니까?")) // 계속 입력하지 않겠다면 브레이크하라. 저 질문에 참이 아니라면,(질문해석 중요)
                break;
        }
        printContacts();
    }
}

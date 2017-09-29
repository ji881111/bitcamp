package bitcamp.java100;

public class Test12_9 {
    public static void main(String[] args){

    char c1;
    c1=44032;
    
    char c2=0xac00;

    System.out.println(c1);
    System.out.println(c2);

    char n1,n2,n3;
    n1=0xD669;
    n2=0xC9C0;
    n3=0xC740;

    System.out.printf("%c %c %c\n",n1,n2,n3);

    n1='황'; n2='지'; n3='은';
    System.out.printf("%c %c %c\n",n1,n2,n3);
 
    char x='7';
    int num;
    num=x-'0'; //문자 0의 유니코드 값이 48임. 0이 48부터 시작하므로 빼줘야함.
    System.out.println(num);

    }    
}
package bitcamp.java100;

public class Test17_6 {

    static int[] m1() {
        int[] values = { 100, 90, 80 }; // 선언이랑 초기화 같이 해야함

        int[] values2;
        // values2 = {100, 90, 80}; 변수를 선언한 후에 따로 만들수는 없음.
        values2 = new int[] { 100, 90, 80 }; // 이거는 가능!

        return new int[] { 100, 90, 80 }; // 배열을 만들어서 리턴하고 싶을때

        // 주의. 배열의 주소값이 리턴되는것임
    }

    public static void main(String[] args) {
        int[] arr = m1();
        for(int i : arr) {
            System.out.println(i); //값을 여러개 리턴하고 싶으면 배열로 리턴
        }
        
        

    }
}
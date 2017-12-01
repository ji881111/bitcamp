package bitcamp.java100.ch16.ex1;

import bitcamp.java100.ch16.ex1.Test4.MyThread;

public class Test5 {

    static class Result {
        int sum;
    }

    static Result result = new Result();

    static class MyThread extends Thread {

        public MyThread(String name) {
            super(name);
        }

        @Override
        public void run() {
            synchronized (result) {
                for (int i = 1; i < 11; i++) {
                    System.out.printf("%s(%d)\n", this.getName(), i);
                    result.sum += i;
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {}
                }

                this.notify();
            }
        }
    }

    public static void main(String[] args) throws Exception {

        MyThread t = new MyThread("꽃님이");
        t.start();

        synchronized (result) {
            result.wait();
            System.out.println("합계 = " + result.sum);
        }

    }
}

//Class to demonstrate use of thread using lambda expression.
package com.github.yasar.lambda;

class myThread implements Runnable{

    @Override
    public void run() {
        System.out.println("Running Thread from non-lambda method.");
    }
}


public class LambdaThread {

    public static void main(String[] args) {

        myThread obj = new myThread();

        Thread thread1 = new Thread(obj);

        thread1.start();

        Runnable thread2 = () -> {
            System.out.println("Running thread using Lambda Expression.");
        };

        thread2.run();

    }



}

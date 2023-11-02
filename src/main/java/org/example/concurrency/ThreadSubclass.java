package org.example.concurrency;

public class ThreadSubclass extends Thread {
    @Override
    public void run() {
//        System.out.println("Hello from a thread!");
        for(int i=0; i<1000; i++) {
            System.out.println(i);
        }
    }
    public static void main(String args[]) {
        (new ThreadSubclass()).start();
    }
}


package org.example.concurrency;

public class ThreadScheduling {
    public static void main(String[] args) {
        (new ThreadSubclass()).start();
        (new ThreadSubclass()).start();
        (new ThreadSubclass()).start();
    }
}

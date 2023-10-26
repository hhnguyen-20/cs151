package org.example.design_patterns;

public class SingletonRace {
    public static void main(String[] args) {
        new Thread(() -> {
            MySingleton.getInstance();
        }).start();
        new Thread(() -> {
            MySingleton.getInstance();
        }).start();
        MySingleton.getInstance();
    }
}

class MySingleton {
    private static MySingleton instance;

    private MySingleton() {
        System.out.println("New instance created by " + Thread.currentThread().threadId());
    }

    public static MySingleton getInstance() {
        if(instance == null) {
            instance = new MySingleton();
        }
        return instance;
    }
}

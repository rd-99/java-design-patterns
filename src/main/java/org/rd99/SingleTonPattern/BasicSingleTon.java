package org.rd99.SingleTonPattern;

public class BasicSingleTon {
    private static BasicSingleTon instance;

    private BasicSingleTon() {
        System.out.println("Creating BasicSingleTon instance");
    }

    public static BasicSingleTon getInstance() {
        if (instance == null) {
            instance = new BasicSingleTon();
        }
        return instance;
    }
}
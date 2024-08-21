package org.rd99.SingleTonPattern;

public class SerializationProblem {

    private SerializationProblem() {
        System.out.println("Creating SerializationProblem instance");
    }
    private static final SerializationProblem instance = new SerializationProblem();

    public static SerializationProblem getInstance() {
        return instance;
    }
    private int value = 0;
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }  
    
    
    
}


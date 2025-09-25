package com.example.generic;

public class IntegerConsumer implements Consumer<String> {

    @Override
    public void consume(String parameter) {
        System.out.println("Consuming String: " + parameter);
    }
}

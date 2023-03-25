package org.Main;

import Users.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producer producer = new Producer("Alex");
        Consumer consumer = new Consumer("John", new ArrayList<>());
        var producer_thread = new Thread(producer);
        var consumer_thread = new Thread(consumer);
        producer_thread.start();
        consumer_thread.start();
    }
}

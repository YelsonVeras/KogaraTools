package edu.utesa.lib.hilos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    private static List<String> products = new ArrayList<>();
    private static Producer producer = new Producer(products);
    private static Consumer consumer = new Consumer(products);
    private static Thread t0 = new Thread(producer);
    private static Thread t1 = new Thread(consumer);
    private static Thread t2 = new Thread(consumer);
    private static Thread t3 = new Thread(consumer);

    public static void main(String[] args) {
        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

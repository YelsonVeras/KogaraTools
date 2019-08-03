package edu.utesa.lib.hilos;

import java.util.List;

public class Producer implements Runnable {
    private List<String> products;
    private int count = 0;

    public Producer(List<String> products) {
        this.products = products;
    }

    @Override
    public void run() {
        while (true) try {
            Thread.sleep(4000);
            synchronized (products) {
                count++;
                products.add("producto" + count);
                products.notify();
                System.out.println("Add the product in list");
            }
        } catch (Exception ignored) {

        }
    }
}

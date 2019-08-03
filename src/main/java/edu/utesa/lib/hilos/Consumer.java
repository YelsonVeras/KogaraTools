package edu.utesa.lib.hilos;

import java.util.List;

public class Consumer implements Runnable {
    private List<String> products;
    private int count = 0;

    public Consumer(List<String> products) {
        this.products = products;
    }

    @Override
    public void run() {
        try {
            synchronized (products) {
                if (products.size() == 0) {
                    System.out.println("No hay producto para consuumir");
                    products.wait();
                }

                System.out.println(products.get(0) + ": Se consumira");
                products.remove(0);
            }

        } catch (Exception ignored) {
        }
    }
}

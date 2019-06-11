package edu.utesa.lib;

import edu.utesa.lib.models.Pair;
import edu.utesa.lib.statistics.Statistics;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class HarborDunes {
    BigDecimal renew25GreenPrice = BigDecimal.valueOf(25.00);
    BigDecimal renew25AutoPrice = BigDecimal.valueOf(20.00);
    BigDecimal renew50GreenPrice = BigDecimal.valueOf(50.00);
    BigDecimal renew50AutoPrice = BigDecimal.valueOf(20.00);

    private static List<Pair> renew25 = Arrays.asList(
            new Pair("0", 0.01),
            new Pair("1", 0.03),
            new Pair("2", 0.05),
            new Pair("3", 0.05),
            new Pair("4", 0.11),
            new Pair("5", 0.15),
            new Pair("6", 0.17),
            new Pair("7", 0.15),
            new Pair("8", 0.13),
            new Pair("9", 0.09),
            new Pair("10", 0.06)
    );
    private static List<Pair> renew50 = Arrays.asList(
            new Pair("0", 0.06),
            new Pair("1", 0.09),
            new Pair("2", 0.12),
            new Pair("3", 0.17),
            new Pair("4", 0.20),
            new Pair("5", 0.13),
            new Pair("6", 0.11),
            new Pair("7", 0.07),
            new Pair("8", 0.05)
    );

    private static List<Integer> renew25Result = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
    private static List<Integer> renew50Result = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0);

    public static void main(String[] args) {
        for (int i = 0; i < 500; i++) {
            int position = Integer.parseInt(Statistics.probabilityStatistic(renew25));
            renew25Result.set(position, (renew25Result.get(position) + 1));

            int position1 = Integer.parseInt(Statistics.probabilityStatistic(renew50));
            renew50Result.set(position1, (renew50Result.get(position1) + 1));
        }

        AtomicInteger i = new AtomicInteger();
        renew25Result.forEach(e -> {
            System.out.println(i + "\t" + (e / 500D) * 100 + "%");
            i.getAndIncrement();
        });
        System.out.println();
        System.out.println();
        i.set(0);
        renew50Result.forEach(e -> {
            System.out.println(i + "\t" + (e / 500D) * 100 + "%");
            i.getAndIncrement();
        });
    }
}

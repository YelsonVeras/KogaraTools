package edu.utesa.lib.statistics;

import java.util.concurrent.ThreadLocalRandom;

public class Tools {
    public static double getRandomStatistical() {
        return ThreadLocalRandom.current().nextDouble(1);
    }
}

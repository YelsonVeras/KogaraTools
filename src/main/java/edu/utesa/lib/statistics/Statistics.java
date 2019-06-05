package edu.utesa.lib.statistics;

import edu.utesa.lib.models.Pair;

import java.util.List;

public class Statistics {

    public static boolean binomialProbability(double yes, double no) {
        return binomialProbability(yes);
    }

    public static boolean binomialProbability(double yes) {
        return Tools.getRandomStatistical() < yes;
    }

    public static boolean poissonProbability() {
        return true;
    }

    public static String probabilityStatistic(List<Pair> list) {
        double count = 0.0;
        double random = Tools.getRandomStatistical();
        for (Pair pair : list) {
            count += pair.getValue();
            if (random <= count) {
                return pair.getKey();
            }
        }
        return "0";
    }

    public static double uniformProbability(long minValue, long maxValue) {
        long rank = maxValue - minValue;
        return minValue + (rank * Tools.getRandomStatistical());
    }

    public static double normalProbability(long miu, long deviation) {
        return miu + (deviation * negative() * Tools.getRandomStatistical());
    }

    private static int negative() {
        return binomialProbability(0.5) ? 1 : -1;
    }

    public static boolean exponentialProbability() {
        return true;
    }
}

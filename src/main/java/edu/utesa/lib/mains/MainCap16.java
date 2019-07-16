package edu.utesa.lib.mains;

import edu.utesa.lib.statistics.Statistics;

public class MainCap16 {

    private static double[] winnerProb = {0.6, 0.55, 0.48, 0.45, 0.48, 0.55, 0.50};
    private static double earned = 0;
    private static double essays = 100;

    public static void main(String[] args) {
        int i = 0;
        while (i < essays) {
            int win = 0;
            for (double winProb : winnerProb) {
                if (Statistics.binomialProbability(0.60)) {
                    win++;
                }
            }
            evaluate(win);
            i++;
        }
        result();
    }

    private static void evaluate(int win) {
        if (win > 3) {
            earned++;
            System.out.println("Win");
        } else {
            System.out.println("Lost");
        }
    }

    private static void result() {
        System.out.println(earned / essays);
    }
}

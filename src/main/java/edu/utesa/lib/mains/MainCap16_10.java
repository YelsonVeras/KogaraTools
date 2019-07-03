package edu.utesa.lib.mains;

import edu.utesa.lib.statistics.Statistics;

public class MainCap16_10 {

    private static double[] winnerProb = {0.5247,
            0.9925,
            0.1241,
            0.1514,
            0.5027,
            0.7790,
            0.4086,
            0.5250,
            0.5181,
            0.0341};

    public static void main(String[] args) {
        Statistics.uniformProbability(12, 28);
    }
}

package edu.utesa.lib.mains;

import edu.utesa.lib.statistics.Statistics;

import java.math.BigDecimal;

public class TriStateCorporation {
    private static int workYear = 35;
    private static int age = 25;
    private static BigDecimal salary = BigDecimal.valueOf(34_000);
    private static BigDecimal portfolio = BigDecimal.valueOf(14_500);
    private static BigDecimal annualSalaryIncrement = BigDecimal.valueOf(0.05);
    private static BigDecimal annualInvestment = BigDecimal.valueOf(0.04);
    private static BigDecimal annualPortfolioInvestment = BigDecimal.valueOf(0.10);

    public static void main(String[] args) {
        System.out.println("salary = " + salary);
        System.out.println("portfolio = " + portfolio);
        System.out.println("annualSalaryIncrement = " + annualSalaryIncrement);
        System.out.println("annualInvestment = " + annualInvestment);
        System.out.println("annualPortfolioInvestment = " + annualPortfolioInvestment);

        System.out.println();
        System.out.println();

//        setVariationAnnualInvestment(8); // Para obtener un 1,000,000 a 30 year

        System.out.println("year\t age\t portfolio\t salary\t salaryIn\t investment\t earning\t invAnnual\t final\t");
        for (int i = 0; i < workYear; i++) {
            setVariationAnnualSalaryIncrement((int) Statistics.uniformProbability(0, 10)); //Aplicando la variabilidad de 0 a 10 en taza de crediminto anual del salario
            setVariationAnnualPortfolioInvestment((int) Statistics.normalProbability(10, 5)); //
            System.out.print(i + 1 + "\t\t ");
            System.out.print(age + i + "\t\t ");
            System.out.print(portfolio.setScale(0, BigDecimal.ROUND_HALF_UP) + "\t\t ");
            System.out.print(salary.setScale(0, BigDecimal.ROUND_HALF_UP) + "\t ");
            System.out.print(annualSalaryIncrement + "\t\t ");

            BigDecimal investment = salary.multiply(annualInvestment);
            System.out.print(investment.setScale(0, BigDecimal.ROUND_HALF_UP) + "\t\t ");
            BigDecimal earning = investment.multiply(BigDecimal.valueOf(0.5)).add(portfolio).multiply(annualPortfolioInvestment);
            System.out.print(earning.setScale(0, BigDecimal.ROUND_HALF_UP) + "\t\t");
            System.out.print(annualPortfolioInvestment + " \t\t ");

            BigDecimal result = portfolio.add(investment).add(earning);
            System.out.print(result.setScale(0, BigDecimal.ROUND_HALF_UP) + "\t ");
            System.out.println();
            increment(result);
        }
    }

    private static void setVariationAnnualInvestment(double n) {
        annualInvestment = BigDecimal.valueOf(n / 100);
    }

    private static void setVariationAnnualSalaryIncrement(double n) {
        annualSalaryIncrement = BigDecimal.valueOf(n / 100);
    }

    private static void setVariationAnnualPortfolioInvestment(double n) {
        annualPortfolioInvestment = BigDecimal.valueOf(n / 100);
    }

    private static void increment(BigDecimal newPortfolioValue) {
        salary = salary.multiply(annualSalaryIncrement).add(salary);
        portfolio = newPortfolioValue;
    }
}

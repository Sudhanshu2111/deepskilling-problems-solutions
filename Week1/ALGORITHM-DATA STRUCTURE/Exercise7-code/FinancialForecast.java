

public class FinancialForecast {

   
    public static double futureValueRecursive(double PV, double[] rates, int n) {
        if (n == 0) {
            return PV;
        }

        double prevValue = futureValueRecursive(PV, rates, n - 1);
        return prevValue * (1 + rates[n - 1]);
    }

    public static void main(String[] args) {
        double presentValue = 1_000.0;
        double[] growthRates = { 0.05, 0.03, 0.07 }; 

        double fv = futureValueRecursive(presentValue, growthRates, growthRates.length);
        System.out.printf("Future Value after %d periods: %.2f%n", growthRates.length, fv);
    }
}

public class Main {
    public static void main(String[] args) {
        double currentValue = 10000;
        double growthRate = 0.08; // 8%
        int years = 5;

        double future = Forecast.predictFutureValue(currentValue, growthRate, years);
        System.out.println("Projected Future Value after " + years + " years: ₹" + future);
    }
}

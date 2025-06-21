class Forecast {
    public static double predictFutureValue(double currentValue, double rate, int years) {
        if (years == 0) return currentValue;
        return predictFutureValue(currentValue, rate, years - 1) * (1 + rate);
    }
}

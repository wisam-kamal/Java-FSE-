public class Main {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp("User1");
        Observer webApp = new WebApp("User2");

        stockMarket.registerObserver(mobileApp);
        stockMarket.registerObserver(webApp);

        stockMarket.setStockPrice("AAPL", 172.5);
        System.out.println();

        stockMarket.setStockPrice("AAPL", 174.0);
        System.out.println();

        stockMarket.removeObserver(webApp);
        stockMarket.setStockPrice("AAPL", 175.5);
    }
}

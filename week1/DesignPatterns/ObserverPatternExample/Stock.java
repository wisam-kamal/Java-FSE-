import java.util.*;

interface Stock {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(String stockName, double newPrice);
    void setStockPrice(String stockName, double newPrice);
}

interface Observer {
    void update(String stockName, double newPrice);
}

class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private Map<String, Double> stockPrices = new HashMap<>();

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String stockName, double newPrice) {
        for (Observer o : observers) {
            o.update(stockName, newPrice);
        }
    }

    public void setStockPrice(String stockName, double newPrice) {
        stockPrices.put(stockName, newPrice);
        notifyObservers(stockName, newPrice);
    }
}

class MobileApp implements Observer {
    private String username;

    public MobileApp(String username) {
        this.username = username;
    }

    public void update(String stockName, double newPrice) {
        System.out.println("MobileApp - " + username + ": " + stockName + " price updated to $" + newPrice);
    }
}

class WebApp implements Observer {
    private String username;

    public WebApp(String username) {
        this.username = username;
    }

    public void update(String stockName, double newPrice) {
        System.out.println("WebApp - " + username + ": " + stockName + " price updated to $" + newPrice);
    }
}

public class Main {

    public static void main(String[] args) {

        StockMarket stockMarket = new StockMarket();

        Observer mobileUser = new MobileApp("Hari");
        Observer webUser = new WebApp("Admin");

        stockMarket.registerObserver(mobileUser);
        stockMarket.registerObserver(webUser);

        stockMarket.setStockPrice("TCS", 4200.50);

        System.out.println();

        stockMarket.setStockPrice("INFY", 1850.75);
    }
}
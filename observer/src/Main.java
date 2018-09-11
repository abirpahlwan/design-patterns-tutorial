public class Main {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer_1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.00);
        stockGrabber.setGOOGPrice(676.00);

        StockObserver observer_2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.00);
        stockGrabber.setGOOGPrice(676.00);

        stockGrabber.unregister(observer_1);

        stockGrabber.setIBMPrice(197.00);
        stockGrabber.setAAPLPrice(677.00);
        stockGrabber.setGOOGPrice(676.00);
    }
}

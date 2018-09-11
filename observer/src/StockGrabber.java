import java.util.ArrayList;

public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
        System.out.println("Observer " + (observers.indexOf(observer)+1) + " added");
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
        System.out.println("Observer " + (observers.indexOf(observer)+1) + " deleted");
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    public void setIBMPrice(double ibmPrice){
        this.ibmPrice = ibmPrice;
        notifyObservers();
    }

    public void setAAPLPrice(double aaplPrice) {
        this.aaplPrice = aaplPrice;
        notifyObservers();
    }

    public void setGOOGPrice(double googPrice) {
        this.googPrice = googPrice;
        notifyObservers();
    }


}

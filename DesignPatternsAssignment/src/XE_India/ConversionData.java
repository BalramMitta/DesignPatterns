package XE_India;

import java.util.ArrayList;
import java.util.List;

public class ConversionData implements Subject {

    private float USDRate;
    private float GBPRate;
    private float EuroRate;

    private List<Observer> observers;

    public ConversionData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
            for (Observer o: observers){
                o.update(USDRate,GBPRate,EuroRate);
            }
    }


    public void setRates(float USDRate,float GBPRate,float EuroRate) {
        this.EuroRate=Math.round(100 * EuroRate)/100;
        this.GBPRate=Math.round(100 * GBPRate)/100;
        this.USDRate=Math.round(100 * USDRate)/100;
        notifyObservers();
    }
}

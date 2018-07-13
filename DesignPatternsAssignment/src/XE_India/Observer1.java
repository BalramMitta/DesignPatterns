package XE_India;

public class Observer1 implements DisplayRates, Observer{
    private float USDRate;
    private float EuroRate;
    private float GBPRate;
    private Subject ConversionData;
    public Observer1(Subject ConversionData){
        this.ConversionData = ConversionData;
        ConversionData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Observer1 \n \n ( 1 USD = "+USDRate+" INR , 1 GBP = "+GBPRate+" = INR , 1 Euro = "+EuroRate+" INR ) \n\n");
    }

    @Override
    public void update(float USDRate, float EuroRate, float GBPRate) {
        this.EuroRate = EuroRate;
        this.GBPRate = GBPRate;
        this.USDRate = USDRate;
        display();
    }
}

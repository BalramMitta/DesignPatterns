package XE_India;

public class Observer2 implements DisplayRates, Observer{
    private float USDRate;
    private float EuroRate;
    private float GBPRate;
    private Subject ConversionData;
    public Observer2(Subject ConversionData){
        this.ConversionData = ConversionData;
        ConversionData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Observer2 \n \n USDRate : "+USDRate+"\n EuroRate : "+EuroRate+"\n\n");
    }

    @Override
    public void update(float USDRate, float EuroRate, float GBPRate) {
        this.EuroRate = EuroRate;
        this.GBPRate = GBPRate;
        this.USDRate = USDRate;
        display();
    }
}

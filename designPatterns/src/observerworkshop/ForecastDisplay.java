package observerworkshop;

public class ForecastDisplay {
    float temperature;
    float humidity;
    public void update(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Forecast Display temperature : " +
                temperature+", humidity :"+humidity);
    }
}

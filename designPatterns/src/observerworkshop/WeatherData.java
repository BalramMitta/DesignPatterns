package observerworkshop;

public class WeatherData {
    float temperature;
    float humidity;
    CurrentConditionsDisplay curentCD= new CurrentConditionsDisplay();
    ForecastDisplay ForecastD=new ForecastDisplay();
    public void setMeasurements(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        curentCD.update(temperature,humidity);
        ForecastD.update(temperature,humidity);
    }
}

package observerworkshop;

public class CurrentConditionsDisplay {
    float temperature;
    float humidity;
    public void update(float temperature,float humidity){
        this.temperature=temperature;
        this.humidity=humidity;
        display();
    }
    public void display(){
        System.out.println("Current Conditions Display temperature :" +
                temperature+", humidity :"+humidity);
    }
}

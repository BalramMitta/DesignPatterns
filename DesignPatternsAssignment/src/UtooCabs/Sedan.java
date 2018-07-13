package UtooCabs;

public class Sedan extends Cab {

    public Sedan(int cost){
        this.cost = cost ;
        this.cabName = "Sedan";
    }


    @Override
    public String getCabName() {
        return cabName;
    }

    @Override
    public int getCost() {
        return cost;
    }
}

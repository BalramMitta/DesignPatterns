package UtooCabs;

public class Micro extends Cab {

    public Micro(int cost){
        this.cost = cost ;
        this.cabName = "Micro";
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

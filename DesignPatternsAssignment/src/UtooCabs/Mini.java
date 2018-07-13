package UtooCabs;

public class Mini extends Cab {

    public Mini(int cost){
        this.cost = cost ;
        this.cabName = "Mini";
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

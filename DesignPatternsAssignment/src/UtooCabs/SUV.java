package UtooCabs;

public class SUV extends Cab {

    public SUV(int cost){
        this.cost = cost ;
        this.cabName = "SUV";
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

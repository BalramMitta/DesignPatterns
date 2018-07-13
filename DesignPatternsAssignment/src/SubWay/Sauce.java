package SubWay;

public class Sauce extends SubDecorator {
    public Sauce(Sub newSub){
        super(newSub);
        System.out.println(" ADDED SAUCE ");
    }

    @Override
    public String getSub() {
        return thisSub.getSub() + " + Sauce";
    }

    @Override
    public int getCost() {
        return thisSub.getCost()+10;
    }

}

package SubWay;

public class Salad extends SubDecorator {

    public Salad(Sub newSub){
       super(newSub);
        System.out.println(" ADDED SALAD ");
    }

    @Override
    public String getSub() {
        return thisSub.getSub() + " + Salad";
    }

    @Override
    public int getCost() {
        return thisSub.getCost()+20;
    }

}

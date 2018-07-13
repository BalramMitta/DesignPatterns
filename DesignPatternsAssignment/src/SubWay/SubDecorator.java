package SubWay;

abstract class SubDecorator implements  Sub{
    protected Sub thisSub;

    public SubDecorator(Sub newSub){
        this.thisSub = newSub;
    }

    @Override
    public String getSub() {
        return thisSub.getSub();
    }

    @Override
    public int getCost() {
        return thisSub.getCost();
    }
}

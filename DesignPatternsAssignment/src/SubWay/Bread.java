package SubWay;

public class Bread implements Sub{

    public Bread(){
        System.out.println(" Bread ");
    }

    @Override
    public String getSub() {
        return "Bread";
    }

    @Override
    public int getCost() {
        return 50;
    }
}

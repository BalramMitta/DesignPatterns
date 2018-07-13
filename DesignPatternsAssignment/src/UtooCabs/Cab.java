package UtooCabs;

public abstract class Cab {
    String cabName;
    int cost;

    public abstract String getCabName();

    public abstract int getCost();

    public void book(){

        System.out.println("Booked "+cabName);

    }

}

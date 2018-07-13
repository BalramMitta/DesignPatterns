package UtooCabs;

import java.util.List;

public abstract class City {

    String cityName;

    List<Cab> cabsList;

    public abstract Cab getCab();

    public void printRateChart(){

        System.out.println("\n" +cityName+" Rate chart \n");
        System.out.println("CAB \t Rate \n");
        for(Cab cab:cabsList){

            System.out.println(cab.getCabName()+ " \t "+cab.getCost());

        }

    }

}

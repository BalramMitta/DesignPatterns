package UtooCabs;

import java.util.ArrayList;
import java.util.Scanner;

public class HyderabadCabFactory extends City {

    public HyderabadCabFactory(){
        cabsList=new ArrayList<Cab>();

        cabsList.add(new Micro(20));
        cabsList.add(new Mini(30));
        cabsList.add(new SUV(80));
        this.cityName = "Hyderabad";
    }

    public Cab getCab(){

        Cab cab;

        System.out.println("Select cab");
        Scanner sc = new Scanner(System.in);

        String cabChoice = sc.nextLine();

        switch (cabChoice){
            case "Micro": cab = cabsList.get(0);
            break;

            case "Mini": cab = cabsList.get(1);
            break;

            case "SUV": cab = cabsList.get(2);
            break;

            default: cab = null ;
        }

        return cab;

    }

}

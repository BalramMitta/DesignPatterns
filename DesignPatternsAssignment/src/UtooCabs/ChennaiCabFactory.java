package UtooCabs;

import java.util.ArrayList;
import java.util.Scanner;

public class ChennaiCabFactory extends City {



    public ChennaiCabFactory(){

        cabsList=new ArrayList<Cab>();

        cabsList.add(new Micro(30));
        cabsList.add(new Mini(50));
        cabsList.add(new Sedan(90));
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

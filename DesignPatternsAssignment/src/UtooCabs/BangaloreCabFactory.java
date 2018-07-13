package UtooCabs;

import java.util.ArrayList;
import java.util.Scanner;

public class BangaloreCabFactory extends City {

    public BangaloreCabFactory(){
        cabsList=new ArrayList<Cab>();

        cabsList.add(new Micro(35));
        cabsList.add(new Mini(45));
        cabsList.add(new Sedan(85));
        cabsList.add(new SUV(95));
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

            case "Sedan": cab = cabsList.get(2);
                break;

            case "SUV": cab = cabsList.get(3);
                break;

            default: cab = null ;
        }

        return cab;

    }

}

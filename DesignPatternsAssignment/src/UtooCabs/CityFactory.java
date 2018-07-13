package UtooCabs;

import java.util.Scanner;

public class CityFactory {

    public City getCity(){

        City city;

        System.out.println("Select City : \n Hyderabad \n Banglore \n Chennai \n");

        Scanner sc = new Scanner(System.in);

        String cityName = sc.nextLine();

        switch (cityName){
            case "Hyderabad": city = new HyderabadCabFactory();
            break;
            case "Bangalore" : city = new BangaloreCabFactory();
            break;
            case "Chennai" : city = new ChennaiCabFactory();
            break;
            default:
                city = null;
        }

        return city;
    }

}

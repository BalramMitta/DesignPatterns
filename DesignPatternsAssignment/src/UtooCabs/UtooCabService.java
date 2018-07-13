package UtooCabs;

public class UtooCabService {
    public static void main(String[] a){

        CityFactory cityFactory =new CityFactory();
        City city;
        do {
            city = cityFactory.getCity();
        }while (city == null);

        city.printRateChart();

        Cab cab;

        do {
            cab = city.getCab();
        }while (cab==null);

        cab.book();

    }
}

package SubWay;

public class SubwayDemo {
    public static void main(String[] args){

        // --------------------------------------

        System.out.println(" Sub 1 ");

        Sub s1=new Salad(new Bread());

        System.out.println(" Description : " + s1.getSub());

        System.out.println("Cost : "+s1.getCost());

        //----------------------------------------

        System.out.println(" Sub 2 ");

        Sub s2=new Sauce(new Bread());

        System.out.println(" Description : " + s2.getSub());

        System.out.println("Cost : "+s2.getCost());


        //-----------------------------------------

        System.out.println(" Sub 3 ");

        Sub s3=new Salad(new Sauce(new Bread()));

        System.out.println(" Description : " + s3.getSub());

        System.out.println("Cost : "+s3.getCost());

    }
}

package singleton;

public class singletonPattern {
    public static void main(String[] args){
        singleObj s1=singleObj.getinstance();
        singleObj s2=singleObj.getinstance();
        s1.i=1;
        //s2.i=2;
        System.out.println("s1.i: "+s1.i);
        System.out.println("s2.i: "+s2.i);
    }
   // static singleObj s1 = new singleObj();
   // static singleObj s2 = new singleObj();
}

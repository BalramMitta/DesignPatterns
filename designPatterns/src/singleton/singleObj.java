package singleton;

public class singleObj {
    public int i;
    private static singleObj sobj=new singleObj();
    private singleObj(){}
    public static  singleObj getinstance(){
        return sobj;
    }
}

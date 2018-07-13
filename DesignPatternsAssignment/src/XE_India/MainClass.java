package XE_India;

public class MainClass {
    public static void main(String[] args) {
        ConversionData cd = new ConversionData();
        Observer1 o1 = new Observer1(cd);
        Observer2 o2 = new Observer2(cd);

        cd.setRates(65.586f, 86.456f, 79.465f);

        cd.removeObserver(o2);

        cd.setRates(65.586f, 86.456f, 79.465f);

    }
}

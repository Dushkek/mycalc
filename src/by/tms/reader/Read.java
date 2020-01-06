package by.tms.reader;

public class Read implements Reader {

    @Override
    public void read(String s) {
        System.out.println(s);
    }

    @Override
    public double readnum(double a) {
        System.out.println(a);
        return a;
    }
}

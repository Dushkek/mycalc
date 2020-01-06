package by.tms.writer;

import java.util.Scanner;

public class Write implements Writer {
    private Scanner in=new Scanner(System.in);

    @Override
    public double writeNum() {
        return in.nextDouble();
    }

    @Override
    public String write() {
        return in.next();
    }
}

package by.tms.calculator;

public class Calc {

    /*public double calc(double a, double b, String op) {
        switch (op) {
            case "sum":
                return sum(a,b);
            case "sub":
                return sub(a,b);
            case "mul":
                return mul(a,b);
            case "div":
                return div(a,b);
            default:
                return 0;
        }
    }*/


    public static double sum(double a, double b){
        return a+b;
    }

    public static double sub(double a, double b){
        return a-b;
    }

    public static double mul(double a, double b){
        return a*b;
    }

    public static double div(double a, double b){
        return a/b;
    }
}

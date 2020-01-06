package by.tms.application;


import by.tms.calculator.Calc;
import by.tms.validator.OperValidator;
import by.tms.reader.Read;
import by.tms.reader.Reader;
import by.tms.writer.Write;
import by.tms.writer.Writer;

import java.util.ArrayList;
import java.util.List;

public class ConsoleApp implements ConsoleApplication {
    private Writer write = new Write();
    private Reader read = new Read();
    private List<String> History= new ArrayList<>();


    private void menu() {
        do {
            read.read("Enter two numbers: ");
            double a = write.writeNum();
            double b = write.writeNum();
            read.read("What operation do u want to choose?(sum,sub,mul,div) Or u can check the history(history):");
            String operation = write.write();
            History.add(String.valueOf(a));
            History.add(String.valueOf(b));
            History.add(operation);
            try {
                Check(operation);
            }catch (StringIndexOutOfBoundsException e){
                read.read("Invalid operation");
          }

            try {
                calc(a, b, operation);
            }catch (ArithmeticException e){
                read.read("Incorrect number");
            }

            read.read("Continue or u can switch/register a new user? (Yes||Switch)");
        } while (OperValidator.validator(write.write()));
    }


    @Override
    public void run() {
        menu();
    }


    private void calc(double a, double b, String op) throws ArithmeticException{
        double result = 0;
        switch (op) {
            case "sum":
                result = read.readnum(Calc.sum(a, b));
                History.add(String.valueOf(result));
               break;
            case "sub":
                result =read.readnum(Calc.sub(a, b));
                History.add(String.valueOf(result));
                break;
            case "mul":
                result =read.readnum(Calc.mul(a, b));
                History.add(String.valueOf(result));
                break;
            case "div":
                result = read.readnum(Calc.div(a, b));
                History.add(String.valueOf(result));
                break;
            case "history":
                History.remove(String.valueOf(a));
                History.remove(String.valueOf(b));
                History.remove(op);
                System.out.println(History);
        }
    }


    private void Check(String op){
        if(op.length()!=3 && op.length()!=7)
            throw new StringIndexOutOfBoundsException();
    }


}



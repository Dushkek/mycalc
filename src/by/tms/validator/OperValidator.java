package by.tms.validator;

public class OperValidator {
    public static boolean validator(String operation){
        String op="Yes";
        String op1= "reg";
        return operation.equalsIgnoreCase(op) || operation.equalsIgnoreCase(op1);
    }
}

package com.company;


public class ParseString {

    public static Calculator parseString(String expression) {
        Calculator parsedString = new Calculator();
        String firstOperand = "";
        String secondOperand = "";

        int placeMultiplic = expression.indexOf("*");
        int placeDivis = expression.indexOf("/");
        int placePlus = expression.indexOf("+");
        int placeMinus = expression.indexOf("-");

        if (placeMultiplic != -1) {
            firstOperand = expression.substring(0, placeMultiplic);
            secondOperand = expression.substring(placeMultiplic + 1);
            if (isDigit(firstOperand, secondOperand)) {
                parsedString.setFistOper(Float.parseFloat(firstOperand));
                parsedString.setSecondOper(Float.parseFloat(secondOperand));
                parsedString.setOperation("multiplic");
                return parsedString;
            }
        }

        if (placeDivis != -1) {
            firstOperand = expression.substring(0, placeDivis);
            secondOperand = expression.substring(placeDivis + 1);
            if (isDigit(firstOperand, secondOperand)) {
                parsedString.setFistOper(Float.parseFloat(firstOperand));
                parsedString.setSecondOper(Float.parseFloat(secondOperand));
                parsedString.setOperation("division");
                if (Float.parseFloat(secondOperand) == 0) {
                    System.out.println("You can\'t divide by 0 !");
                    return null;
                }
                return parsedString;
            }
        }

        if (placePlus != -1) {
            firstOperand = expression.substring(0, placePlus);
            secondOperand = expression.substring(placePlus + 1);
            if (isDigit(firstOperand, secondOperand)) {
                parsedString.setFistOper(Float.parseFloat(firstOperand));
                parsedString.setSecondOper(Float.parseFloat(secondOperand));
                parsedString.setOperation("summ");
                return parsedString;
            }
        }

        if (placeMinus != -1) {
            firstOperand = expression.substring(0, placeMinus);
            secondOperand = expression.substring(placeMinus + 1);
            if (isDigit(firstOperand, secondOperand)) {
                parsedString.setFistOper(Float.parseFloat(firstOperand));
                parsedString.setSecondOper(Float.parseFloat(secondOperand));
                parsedString.setOperation("minus");
                return parsedString;
            }
        }
        return null;
    }

    private static boolean isDigit(String oper1, String oper2) throws NumberFormatException {
        try {
            Float.parseFloat(oper1);
            Float.parseFloat(oper2);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}

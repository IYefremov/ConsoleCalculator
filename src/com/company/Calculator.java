package com.company;


public class Calculator {
    public void setFistOper(float fistOper) {
        this.fistOper = fistOper;
    }

    public void setSecondOper(float secondOper) {
        this.secondOper = secondOper;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    private float fistOper;
    private float secondOper;
    private String operation;

    public static void main(String[] args) {
        GetExpression getExpression = new GetExpression();
        ParseString parseString = new ParseString();
        Calculation myCalc = new Calculation();
        String expr = "";
        do {
            expr = getExpression.getConsoleExpression();
            if (!expr.toUpperCase().equals("Q")) {
                Calculator myExpr = ParseString.parseString(expr);
                if (myExpr != null) {
                    System.out.println("The result = " + myCalc.calc(myExpr.fistOper, myExpr.secondOper, myExpr.operation));
                } else {
                    System.out.println("Enter the correct expression!");
                }
            }
        } while (!expr.toUpperCase().equals("Q"));

    }
}

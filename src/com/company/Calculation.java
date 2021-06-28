package com.company;

public class Calculation {
    public float calc(float oper1, float oper2, String operation) {
        float calcRes = -888888;

        switch (operation) {
            case "multiplic":
                calcRes = oper1 * oper2;
                break;
            case "division":
                calcRes = oper1 / oper2;
                break;
            case "summ":
                calcRes = oper1 + oper2;
                break;
            case "minus":
                calcRes = oper1 - oper2;
                break;
        }
        return calcRes;
    }
}

package com.company;


import java.util.Scanner;

public class GetExpression {


    public String getConsoleExpression () {
        String str = "";

            Scanner in = new Scanner(System.in);
            System.out.print("Введите выражение (Q для выхода): ");

            if (in.hasNextLine()) {
                str = in.nextLine();
            }

        return str;
    }
}

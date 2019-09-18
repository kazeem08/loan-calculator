package com.kazeem;

import java.util.Scanner;

public class Console {
    //read input and validate
    private static Scanner scanner = new Scanner(System.in);

    public static double readNumber(String prompt){

        return scanner.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max){
        System.out.print(prompt + ": ");
        double value = scanner.nextDouble();
        while(true){
            if(value >=min && value <= max)
                break;
            System.out.println("Enter a value between " + min + " " + max);
        }
        return value;
    }
}

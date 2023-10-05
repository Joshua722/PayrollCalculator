package com.pluralsight;
import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
            System.out.print("Insert your name please : ");
            String user_name = myScanner.next();
            System.out.print("How many hours have you worked? ");
            double hours = myScanner.nextDouble();
            System.out.print("What is your payrate? ");
            double pay_rate = myScanner.nextDouble();
            double gross_pay = pay_rate * hours;
            System.out.print("Here is your gross pay : " + user_name , + gross_pay );

    }

}

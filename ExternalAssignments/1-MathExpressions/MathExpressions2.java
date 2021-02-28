package MathExpressions;

import java.util.Scanner;

    // CSC201 Homework Assigment
    // Created by Sam Castle

public class MathExpressions2 {
    
    public static void main(String[] args) {
        System.out.println("°C (Celsius) to °F (Fahrenheit) Converter");
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the temperature in °C: ");
        float tempC = input.nextFloat();
        float tempF = tempC * 9/5 + 32;
        System.out.println(tempC + " °C is the same as " + tempF + " °F.");

        input.close();
    } //end main
}
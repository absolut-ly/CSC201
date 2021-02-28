package MathExpressions;

// CSC201 Homework Assigment
// Created by Sam Castle

public class MathExpressions1 {
    public static void main(String[] args) {
        final int NUM = 7;
        final int DEM = 4;
        float fnum = NUM;
        float fdem = DEM;
        System.out.println(NUM + " / " + DEM + " using integer division equals " + NUM/DEM );
        System.out.println(NUM + " / " + DEM + " using floating-point division equals " + fnum/fdem);
        System.out.println(NUM + " modulo " + DEM + " equals " + NUM%DEM);
    } //end main
}
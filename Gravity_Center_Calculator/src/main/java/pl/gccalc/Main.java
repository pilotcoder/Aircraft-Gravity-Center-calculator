package pl.gccalc;

import java.util.Scanner;

public class Main {
    static Aircraft aircraft = new Aircraft();
    public static void main(String[] args) {
        System.out.println("Hello in calculator please enter correct values:");
        System.out.println("enter l lenght:");

        Scanner scanner = new Scanner(System.in);
        aircraft.setLLenght(scanner.nextDouble());

        System.out.println("enter a lenght");
        aircraft.setALenght(scanner.nextDouble());

        System.out.println("enter front weight");




    }

}
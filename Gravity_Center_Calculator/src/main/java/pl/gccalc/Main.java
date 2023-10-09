package pl.gccalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static Aircraft aircraft = new Aircraft();
    public static void main(String[] args) {
        System.out.println("Hello in calculator please enter correct values:");


        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(aircraft.getLLenght() == null)
        {
            try{
                System.out.println("enter l lenght:");
//                aircraft.setLLenght(scanner.nextDouble());
                aircraft.setLLenght(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.println("wrong!!!");;
            }
        }




        System.out.println("enter a lenght");
        aircraft.setALenght(scanner.nextDouble());

        System.out.println("enter front weight");
        aircraft.setFrontWeight(scanner.nextDouble());

        System.out.println("enter rear weight");
        aircraft.setRearWeihgt(scanner.nextDouble());

        Double result =  (((aircraft.getLLenght() * aircraft.getRearWeihgt())/(aircraft.getFrontWeight()+ aircraft.getRearWeihgt()))- aircraft.getALenght());

        System.out.println(result);





    }

}
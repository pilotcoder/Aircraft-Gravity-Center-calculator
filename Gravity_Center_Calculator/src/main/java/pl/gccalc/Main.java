package pl.gccalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static Aircraft aircraft = new Aircraft();
    public static void main(String[] args) {
        System.out.println("Hello in calculator please enter correct values:");


        Scanner scanner = new Scanner(System.in);


        while(aircraft.getLLength() == null)
        {
            try{
                System.out.println("enter l lenght:");
                aircraft.setLLength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.println("wrong data!!! Please enter only numbers for example: 123,45");;
            }
        }

        while(aircraft.getALength() == null)
        {
            try{
                System.out.println("enter a lenght");
                aircraft.setALength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.println("wrong data!!! Please enter only numbers for example: 123,45");;
            }
        }

        while(aircraft.getFrontWeight() == null)
        {
            try{
                System.out.println("enter front weight");
                aircraft.setFrontWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.println("wrong data!!! Please enter only numbers for example: 123,45");;
            }
        }

        while(aircraft.getRearWeight() == null)
        {
            try{
                System.out.println("enter rear weight");
                aircraft.setRearWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.println("wrong data!!! Please enter only numbers for example: 123,45");;
            }
        }



        Double result =  (((aircraft.getLLength() * aircraft.getRearWeight())/(aircraft.getFrontWeight()+ aircraft.getRearWeight()))+ aircraft.getALength());

        System.out.println(result);





    }


}
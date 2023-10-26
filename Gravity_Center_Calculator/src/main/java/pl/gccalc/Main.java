package pl.gccalc;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static Aircraft aircraft = new Aircraft();
    public static void main(String[] args) {
        System.out.print(ConsoleColors.BLUE);
        System.out.println("Welcome in calculator please enter correct values:" +  "USE DOT '.' AS DECIMAL"  + "\n" + "Read Mantenance Manual of Your glider to see weiging procedure." );
        System.out.print(ConsoleColors.RESET);






        while(aircraft.getLLength() == null)
        {
            try{
                System.out.println("enter l lenght:");
                aircraft.setLLength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("wrong data!!! Please enter only numbers for example: 123.45");
                System.out.print(ConsoleColors.RESET);
            }
        }

        while(aircraft.getALength() == null)
        {
            try{
                System.out.println("enter a lenght");
                aircraft.setALength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("wrong data!!! Please enter only numbers for example: 123.45");
                System.out.print(ConsoleColors.RESET);
            }
        }

        while(aircraft.getFrontWeight() == null)
        {
            try{
                System.out.println("enter front weight");
                aircraft.setFrontWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("wrong data!!! Please enter only numbers for example: 123.45");
                System.out.print(ConsoleColors.RESET);
            }
        }

        while(aircraft.getRearWeight() == null)
        {
            try{
                System.out.println("enter rear weight");
                aircraft.setRearWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("wrong data!!! Please enter only numbers for example: 123.45");
                System.out.print(ConsoleColors.RESET);
            }
        }
        System.out.println("enter weghing method A (front wheel and tail) or B (main wheel and tail) ");

        try{
            aircraft.setWeighingMethod(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.print(ConsoleColors.RED);
            System.out.println("wrong data!!! Please enter only letter A or B");
            System.out.print(ConsoleColors.RESET);
        }
        while(!aircraft.getWeighingMethod().equalsIgnoreCase("a")  && !aircraft.getWeighingMethod().equalsIgnoreCase("b"))
        {
            try{
                System.out.println("Please enter only A or B");
                aircraft.setWeighingMethod(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("wrong data!!! Please enter only letter A or B");
                System.out.print(ConsoleColors.RESET);
            }
        }

        if ("a".equalsIgnoreCase(aircraft.getWeighingMethod())){
            aircraft.setGravityCentre((((aircraft.getLLength() * aircraft.getRearWeight())/(aircraft.getFrontWeight()+ aircraft.getRearWeight()))+ aircraft.getALength()));

        } else if ("b".equalsIgnoreCase(aircraft.getWeighingMethod())) {
            aircraft.setGravityCentre((((aircraft.getLLength() * aircraft.getRearWeight())/(aircraft.getFrontWeight()+ aircraft.getRearWeight()))- aircraft.getALength()));

        }
        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        System.out.println(aircraft.toString());
        System.out.print(ConsoleColors.RESET);





    }


}
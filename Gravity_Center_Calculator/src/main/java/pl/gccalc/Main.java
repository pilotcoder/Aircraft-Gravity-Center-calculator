package pl.gccalc;


import com.itextpdf.text.DocumentException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import static pl.gccalc.PdfCreator.createPdf;

public class Main {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    static Aircraft aircraft = new Aircraft();

    public static void main(String[] args) throws DocumentException, FileNotFoundException {
//        createPdf(aircraft);

        System.out.print(ConsoleColors.BLUE);
        System.out.println("Welcome in calculator please enter correct values:" +  "USE DOT '.' AS DECIMAL"  + "\n" + "Read Maintenance Manual of Your glider to see weighing procedure." );
        System.out.print(ConsoleColors.RESET);

        while(aircraft.getLeftWingWeight() == null)
        {
            try{
                System.out.println("enter left wing weight:");
                aircraft.setLeftWingWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }
        while(aircraft.getRightWingWeight() == null)
        {
            try{
                System.out.println("enter right wing weight:");
                aircraft.setRightWingWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }
        while(aircraft.getTailplaneWeight() == null)
        {
            try{
                System.out.println("enter tailplane weight:");
                aircraft.setTailplaneWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }

        while(aircraft.getLLength() == null)
        {
            try{
                System.out.println("enter l lenght:");
                aircraft.setLLength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }
        while(aircraft.getALength() == null)
        {
            try{
                System.out.println("enter a lenght");
                aircraft.setALength(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }

        while(aircraft.getFrontWeight() == null)
        {
            try{
                System.out.println("Enter front weight");
                aircraft.setFrontWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }

        while(aircraft.getRearWeight() == null)
        {
            try{
                System.out.println("enter rear weight");
                aircraft.setRearWeight(Double.parseDouble(bufferedReader.readLine()));
            } catch (Exception e) {
                wrongDataException();
            }
        }
        System.out.println("enter weighing method A (Main wheel and tail) or B (front wheel and tail) ");

        try{
            aircraft.setWeighingMethod(bufferedReader.readLine());
        } catch (Exception e) {
            System.out.print(ConsoleColors.RED);
            System.out.println("wrong data!!! Please enter only letter A or B");
            System.out.print(ConsoleColors.RESET);
        }
        aircraft.setTotalWeight(aircraft.getFrontWeight(), aircraft.getRearWeight());
        aircraft.setFuselageWeight(aircraft.getTotalWeight(), aircraft.getLeftWingWeight(), aircraft.getRightWingWeight(), aircraft.getTailplaneWeight());

        while(!aircraft.getWeighingMethod().equalsIgnoreCase("a")  && !aircraft.getWeighingMethod().equalsIgnoreCase("b"))
        {
            try{
                System.out.println("Please enter only A or B");
                aircraft.setWeighingMethod(bufferedReader.readLine());
            } catch (Exception e) {
                System.out.print(ConsoleColors.RED);
                System.out.println("Wrong data!!! Please enter only letter A or B");
                System.out.print(ConsoleColors.RESET);
            }
        }
        if ("a".equalsIgnoreCase(aircraft.getWeighingMethod())){
            aircraft.setGravityCentre((((aircraft.getLLength() * aircraft.getRearWeight())/(aircraft.getFrontWeight()+ aircraft.getRearWeight()))+ aircraft.getALength()));

        } else if ("b".equalsIgnoreCase(aircraft.getWeighingMethod())) {
            aircraft.setGravityCentre((((aircraft.getLLength() * aircraft.getRearWeight())/(aircraft.getFrontWeight()+ aircraft.getRearWeight()))- aircraft.getALength()));
        }
        createPdf(aircraft);

        System.out.print(ConsoleColors.YELLOW_BOLD_BRIGHT);
        System.out.println(aircraft.toString());
        System.out.print(ConsoleColors.RESET);
    }
    public static void wrongDataException (){
        System.out.print(ConsoleColors.RED);
        System.out.println("wrong data!!! Please enter only numbers for example: 123.45");
        System.out.print(ConsoleColors.RESET);
    }



}
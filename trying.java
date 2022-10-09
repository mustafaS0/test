import java.util.Scanner;

public class trying {

    
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double pounds = input.nextDouble();
        System.out.println("Enter your height in inches:");
        double inches = input.nextDouble();
        double weightİnKilograms = pounds * 0.45359237 ;
        double heightİnMeters = inches * 0.0254 ;
        int bmi;
        bmi = (int) (weightİnKilograms / (heightİnMeters * heightİnMeters)) ;
        System.out.println("Your BMI is : " + bmi);
        



    }
}
import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) { 
           Scanner inputscanner = new Scanner(System.in);
           System.err.println("Enter your birth year");
           int yearofbirth=inputscanner.nextInt();
           int currentyear=LocalDate.now().getYear();
           int age=currentyear-yearofbirth;
           System.out.println("your age:"+age);
    }
    
}

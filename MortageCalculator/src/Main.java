import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Principal: ");
        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();

        System.out.print("Annual Interest rate: ");
        double interestRate = s.nextDouble();

        System.out.print("Period (Years): ");
        int years = s.nextInt();

        String mortgageValue = "";
//        double result = (principal * interestRate * years) / 100;
//        mortgageValue = NumberFormat.getCurrencyInstance().format(result);

        double result = principal * ((interestRate * Math.pow(1+interestRate, years)) / (Math.pow(1+interestRate, years) - 1)) ;
        mortgageValue = NumberFormat.getCurrencyInstance().format(result);
        System.out.println(mortgageValue);
    }

}

/**
 * Behaviour
 * 1. Principal: 100000
 * 2. Annual Interest rate: 3.9
 * 3. Period (Years): 30
 * 4. Mortgage value: $472.81
 */
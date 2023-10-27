/**
 * Calculating a Morgage "M" by providing
 * "P" - sum landed
 * "n" - interest rate
 * "y" - number of years
 */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //////// Difining P"rincipal"
        System.out.print("Pricipal: ");
        double P = scanner.nextDouble();


        //////// Calculating 'r' based on 
        //////// 'Annual Interest Rate'
        System.out.print("Annual Interest Rate: ");
        double annualRate = scanner.nextDouble();
        double r = annualRate / 12 /100;


        //////// Computation of 'n' based 
        //////// on number of years
        System.out.print("For how many years: ");
        double y = scanner.nextDouble();
        double n = y * 12;
        
        scanner.close();


        double exponent = 1 + r;
        double power = Math.pow(exponent, n);

        double mResult = P * r * power / (power - 1);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        double mRound  = Double.parseDouble(decimalFormat.format(mResult));

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String M = currencyFormat.format(mRound);


        System.out.println(M);
    }
}
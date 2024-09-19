package no.hvl.dat100;

import java.util.Scanner;

public class O2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Skriv inn bruttoinntekt (i kr): ");

        
        double bruttoinntekt = Double.parseDouble(scanner.nextLine());
        double trinnskatt = beregnTrinnskatt(bruttoinntekt);
        System.out.println("Trinnskatten som skal betales: " + String.format("%.2f", trinnskatt));

        scanner.close();
    }

    public static double beregnTrinnskatt(double inntekt) {
        double skatt = 0;

        if (inntekt > 208050) {
            if (inntekt > 208050) {
                skatt = inntekt * 0.017;
            }

            if (inntekt > 292850) {
                skatt = inntekt * 0.04;
            } 

            if (inntekt > 670000) {
                skatt = inntekt * 0.136;
            }
            
            if (inntekt > 937900) {
                skatt = inntekt * 0.166;
            } 

            if (inntekt > 1350000) {
                skatt = inntekt * 0.176;
            }
        }

        return skatt;
    }
}

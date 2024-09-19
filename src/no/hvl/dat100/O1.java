package no.hvl.dat100;

import java.util.Scanner;

public class O1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
		for (int i = 1; i <= 10; i++) {
			int poengsum = -1; 
            
            
            while (poengsum < 0 || poengsum > 100) {
                System.out.print("Skriv inn poengsummen til student " + i + ": ");
                
               
                poengsum = Integer.parseInt(scanner.nextLine());
                    
                if (poengsum < 0 || poengsum > 100) {
                        System.out.println("Ugyldig poengsum.");
                    }
                else  
                    System.out.println("Ugyldig inndata.");
                
            }
            
            String karakter = vurdering(poengsum);
            System.out.println("Student " + i + ": " + karakter);
        }
        
        scanner.close();
    }

    public static String vurdering(int poeng) {
        if (poeng >= 90) {
            return "A";
        } else if (poeng >= 80) {
            return "B";
        } else if (poeng >= 70) {
            return "C";
        } else if (poeng >= 60) {
            return "D";
        } else if (poeng >= 50) {
            return "E";
        } else {
            return "F";
        }
    }

}

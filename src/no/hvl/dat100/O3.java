package no.hvl.dat100;

import java.util.Scanner;

public class O3 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Skriv inn et heltall: ");
        
        int n = Integer.parseInt(scanner.nextLine());
        
        long faktorial = beregnFaktorial(n);
        
        System.out.println(faktorial);
       

        scanner.close();
    }

    public static long beregnFaktorial(int n) {
        long resultat = 1;
        for (int i = 1; i <= n; i++) {
            resultat *= i;
        }
        return resultat;
    }
}

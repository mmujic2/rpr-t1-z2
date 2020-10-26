package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Dijeljenje {
    public static void main(String[] args) {
        int n;
        Scanner ulaz = new Scanner(System.in);
        System.out.println("Unesite broj n: ");
        n = ulaz.nextInt();
        System.out.println("Trazeni brojevi su: ");
        for (int i = 1; i < n; i++) {
            if (i % sumaCifara(i) == 0) System.out.println(i);
        }
    }

    public static int sumaCifara(int broj) {
            int suma = 0;
            do{
                suma = suma + (broj % 10);
                broj = broj / 10;
            }while(broj != 0);
            return suma;
    }



}
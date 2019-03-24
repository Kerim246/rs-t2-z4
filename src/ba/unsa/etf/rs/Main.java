package ba.unsa.etf.rs;

import java.util.Scanner;

public class Main {

    public static double funkcija(double []niz){
        double max;
        max=niz[0];
        for(int i=0 ; i<niz.length ; i++){
            if(niz[i]>max)
                max=niz[i];
        }

        return max;
    }

    public static double korijen(double []niz,double X){
        int brojac=0;

        double kor = Math.sqrt(X);

        for(int i=0 ; i<niz.length ; i++ ){
            if(niz[i] > kor){
                brojac = brojac + 1;
            }
        }
        return brojac;
    }

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite velicinu niza: ");

        int n;

        do {
             n = ulaz.nextInt();
        } while (n<0 || n>100);

        double niz[] = new double[n];

        System.out.println("Unesite clanove niza: ");

        for(int i=0 ; i<niz.length ; i++){
            niz[i] = ulaz.nextInt();
        }

        double max = funkcija(niz);

        System.out.println("Broj članova niza koji su veći od korijena najvećeg člana niza iznosi: "+korijen(niz,max));


    }

}


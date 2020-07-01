package de.wbs.bs1;

import java.util.Random;

public class Wahl3 {
    public static void main(String[] args) {
        String[] namen = { "AKhokhlov", "Arafat Hos", "Armin Ott", "Benjamin Sch", "Benjamin Wil", "Christian Mal",
                "Christian Mey", "Christoph Slo", "Claudia Str", "Cristo Mar", "Frank Sit", "Guenter Zae", "Helin Abd",
                "Jens Ric", "JPribbenow", "Jürgen Bre", "Jürgen Fis", "Michaela Chr", "Naoufel Bou", "Ralf Äär",
                "Torsten Deg", "Victor Leu", "Walter Hoh", "Youssef Baz" };

        int anzahl = namen.length;
        int[] personenAnzahl = new int[2];
        boolean[] gezogen = new boolean[anzahl]; // Standardwert von boolean = false

        Random generator = new Random();
        
        int n=0;

        do {
            personenAnzahl[n] = generator.nextInt(anzahl) + 1;
            if (gezogen[personenAnzahl[n] - 1] == false) {            // schon gewählt
                gezogen[personenAnzahl[n] - 1] = true;                // falls false, true setzen
                n++;
            }
        } while (n < personenAnzahl.length);

        
        for (int i=0;i< personenAnzahl.length;i++) {
            System.out.println("Klassensprecher " + (i + 1) + ": " + namen[personenAnzahl[i]]);
        }

    }

}
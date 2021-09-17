package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Oblig1 {
    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int maks(int[] a) {
        if (a.length<1){
            throw new NoSuchElementException("tabellen er tom");
        }


            for (int i=0;i<a.length-1;i++){

                if(a[i]>a[i+1]){
                    bytt(a,i,i+1);

                }
            }
            return a[a.length-1];
        }
        /* i denne oppgaven jeg byttet plasser på i og i+1 hvis a[i] var
         større enn a[i+1] og sonn ble siste element er den største
         så lagde jeg en annen metode der tellet jeg hvor mange
          ombytninger skjedde til vi fikk største element i den siste indexen

          bytt metoden var brukt inni de andre to metodene
          bytt metoden gjør at man kan bytte plass på to indexer

         */
    public static void bytt(int []a,int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;

    }


    public static int ombyttinger(int[] a) {
        if(a.length<1){
            throw new NoSuchElementException("tabellen er tom");

        }

        int antall = 0;


        for (int i = 0; i < a.length-1; i++){
            if (a[i] >= a[i+1]){
                bytt(a,i,i+1);
                antall++;
                }
        }
        return antall;

    }





    ///// Oppgave 2 //////////////////////////////////////
    /* her legget jeg verdi som var 0 og hver gang a[i]>verdi adder på antal*/
    public static int antallUlikeSortert(int[] a) {
        int verdi=0;
        int antal=0;
        if(a.length<1){
            return 0;
        }

       for (int i=0;i<a.length;i++) {
           if (a[i] >= verdi) {
               if (a[i] !=verdi) {
                   antal++;

               }
               verdi = a[i];
           }
           else{
               throw new IllegalStateException("arayet må være sortert stigende");

           }

       }
       return antal;
    }

    ///// Oppgave 3 //////////////////////////////////////
/* for usortert array hadde jeg to for lokker inni
hverandre og hver gang de hadde samme tal ble antal
mindre

 */

    public static int antallUlikeUsortert(int[] a) {

        int antal=a.length;
        if (a.length < 1) {
            return 0;
        }
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[j]==a[i]){
                    antal--;
                    break;
                }

            }


        }
        return antal;

    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

          //  throw new UnsupportedOperationException();
        int antal = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) { // Hvis resten av a[i] ikke lik 0 så er den oddetall
                bytt(a, antal, i); //hvis den er oddetall så kaller vi metoden bytt for å bytte teller med i osv
                antal++; // vi øker teller med 1 hver gang if setningen fungerer
            }
        }
        if (antal == 0 || antal== a.length) { // hvis if setningen ble aldre kjørt (0 ganger) det betyr at
            quickSort(a);//tabellen har bare partall, så funker quickSort automatisk å sortere tabellen
        } else { // samme for oddetall, hvis if setning ble kjørt 10 ganger, det betyr at tabellen har bare oddetall
            kvikksortering(a, 0, antal);//hvis ikke, da kvikksortering kjøres å sortere oddetallene og partallene
            kvikksortering(a, antal, a.length);
        }


    }
    public static void quickSort ( int[] a){   // sorterer hele tabellen
        kvikksortering0(a, 0, a.length - 1);
    }
    public static void kvikksortering ( int[] a, int fra, int til){
        kvikksortering0(a, fra, til-1);
    }



    private static void kvikksortering0(int[] a, int v, int h) {
        if (v >= h){
            return;
        }
        int k = sParter0(a, v, h, (v+h)/2);
        kvikksortering0(a, v, k-1);
        kvikksortering0(a, k+1, h);
    }

    private static int sParter0(int[] a, int v, int h, int indeks) {  /// Kilde: Kombendie/ Programkode 1.3.9 a)

        bytt(a, indeks, h);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter0(a, v, h - 1, a[h]);  // partisjonerer a[v:h - 1]
        bytt(a, pos, h);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien

    }

    private static int parter0(int[] a, int v, int h, int skilleverdi) /// Kilde: Kombendie
    {
        while (true)            // stopper når v > h
        {
            while (v <= h && a[v] < skilleverdi) v++;   // h er stoppverdi for v
            while (v <= h && a[h] >= skilleverdi) h--;  // v er stoppverdi for h

            if (v < h) bytt(a,v++,h--);                 // bytter om a[v] og a[h]
            else  return v;  // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }







    ///// Oppgave 5 //////////////////////////////////////
    /*
    jeg valgte siste element og begynte fra den og
     hver gang bytta jeg den til den forige til vi kom til
      første element så bytta jeg den til siste element
    */

    public static void rotasjon(char[] a) {

        if (a.length == 0){
           return;

        }

            char sist = a[a.length - 1];
            for (int i = a.length - 1; i> 0; i--) {
                a[i] = a[i - 1];
            }
            a[0] = sist;


    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        throw new UnsupportedOperationException();
    }

    /// 7b)
    public static String flett(String... s) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1

package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
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

            throw new UnsupportedOperationException();
        }



    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {
        throw new UnsupportedOperationException();
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

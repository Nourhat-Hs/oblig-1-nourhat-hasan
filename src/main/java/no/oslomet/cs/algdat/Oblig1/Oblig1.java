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
    public static int antallUlikeSortert(int[] a) {
        if(a.length<1){
            throw new IllegalStateException("Arrayet er ikke sortert stigende!");
        }
       int verdi=0;
       int teller=0;
       for (int i=0;i<a.length;i++){
           if (a[i]>=verdi){
               if (a[i]!=verdi){
                   teller++;
               }
           }
          verdi=a[i];
       }
       return teller;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        if (a.length<1) {
            throw new UnsupportedOperationException("arryet er tom");
        }
        int antal=a.length;
        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    antal--;

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

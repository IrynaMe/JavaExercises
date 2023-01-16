public class AColpoDOcchio {
    public static void main(String[] args) {
    /*
        * A colpo d’occhio:
Individuare sul codice riportato a seguire il problema che impedisce
la compilazione del programma.
In questo codice c'è un errore. Sapresti individuarlo leggendo il codice:
public class Main {
public static void main ( String [] args ) {
int x = 10;
int y = 5;
int z = 8;
// calcola il totale di x,y e z in due passi
int totale = x+ y;
int totale = totale + z;
System . out . println ( totale );
}
        * */
        int x = 10;
        int y = 5;
        int z = 8;
// calcola il totale di x,y e z in due passi
        int totale = x+ y;
        totale += z;
        System . out . println ( totale );
    }
}



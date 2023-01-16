public class CelsiusFahrenheight {
    public static void main(String[] args) {

        /*
        * Scrivere un programma che permetta all’utente di convertire una temperatura fornita in gradi
da Celsius a Fahrenheit e viceversa. Le formule sono:
gradi_Celsius = 5 (gradi_Fahrenheit - 32) / 9
gradi_Fahrenheit = (9 (gradi_Celsius) / 5) + 32
Nel codice dobbiamo usare una variabile di tipo char che deve contenere le lettere "C" o "c"
per Celsius e "F" o "f" per i Fahrenheit, in modo tale che sia questa variabile ad indirizzare il
programma nella scelta della formula corretta di conversione.
Ad esempio se imposto la variabile a "C" (oppure “c”) e gradi a 35, significa che voglio
convertire i 35 gradi Celsius in gradi Fahrenheit. Quindi si converte la temperatura in gradi
Fahrenheit se si inseriscono i Celsius e viceversa. Se vengono digitate lettere diverse da C,
c, F o f, si mostri un messaggio che riporta l'inserimento di una lettera non corretta.
Il programma puo' essere scritto usando lo switch.
        * */

        //le variabili
        char scala = 'f'; // 'c' 'C' 'f' 'F'
        float gradi = 403f;
        float temperatura = 0f;
        switch (scala) {

            case 'c':
                temperatura = 9 * (gradi / 5) + 32;
                System.out.printf("Il risultato di conversione è: "
                        + gradi + " gradi Celsius corrispondono a %.2f gradi Fahrenheight", temperatura);
                break;
            case 'C':
                temperatura = 9 * (gradi / 5) + 32;
                System.out.printf("Il risultato di conversione è: "
                        + gradi + " gradi Celsius corrispondono a %.2f gradi Fahrenheight", temperatura);
                break;
            case 'f':
                temperatura = 5 * (gradi - 32) / 9;
                System.out.printf("Il risultato di conversione è: "
                        + gradi + " gradi Fahrenheight corrispondono a %.1f gradi Celsius", temperatura);
                break;
            case 'F':
                temperatura = 5 * (gradi - 32) / 9;
                System.out.printf("Il risultato di conversione è: "
                        + gradi + " gradi Fahrenheight corrispondono a %.1f gradi Celsius", temperatura);
                break;
            default:
                System.out.println("L'inserimento di una lettera non corretta");
        }

    }
}


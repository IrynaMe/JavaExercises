public class Zodiac {
    public static void main(String[] args) {
        /*
        * Scriviamo un programma che determini il segno zodiacale (e lo stampi a video)
in base all’inserimento di 4 numeri all’interno di variabili che rappresentano il
giorno e il mese di inizio e il giorno e il mese di fine di ogni singolo segno.
Es. per gemelli si avrebbe
giornoInizio = 21
giornoFine=21
meseInizio=5
meseFine=6
Per ogni segno zodiacale queste sono le fasce:
Ariete            21 marzo – 20 aprile//321-420
Toro	         21 aprile – 20 maggio//421-520
Gemelli         21 maggio – 21 giugno//521-621
Cancro	         22 giugno – 22 luglio//622-722
Leone	         23 luglio – 23 agosto//723-823
Vergine        24 agosto – 22 settembre//824-922
Bilancia        23 settembre – 22 ottobre//923-1022
Scorpione    23 ottobre – 22 novembre//1023-1122
Sagittario     23 novembre – 21 dicembre//1123-1221
Capricorno  22 dicembre – 20 gennaio//1222-1231 ||101- 120
Aquario       21 gennaio – 19 febbraio//121-219
Pesci           20 febbraio – 20 marzo//220-320   */

        // variabili

        byte giornoNascita = 31;
        byte meseNascita = 13;

        int meseGiornoNascita = meseNascita * 100 + giornoNascita;
        String Zodiac = "Non definito";
        //se mese o giorno è sbagliato
        if (meseNascita < 0 || meseNascita > 12 ||
                (meseGiornoNascita > 331 && meseGiornoNascita <= 400) ||
                (meseGiornoNascita > 430 && meseGiornoNascita <= 500) ||
                (meseGiornoNascita > 531 && meseGiornoNascita <= 600) ||
                (meseGiornoNascita > 630 && meseGiornoNascita <= 700) ||
                (meseGiornoNascita > 731 && meseGiornoNascita <= 800) ||
                (meseGiornoNascita > 831 && meseGiornoNascita <= 900) ||
                (meseGiornoNascita > 930 && meseGiornoNascita <= 1000) ||
                (meseGiornoNascita > 1031 && meseGiornoNascita <= 1100) ||
                (meseGiornoNascita > 1130 && meseGiornoNascita <= 1200) ||
                (meseGiornoNascita > 229 && meseGiornoNascita <= 300)) {
            System.out.println("La data di nascita è sbagliata");
            //se la data di nascita è corretta
        } else if (meseGiornoNascita >= 321 && meseGiornoNascita <= 420) {

            Zodiac = "Ariete";
        } else if (meseGiornoNascita >= 421 && meseGiornoNascita <= 520) {
            Zodiac = "Toro";
        } else if (meseGiornoNascita >= 521 && meseGiornoNascita <= 621) {
            Zodiac = "Gemelli";
        } else if (meseGiornoNascita >= 622 && meseGiornoNascita <= 722) {
            Zodiac = "Cancro";
        } else if (meseGiornoNascita >= 723 && meseGiornoNascita <= 823) {
            Zodiac = "Leone";
        } else if (meseGiornoNascita >= 824 && meseGiornoNascita <= 922) {
            Zodiac = "Vergine";
        } else if (meseGiornoNascita >= 923 && meseGiornoNascita <= 1022) {
            Zodiac = "Bilancia";
        } else if (meseGiornoNascita >= 1023 && meseGiornoNascita <= 1122) {
            Zodiac = "Scorpione";
        } else if (meseGiornoNascita >= 1123 && meseGiornoNascita <= 1221) {
            Zodiac = "Sagittario";
        } else if ((meseGiornoNascita >= 1222 && meseGiornoNascita <= 1231) ||
                (meseGiornoNascita >= 101 && meseGiornoNascita <= 120)) {
            Zodiac = "Capricorno";
        } else if (meseGiornoNascita >= 121 && meseGiornoNascita <= 219) {
            Zodiac = "Aquario";
        } else if (meseGiornoNascita >= 220 && meseGiornoNascita <= 320) {
            Zodiac = "Pesce";
        }
        System.out.println("Il tuo segno zodiacale è: " + Zodiac);
    }
}

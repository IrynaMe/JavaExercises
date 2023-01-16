public class CostoServizio {

        public static void main(String[] args) {
        /*
        Si supponga di dover definire un programma per determinare i costi di servizio legati alla
riscossione di assegni. Il costo del servizio dipende dall’ammontare dell’assegno.
Se èminore o uguale a 10 Euro, il costo di servizio è di 1 Euro.
Se è maggiore di 10 ma minore ouguale a 100 Euro il costo del servizio è pari al 10% dell’importo.
Se l’importo è maggiore di 100 Euro ma minore o uguale a 1000 Euro,
il costo del servizio è pari a 5 Euro più il 5% dell’importo.
Se il valore dell’importo è superiore a 1000 Euro,
il costo del servizio è pari a 40 Euro più l’1% dell’importo.
Scrivere un codice che permetta di computare questa cifra tramite un’istruzione if-else
multi-ramo.
        */
            int importo = 525;
            double costoServizio = 0;
            if (importo <= 10) {
                costoServizio = 1;
            } else if (importo > 10 && importo <= 100) {
                costoServizio = importo * 0.1;

            } else if (importo > 100 && importo <= 1000) {
                costoServizio = 5 + (importo * 0.05);

            } else if (importo > 1000) {
                costoServizio = 40 + (importo * 0.01);
            }
            System.out.println("Il costo dell servizio è: " + costoServizio + " EUR");
        }
    }

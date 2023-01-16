public class StipendioAnnuale {
    public static void main(String[] args) {
        /*
        * Realizzare un programma per determinare, dopo aver inserito in una variabile correttamente
dimensionata lo stipendio annuale (es. 15.414,74 ), l'aumento e quindi il nuovo stipendio di
un dipendente, tramite le istruzioni if... else con le quali calcolare l’aumento rispetto allo
stipendio base.
In particolare l'input al programma include l'attuale stipendio annuo per il dipendente e un
numero che indica la valutazione della performance (1=eccellente, 2=buona e 3=scarsa). Un
dipendente con una valutazione di 1 riceverà un aumento del 6%, un
un dipendente con una valutazione di 2 riceverà un aumento del 4% e uno con una
valutazione di 3 riceverà un aumento dell'1,5%.
        * */
        float stipendio = 15_414.74f;
        byte performance = 3; //1=eccellente, 2=buona e 3=scarsa
        float aumento = 0f;
        float stipendioAumentato = stipendio + aumento;

/*
switch (performance){
    case 1:
        aumento=stipendio*0.06f;

        System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);
        break;
    case 2:
        aumento=stipendio*0.04f;
        stipendio+=aumento;
        System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);
        break;
    case 3:
        aumento=stipendio*0.015f;
        stipendio+=aumento;
        System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);
        break;
    default:
        System.out.println("No è possibile valutare l'aumento: valore di 'performance' deve essere 1, 2 o 3");
}

    }
}*/
        if (performance == 1) {
            aumento = stipendio * 0.06f;
            System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);

        } else if (performance == 2) {
            aumento = stipendio * 0.04f;
            System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);
        } else if (performance == 3) {
            aumento = stipendio * 0.015f;
            System.out.printf("L'aumento è: %.2f%nIl nuovo stipendio con aumento è: %.2f", aumento, stipendioAumentato);
        } else {
            System.out.println("No è possibile valutare l'aumento");
        }

    }
}

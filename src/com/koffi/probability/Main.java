import com.koffi.probability.LoiBinomiale;
import com.koffi.probability.LoiDePoisson;
import com.koffi.probability.LoiGeometrique;
import com.koffi.probability.LoiNormale;

import java.util.Scanner;


public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choixUtilisateur;
    /*System.out.println("Bonjour veuiller choisir une valeur entre 1 a 4. \n 1-Loi " +
            "Binominale" + "\n 2-Loi de Poisson " + "\n 3-Loi Geometrique" +
            "\n 4-Loi Normale");

    choixUtilisateur = input.nextInt();*/


    do {

        System.out.println("Bonjour, veuillez choisir une valeur entre 1 et 4 :");
        System.out.println("1 - Loi Binomiale");
        System.out.println("2 - Loi de Poisson");
        System.out.println("3 - Loi Géométrique");
        System.out.println("4 - Loi Normale");
        choixUtilisateur = input.nextInt();

    } while (choixUtilisateur < 1 || choixUtilisateur > 4);


    if (choixUtilisateur == 1) {
        LoiBinomiale binomiale = new LoiBinomiale(5, 2, 0.67);
        binomiale.valeurCoefficientBinomial();
        binomiale.valeurPobetEchec();
        System.out.println(binomiale.valeurdeprobBinomiale());
    } else if (choixUtilisateur == 2) {

        LoiDePoisson poisson = new LoiDePoisson(9.54, 23);
        poisson.occurenceFactorielle();
        System.out.println(poisson.probdeEvent());
    } else if (choixUtilisateur == 3) {

        LoiGeometrique loi = new LoiGeometrique(0.34, 9);
        System.out.println(loi.event(8));
    } else if (choixUtilisateur == 4) {

        LoiNormale loi2 = new LoiNormale(23, 6, 6);
        System.out.println(loi2.fonctionLoiNormale());

    }


   /* LoiGeometrique loi = new LoiGeometrique(0.34, 9);
    LoiNormale loi2 = new LoiNormale(23, 6, 6);
    LoiDePoisson poisson = new LoiDePoisson(9.54, 23);
    LoiBinomiale binomiale = new LoiBinomiale(5, 2, 0.67);

    poisson.occurenceFactorielle();
    binomiale.valeurCoefficientBinomial();
    binomiale.valeurPobetEchec();

    System.out.println(loi.event(8));
    System.out.println(loi2.fonctionLoiNormale());
    System.out.println(poisson.probdeEvent());*/


}

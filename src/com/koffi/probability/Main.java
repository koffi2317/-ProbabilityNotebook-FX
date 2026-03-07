import com.koffi.probability.LoiBinomiale;
import com.koffi.probability.LoiDePoisson;
import com.koffi.probability.LoiGeometrique;
import com.koffi.probability.LoiNormale;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;


public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    int choixUtilisateur;

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
        binomiale.esperancebBinomiale();
        binomiale.varianceBinomiale();
        System.out.println(binomiale.valeurdeprobBinomiale());
        System.out.println(binomiale.esperancebBinomiale());
        System.out.println(binomiale.varianceBinomiale());

    } else if (choixUtilisateur == 2) {

        double lambda;
        int nbOccurence;

        System.out.println("Veuiller entrer une valeur de lambda de votre choix");
        lambda=input.nextDouble();
        System.out.println("Veuiller entrer le nombre d'occurence de votre choix");
        nbOccurence=input.nextInt();

        LoiDePoisson poisson = new LoiDePoisson(lambda, nbOccurence);
        poisson.occurenceFactorielle();
        poisson.esperance();
        poisson.getVariance();

        System.out.println(poisson.probdeEvent());
        System.out.println(poisson.esperance());
        System.out.println(poisson.getVariance());

    } else if (choixUtilisateur == 3) {
        /*int nbEchec=0;
        System.out.println("Combien d'échec vous vouliez ?");
        nbEchec=input.nextInt();*/
        LoiGeometrique loi = new LoiGeometrique(0.34, 9);

        loi.esperanceGeometrique();
        loi.varianceGeometrique();

        System.out.println(loi.event(8));
        System.out.println(loi.esperanceGeometrique());
        System.out.println(loi.varianceGeometrique());


    } else if (choixUtilisateur == 4) {

        double moyenne;
        double ecartType;
        double value;


        System.out.println("Veuiller entrer une valeur de moyenne de votre choix");
        moyenne = input.nextDouble();
        System.out.println("Veuiller entrer une valeur d<ecart type de votre choix");
        ecartType = input.nextDouble();
        System.out.println("Veuiller entrer une valeur de votre choix ");
        value = input.nextDouble();

        LoiNormale loi2 = new LoiNormale(moyenne, ecartType, value);
        System.out.println(loi2.fonctionLoiNormale());

    }


}

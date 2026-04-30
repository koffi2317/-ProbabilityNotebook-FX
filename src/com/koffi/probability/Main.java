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

        String choix;
        double probaSucces;
        int nbEpreuve;
        int nbSucces;

        System.out.println("C'est quoi la probabilite de succes que vous vouliez pour cette loi ?");
        probaSucces = input.nextDouble();

        System.out.println("C'est quoi le nombre d'epreuves que vous vouliez appliquer à cette loi binomiale ?");
        nbEpreuve = input.nextInt();

        System.out.println("C'est quoi le nombre de succes désiré sur le nombre d'epreuves ?");
        nbSucces = input.nextInt();

        // --- Version correcte de la classe LoiBinomiale ---
        LoiBinomiale binomiale = new LoiBinomiale(nbEpreuve, nbSucces, probaSucces);

        // Probabilité exacte
        System.out.println("La probabilité est : " + binomiale.prob());

        // Lecture du choix utilisateur
        System.out.print("Vouliez-vous voir l'espérance et la variance de vos données choisies ?  ");
        input.nextLine(); // consomme le \n
        choix = input.nextLine();

        if (choix.equalsIgnoreCase("oui")) {
            System.out.println("Espérance : " + binomiale.esperance());
            System.out.println("Variance : " + binomiale.variance());
        }


    } else if (choixUtilisateur == 2) {

        double lambda;
        int nbOccurence;
        String choixPoisson;
        System.out.println("Veuillez entrer une valeur de lambda :");
        lambda = input.nextDouble();

        System.out.println("Veuillez entrer le nombre d'occurrences :");
        nbOccurence = input.nextInt();

        LoiDePoisson poisson = new LoiDePoisson(lambda, nbOccurence);

        System.out.println("Probabilité : " + poisson.probDeEvent());
        System.out.println("Espérance : " + poisson.esperance());
        System.out.println("Variance : " + poisson.variance());

        System.out.println("Veuiller vous voir la probabilité cumulé de celle-ci ?");

        input.nextLine();
        choixPoisson = input.nextLine();


        if (choixPoisson.equals("oui")) {

            System.out.println("La probabilité cumulé de " + nbOccurence + " est egal à " + poisson.cdf());

        } else if (choixUtilisateur == 3) {
            int valeur = 0;
            String choix;
        /*int nbEchec=0;
        System.out.println("Combien d'échec vous vouliez ?");
        nbEchec=input.nextInt();*/

            LoiGeometrique loi = new LoiGeometrique(0.34, 9);

            loi.esperanceGeometrique();
            loi.varianceGeometrique();

            System.out.println(loi.event(8));
            System.out.println(loi.esperanceGeometrique());


            System.out.println(loi.varianceGeometrique());

            System.out.println("Voulez vous trouver la probabilité d'un évenement de votre " +
                    "choix ? ");
            input.nextLine();
            choix = input.nextLine();

            if (Objects.equals(choix, "oui")) {

                System.out.println("Veuiller entrer le nombre d'essaie minimum avant " +
                        "d'Avoir une reussite ?");
                valeur = input.nextInt();
                System.out.println(loi.eventCummulue(valeur));

            }


        } else if (choixUtilisateur == 4) {

            double moyenne;
            double ecartType;
            double value;

            System.out.println("Veuillez entrer une valeur de moyenne de votre choix :");
            moyenne = input.nextDouble();

            System.out.println("Veuillez entrer une valeur d'écart type de votre choix :");
            ecartType = input.nextDouble();

            System.out.println("Veuillez entrer une valeur x pour laquelle vous voulez calculer la probabilité cumulée :");
            value = input.nextDouble();


            LoiNormale loi2 = new LoiNormale(moyenne, ecartType, value);


            System.out.println("La probabilité cumulée P(X ≤ x) est : " + loi2.cdf());
        }


    }
}
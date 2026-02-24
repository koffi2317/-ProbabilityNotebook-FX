package com.koffi.probability;

public class LoiBinomiale {

    int nbepreuvestot = 0;
    int k_nbsucceschercher = 0;
    double probSucces = 0;
    double coefficientBinomial = 0;
    double esperance = 0;
    double variance = 0;
    double ecartType = 0;
    int kMinusN = 0;
    double probEchecc = 0;
    int exposantK = 0;

    public LoiBinomiale(int nbpreuve, int nbSucces, double probSucc) {

        this.nbepreuvestot = nbpreuve;
        this.k_nbsucceschercher = nbSucces;
        this.probSucces = probSucc;
        kMinusN = nbepreuvestot - k_nbsucceschercher;
        probEchecc = 1 - probSucces;
        exposantK = k_nbsucceschercher;
    }


    public void valeurCoefficientBinomial() {

        for (int i = (nbepreuvestot - 1); i >= 1; i--) {
            nbepreuvestot *= i;
        }

        for (int i = (k_nbsucceschercher - 1); i >= 1; i--) {
            k_nbsucceschercher *= i;
        }

        for (int i = (kMinusN - 1); i >= 1; i--) {

            kMinusN *= i;

        }

        coefficientBinomial = ((double) (nbepreuvestot) / (kMinusN * k_nbsucceschercher));
    }

    public void valeurPobetEchec() {


        for (int i = 0; i < exposantK - 1; i++) {

            probSucces *= probSucces;
            probEchecc *= probEchecc;
        }


    }


    public double valeurdeprobBinomiale() {

        double prob = 0;

        prob = coefficientBinomial * probEchecc * probSucces;
        return prob;
    }


    public double esperancebBinomiale() {

        esperance = nbepreuvestot * probSucces;

        return esperance;
    }


    public double varianceBinomiale() {

        variance = nbepreuvestot * probEchecc * probSucces;

        return variance;
    }

    public double ecartType() {

        ecartType = Math.sqrt(variance);

        return ecartType;
    }

}

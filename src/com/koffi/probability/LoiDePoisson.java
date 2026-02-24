package com.koffi.probability;

public class LoiDePoisson {

    double esperance = 0;
    double variance = 0;
    double probabiblite = 0;
    int nbOccurence = 0;
    double lambda = 0;
    int nboccutempo = 0;


    public LoiDePoisson(double lambda, int occurence) {
        this.lambda = lambda;
        this.nbOccurence = occurence;
        nboccutempo = nbOccurence;
    }

    public void occurenceFactorielle() {

        for (int i = (nbOccurence - 1); i >= 1; i--) {

            nbOccurence *= i;
        }

    }

    public double probdeEvent() {

        probabiblite = ((Math.exp(-1 * lambda)) * (Math.pow(lambda, nboccutempo))) / (nbOccurence);

        return probabiblite;
    }

    public double esperance() {

        return esperance = lambda;
    }

    public double getVariance() {

        return variance = lambda;
    }

}

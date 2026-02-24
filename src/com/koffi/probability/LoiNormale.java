package com.koffi.probability;

public class LoiNormale {

    double moyenne = 0;
    double ecartType = 0;
    double fctloiNormale = 0;
    double valeurx = 0;

    public LoiNormale(double moyenne, double ecartTy, double valeur) {

        this.moyenne = moyenne;
        this.ecartType = ecartTy;
        this.valeurx = valeur;
    }

    public double fonctionLoiNormale() {

        double part1 = 0;
        part1 = ((1) / (ecartType * Math.sqrt(2 * Math.PI)));

        fctloiNormale =
                part1 * Math.exp((-1) * (Math.pow((valeurx - moyenne), 2)) / (2 * Math.pow(ecartType, 2)));

        return fctloiNormale;
    }


}

package com.koffi.probability;

public class LoiNormale {

    private final double moyenne;
    private final double ecartType;
    private final double valeurx;

    public LoiNormale(double moyenne, double ecartType, double valeurx) {
        this.moyenne = moyenne;
        this.ecartType = ecartType;
        this.valeurx = valeurx;
    }

    // --- Densité de probabilité ---
    public double densite() {
        double coeff = 1 / (ecartType * Math.sqrt(2 * Math.PI));
        double exponent = -Math.pow(valeurx - moyenne, 2) / (2 * Math.pow(ecartType, 2));
        return coeff * Math.exp(exponent);
    }


    public double zScore() {
        return (valeurx - moyenne) / ecartType;
    }


    public double cdf() {
        return cdfStandardisee(zScore());
    }

   
    private double cdfStandardisee(double z) {
        double t = 1 / (1 + 0.2316419 * Math.abs(z));
        double d = 0.3989423 * Math.exp(-z * z / 2);

        double prob = d * t * (0.3193815
                + t * (-0.3565638
                + t * (1.781478
                + t * (-1.821256
                + t * 1.330274))));

        if (z > 0) {
            return 1 - prob;
        } else {
            return prob;
        }
    }
}

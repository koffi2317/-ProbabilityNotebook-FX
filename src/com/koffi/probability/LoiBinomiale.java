package com.koffi.probability;

public class LoiBinomiale {

    private final int n;      // nombre d'épreuves
    private final int k;      // nombre de succès recherchés
    private final double p;   // probabilité de succès

    public LoiBinomiale(int n, int k, double p) {
        this.n = n;
        this.k = k;
        this.p = p;
    }

    private long fact(int x) {
        long f = 1;
        for (int i = 2; i <= x; i++) f *= i;
        return f;
    }

    private long coefficientBinomial() {
        return fact(n) / (fact(k) * fact(n - k));
    }

    public double prob() {
        return coefficientBinomial() * Math.pow(p, k) * Math.pow(1 - p, n - k);
    }

    public double esperance() {
        return n * p;
    }

    public double variance() {
        return n * p * (1 - p);
    }

    public double ecartType() {
        return Math.sqrt(variance());
    }
}

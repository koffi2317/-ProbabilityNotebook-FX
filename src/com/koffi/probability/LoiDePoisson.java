package com.koffi.probability;

public class LoiDePoisson {

    private final double lambda;
    private final int k;

    public LoiDePoisson(double lambda, int occurence) {
        this.lambda = lambda;
        this.k = occurence;
    }

    private long factorielle(int n) {
        long f = 1;
        for (int i = 2; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public double probDeEvent() {
        return (Math.exp(-lambda) * Math.pow(lambda, k)) / factorielle(k);
    }

    public double esperance() {
        return lambda;
    }

    public double variance() {
        return lambda;
    }
}

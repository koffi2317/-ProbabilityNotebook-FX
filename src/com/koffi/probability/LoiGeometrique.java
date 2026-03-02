package com.koffi.probability;

public class LoiGeometrique {

    double probabiblieSucces;
    int nbessaie;
    int nbechec;
    double probEchec;
    double esperance;
    double variance;
    double eventprob;
    double probCummule;
    int nbessaieCumulle;

    public LoiGeometrique(double probreu, int nbessaie) {

        this.probabiblieSucces = probreu;
        this.nbessaie = nbessaie;
        probEchec = 1 - probabiblieSucces;

    }

    public double event(int nbechec) {

        this.nbechec=nbechec;
        eventprob = (Math.pow(probEchec, nbechec) * probabiblieSucces);

        return eventprob;
    }


    public double esperanceGeometrique() {

        esperance = (1 / probabiblieSucces);

        return esperance;
    }

    public double varianceGeometrique() {

        variance = ((probEchec) / Math.pow(probabiblieSucces, 2));

        return variance;
    }

    public double eventCummulue(int essaiecumule) {

        this.nbessaieCumulle = essaiecumule;

        probCummule = 1 - (Math.pow(probEchec, nbessaieCumulle));

        return probCummule;
    }


}

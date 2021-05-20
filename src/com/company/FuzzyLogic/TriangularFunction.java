package com.company.FuzzyLogic;

public class TriangularFunction {
    double ax;
    double bx;
    double cx;

    public TriangularFunction(double ax, double bx, double cx) {
        this.ax = ax;
        this.bx = bx;
        this.cx = cx;
    }

//    public double calcAffilation(double u){
//        if (u <= ax || u >= bx) {
//            return 0.0;
//        } else if (u > ax && u <= cx) {
//            return (u - ax) / (cx - ax);
//        } else if (u > cx && u < bx) {
//            return (bx - u) / (bx - cx);
//        } else return 0.0;
//    }

    public double calcAffilation(double u){
         if (u >= ax && u <= bx) {
            return (u - ax) / (bx - ax);
        } else if (u >= bx && u <= cx) {
            return (cx - u) / (cx - bx);
        } else return 0.0;
    }

    public double cardinality() {
        return 0.5 * (bx - ax);
    }

    public double support() {
        return bx - ax;
    }
}

package com.company.FuzzyLogic;

public class TrapezoidalFunction {
    double ax;
    double bx;
    double cx;
    double dx;

    public TrapezoidalFunction(double ax, double bx, double cx, double dx) {
        this.ax = ax;
        this.bx = bx;
        this.cx = cx;
        this.dx = dx;
    }

    public double calcAffilation(double u){
        if (u >= ax && u <= bx) {
            return (u - ax) / (bx - ax);
        } else if (u >= bx && u <= cx) {
            return 1.0;
        } else if (u >= cx && u <= dx) {
            return (dx - u) / (dx - cx);
        } else return 0.0;
    }

    public double cardinality(){
        return 0.5*(bx - ax + (dx - cx));
    }

    public double support(){
        return bx - ax;
    }

}

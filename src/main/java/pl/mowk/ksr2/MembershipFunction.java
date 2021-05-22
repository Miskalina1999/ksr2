package pl.mowk.ksr2;

public interface MembershipFunction {
    double calcAffilation(double u);
    double cardinality();
    double support();
}

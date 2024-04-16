package functions;

import java.util.List;

// y = 1 / x
public class Function3 extends Function {

    public Function3() {
        super(List.of(new double[] {Double.NEGATIVE_INFINITY, 0d}, new double[] {0d, Double.POSITIVE_INFINITY}), List.of(0d));
    }

    @Override
    public double compute(double x) {
        return 1 / x;
    }

    @Override
    public double computeAntiderivative(double x) {
        return Math.log(Math.abs(x));
    }

    @Override
    public String toString() {
        return "y = 1 / x";
    }
}

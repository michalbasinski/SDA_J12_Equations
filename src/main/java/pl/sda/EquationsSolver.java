package pl.sda;

public class EquationsSolver {
    public double solve(double a, double b, double c) {

        if (a == 0) {
            throw new IncorrectEquationException("Wrong equations");
        } else {
            return (c - b) / a;
        }
    }
}

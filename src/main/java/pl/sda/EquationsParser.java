package pl.sda;

public class EquationsParser {

    public Equation parse(String equation) {
        String[] split = equation.split("=");

        double c = Double.parseDouble(split[1]);

        String[] left = split[0].split("x");

        Equation result = null;
        if (left.length == 1 && split[0].contains("x")) {
            double a = Double.parseDouble(left[0]);
            result = new Equation(a, 0, c);
        }
        if (left.length == 1 && !split[0].contains("x")) {
            double b = Double.parseDouble(left[0]);
            result = new Equation(0, b, c);
        } else if (left.length == 2) {
            double a = parseA(left[0]);
            double b = Double.parseDouble(left[1]);
            result = new Equation(a, b, c);
        }

        return result;
    }

    private double parseA(String leftSide) {
        //boolean isNull = leftSide != null ? false: true;

        //boolean isNull;
        //if (leftSide != null) {
        //     isNull = false
        // } else {
        //    isNull = true;
        // }

        return Double.parseDouble(leftSide.contains("-") ? "-1" : leftSide.isEmpty() ? "1" : leftSide);
    }
}
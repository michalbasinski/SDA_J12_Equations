package pl.sda;

import java.util.Objects;

public class Equation {
    private double a;
    private double b;
    private double c;

    public Equation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public boolean equals(Object o) {
        Equation equation = (Equation) o;
        return a == equation.getA() && b == equation.getB() && c == equation.getC();
    }
}

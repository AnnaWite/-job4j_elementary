package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double x1 = p - a;
        double x2 = p - b;
        double x3 = p - c;
        double x4 = p * x1 * x2 * x3;
        double rsl = Math.sqrt(x4);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
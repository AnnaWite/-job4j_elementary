package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rsl = (187 - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (187 - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        double fitMan = Fit.manWeight(heightMan);
        System.out.println("Man 187 is " + fitMan);

        short heightWomen = 187;
        double fitWomen = Fit.womanWeight(heightWomen);
        System.out.println("Man 187 is " + fitWomen);
    }
}
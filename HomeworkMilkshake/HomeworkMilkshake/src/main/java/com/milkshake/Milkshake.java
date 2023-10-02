package com.milkshake;

public class Milkshake {

    public static int MilkshakeChocolate = 15;
    public static int Caramel = 6;
    public static int Nuts = 3;
    public static int Almonds = 5;
    public static int Pistachios = 5;

    public static int Price(int a, int b) {
        return a + b;
    }

    public static boolean AreEqual(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean MilkCaramel(int num1, int num2) {
        boolean caramel = false;
        if (num1 + num2 == 21) {
            caramel = true;
        }
        return caramel;
    }

}

package org.example;

public class PassingBy {
    public static void main(String[] args) {

        int value = getValue();
        for (int i = 0; i < value; i++) {
            if (i % 2 == 0) {
                System.out.println("i = " + i + " is even");
            } else {
                System.out.println("i = " + i + " is odd");
            }
        }
    }

    private static Integer getValue() {
        return ((10 * 8) - 2) + 6;
    }
}

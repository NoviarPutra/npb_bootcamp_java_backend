package org.example;

public class Variable {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        String name = "John";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        boolean isTrue = true;
        System.out.println("Is it true? " + isTrue);
        System.out.println("Is it false? " + !isTrue);

        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println("Number: " + number);
        }

//        ASSIGNMENT OPERATOR
        int x = 10;
        x += 5;
        System.out.println(x);

//        UNASSIGNED OPERATOR
        int y = 10;
        y--;
        System.out.println(y);

        int z = 10;
        for (int i = 0; i < z; i++) {
            if (i % 2 == 0) {
                System.out.println(" Even number: " + i);
            } else {
                System.out.println(" Odd number: " + i);
            }
        }

//        FLOAT OPERATOR
        float aFloat = 10.0f;
        float bFloat = 5.0f;
        float cFloat = aFloat / bFloat;
        System.out.println("Float: " + cFloat);

//        DOUBLE OPERATOR
        double aDouble = 10.0;
        double bDouble = 5.0;
        double cDouble = aDouble / bDouble;
        System.out.println("Double: " + cDouble);

//        BOOLEAN OPERATOR
        boolean aBoolean = true;
        boolean bBoolean = false;
        boolean cBoolean = aBoolean && bBoolean;
        System.out.println("Boolean: " + cBoolean);

//        STRING OPERATOR
        String aString = "Hello";
        String bString = "World";
        String cString = aString + " " + bString;
        System.out.println("String: " + cString);

//        CHAR
        char aChar = 'A';
        char bChar = 'B';
        char cChar = (char) (aChar + bChar);
        System.out.println("Char: " + cChar);
    }

}

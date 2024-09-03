package org.example.operator;

public class OperatorAritmatika {
    public static void main(String[] args) {
//        int intNum1 = 20;
//        int intNum2 = 30;
//        int intSum = intNum1 + intNum2;
//        System.out.println(intSum);

        double douNum1 = 20.0;
        int intNum3 = 30;
        double douSum2 = (intNum3 / douNum1);
        System.out.println(Math.floor(douSum2));

        int x = 2;
        int num1 = 10 * (x + 1);
        System.out.println(num1);

        int intArgs = Integer.parseInt(args[0]);

//        System.out.println((3==3));
//        System.out.println((4!=4));
//        System.out.println(((3!=3) || !(4!=4)));
//        System.out.println(!((5==5)^(4==4)));


//        System.out.println(10&12);
        System.out.println(Integer.toBinaryString(181));
        System.out.println(Integer.toBinaryString(108));

        if (intArgs > 0) {
            System.out.println("Lebih dari 0");
        } else {
            System.out.println("Kurang dari 0");
        }

        int intX = 10
                *
                (x + 1);

        System.out.println(intX);
        for (int i = 0;
             i < 5;
             i++) {
        }

        for (int i = 0;
             i < 10;
             i++) {
        }
//        && --> AND
//        || --> OR
//        ! --> NOT
    }
}

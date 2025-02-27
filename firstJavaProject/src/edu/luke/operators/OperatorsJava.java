package edu.luke.operators;

public class OperatorsJava {
    public static void main(String[] args) {
    // unary operators
        int x = 10;
        int y = -x; // -10
        System.out.println(y);

        int z = +x; // 10
        System.out.println(z);

        // add and decrement
        int a = 10;
        int b = ++a;

        System.out.println(b); //11
        System.out.println(a);
        System.out.println(--a); //10

        // NOT
        boolean c = true;
        boolean d = !c; // false
        System.out.println(d);
        System.out.println(c); // true

        System.out.println("--------------------------");
        // TERNARY OPERATOR
        String T = "True";
        String F = "False";

        String result = T.equals("True") ? T : F;
        // equals is a method of the String class

        System.out.println(result);

        // OR

        String result_2 = 6 > 5 ? T : F;
        System.out.println(result_2);

        System.out.println("--------------------------");

        // RELATIONAL OPERATORS

        int x1 = 10;
        int y1 = 20;

        boolean result1 = x1 == y1;
        System.out.println(result1);

        boolean result2 = x1 != y1;
        System.out.println(result2);

        boolean result3 = x1 > y1;
        System.out.println(result3);

        boolean result4 = x1 < y1;
        System.out.println(result4);

        boolean result5 = x1 >= y1;
        System.out.println(result5);

        boolean result6 = x1 <= y1;
        System.out.println(result6);

        System.out.println("--------------------------");


    

        // LOGICAL OPERATORS

        boolean resultTrue = true;
        boolean resultFalse = false;

        if (resultTrue && resultFalse) {
            System.out.println("Totally True");
        } else {
            System.out.println("Another False");
        };

        if (resultTrue || resultFalse) {
            System.out.println("True or False");
        };

    }
}

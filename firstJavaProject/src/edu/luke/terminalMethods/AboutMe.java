package edu.luke.terminalMethods;

import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual seu nome? ");
        String name = scanner.next();

        System.out.println("Qual seu sobrenome? ");
        String lastName = scanner.next();

        System.out.println("Qual sua idade? ");
        int age = scanner.nextInt();

        System.out.println("Qual sua altura? ");
        double height = scanner.nextDouble();

        System.out.println("Me chamo: " + name + " " + lastName);
        System.out.println("Idade: " + age);
        System.out.println("Altura: " + height);
    }
}

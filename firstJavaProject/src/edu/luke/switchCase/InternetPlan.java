package edu.luke.switchCase;
import java.util.Scanner;

public class InternetPlan {
    public static void main(String[] args) {
        String plan;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a velocidade desejada para o plano de internet: ");
        System.out.println(" - Basico: 10Mbps\n - Medio: 50Mbps\n - Premium: 100Mbps");
        plan = sc.next();

        switch (plan) {
            case "basico":
                System.out.println("O plano escolhido foi o Basico");
                break;
            case "medio":
                System.out.println("O plano escolhido foi o Medio");
                break;
            case "premium":
                System.out.println("O plano escolhido foi o Premium");
                break;

            default:
                System.out.println("Plano invalido");
                break;
            }

    }
}

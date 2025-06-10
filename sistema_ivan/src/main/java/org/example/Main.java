package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema de conversión de unidades");
        System.out.println("Te encuentras en el menú:");
        System.out.println("1.Km a Millas");
        System.out.println("2.Litros a Galones");
        System.out.println("3.Gramos a Onzas");
        System.out.println("4.Cm a Pulgadas");

        int op= sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Conversión de Km a Millas");
                System.out.print("Dame tu valor numérico: ");
                double resultado_a = sc.nextDouble();
                System.out.println("Resultado: " + resultado_a * 0.621371);
                break;
            case 2:
                System.out.println("Conversión de Litros a Galones");
                System.out.print("Dame tu valor numérico: ");
                double resultado_b = sc.nextDouble();
                System.out.println("Resultado: " + resultado_b * 0.264172);
                break;
            case 3:
                System.out.println("Conversión de Gramos a Onzas");
                System.out.print("Dame tu valor numérico: ");
                double resultado_c = sc.nextDouble();
                System.out.println("Resultado: " + resultado_c * 0.03527396);
                break;
            case 4:
                System.out.println("Conversión de Cm a Pulgadas");
                System.out.print("Dame tu valor numérico: ");
                double resultado_d = sc.nextDouble();
                System.out.println("Resultado: " + resultado_d * 0.393701);
                break;
            default:
                System.out.println("No es posible.");
        }

        sc.close();
    }
}

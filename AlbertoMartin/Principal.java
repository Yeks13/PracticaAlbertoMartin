package practica;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número sobre el que hacer los cálculos");

        int numero;
        try {
            numero = sc.nextInt();
        } catch (Exception e) {
            System.out.println("El dato introducido no es un número");
            return;
        }

        // Usamos el nuevo método refactorizado
        CalculosMatematicos misCalculosMatematicos = new CalculosMatematicos();
        misCalculosMatematicos.calculosRefactorizados(numero);
    }
}

package practica;

import java.util.ArrayList;
/**
 * Clase que realiza cálculos matemáticos como factoriales y validación de números primos.
 */
public class CalculosMatematicos {
	
    public CalculosMatematicos() {
    }

    public void calculosRefactorizados(int numero) {
        ArrayList<Integer> factorialesPrimos = calcularFactorialesPrimos(numero);
        System.out.println("Los factoriales primos del número introducido son: " + factorialesPrimos);

        // Validamos si el número es primo
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " SI es primo");
        } else {
            System.out.println("El número " + numero + " NO es primo");
        }
    }

    private ArrayList<Integer> calcularFactorialesPrimos(int numero) {
        ArrayList<Integer> miArray = new ArrayList<>();
        boolean noEsPrimo = false;
        int j;

        miArray.add(1);

        for (int i = 2; i < numero; i++) {
            noEsPrimo = false;
            j = 2;
            while (j < i) {
                if (i % j == 0) {
                    noEsPrimo = true;
                    j = i;
                } else {
                    j++;
                }
            }
            if (!noEsPrimo && numero % i == 0) {
                miArray.add(i);
            }
        }

        return miArray;
    }

    private boolean esPrimo(int numero) {
        boolean noEsPrimo = false;

        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                noEsPrimo = true;
                break;
            }
        }

        return !noEsPrimo;
    }
}

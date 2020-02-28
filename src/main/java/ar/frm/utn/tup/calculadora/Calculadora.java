package ar.frm.utn.tup.calculadora;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static int opcion, operador1, operador2, resultado;
    public static float resultado2;

    public static void main(String[] args) {
    }

    public static float divide(int operador1, int operador2) {
        resultado2 = (float) operador1 / operador2;
        System.out.println("La división de " + operador1 + " / " + operador2 + " es " + resultado2);

        return resultado2;
    }

    public static int multiplica(int operador1, int operador2) {

        resultado = operador1 * operador2;
        System.out.println("La multiplicacion de " + operador1 + " * " + operador2 + " es " + resultado);

        return resultado;

    }

    public static int resta(int operador1, int operador2) {
        resultado = operador1 - operador2;
        System.out.println("La resta de " + operador1 + " - " + operador2 + " es " + resultado);

        return resultado;
    }

    public static int suma(int operador1, int operador2) {
        return 0;
    }

    public static void preguntaOperadores() {

    }

    public static void preguntaOpcion() {

    }

    public static void imprimeMenu() {

    }
}



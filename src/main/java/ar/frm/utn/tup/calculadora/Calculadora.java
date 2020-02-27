package ar.frm.utn.tup.calculadora;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static int opcion,operador1,operador2,resultado;
    public static float resultado2;
    public static void main(String[] args) {
    }
    private static void divide(int operador1, int operador2) {

    }
    private static void multiplica(int operador1, int operador2) {
        System.out.println("La multiplicación de "+operador1+" * "+operador2+" es "+(operador1*operador2));
    }
    private static void resta(int operador1, int operador2) {

    }
    private static void suma(int operador1, int operador2) {

    }
    private static void preguntaOperadores() throws IOException {

        System.out.println("Ingrese el Operador 1: ");
        BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
        operador1=Integer.parseInt(br1.readLine());

        System.out.println("Ingrese el Operador 2: ");
        BufferedReader br2=new BufferedReader(new InputStreamReader(System.in));
        operador2=Integer.parseInt(br2.readLine());
    }

    private static void preguntaOpcion()  {

    }
    private static void imprimeMenu() {

    }
}

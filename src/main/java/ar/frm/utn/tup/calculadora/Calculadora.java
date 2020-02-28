package ar.frm.utn.tup.calculadora;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculadora {
    public static int opcion, operador1, operador2, resultado;
    public static float resultado2;

    public static void main(String[] args) throws IOException {

        imprimeMenu();
        preguntaOpcion();
        while (opcion != 5) {
            preguntaOperadores();
            switch (opcion) {
                case 1:
                    suma(operador1, operador2);
                    break;
                case 2:
                    resta(operador1, operador2);
                    break;
                case 3:
                    multiplica(operador1, operador2);
                    break;
                case 4:
                    divide(operador1, operador2);
                    break;
                default:
                    System.out.println("Opcion pulsada no valida");
                    break;
            }
            System.out.println("");
            imprimeMenu();
            preguntaOpcion();
        }
        System.out.println("Fin de aplicacion");

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
        resultado = operador1 + operador2;
        System.out.println("La suma de " + operador1 + " + " + operador2 + " es " + resultado);

        return resultado;
    }

    public static void preguntaOperadores() throws IOException {
        System.out.println("Operador 1: ");
        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        operador1 = Integer.parseInt(br1.readLine());
        System.out.println("Operador 2: ");
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
        operador2 = Integer.parseInt(br2.readLine());
    }

    public static void preguntaOpcion() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        opcion = Integer.parseInt(br.readLine());
    }

    public static void imprimeMenu() {
        //Logger log= (Logger) LogManager.getLogger(this.getClass()); //Para métodos no estáticos.
        Logger log = (Logger) LogManager.getLogger();
        log.error("Menu Opciones");
        log.warn("1. Suma");
        log.debug("2. Resta");
        log.info("3. Multiplicacion");
        log.info("4. Division");
        log.fatal("5. Salir");
    }
}



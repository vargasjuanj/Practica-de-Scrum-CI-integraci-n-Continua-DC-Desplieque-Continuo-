package ar.frm.utn.tup.calculadora;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculadora {
    public static int opcion, operador1, operador2, resultado;
    public static float resultado2;

    public static void main(String[] args) {
imprimeMenu();
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

    public static void preguntaOperadores() {

    }

    public static void preguntaOpcion() {

    }

    public static void imprimeMenu() {
        //Logger log= (Logger) LogManager.getLogger(this.getClass()); //Para métodos no estáticos.
        Logger log= (Logger) LogManager.getLogger();
        log.error("Menu Opciones");
        log.warn("1. Suma");
        log.debug("2. Resta");
        log.info("3. Multiplicacion");
        log.info("4. Division");
        log.fatal("5. Salir");
    }
}



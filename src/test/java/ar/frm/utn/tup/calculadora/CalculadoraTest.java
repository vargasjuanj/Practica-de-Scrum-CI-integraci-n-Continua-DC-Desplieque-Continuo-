package ar.frm.utn.tup.calculadora;


import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void before() {

        this.calculadora = new Calculadora();

    }

    @Test
    public void testMultiplica() {
        int expected = (5 * 4);
        int result = this.calculadora.multiplica(5, 4);
        assertEquals(expected, result);

    }

    @Test
    public void testDivide() {
        float expected = 8f / 5;
        float result = this.calculadora.divide(8, 5);
        assertEquals(expected, result, 0);
    }

    @Test
    public void testResta() {
        int expected = 10 - 3;
        int result = this.calculadora.resta(10, 3);
        assertEquals(expected, result);
    }

    @Test
    public void testSuma() {
        int expected = 40 + 31;
        int result = this.calculadora.suma(40, 31);
        assertEquals(expected, result);
    }
}

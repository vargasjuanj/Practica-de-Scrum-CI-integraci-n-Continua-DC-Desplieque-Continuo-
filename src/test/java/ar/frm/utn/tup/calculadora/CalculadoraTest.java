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
    public void testDivide(){
        float expected = 8f/5;
        float result = this.calculadora.divide(8, 5);
        assertEquals(expected, result,0);
    }
}

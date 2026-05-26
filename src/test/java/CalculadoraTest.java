// primeiro teste
import org.junit.jupiter.api.Test;

import fatec.Calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;
 
@DisplayName("Testes da Calculadora")
class CalculadoraTest {
 
    private Calculadora calc;
 
    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }
 
    @Test
    @DisplayName("Deve somar dois números positivos")
    void deveSomarDoisNumerosPositivos() {
        assertEquals(8, calc.somar(5, 3));
    }
 
    @Test
    @DisplayName("Deve subtrair corretamente")
    void deveSubtrairCorretamente() {
        assertEquals(2, calc.subtrair(5, 3));
    }
 
    @Test
    @DisplayName("Deve multiplicar corretamente")
    void deveMultiplicarCorretamente() {
        assertEquals(15, calc.multiplicar(5, 3));
    }
 
    @Test
    @DisplayName("Deve dividir corretamente")
    void deveDividirCorretamente() {
        assertEquals(2.5, calc.dividir(5, 2), 0.001);
    }
 
    @Test
    @DisplayName("Deve lançar exceção ao dividir por zero")
    void deveLancarExcecaoAoDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }
 
    @Test
    @DisplayName("Deve identificar número par")
    void deveIdentificarNumeroPar() {
        assertTrue(calc.ehPar(4));
        assertFalse(calc.ehPar(7));
    }
}

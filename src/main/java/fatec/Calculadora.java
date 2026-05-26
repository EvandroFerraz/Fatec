// primeiro teste
package fatec;
 
public class Calculadora {
 
    public int somar(int a, int b) {
        return a + b;
    }
 
    public int subtrair(int a, int b) {
        return a - b;
    }
 
    public int multiplicar(int a, int b) {
        return a * b;
    }
 
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida");
        }
        return (double) a / b;
    }
 
    public boolean ehPar(int numero) {
        return numero % 2 == 0;
    }
}


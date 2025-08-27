public class calculadora {
<<<<<<< HEAD
    public static int soma(int a, int b) {
        return a + b;
=======
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    public static double divisao(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisão por zero não permitida!");
        return (double) a / b;
>>>>>>> feature-multiplicacao-divisao
    }
    public static int subtracao(int a, int b) {
        return a - b;
    }
   
}


public class Calculadora {

    public int resultOperacao(int a, int b, String operacao) {
        
        if (operacao.equals("+")) {
            return a + b;
        } 
        else if (operacao.equals("-")) {
            return a - b;
        } 
        else if (operacao.equals("*")) {
            return a * b;
        } 
        else if (operacao.equals("/")) {
            return a / b;
        } 
        else {
            System.out.println("Não é uma operação válida :(, por favor, escolha uma dessas operações: (+, -, *, /)");
        }
       return 0;
    }
}

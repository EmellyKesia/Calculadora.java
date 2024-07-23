
import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    try {
      System.out.println("Digite um número: ");
      double a = scan.nextDouble();

      System.out.println("Qual operação?");
      String operacao = scan.next();

      System.out.println("Digite outro número: ");
      double b = scan.nextDouble();

      double resultOperacao = calc.resultOperacao(a, b, operacao);
      System.out.println("O resultado é: " + resultOperacao);
    } catch (InputMismatchException e) {
      System.out.println("Erro: Entrada inválida! Digite apenas números e o operador matemático (+, -, *, /)");
    }
  }
}

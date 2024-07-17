
import java.util.Scanner;

public class main {
  public static void main(String[] args) throws Exception {

    Scanner scan = new Scanner(System.in);
    Calculadora calc = new Calculadora();

    System.out.println("Digite um número: ");
    int a = scan.nextInt();
    System.out.println("Qual operação?");
    String operacao = scan.next();
    System.out.println("Digite outro número: ");
    int b = scan.nextInt();

    int resultOperacao = calc.resultOperacao(a, b, operacao);
    

    System.out.println("O resultado é: " + resultOperacao);
  }
}

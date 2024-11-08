## Calculadora Simples em Java

Este projeto é uma calculadora simples em Java que permite ao usuário realizar operações matemáticas básicas (adição, subtração, multiplicação e divisão) entre dois números. O programa captura a entrada do usuário, realiza a operação desejada e exibe o resultado.

## Estrutura do Projeto
O projeto contém duas classes principais:

- Classe main: Gerencia a interação com o usuário, capturando entradas, validando dados e exibindo resultados.
- Classe Calculadora: Realiza as operações matemáticas com base na entrada do usuário.

## Funcionalidades
- Operações Suportadas: Adição (+), Subtração (-), Multiplicação (*) e Divisão (/).
- Validação de Entrada: O programa verifica se o usuário inseriu um número válido. Em caso de erro de digitação, uma mensagem é exibida e o usuário pode tentar novamente.
- Tratamento de Exceções: Lida com erros de entrada inválida e outras exceções, como divisões por zero, garantindo a estabilidade do programa.

## Como Funciona
1. Interação com o Usuário:
- A classe main captura os valores e a operação que o usuário deseja realizar.
2. Execução da Operação:
- O método resultOperacao da classe Calculadora é chamado para realizar a operação. Ele recebe os dois valores (a e b) e uma string operacao indicando a operação desejada.
- O método identifica a operação com base no símbolo e retorna o resultado.
3. Exibição do Resultado:
- O resultado é exibido no console. Em caso de operação inválida, o método informa o usuário e retorna 0.

## Exemplo de Código - Classe Calculadora
````bash
public class Calculadora {

    public double resultOperacao(double a, double b, String operacao) {
        
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
            if (b == 0) {
                throw new ArithmeticException("Erro: Divisão por zero.");
            }
            return a / b;
        } 
        else {
            throw new IllegalArgumentException("Operação inválida. Use: +, -, *, /");
        }
    }
}
````

## Exemplos de Uso
````bash
Digite um número:
5
Qual operação?
+
Digite outro número:
3
O resultado é: 8.0
`````
Em caso de entrada inválida, como letras ou símbolos não numéricos, o programa exibe uma mensagem de erro e permite ao usuário inserir os valores novamente.

## Requisitos
- Java SE 8 ou superior.

## Exceções Tratadas
- InputMismatchException: Lança uma exceção quando o usuário insere um valor não numérico.
- ArithmeticException: Evita divisões por zero.
- IllegalArgumentException: Lançada se o usuário inserir uma operação inválida.
  
## Como Executar
1. Compile o código:
````bash
javac main.java Calculadora.java
````
2. Execute o programa:
````bash
java main
````

## Possíveis Melhorias
- Adicionar suporte a operações adicionais, como exponenciação e raiz quadrada.
- Implementar uma interface gráfica para tornar o programa mais amigável.
- Permitir a entrada de múltiplas operações em uma única linha.

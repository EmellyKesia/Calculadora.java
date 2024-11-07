## Calculadora Simples em Java

Este projeto é uma calculadora simples em Java que permite ao usuário realizar operações matemáticas básicas (adição, subtração, multiplicação e divisão) entre dois números. O programa captura a entrada do usuário, realiza a operação desejada e exibe o resultado.

## Funcionalidades
- Operações Suportadas: Adição (+), Subtração (-), Multiplicação (*) e Divisão (/).
- Validação de Entrada: O programa verifica se o usuário inseriu um número válido. Em caso de erro de digitação, uma mensagem é exibida e o usuário pode tentar novamente.
- Tratamento de Exceções: Lida com erros de entrada inválida e outras exceções, como divisões por zero, garantindo a estabilidade do programa.

## Estrutura do Código
O código é composto pela classe main, que contém o método main responsável por:

- Capturar as entradas do usuário (números e operação desejada).
- Executar a operação escolhida.
- Exibir o resultado da operação ou uma mensagem de erro se a entrada for inválida.

## Como Funciona
1. O programa solicita ao usuário:
- Primeiro número (a).
- Operação desejada (operacao) – adição, subtração, multiplicação ou divisão.
- Segundo número (b).
2. A operação é realizada pelo método resultOperacao, que precisa ser implementado na classe Calculadora.
3. O resultado é exibido no console.

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
- Outras Exceções: Exibe uma mensagem de erro correspondente se ocorrerem exceções específicas (por exemplo, divisão por zero).
  
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

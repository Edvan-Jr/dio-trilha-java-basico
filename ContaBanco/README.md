# DIO - Trilha Java Básico

#### Autor
[Edvan Miranda](https://github.com/Edvan-Jr)

## Sintaxe - Desafio

Exercício do conteúdo apresentado no módulo de Sintaxe.

1. Criei o projeto `ContaBanco`, que recebe dados via terminal contendo as características de conta em banco conforme atributos abaixo:

| Atributo  | Tipo     | Exemplo   
| --------- | ---------| ------- 
| Numero    | Inteiro  | 1021 
| Agencia   | Texto    | 067-8
| Nome Cliente | Texto    | ED DEV
| Saldo | Decimal |237.48

2. Dentro do projeto, criei a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.
3. Via terminal, o usuário recebe a mensagem de qual informação será solicitada, e insere os dados respectivos; por exemplo:

* Programa: "Digite a agência: "
* Usuário: 1021 *(depois ENTER para o próximo campo)*

4. Depois de todas as informações terem sido inseridas, o sistema exibe a seguinte mensagem:

5. *"[Nome Cliente], obrigado por criar uma conta em nosso banco.
     Sua agência é [Agencia], conta [Numero] e o seu saldo de [Saldo] já está disponível para saque."*
   
Os campos em [ ] corrrespndem às informações inseridas pelo usuário.


### Conteúdos Aplicados

#### Regras de declaração de variáveis
#### Terminal, main args e a classe Scanner
#### Concatenação e classe String com método concat


##### Dificuldades

Aprender a esvaziar o buffer de entrada de dados, com o comando 'scanner.nextLine()', para corrigir falhas na entrada de dados;
Aprender a usar a máscara de moeda para exibição do saldo na saída, com o java.text.NumberFormat.
Obs: Lembrar de fechar o Scanner após o término do uso; e sugestão da IDE de refatoração "Convert to try-with-resources".

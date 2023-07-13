# Estrutura Sequencial

#### 1. Declaração das variáveis

Sintaxe: tipo nome = valor inicial;

ex: `String nome = "Bruno";`

#### 2. Saída de Dados

`System.out.println(x);` // exibe x e quebra a linha

`System.out.print(x);` // exibe x e não quebra linha

Supondo que exista : `double x = 10.49567;`

`System.out.printf("%.2f%n", x);` // o %.2f simboliza a variável de ponto flutuante com 2 casa após o ponto, que no caso é o x que foi declarado a seguir.

Para atribuir as variáveis dentro do printf é necessário identifica-lás da forma correta, sendo:

| Sintaxe | Tipo de Dado    |
| ------- | --------------- |
| %f      | ponto flutuante |
| %d      | inteiro         |
| %s      | texto           |
| %n      | quebra de linha |

O comando printf nativamente retorna usando o ponto flutuante da língua do computador (no caso do português, a virgula), para alterar é necessário importar uma biblioteca e chama-lá:

`import java.util.Locale;`

e dentro do código:

`Locale.setDefault(Locale.US);`

##### Casting

Em um exemplo:

`int a, b;`

`double resultado;`

`a = 5;`

`b = 2;`

`resultado = a / b;`

O resultado retornado será 2.0 pois foi solicitado uma divisão de int, e o programa entende que o resultado deve ser int. Para resolver este problema, é utilizado o casting que se resume em colocar entre parenteses o tipo de variável que é desejada.

`resultado = (double) a/b;`

#### 3. Entrada de Dados

Para realizar a entrada de dados, precisamos criar um objeto do tipo Scanner

`Scanner sc = new Scanner(System.in);`

É necessário o `import java.util.Scanner;` e usar o `sc.close()` quando não precisar digitar mais.

| Tipo de Dado | Sintaxe                    |
| ------------ | -------------------------- |
| String       | `x = sc.next();`           |
| int          | `x = sc.nextInt();`        |
| double       | `x = sc.nextDouble();`     |
| char         | `x = sc.next().chatAt(0);` |

Obs: A entrada do double também tem a necessidade da utilização do Locale para que o usuário possa digitar a entrada utilizando `.` (caso o sistema do computador não esteja em Inglês). O Locale deve ser adicionado antes do Scanner.

Obs²: As entradas acima apenas leem um valor por vez, por exemplo, no caso da String apenas uma palavra será atribuída a variável.

Para ler um texto até a quebra de linha é necessário usar o método `nextLine().

Aviso: Caso haja uma entrada que não seja `nextLine()`, antes de um `nextLine()`, como por exemplo:

`x = sc.nextInt();`

`y = sc.nextLine();`

O `x` irá receber o valor atribuído normalmente, porém o `y` irá receber apenas uma quebra de linha (ficará em branco), para isso não acontecer, é necessário adicionar um `nextLine()` entre os dois, sem uma variável atribuída a ele, como por exemplo:

`x = sc.nextInt();`

`sc.nextLine();`

`y = sc.nextLine();`








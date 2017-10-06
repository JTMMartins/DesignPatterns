### Prototype pattern

Incluí-se nos padrões de desenvolvimento creacionais *(Creational Patterns)*

O padrão *prototype* tem por objectivo a criacão de objectos a partir de um modelo original (o protótipo) que é clonado
dando origem a novos objectos idénticos ao protótipo.

Por vezes a criacão de um objecto pode envolver custos computacionais elevados, e sempre que isso acontece, o padrão *prototype*
deve ser equacionado como uma possivel solucão.

Imaginemos que necessitamos de criar um objecto a partir de dados provenientes de uma base de dados, ou até de uma
chamada a uma API remota via HTTP.

Após obtermos esse objecto, imaginemos que a nossa a aplicacão ao longo do seu ciclo de vida necessita de manipular
atributos ou estados desse objecto várias vezes. Se de cada vez que necessitarmos do objecto inicial, tivermos de ir à base de dados
ou efectuar a chamada HTTP, vamos desperdicar tempo e recursos.

O ideal seria termos sempre o objecto original em memória local e reutiliza-lo.

Esse é o principal problema que o padrão *prototype* pretende resolver. Após termos o objecto inicial, guardamo-lo e
trabalhamos apenas com clones desse objecto. Sempre que o objecto "original" for necessário, só necessitaremos de solicitar
uma nova cópia (clone).

Em resumo, Após termos um objecto, trabalhamos e manipulamos apenas cópias desse mesmo objecto e nunca alteramos o
objecto inicial.

Um dos requisitos indicados nas boas práticas, é que o objecto inicial disponibilize ele próprio um método para clonagem,
ou seja, a clonagem não deve ser feita a partir de uma outra classe.

A API java disponibiliza-nos o interface Cloneable, que podemos (e devemos) utilizar como um contrato para as nossas
classes que necessitem de implementar a funcionalidade de clonagem.

As clonagens podem ser feitas de duas formas

1. Superficiais (*shallow copy*)
2. Profundas (*deep copy*)

dependendo dos objectivos teremos de optar por um dos dois métodos.

Numa cópia superficial (*shallow copy*), apenas o objecto principal é clonado. Ou seja, se um objecto for composto por vários objectos,
a clonagem vai devolvernos uma cópia do objecto principal, mas os seus objectos interiores continuarão a ser os mesmos,
logo se alterarmos algum dos seus objectos interiores, iremos alterar também os objectos interiores do objecto original.

Imaginemos o objecto pessoa, que lá dentro contém um objecto filiacão. Ao clonarmos o objecto pessoa, recebemos uma
nova pessoa, mas o objecto filiacão continua a ser o mesmo. Alterar o objecto afiliacão no clone de pessoa, irá alterar
também o objecto afiliacão na pessoa original.

Numa cópia profunda (*deep copy*), iremos obter uma cópia de toda a estrutura do objecto, totalmente independente do objecto original,
e alterar o objecto morada no clone de pessoa não irá afectar o objecto morada em pessoa original.

Por defeito, quando utilizamos o interface Cloneable da API JAVA, o método de clonagem será superficial (*shallow copy*).
Caso necessitemos de efectuar uma cópia profunda (deep copy) deveremos utilizar uma implementacão ligeiramente diferente, que depende
do que quisermos obter.

Deveremos analizar as situacões com cuidado, pois a clonagem shallow utiliza menos recursos que a clonagem deep, e como
tal deveremos optar pela deep, apenas se tal for realmente necessário.

No exemplo apresentamos duas solucões. Uma é composta pela classe Person e a outra pela classe PersonDeep.

AppDeep e AppShallow tentam demonstrar a diferenca entre os dois métodos de clonagem.

Quando utilizamos a DeepCopy nos nossos projectos, devemos confirmar que não deixamos espaco para erros do tipo NullPointer.





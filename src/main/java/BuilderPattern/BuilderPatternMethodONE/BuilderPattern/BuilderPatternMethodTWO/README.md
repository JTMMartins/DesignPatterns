### BUILDER PATTERN Método 1

Incluí-se nos padrões de desenvolvimento creacionais *(Creational Patterns)*

O padrão builder foi pensado para resolver alguns dos problemas que ocorrem com as Factories quando um objecto contém um
grande número de atributos e a sua criacão apresenta alguma complexidade.

O objectivo é separar a construcão de um objecto complexo da sua representacão por forma a que um mesmo processo de construcão
nos permita criar diferentes representacões desse objecto.

Quando necessitarmos de passar um grande número de parâmetros para um objecto, estamos a aumentar a probabilidade
de introduzir erros sendo que também nos é dificil de manter a percepcão de qual a ordem correcta pela qual os parâmetros devem
ser colocados.

Por outro lado, alguns parâmetros podem ser opcionais, e nesse caso normalmente enviamo-los com *null*

Claro que podemos resolver estes problemas utilizando um construtor com parametros eventualmente essenciais e depois um grande número de
*getters* e *setters*, no entanto isto deixa o objecto num estado inconsistente até que todos os atributos estejam definidos.
Para ajudar, não é elegante e não facilita a leitura fluente do código.


A forma como o *builder* resolve isto é fornecendo-nos uma forma de construirmos um objecto passo a passo disponibilizando-nos
um método (normalmente denominado *build()*) que nos devolverá o objecto já perfeitamente construido.

Para criarmos um *builder* a forma mais prática é

1. Criar uma classe interior (*static*) e copiar todos os argumentos da classe exterior para essa classe *builder*. A
convencão que normalmente se utiliza no nome a utilizar na classe interior é adicionar o sufixo 'builder' ao nome da classe
exterior. Assim se a classe exterior se chamar "Radio" a classe interior deverá chamar-se RadioBuilder. (isto é apenas uma
convencão e não uma obrigatoriedade)
2. A classe Builder deverá ter um construtor público com todos os atributos necessários como parametros.
3. Deve ser disponibilizado um método *build()* (uma vez mais isto é uma convencão) que irá devolver o objecto solicitado.
Para isso utilizamos um construtor privado na class principal cujo argumento é a sua classe interior.

NOTA : podemos, caso seja necessário, ter mais que uma classe *builder*, cada uma utilizando os passos necessários para a criacão do
objecto.

O exemplo é bastante simples.

Imaginemos que temos uma loja de bolos que atende pedidos ao balcão e a receita do bolo pretendido pelo cliente sai
numa impressora na cozinha.

Para ser simples nossa loja só vende 2 tipos de bolos...Bolo de Cereja e Bolo de Morango, mas podemos com facilidade
adicionar novos bolos mantendo o mesmo processo de construcão do objecto bolo.





### BUILDER PATTERN

Incluí-se nos padrões de desenvolvimento creacionais *(Creational Patterns)*

O padrão builder foi pensado para resolver alguns dos problemas que ocorrem com as Factories quando um objecto contém um
grande número de atributos e a sua criacão apresenta alguma complexidade.

O objectivo é separar a construcão de um objecto complexo da sua representacão por forma a que um mesmo processo de construcão
nos permita criar diferentes representacões desse objecto.

Quando necessitarmos de passar um grande número de parâmetros para um objecto, estamos a aumentar a probabilidade
de introduzir erros sendo que também nos é dificil de manter a percepcão de qual a ordem correcta pela qual os parâmetros devem
ser colocados.

Por outro lado, alguns parâmetros podem ser opcionais, e nesse caso normalmente enviamo-los com *null*, o que não é bonito
e pode estar a abrir caminho para os famosos *null pointer exception*

Claro que podemos resolver estes problemas utilizando um construtor com os parametros eventualmente essenciais e depois um grande número de
*getters* e *setters*, no entanto isto deixa o objecto num estado inconsistente até que todos os atributos estejam definidos.
Para ajudar, não é elegante e não facilita a leitura fluente do código.

Vamos utilizar 2 formas de aplicar o padrão *Builder*. O método 1, o mais simples, e o método 2, mais
elaborado e flexivel.
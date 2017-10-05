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

Neste exemlo, o *builder* resolve o problema de termos de criar um objecto com vários parametros de uma forma simples,
Construimos o objecto passo a passo e no final chamamos o método *build()* que nos devolverá o objecto já perfeitamente
construido.

Para criarmos este tipo de *builder*


1. Criamos a classe que representa o nosso objecto, com todos os atributos que o mesmo necessita.

2. Criamos uma classe interior (*static*) e copiamos todos os atributos da classe exterior para essa classe *builder*. A
convencão que normalmente se utiliza no nome a utilizar na classe interior é adicionar o sufixo 'builder' ao nome da classe
exterior. Assim se a classe exterior se chamar "Radio" a classe interior deverá chamar-se RadioBuilder. (isto é apenas uma
convencão e não uma obrigatoriedade)

3. A classe Builder deverá ter um construtor público com todos os atributos necessários como parametros.

4. Disponibilizamos um método *build()* (uma vez mais isto é uma convencão) que irá devolver o objecto solicitado.
Para isso utilizamos um construtor privado na class principal cujo argumento é a sua classe interior.

NOTA : podemos, caso seja necessário, ter mais que uma classe *builder*, cada uma utilizando os passos necessários para a criacão do
objecto.

O exemplo é bastante simples.

Imaginemos que pretendemos criar uma janela no ecrã. Para definirmos essa janela usamos uma classe Window.
Para definir a janela, necessitamos de informar :

* Coordenada X do canto superior esquerdo.
* Coordenada Y do canto superior esquerdo.
* Comprimento da Janela.
* Altura da Janela.
* Título da Janela.
* Côr de fundo para preenchimento da janela.

Se enveredarmos pela estratégia normal de criar um construtor que receba esses parametros iremos ficar  algo do tipo :

`Window window = new Window (100,100,200,300,"Clientes",35,127,32)`

Quem olhar para esse código ficará sem saber o que significam todos aqueles números, e como tal terá de consultar
a documentacão ou ir verificar o código da classe window. Se necessitar de criar várias janelas ao longo da aplicacão
provavelmente terá de anotar num papel, o que significam os parametros para não se enganar.

Setters ajudariam...Mas será que não existe uma forma melhor ?

É ai que vai entrar o builder que nos permitirá criar o objecto passo a passo, valida-lo e devolve-lo já criado
num estado consistente ficando no nosso código muito mais compreensivel e fluente.

        `Window window = new Window.WindowBuilder()
                            .withLeftTopcornerPositionX(100)
                            .withLeftTopCornerPositionY(100)
                            .withHeight(300)
                            .withWidth(600)
                            .fillWithRGB(125,180,28)
                            .withTitle("Janela Numero 3")
                            .build();`

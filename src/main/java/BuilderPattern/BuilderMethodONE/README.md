### BUILDER PATTERN Método 1




Neste método, o *builder* resolve o problema de termos de criar um objecto com vários parametros de uma forma simples,
Construimos o objecto passo a passo e no final chamamos o método *build()* que nos devolverá o objecto já perfeitamente
construido.

Para criarmos este tipo de *builder*


1. Criamos a classe que representa o nosso objecto, com todos os atributos que o mesmo necessita.

2. Criamos uma classe interior (*static*) e copiar todos os argumentos da classe exterior para essa classe *builder*. A
convencão que normalmente se utiliza no nome a utilizar na classe interior é adicionar o sufixo 'builder' ao nome da classe
exterior. Assim se a classe exterior se chamar "Radio" a classe interior deverá chamar-se RadioBuilder. (isto é apenas uma
convencão e não uma obrigatoriedade)

3. A classe Builder deverá ter um construtor público com todos os atributos necessários como parametros.

4. Disponibilizamos um método *build()* (uma vez mais isto é uma convencão) que irá devolver o objecto solicitado.
Para isso utilizamos um construtor privado na class principal cujo argumento é a sua classe interior.

NOTA : podemos, caso seja necessário, ter mais que uma classe *builder*, cada uma utilizando os passos necessários para a criacão do
objecto.

Este exemplo é bastante simples.

Imaginemos que temos uma loja de bolos que atende pedidos ao balcão e a receita do bolo pretendido pelo cliente sai
numa impressora na cozinha.

Para ser simples nossa loja só vende 2 tipos de bolos...Bolo de Cereja e Bolo de Morango, mas podemos com facilidade
adicionar novos bolos mantendo o mesmo processo de construcão do objecto bolo.

Por este método ser tão simples e apenas com uma classe (embora contenha uma classe interna) não criamos nenhuma
representacão UML.







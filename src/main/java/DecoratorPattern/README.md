### Decorator

Inclui-se nos padrões de desenvolvimento estruturais *(Structural Patterns)*

A definicão de *Decorator* diz-nos que este padrão permite alterar o comportamento de um
objecto, de forma estática ou dinâmica (durante o run-time), sem afectar o comportamento de
outros objectos da mesma classe.

Pessoalmente prefiro dizer que o *Decorator* é uma alternativa à criacão de subclasses, com
o intuito de alterar ou obter mais funcionalidades para um objecto.

O conceito de *Decorator*, não é muito dificil de entender, no entanto a sua implementacão tem
algumas características que, enquanto não assimilarmos bem os conceitos de composicão e herditariedade,
nos podem deixar um bocado confusos. (pelo menos a mim deixaram-me umas horas a pensar).

Para simplificar vamos imaginar o *Decorator* como um invólucro, ou seja um objecto que dentro de si
contém outro objecto.

Quando queremos "falar" com o objecto no interior do *Decorator*, temos de "conversar" com esse *Decorator*,
que irá actuar com um intermediário, sendo portanto ele que depois irá transmitir a nossa mensagem
ao objecto que se encontra no seu interior.

Isso significa que podemos interceptar e manipular as "perguntas" ao objecto interior, bem como as "respostas"
que esse objecto interior disponibiliza.

Na realidade, isto não parece nada de especial nem tão pouco complexo, mas se comecarmos a imaginar
que um objecto pode ser decorado um sem número de vezes, consoante as nossas necessidades, acabamos
com um objecto (*decorator*) que dentro de si contém outro *decorator*, que por sua vez contém outro *decorator*
e assim sucessivamente até chegarmos ao objecto inicial (o que foi decorado). E isto pode já comecar a fazer
alguma confusão.

Podemos tentar visualizar da seguinte forma :

Situacao inicial

![Decorator1](Decorator1.png)

Situacão final

![Decorator2](Decorator2.png)

Perante uma situacao destas, e para que possamos comunicar com o objecto A, é necessário que todos os *decorators*
que o envolvem sejam do mesmo tipo do objecto A e ao mesmo tempo também se torna necessário que todos os decoradores
possuam pelo menos os mesmos métodos do objecto A. Como podemos imaginar, iremos sempre contactar o objecto mais exterior, que por
sua vez irá comunicar com o objecto que se encontra imediatamente a seguir e assim sucessivamente até chegarmos ao
Objecto A.

Para conseguir esta "estrutura" para as classes, iremos utilizar um interface que o nosso "objecto simples" irá implementar.
De seguida todos os nossos decorators irão também implementar esse interface directamente ou através de herditariedade. (este é um
excelente exemplo do bom uso que se pode dar à herditariedade)

Isto irá permitir que o cliente comunique com os *decorators* exactamente da mesma forma como se estivesse a lidar directamente
com o objecto mais interior e como tal não tem conhecimento se está a lidar com o Objecto A ou com um dos seus decoradores.

Este processo, tem na realidade uma inifidade de aplicacões, que normalmente não vislubramos imediatamente.

Para este pattern vamos encontrar 2 exemplos (nas pastas ExampleONE e ExampleTWO). O primeiro exemplo é o que se
encontra normalmente em livros sobre este tema, no entanto parece-me um bocado limitado, pois não estamos a alterar
nenhum comportamento, e estamos apenas a fazer um pequeno cálculo através da leitura de uma propriedade. Já o segundo
exemplo, tenta representar uma funcionalidade mais útil e mais parecida com algo que possa ser necessário na vida
real e que demonstra como podemos adicionar e combinar funcionalidades em caso de necessidade.



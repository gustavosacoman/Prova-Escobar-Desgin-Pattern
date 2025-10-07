# Prova 01 Escobar

### Description

- Um Adento, quando for testar voce deve entrar na pasta das questoes para realizar os testes pois os objetos nao estao com package por questao.

## Questao 01 - Factory

### Justificativa: 
- Eu escolhi utilizar o modelo factory pois esse design pattern possibilita a criação dos tipos de transporte de forma genérica em que você possa simplesmente instaciar a fabrica e receber o valor desejado, o programador não tem a necessidade de saber como acontece a regra de negócio que gera o valor. Decidi não utilizar service pois o exercicio deixa claro o tratamento de froma genérica, assim o programador tem total liberdade de instacias a factories e utilizar no código.

- Link: [Questão 01](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao01)

### Diagrama 01 

![Diagrama01](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/raw/main/assets/Diagrama%20de%20classes%2001.png)


- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2001.png)


## Questao 02 - Factory

### Justificativa

- Eu escolhi utilizar o modelo factory novamente pois esse design pattern possiblita a criação dos meios de pagamento de forma genérica em que voce somente necessita instaciar a fabrica e aplicar o meio de pagamento correto, o programado não tem a necessidade de saber como funciona a regra de negócio que faz o pagamento. Decidi utilzar a service nesse exercicio pois nele havia a necessidade de um processador para poder utilizar os meios de pagamentos, entao chama-se a service para e a própria service orquestra as classes que sao enviadas, dando liberdade para o programador configure a classe que ele quer usar para a chamada de pagamento.

- Link: [Questão 02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao02)

### Diagrama 02

![Diagrama02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/raw/main/assets/Diagrama%20de%20classes%2002.png)

- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2002.png)

## Questao 03 - Observer

### Justificativa

- Eu escolhi utilizar o modelo observer, pois ele aplica exatamente aquilo que o cliente está pedindo que seria a possibilidade de enviar notificações para somente um grupo ao mesmo tempo, ou seja, o Subject vai observar a classe e ver se há alguma notificação quando aplicado o notifyObserver, entao todos que tem o observer sao notificados, a escolha da utilização do dicionario foi justamente para poder separar os usuarios em grupos, assim como é pedido pelo cliente, entao passo a chave Sports mais o user que implementa a interface observer, entao o subject lidaria com cada grupo.

- Link: [Questão 03](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao03)

### Diagrama 03 

![Diagrama02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/raw/main/assets/Diagrama%20de%20classes%2003.png)

- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2003.png)

## Questao 04 - Decorator

### Justificativa

- Eu escolhi usar o decorator pois ele é um modelo que foi feito para adicionar novas funcionalidade sem alterar o objeto original que no caso aqui seria o Report, ele cria subClasses que podem ser utilizadas para adicionar mais coisas que era o que o cliente estava pedindo, um relatorio basico que pudesse ir acrescentando mais peças a ele conforme o desejo do cliente

- Link: [Questão 04](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao04)

### Diagrama 04 

![Diagrama02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/raw/main/assets/Diagrama%20de%20classes%2004.png)

- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2004.png)


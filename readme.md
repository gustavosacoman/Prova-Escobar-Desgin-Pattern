# Prova 01 Escobar

## Questao 01 - Factory

### Justificativa: 
- Eu escolhi utilizar o modelo factory pois esse design pattern possibilita a criação dos tipos de transporte de forma genérica em que você possa simplesmente instaciar a fabrica e receber o valor desejado, o programador não tem a necessidade de saber como acontece a regra de negócio que gera o valor. Decidi não utilizar service pois o exercicio deixa claro o tratamento de froma genérica, assim o programador tem total liberdade de instacias a factories e utilizar no código.

- Link: [Questão 01](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao01)

### Diagrama 01 

- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2001.png)

## Questao 02 - Factory

### Justificativa

- Eu escolhi utilizar o modelo factory novamente pois esse design pattern possiblita a criação dos meios de pagamento de forma genérica em que voce somente necessita instaciar a fabrica e aplicar o meio de pagamento correto, o programado não tem a necessidade de saber como funciona a regra de negócio que faz o pagamento. Decidi utilzar a service nesse exercicio pois nele havia a necessidade de um processador para poder utilizar os meios de pagamentos, entao chama-se a service para e a própria service orquestra as classes que sao enviadas, dando liberdade para o programador configure a classe que ele quer usar para a chamada de pagamento.

- Link: [Questão 02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/tree/main/Questao02)

### Diagrama 02

    ![Diagrama02](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2002.png)

- Link: [Diagrama](https://github.com/gustavosacoman/Prova-Escobar-Desgin-Pattern/blob/main/assets/Diagrama%20de%20classes%2002.png)

 
Informações Gerais sobre o Projeto:
O nosso projeto simula um teste de vocação por meio de um quiz. Ele é inspirado em um projeto anterior que fizemos na disciplina de Start Up no primeiro semestre, com a diferença que naquela ocasião fizemos um jogo de cartas, e aqui adaptamos para um código, ignorando a parte do cardgame e tratando apenas como um quiz.
O quiz funciona da seguinte maneira: são 28 perguntas, cada uma delas contendo 2 possíveis respostas, e dependendo da resposta que o jogador escolher, ele vai pontuar em uma "personalidade" específica, e no final dependendo da pontuação em cada personalidade vai gerar um resultado que configura numa descrição do perfil e recomendações de carreiras.

Informações sobre as Classes e suas Relações: 
Console - Contém apenas o método lerInt e lerString
Lista - Contém a lista de perguntas e o método para apresentá-las no Sistema
Main - Praticamente vazia, apenas faz a ponte para executar o menu no Sistema
Pergunta - Classe da pergunta em si, contendo a sua estrutura com opções e se relacionando com a Personalidade
Personalidade - Contém as personalidades e todos os métodos necessários para as suas funcionalidades, incluindo o sistema de pontuações
Resultados - Todas as funcionalidades que envolve os resultados do quiz, incluindo o armazenamento (que interage com o sistema de pontuação da classe Personalidade), como a exibição (tanto da jogatina individual em questão como a exibição de todos os resultados prévios), e também o registro desses resultados em um arquivo através de persistência de dados
Sistema - Onde o código é rodado através de um menu interativo que contém 3 opções: Jogar, Resultado e Sair
Vocacao - Esse é o resultado final do jogo, e contém apenas um método, que é para recolher as pontuações da Personalidade, de resto optamos por fazer um if else onde simplesmente imprime um texto com a vocação da pessoa baseado na sua respectiva combinação de pontuações

Como Executar o Projeto:
Não tem segredo, ao rodar o código automaticamente a Main vai executar o menu da classe Sistema.

Uso do ChatGPT:
Por não ter um domínio tão grande da disciplina, acabamos utilizando bastante o ChatGPT no começo, mas na reta final do trabalho praticamente não usamos, visto que na resolução de erros notamos que ele não era de grande ajuda, e conforme adquirimos uma familiaridade maior com a linguagem ficou mais fácil fazer alterações sem precisar de ajuda.
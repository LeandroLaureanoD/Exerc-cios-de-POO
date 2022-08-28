# Exercícios-de-POO

1) Crie a classe Jogador descrita no “diagrama” abaixo
      id: int
      nome: String
      apelido: String
      dataNascimento: Date
      numero: int
      posicao: String
      qualidade: int
      cartoes: int
      suspenso: Boolean
      Jogador()
      Jogador(all attrs)
      verificarCondicaoDeJogo(): Boolean

      a)Cadastrar/Instanciar pelo menos um time completo 11 jogadores.

      b) Criar um método que verifica a condição de jogo, ou seja, um método booleano
      que retornará true se o jogador está apto a jogar e false se o jogador está
      suspenso. Note que um jogador está suspenso pelo 3 cartão amarelo ou
      quando recebe uma punição cartão vermelho ou em uma decisão do tribunal.

      c) Em uma outra classe, crie o método main, o qual cadastra os jogadores e ao
      final imprimirá a lista do “plantel” juntamente com a informação de quem está
      apto a jogar, conforme a figura abaixo.

      d) Crie novos métodos na classe Jogador:
      • aplicarCartao(int quantidade): void - Aplica a quantidade de cartões
      informada ao jogador, adicionalmente pode tornar um jogador suspenso.
      • cumprirSuspencao(): void – Esse método vai zerar a quantidade de
      cartões e tornar o jogador apto a jogar
      • sofrerLesao(): void – Este método vai gerar aleatoriamente um lesão no
      jogador. A gravidade da lesão irá se refletir em uma redução da qualidade
      do jogador, quanto mais grave maior a redução da qualidade. Crie uma
      escala de redução de no mínimo 1 ponto até o máximo de 15% da qualidade
      total do jogador. Note que a qualidade jamais pode ficar negativa. A tabela
      abaixo pode ser utilizada como referência: 

      Probabilidade Qualidade decrementada
      5% 		15% do total da qualidade
      10% 		10% do total da qualidade
      15% 		5% do total da qualidade
      30% 		2 pontos
      40% 		1 ponto

      •executarTreinamento(): void – A exemplo do método anterior, este método
      aleatoriamente vai aumentar a qualidade do jogador. Note que só pode ser
      executado 1 treinamento antes de cada partida (você deve adicionar um
      atributo na classe para poder controlar essa informação). Além disso, deve
      existir uma maior probabilidade para pequenos incrementos na qualidade
      conforme a seguinte tabela:


      Probabilidade Qualidade incrementada
      5% 5 pontos
      10% 4 pontos
      15% 3 pontos
      30% 2 pontos
      40% 1 ponto

      Observe que a qualidade nunca pode superar o máximo de 100 pontos.
      Além disso, você deverá adicionar mais um atributo na classe jogador para
      poder controlar os jogadores que já efetuaram o treinamento e que só
      poderão treinar após o próximo jogo.

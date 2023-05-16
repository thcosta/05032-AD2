# Sobre o programa

## Classes
As classes construídas foram:
- **Time**: representa um time; possui quantidade de pontos acumulada, quantidade de vitórias e os jogos em que competiu;
- **Participante**: representa um time em uma partida; possui o time e a quantidade de pontos daquele time na partida;
- **Jogo**: representa uma partida; possui a data e hora (um só campo) e os dois participantes
- **Campeonato**: representa o campeonato; possui os times que jogam nesse campeonato e a quantidade de colocados permitida; 
- **Teste**: cria o campeonato e realiza a leitura dos dados do arquivo, adicionando os jogos ao campeonato e, por fim, mostrando sua classificação; 

## Rodando o programa
1 - Compile o programa utilizando a classe de teste:  
```$ javac Teste.java```  
2 - Coloque o arquivo de entrada no mesmo diretório do programa. O arquivo `entrada` pode ser usado para teste.  
3 - Rode o programa utilizando o object class criado de teste e como argumentos o nome do arquivo de entrada e a quantidade desejada de colocações:  
```$ java Teste entrada 3```
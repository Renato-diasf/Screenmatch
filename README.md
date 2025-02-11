# 📺 ScreenMatch  

Screenmatch é uma aplicação Java que gerencia informações sobre filmes e séries, permitindo calcular duração total, recomendação de classificação e média de avaliações.

Estrutura do Projeto

Classes Principais:

Titulo: Classe base para representar filmes e séries.

Filme: Extende Titulo, adicionando informações específicas para filmes.

Serie: Extende Titulo, calculando a duração total com base no número de episódios.

Episodio: Representa um episódio de uma série e implementa Classificavel.

Calculadora: Calcula o tempo total para assistir uma lista de títulos.

FiltroRecomendacao: Aplica regras de classificação a um título baseado em sua avaliação.

Testes Automatizados

O projeto conta com testes unitários para validar o comportamento das principais funcionalidades.

FilmeTest

Testa a média de avaliação de um filme.

Cria um objeto Filme e adiciona avaliações.

Verifica se a média calculada é a esperada.

SerieTest

Testa o cálculo da duração total de uma série.

Configura o número de temporadas, episódios e duração por episódio.

Confirma se o resultado final corresponde à soma esperada.

EpisodioTest

Testa a classificação de um episódio com base no número de visualizações.

Define um número de visualizações e verifica se a classificação retornada é correta.

CalculadoraTest

Valida o cálculo do tempo total da Calculadora.

Adiciona um filme e uma série.

Confirma se a soma das durações está correta.

FiltroRecomendacaoTest

Testa o funcionamento do filtro de recomendação.

Avalia um filme e aplica o filtro.

Confirma se a classificação atribuída está correta.

## 🚀 Como executar  

1. Clone o repositório:  
   ```sh
   git clone https://github.com/Renato-diasf/Screenmatch.git
   cd Screenmatch

2. Compilar e executar os testes
   ```sh
   mvn clean test

4. Para rodar a aplicação:
   ```sh
   mvn exec:java -Dexec.mainClass="br.com.diaslitz.screenshot.principal.Principal"

Caso o mvn não dê certo, os testes podem ser executados individualmente, sendo estes o SerieTest, FilmeTest, CalculadoraTest, EpisodioTest e FiltroRecomendacaoTest;


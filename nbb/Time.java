package nbb;
import java.util.ArrayList;

public class Time implements Comparable<Time>{
  private ArrayList<Jogo> jogos;
  private int pontos;
  private int vitorias;
  private String nome;

  public Time(String nome) {
    this.nome = nome;
    this.pontos = 0;
    this.vitorias = 0;
    this.jogos = new ArrayList<Jogo>();
  }

  public void adicionaJogo(Jogo jogo, int pontos){
    this.jogos.add(jogo);
    this.adicionaPontos(pontos);
  }

  public void adicionaVitoria(){
    this.vitorias += 1;
  }

  public String getNome(){ return this.nome; }
  public int getPontos(){ return this.pontos; }
  public int getVitorias(){ return this.vitorias; }

  /*
   * Compara com outro time de maneira reversa
   * Critérios:
   * - Maior número de vitórias
   * - Se número de vitórias for igual
   *    - Maior pontuação
   */
  @Override
  public int compareTo(Time outroTime) {
    if(this.getVitorias() > outroTime.getVitorias()){
      return -1;
    } else if(this.getVitorias() < outroTime.getVitorias()){
      return 1;
    } else if(this.getPontos() > outroTime.getPontos()){
      return -1;
    } else if(this.getPontos() < outroTime.getPontos()){
      return 1;
    }
    else return 0;
  }

  @Override
  public String toString(){
    return String.format("%s - %i Vitórias e %i Pontos", this.getNome(), this.getVitorias(), this.getPontos()).toString();
  }

  private void adicionaPontos(int pontos){
    this.pontos += pontos;
  }
}

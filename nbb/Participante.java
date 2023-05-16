package nbb;

public class Participante {
  private Time time;
  private int pontuacao;

  public Participante(Time time, int pontuacao){
    this.time = time;
    this.pontuacao = pontuacao;
  }

  public Time getTime() { return this.time; }
  public int getPontuacao() { return this.pontuacao; }
}

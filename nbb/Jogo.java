package nbb;
import java.util.ArrayList;

public class Jogo {
  String data;
  String hora;
  private ArrayList<Participante> participantes;

  public Jogo(String data, String hora){
    this.data = data;
    this.hora = hora;
    this.participantes = new ArrayList<Participante>();
  }

  public void adicionaTime(Time time, int pontos){
    Participante participante = new Participante(time, pontos);
    this.participantes.add(participante);
    time.adicionaJogo(this, pontos);
  }

  public void setaVitoria(){
    Participante participante1 = this.participantes.get(0);
    Participante participante2 = this.participantes.get(1);
    if(participante1.getPontuacao() > participante2.getPontuacao()){
      participante1.getTime().adicionaVitoria();
    } else if(participante1.getPontuacao() < participante2.getPontuacao()){
      participante2.getTime().adicionaVitoria();
    }
  }
}

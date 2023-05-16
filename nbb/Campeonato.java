package nbb;
import java.util.ArrayList;
import java.util.Collections;
import java.time.Year;

public class Campeonato {
  private int qtd_colocados;
  private ArrayList<Time> times;

  public Campeonato(int qtd_colocados){
    this.qtd_colocados = qtd_colocados;
    this.times = new ArrayList<Time>();
  }

  public void adicionaJogo (String data_hora, String time1,  String time2, int pontos1, int pontos2) {
    String nome_times[] = {time1, time2} ;
    int pontos[] = {pontos1, pontos2} ;
    String[] dados_data = data_hora.split(" ");
    int ano = Year.now().getValue();
    Jogo jogo = new Jogo(dados_data[0] + ano, dados_data[1]);
    Time time = null;
    for (int i = 0; i < 2; i++ ){
      time = buscaOuCriaTime(nome_times[i]);
      jogo.adicionaTime(time, pontos[i]);
    }
    jogo.setaVitoria(); 
  }

  public void getCampeoes(){
    Collections.sort(times);
    for(int i=0; i < qtd_colocados; i++){
      System.out.println("Colocação " + (i+1) + " - " + times.get(i).getNome());
    }
  }

  public void getClassificacaoGeral(){
    Collections.sort(times);
    int colocacao = 1;
    for(Time time : times){
      System.out.println("Colocação " + colocacao + " - " + time.toString());
      colocacao++;
    }
  }

  private Time buscaOuCriaTime(String nome){
    for(Time time : this.times){
      if(time.getNome().equals(nome)){
        return time;
      }
    } 
    Time novoTime = new Time(nome);
    times.add(novoTime);  
    return novoTime;
  }
}

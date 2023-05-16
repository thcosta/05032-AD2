import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import nbb.*;

public class Teste {
  public static void main(String[] args) throws IOException{
    Campeonato campeonato = new Campeonato(Integer.parseInt(args[1]));
    BufferedReader buffer = new BufferedReader(new FileReader(args[0]));
    try {
      String linha;
      while((linha = buffer.readLine()) != null){
        String[] dados = linha.split("/");
        campeonato.adicionaJogo(dados[0], dados[1], dados[2], Integer.parseInt(dados[3]), Integer.parseInt(dados[4]));
      }      
      buffer.close();
      campeonato.getCampeoes();
      // campeonato.getClassificacaoGeral();
    } catch (Exception e){
      System.out.println("Exceção: \n" + e.getClass() + e.getCause() + e.getMessage());   
    }
  }
}

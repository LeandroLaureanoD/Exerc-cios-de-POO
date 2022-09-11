import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class Time {
    private String nome;
    private String apelido;
    private String fundacao;
    public ArrayList<Jogador> plantel;
    public ArrayList<Jogador> relacionadosList;

    public Time(){
    }

    //CONTRUTOR CLASSE TIME
    public Time(String nome, String apelido, String fundacao, ArrayList<Jogador> plantel, ArrayList<Jogador> relacionadosList) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionadosList = relacionadosList;
    }

    //METODOS
    public ArrayList<Jogador> relacionarJogadores (){
        List jogadores = plantel.stream().sorted(Comparator.comparing(Jogador::getQualidade).reversed()).limit(2).collect(Collectors.toList());
        relacionadosList = new ArrayList<Jogador>(jogadores);
        return relacionadosList;

    }

    public String toString(){
        return "Titulares do " + nome;
    }
}

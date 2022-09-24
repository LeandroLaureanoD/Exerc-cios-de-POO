import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
public class Time {
    private String nome;
    private String apelido;
    private String fundacao;
    public ArrayList<Jogador> plantel;
    public ArrayList<Jogador> relacionadosList;

    //CONTRUTOR CLASSE TIME
    public Time(String nome, String apelido, String fundacao, ArrayList<Jogador> plantel, ArrayList<Jogador> relacionadosList) {
        this.nome = nome;
        this.apelido = apelido;
        this.fundacao = fundacao;
        this.plantel = plantel;
        this.relacionadosList = relacionadosList;
    }
    //METODOS
    public ArrayList<Jogador> relacionarJogadoresTitular (){
        relacionadosList = plantel.stream().sorted(Comparator.comparing(Jogador::getQualidade).reversed()).limit(11).collect(Collectors.toCollection(ArrayList::new));
        return relacionadosList;

    }
    public ArrayList<Jogador> relacionarJogadoresReserva (){
        relacionadosList = plantel.stream().sorted(Comparator.comparing(Jogador::getQualidade).reversed()).skip(11).collect(Collectors.toCollection(ArrayList::new));
        return relacionadosList;

    }

    public String toString(){
        return "Clube " + nome + "\n";
    }
}

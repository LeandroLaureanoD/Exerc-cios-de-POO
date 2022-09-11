public class Jogador{
    private int id;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int numero;
    private String posicao;
    private int qualidade;

    //CONNSTRUTOR CLASE JOGADOR
    public Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
    }

    public int getQualidade() {
        return qualidade;
    }

    public String toString(){
        return numero + " " + nome + " " + qualidade;
    }
}

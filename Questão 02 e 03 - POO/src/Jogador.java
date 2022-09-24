import java.util.Random;

public class Jogador{
    private int id;
    private String nome;
    private String apelido;
    private String dataNascimento;
    private int numero;
    private String posicao;
    private double qualidade;
    private int cartoes;
    private boolean treino;
    private boolean suspenso;
    //Constructor class jogador

    public Jogador() {
    }
    public Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao, double qualidade, int cartoes, boolean suspenso, boolean treino) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
        this.treino = treino;
    }
    //Getter
    public double getQualidade() {
        return qualidade;
    }
    public boolean getTreino() {
        return treino;
    }
    public String getNome() {
        return nome;
    }
    //Method
    public void aplicarCartao(int qtdCartoes) {
        this.cartoes = this.cartoes + qtdCartoes;
        if(this.cartoes >= 3) {
            this.suspenso = true;
        }
        System.out.println(this.nome);
    }
    public void sofrerLesao() {
        Random gerarNumeroLesao = new Random();
        int lesao = gerarNumeroLesao.nextInt(5);
        if (lesao >= 1) {
            switch (lesao) {
                case 1:
                    qualidade = this.qualidade - (this.qualidade * 0.15);
                    break;
                case 2:
                    qualidade = this.qualidade - (this.qualidade * 0.10);
                    break;
                case 3:
                    qualidade = this.qualidade - (this.qualidade * 0.5);
                    break;
                case 4:
                    qualidade -= 2;
                    break;
            }
        }
        System.out.println(this.nome);
    }
    public String toString(){
        return "Camisa " + numero + " " + nome + " - Qualidade: " + qualidade + "\n";
    }
}

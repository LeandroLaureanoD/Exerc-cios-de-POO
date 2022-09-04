import java.security.PublicKey;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Jogador {
    //ATRIBUTOS DA CLASSE JOGADOR
    int atleta_0;
    int id;
    String nome;
    String apelido;
    String dataNascimento;
    int numero;
    String posicao;
    double qualidade;
    int cartoes;
    boolean suspenso;
    int cartaoAmarelo;
    int cartaoVermelho;
    int treino;

    //CONTRUTORES DA CLASSE JOGADOR
    public Jogador() {
        //INSTANCIA DO CONTRUTOR VAZIO
    }
    public Jogador(int id, String nome, String apelido, String dataNascimento, int numero, String posicao, int qualidade, int cartoes, boolean suspenso) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.numero = numero;
        this.posicao = posicao;
        this.qualidade = qualidade;
        this.cartoes = cartoes;
        this.suspenso = suspenso;
    }
    //MÉTODOS DA CLASSE JOGADOR
    public boolean verificarCondicaoDejogo(){
        this.suspenso = !suspenso && cartoes <= 2 && cartaoAmarelo < 3 && cartaoVermelho != 1;
        return this.suspenso;
    }
    public void aplicarCartaoAmarelo(int quantidade){
        this.cartaoAmarelo = cartoes + quantidade;
        verificarCondicaoDejogo();
    }
    public void aplicarCartaoVermelho(int num){
        this.cartaoVermelho = num;
        verificarCondicaoDejogo();
    }
    public void cumprirSuspencao(){
        cartaoAmarelo = 0;
        cartaoVermelho = 0;
    }
    public void sofrerLesao(){
        Random gerarNumeroLesao = new Random();
        int lesao = gerarNumeroLesao.nextInt(100);
        if(lesao >= 1 && lesao <= 5 ){
            switch (lesao){
                case 1:
                    qualidade = 4;
                    break;
                case 2:
                    qualidade = 3;
                    break;
                case 3:
                    qualidade = 1.5;
                    break;
                case 4:
                    qualidade = 1;
                    break;
                case 5:
                    qualidade = 0.5;
                    break;
                default:
                    qualidade = 10;
                    break;
            }
        }
    }
    public void executarTreinamento(){
        Random gerarNumeroTreinamento = new Random();
        if (treino == 0){
            int pontos = (gerarNumeroTreinamento.nextInt(3));
            qualidade += pontos;
            treino +=1;
            System.out.println("O jogador "+ nome + " teve esses resultados: "  + "Treino: " + treino + " Qualidade: " + qualidade + " Pontos: " + pontos);
        }
        else {
            System.out.println("O jogador " + nome +  " não pode treinar.");
        }
    }
}

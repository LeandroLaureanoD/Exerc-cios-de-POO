import java.util.Random;
public class Jogo {
    private Time mandante;
    private Time visitante;
    private String dataDoJogo;
    private String estadio;
    private String cidade;
    private Integer placarMandante;
    private Integer placarVisitante;
    private int somaQualidadeMandante = 0;
    private int somaQualidadeVisitante = 0;

    public Jogo() {
    }
    public Jogo(Time mandante, Time visitante, String dataDoJogo, String estadio, String cidade, Integer placarMandante, Integer placarVisitante) {
        this.mandante = mandante;
        this.visitante = visitante;
        this.dataDoJogo = dataDoJogo;
        this.estadio = estadio;
        this.cidade = cidade;
        this.placarMandante = placarMandante;
        this.placarVisitante = placarVisitante;
    }
    public void gerarResultados(){
        Random radom = new Random();

        for (Jogador jogador : mandante.relacionarJogadoresTitular()) {
            somaQualidadeMandante += jogador.getQualidade();
        }
        int valor1 = radom.nextInt(50);
        for (Jogador jogador : visitante.relacionarJogadoresTitular()) {
            somaQualidadeVisitante += jogador.getQualidade();
        }
        int valor2 = radom.nextInt(50);

        if (somaQualidadeMandante * valor1 > somaQualidadeVisitante * valor2 ){
            System.out.println("Time mandante vence com a qualidade total de " + somaQualidadeMandante + " e porcentagem de vitoria de 50%");
        }else {
            System.out.println("Time visitante vence com a qualidade total de " + somaQualidadeVisitante + " e porcentagem de vitoria de 50%");
        }
    }
    public void gerarLesoes(){
        Random random = new Random();
        int quantidadeLesoes = random.nextInt(2);

        for (; quantidadeLesoes > 0; quantidadeLesoes--) {
            int jogador = random.nextInt(25);
            if (jogador > 10) {
                System.out.println("Jogador que sofreu lesão timeOne: ");
                mandante.relacionarJogadoresTitular().get(jogador - 11).sofrerLesao();
            } else {
                System.out.println("Jogador que sofreu lesão timeTwo: ");
                visitante.relacionarJogadoresTitular().get(jogador).sofrerLesao();
            }
        }
    }
    public void gerarCartoes(){
        Random random = new Random();
        int quantidadeCartoes = random.nextInt(10);

        for (; quantidadeCartoes > 0; quantidadeCartoes--) {
            int jogador = random.nextInt(21);
            if (jogador > 10) {
                System.out.print("Jogador que gerou cartão timeOne: ");
                mandante.relacionarJogadoresTitular().get(jogador - 11).aplicarCartao(1);
            } else {
                System.out.print("Jogador que gerou cartão timeTwo: ");
                visitante.relacionarJogadoresTitular().get(jogador).aplicarCartao(1);
            }
        }
    }
    //Permite treino de jogadores que tem a qualidade maior ou igual a 5
    public void permitirTreinamento(){
        for(Jogador jogador : mandante.relacionarJogadoresTitular()) {
            if (jogador.getTreino()){
                System.out.println(jogador.getNome());
            }
        }
        for(Jogador jogador : visitante.relacionarJogadoresTitular()) {
           if (jogador.getTreino()){
               System.out.println(jogador.getNome());
           }
        }
    }
    @Override
    public String toString() {
        return  "Jogo" + "\n" +
                "Mandante: " + mandante + "\n" +
                "Visitante: " + visitante + "\n" +
                "Data do jogo: " + dataDoJogo + "\n" +
                "Estadio: " + estadio + "\n" +
                "Cidade: " + cidade + "\n" +
                "Placar do mandante: " + placarMandante + "\n" +
                "Placar do visitante: " + placarVisitante + "\n" +
                "Soma da qualidade do mandante: " + somaQualidadeMandante + "\n" +
                "Soma da qualidade do visitante: " + somaQualidadeVisitante;
    }
}

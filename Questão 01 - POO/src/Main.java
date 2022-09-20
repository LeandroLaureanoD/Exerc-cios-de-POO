import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Jogador[] atleta = new Jogador[11];
        atleta[0] = new Jogador(0, "Leandro", "Servidor", "1990/16/01", 9, "Atacante", 10, 1, false);
        atleta[1] = new Jogador(1, "Leonardo", "Cordenador", "1991/16/02", 9, "Goleiro", 10, 3, false);
        atleta[2] = new Jogador(2, "Osmar", "Dba", "1992/16/03", 9, "Zagueiro", 10, 1, false);
        atleta[3] = new Jogador(3, "Lucas", "Serviço", "1993/16/04", 9, "Volante", 10, 3, true);
        atleta[4] = new Jogador(4, "Aline", "Sistemas", "1994/16/05", 9, "Volante", 10, 3, true);
        atleta[5] = new Jogador(5, "Elias", "Suporte", "1995/16/06", 9, "Volante", 10, 1, false);
        atleta[6] = new Jogador(6, "Diego", "Suporte", "1996/16/07", 9, "Volante", 10, 2, false);
        atleta[7] = new Jogador(7, "Andre", "Suporte Noite", "1997/16/08", 9, "Meia", 10, 3, true);
        atleta[8] = new Jogador(8, "Emmanuel", "Suporte Noite", "1998/16/09", 9, "Meia", 10, 0, false);
        atleta[9] = new Jogador(9, "Luana", "Suporte Dia", "1999/16/10", 9, "Lateral esquerdo", 10, 0, false);
        atleta[10] = new Jogador(10, "Marcia", "Cordenadora Desenvolvimento", "2000/16/11", 9, "Goleiro", 10, 0, false);

        System.out.println("JOGADORES CADASTRADOS");

        System.out.println("Você deseja espulsar um Atleta ? (1)SIM (2)NÃO : ");
        int espulsarAtleta = sc.nextInt();

        int idAtleta = 0;

        //Verifica se o usuario deseja espulsar o atleta
        if (espulsarAtleta == 1) {
            System.out.println("Digite o ID do Atleta:");
            idAtleta = sc.nextInt();
        }

        int idAtletab = idAtleta;

        //Estrutura de repeticao para verificar meu array
        for (Jogador jogador : atleta) {

            //Verifica se o valor digitado pelo usuario e igual a 1
            if (espulsarAtleta == 1) {
                //Verifica qual atleta deve ser espulso por cartao vermelho
                if (idAtletab == jogador.id) {
                    jogador.aplicarCartaoVermelho(1);
                    System.out.println(jogador.posicao + ": " + jogador.id + " - " + jogador.nome + " " + "(" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " " + "CONDIÇÃO: SUSPENSO POR CARTÃO VERMELHO");
                    break;
                }
            }
            else {
                //jogador.executarTreinamento();

                //Verifica se o atleta esta apto ou nao para jogar
                if (jogador.verificarCondicaoDejogo()) {
                    System.out.println(jogador.posicao + ": " + jogador.id + " - " + jogador.nome + " " + "(" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " " + "CONDIÇÃO: TÁ PRA JOGAR");
                }
                else {
                    System.out.println(jogador.posicao + ": " + jogador.id + " - " + jogador.nome + " " + "(" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " " + "CONDIÇÃO: SUSPENSO");
                }

                //jogador.aplicarCartaoAmarelo(1);
                //Verifica se o atleta esta apto ou nao para jogar de acordo com a qunatidade de cartao amarelo inserido
                /*if (jogador.suspenso == true) {
                    System.out.println(jogador.posicao + ": " + jogador.id + " - " + jogador.nome + " " + "(" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " " + "CONDIÇÃO: TÁ PRA JOGAR");
                } else {
                    System.out.println(jogador.posicao + ": " + jogador.id + " - " + jogador.nome + " " + "(" + jogador.apelido + ")" + " - " + jogador.dataNascimento + " " + "CONDIÇÃO: SUSPENSO");
                }*/
            }
        }
    }
}

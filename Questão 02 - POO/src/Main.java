import java.util.ArrayList;

public class Main {

    public static void main(String[] argrs) {

        ArrayList<Jogador> jogadoresOne = new ArrayList<>();
        jogadoresOne.add(new Jogador(0, "Leandro", "Servidor", "1990/16/01", 4, "Atacante", 6));
        jogadoresOne.add(new Jogador(1, "Leonardo", "Cordenador", "1991/16/02", 9, "Goleiro", 8));
        jogadoresOne.add(new Jogador(2, "Laureano", "Laure", "1991/16/08", 5, "Meio", 7));
        jogadoresOne.add(new Jogador(3, "Osmar", "Dba", "1992/16/03", 9, "Zagueiro", 10));
        jogadoresOne.add(new Jogador(4, "Lucas", "Serviço", "1993/16/04", 9, "Volante", 11));
        jogadoresOne.add(new Jogador(5, "Aline", "Sistemas", "1994/16/05", 9, "Volante", 1));
        jogadoresOne.add(new Jogador(6, "Elias", "Suporte", "1995/16/06", 9, "Volante", 2));
        jogadoresOne.add(new Jogador(7, "Diego", "Suporte", "1996/16/07", 9, "Volante", 3));
        jogadoresOne.add(new Jogador(8, "Andre", "Suporte Noite", "1997/16/08", 9, "Meia", 4));
        jogadoresOne.add(new Jogador(9, "Emmanuel", "Suporte Noite", "1998/16/09", 9, "Meia", 5));
        jogadoresOne.add(new Jogador(10, "Marcia", "Cordenadora Desenvolvimento", "2000/16/11", 9, "Goleiro", 10));
        jogadoresOne.add(new Jogador(11, "Maria", "Servidor", "1990/16/01", 4, "Atacante", 6));
        jogadoresOne.add(new Jogador(12, "Carla", "Cordenador", "1991/16/02", 9, "Goleiro", 8));
        jogadoresOne.add(new Jogador(13, "Fernando", "Laure", "1991/16/08", 5, "Meio", 7));
        jogadoresOne.add(new Jogador(14, "Sandra", "Dba", "1992/16/03", 9, "Zagueiro", 10));
        jogadoresOne.add(new Jogador(15, "Carlos", "Serviço", "1993/16/04", 9, "Volante", 12));
        jogadoresOne.add(new Jogador(16, "Tulio", "Sistemas", "1994/16/05", 9, "Volante", 1));
        jogadoresOne.add(new Jogador(17, "Fernanda", "Suporte", "1995/16/06", 9, "Volante", 2));
        jogadoresOne.add(new Jogador(18, "Fabio", "Suporte", "1996/16/07", 9, "Volante", 3));
        jogadoresOne.add(new Jogador(19, "Tardele", "Suporte Noite", "1997/16/08", 9, "Meia", 4));
        jogadoresOne.add(new Jogador(20, "Luiza", "Suporte Noite", "1998/16/09", 9, "Meia", 5));
        jogadoresOne.add(new Jogador(21, "Raquel", "Suporte Dia", "1999/16/10", 9, "Lateral esquerdo", 8));
        jogadoresOne.add(new Jogador(22, "Ester", "Cordenadora Desenvolvimento", "2000/16/11", 9, "Goleiro", 13));

        ArrayList<Jogador> jogadoresTwo = new ArrayList<>();
        jogadoresTwo.add(new Jogador(0, "Gustavo", "Gu", "1990/01/22", 11, "Atacante", 9));
        jogadoresTwo.add(new Jogador(1, "Joao", "Jo", "1991/02/05", 12, "Goleiro", 8));
        jogadoresTwo.add(new Jogador(2, "Reinaldo", "Rei", "1991/06/09", 7, "Meio", 5));
        jogadoresTwo.add(new Jogador(3, "Rafael", "Dba", "1992/16/03", 9, "Zagueiro", 10));
        jogadoresTwo.add(new Jogador(4, "Elio", "Serviço", "1993/16/04", 9, "Volante", 1));
        jogadoresTwo.add(new Jogador(5, "Gabriel", "Sistemas", "1994/16/05", 9, "Volante", 1));
        jogadoresTwo.add(new Jogador(6, "Marcos", "Suporte", "1995/16/06", 9, "Volante", 2));
        jogadoresTwo.add(new Jogador(7, "Bruno", "Suporte", "1996/16/07", 9, "Volante", 3));
        jogadoresTwo.add(new Jogador(8, "Edu", "Suporte Noite", "1997/16/08", 9, "Meia", 4));
        jogadoresTwo.add(new Jogador(9, "Alex", "Suporte Noite", "1998/16/09", 9, "Meia", 5));
        jogadoresTwo.add(new Jogador(10, "Alessandro", "Cordenadora Desenvolvimento", "2000/16/11", 9, "Goleiro", 10));
        jogadoresTwo.add(new Jogador(11, "Willian", "Servidor", "1990/16/01", 4, "Atacante", 6));
        jogadoresTwo.add(new Jogador(12, "Victor", "Cordenador", "1991/16/02", 9, "Goleiro", 8));
        jogadoresTwo.add(new Jogador(13, "Dudu", "Laure", "1991/16/08", 5, "Meio", 7));
        jogadoresTwo.add(new Jogador(14, "Luiz Carlos", "Dba", "1992/16/03", 9, "Zagueiro", 10));
        jogadoresTwo.add(new Jogador(15, "Douglas", "Serviço", "1993/16/04", 9, "Volante", 1));
        jogadoresTwo.add(new Jogador(16, "Jair", "Sistemas", "1994/16/05", 9, "Volante", 1));
        jogadoresTwo.add(new Jogador(17, "Pedro", "Suporte", "1995/16/06", 9, "Volante", 2));
        jogadoresTwo.add(new Jogador(18, "Adelson", "Suporte", "1996/16/07", 9, "Volante", 13));

        Time timeOne = new Time("Atletico Mineiro", "Galo", "1950/02/13", jogadoresOne, jogadoresOne);
        Time timeTwo = new Time("Cruzeiro", "Raposa", "1955/03/03", jogadoresTwo, jogadoresTwo);

        System.out.println();
        System.out.println(timeOne);
        System.out.println(timeOne.relacionarJogadores());

        System.out.println();
        System.out.println(timeTwo);
        System.out.println(timeTwo.relacionarJogadores());
        /*System.out.println("Titulares do " + timeOne.getNome() + ": ");
        timeOne.relacionarJogadores().stream().forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));

        System.out.println();
        System.out.println("Titulares do " + timeTwo.getNome() + ": ");
        timeTwo.relacionarJogadores().stream().forEach(t -> System.out.println(t.getNumero() + " - " + t.getNome() + " - " + t.getQualidade()));*/

    }
}

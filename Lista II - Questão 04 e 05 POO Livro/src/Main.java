import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Titulo do Livro: ");
        livro.setTitulo(sc.nextLine());

        System.out.println("Digite a quantidade de Paginas do Livro: ");
        livro.setQtdPaginas(sc.nextInt());

        System.out.println("Digite a quantidade de Paginas Lidas: ");
        livro.setPaginasLidas(sc.nextInt());

        System.out.print("Você ja leu ");
        livro.verificarProgresso();
        System.out.print("% do livro " + "'"+ livro.getTitulo() + "'");

    }
}

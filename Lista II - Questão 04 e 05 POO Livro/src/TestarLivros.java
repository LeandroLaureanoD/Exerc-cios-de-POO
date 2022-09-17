public class TestarLivros {

    public static void main(String[] args){
        Livro livrofavorito = new Livro();

        livrofavorito.setTitulo("O Pequeno Principe");
        livrofavorito.setQtdPaginas(98);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(20);
        livrofavorito.verificarProgresso();
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("O Protetor");
        livrofavorito.setQtdPaginas(118);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(25);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("O Viajante");
        livrofavorito.setQtdPaginas(128);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(45);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Peter Pan");
        livrofavorito.setQtdPaginas(218);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(15);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("One Piece");
        livrofavorito.setQtdPaginas(2000);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(1473);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Naruto");
        livrofavorito.setQtdPaginas(600);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(600);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Boruto");
        livrofavorito.setQtdPaginas(150);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(150);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Dragon Ball Z");
        livrofavorito.setQtdPaginas(350);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(350);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Cavaleiro do Zodiaco");
        livrofavorito.setQtdPaginas(50);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(50);
        livrofavorito.verificarProgresso();

        livrofavorito.setTitulo("Pai rico pai Pobre");
        livrofavorito.setQtdPaginas(120);
        System.out.println("O livro " + "'" + livrofavorito.getTitulo() + "'" + " possui " + livrofavorito.getQtdPaginas() + " páginas");
        livrofavorito.setPaginasLidas(60);
        livrofavorito.verificarProgresso();
    }
}

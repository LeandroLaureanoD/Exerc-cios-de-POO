public class Livro {

    private String titulo;
    private Integer qtdPaginas;
    private Integer paginasLidas;

    public Livro() {
    }

    public Livro(String titulo, Integer qtdPaginas) {
        this.titulo = titulo;
        this.qtdPaginas = qtdPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(Integer qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Integer getPaginasLidas() {
        return paginasLidas;
    }

    public void setPaginasLidas(Integer paginasLidas) {
        this.paginasLidas = paginasLidas;
    }

    //Method
    public void verificarProgresso(){
        Integer porcentagem = (paginasLidas * 100) / qtdPaginas;
        System.out.println("Você ja leu " + porcentagem + "% do livro");
    }
}

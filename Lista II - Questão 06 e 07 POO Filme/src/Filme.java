public class Filme {

    private String titulo;
    private Integer duracaoEmMinutos;
    public Filme() {
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setDuracaoEmMinutos(Integer duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void exibirDuracaoEmHoras() {
        Integer minutos = duracaoEmMinutos % 60;
        int horas = (duracaoEmMinutos - minutos) / 60;
        System.out.println("O filme " + "'" + getTitulo() + "'" + " possui " + horas + " horas e " + minutos + " minutos de duração"  );
    }
}

public class TestarFilme {


    public static void main (String[] args){

        Filme filme1 = new Filme();
        filme1.setTitulo("Os Vingadores");
        filme1.setDuracaoEmMinutos(42);
        filme1.exibirDuracaoEmHoras();

        Filme filme2 = new Filme();
        filme2.setTitulo("Hotel Transilvânia");
        filme2.setDuracaoEmMinutos(93);
        filme2.exibirDuracaoEmHoras();

        Filme filme3 = new Filme();
        filme3.setTitulo("Dragon Ball Super - Freeza");
        filme3.setDuracaoEmMinutos(90);
        filme3.exibirDuracaoEmHoras();

        Filme filme4 = new Filme();
        filme4.setTitulo("Invocação do Mal 3 - A origem");
        filme4.setDuracaoEmMinutos(110);
        filme4.exibirDuracaoEmHoras();

        Filme filme5 = new Filme();
        filme5.setTitulo("Chuck");
        filme5.setDuracaoEmMinutos(100);
        filme5.exibirDuracaoEmHoras();

        System.out.println("_____________________________________________________________________");
        System.out.println("Os filmes em cartazes são: " + "\n" +  "- " + filme1.getTitulo() +  "\n" + "- " + filme2.getTitulo() + "\n" + "- " + filme3.getTitulo() + "\n"+
                "- " + filme4.getTitulo() + "\n" + "- " + filme5.getTitulo());
    }
}

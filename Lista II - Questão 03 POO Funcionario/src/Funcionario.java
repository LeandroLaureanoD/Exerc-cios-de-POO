import javax.swing.plaf.PanelUI;

public class Funcionario {
    private String nome, sobrenome;
    protected Integer horasTrabalhadas;
    protected double valorPorhora;

    //Contructor
    public Funcionario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }
    public Funcionario(String nome, String sobrenome, Integer horasTrabalhadas, double valorPorhora) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorhora = valorPorhora;
    }
    //Setter
    public void setHorasTrabalhadas(Integer horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }
    //Method
    public void nomeCompleto(){
        System.out.println(nome + " " + sobrenome);
    }
    public void calcularSalario(){
        double salario = valorPorhora * horasTrabalhadas;
        System.out.println(salario);
    }
    public void incrementarHoras(Integer horas){
        horasTrabalhadas += horas;
    }
}

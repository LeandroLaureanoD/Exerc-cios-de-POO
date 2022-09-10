package main.java;

public class Funcionario {
    private String nomeFuncionario;
    private int matriculaFuncionario;
    private double salarioFuncionario;
    private String dataAdmissaoFuncionario;
    private String cpfFuncionario;

    //Contructor
    public Funcionario() {
    }

    public Funcionario(String nomeFuncionario, int matriculaFuncionario, double salarioFuncionario, String dataAdmissaoFuncionario, String cpfFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
        this.matriculaFuncionario = matriculaFuncionario;
        this.salarioFuncionario = salarioFuncionario;
        this.dataAdmissaoFuncionario = dataAdmissaoFuncionario;
        this.cpfFuncionario = cpfFuncionario;
    }

    //Setter
    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public void setMatriculaFuncionario(int matriculaFuncionario) {
        this.matriculaFuncionario = matriculaFuncionario;
    }

    public void setSalarioFuncionario(double salarioFuncionario) {
        this.salarioFuncionario = salarioFuncionario;
    }

    public void setDataAdmissaoFuncionario(String dataAdmissaoFuncionario) {
        this.dataAdmissaoFuncionario = dataAdmissaoFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    //Method

    public void receberAumento(double aumentaSalario){
        salarioFuncionario += aumentaSalario;
    }

    public double calcularGanhoBrutoAnual(){
        return salarioFuncionario * 12;
    }

    public double calcularImposto(){
        double impostoInss = (salarioFuncionario * 11) / 100;
        if (salarioFuncionario > 2500){
            double valorExcedido = salarioFuncionario - 2500;
            double impostoIr = (valorExcedido * 17.5) / 100;
            return impostoInss + impostoIr;
        }else {
            return impostoInss;
        }
    }

    public double calclarGanhoLiquidoMensal(){
        return salarioFuncionario - calcularImposto();
    }

    public double calclarGanhoLiquidoAnual(){
        return (salarioFuncionario - calcularImposto()) * 12;

    }

    @Override
    public String toString() {
        return  "Nome: " + nomeFuncionario + "\n" +
                "Matricula: " + matriculaFuncionario + "\n" +
                String.format("Salario: " +  "%.2f", salarioFuncionario) + "\n" +
                "Data de Admissao: " + dataAdmissaoFuncionario + "\n" +
                "Cpf: " + cpfFuncionario + "\n" +
                String.format("Salario Bruto Anual: " + "%.2f", calcularGanhoBrutoAnual()) + "\n" +
                String.format("Valor descontado do Imposto: " + "%.2f", calcularImposto()) + "\n" +
                String.format("Salario Liquido Mensal: " + "%.2f", calclarGanhoLiquidoMensal()) + "\n" +
                String.format("Salario Liquido Anual: " + "%.2f", calclarGanhoLiquidoAnual());
    }
}

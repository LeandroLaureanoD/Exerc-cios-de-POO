public class Main {

    public static void main(String[] args){
        Funcionario funcionario;

        funcionario = new Funcionario("Lucas", "Silva");
        funcionario.setHorasTrabalhadas(10);
        funcionario.setValorPorhora(25.50);

        funcionario.nomeCompleto();
        funcionario.calcularSalario();

        funcionario.incrementarHoras(8);
        funcionario.calcularSalario();

        Funcionario[] novosFuncionarios = new Funcionario[9];
        novosFuncionarios[0] = new Funcionario("Leandro","Laureano", 35, 1.50);
        novosFuncionarios[1] = new Funcionario("Maria","Duarte", 14, 1.70);
        novosFuncionarios[2] = new Funcionario("Juliana","Alves", 45, 1.90);
        novosFuncionarios[3] = new Funcionario("João","Lima", 10, 5.50);
        novosFuncionarios[4] = new Funcionario("Ana","Fernanda", 35, 1.50);
        novosFuncionarios[5] = new Funcionario("Cleiton","Fernandes", 65, 2.50);
        novosFuncionarios[6] = new Funcionario("Judith","Cleide", 5, 3.50);
        novosFuncionarios[7] = new Funcionario("Carol","da Silva", 15, 9.50);
        novosFuncionarios[8] = new Funcionario("Luana","Olivia", 25, 4.50);

        for (Funcionario func : novosFuncionarios){
            func.nomeCompleto();
            func.calcularSalario();
        }
    }
}

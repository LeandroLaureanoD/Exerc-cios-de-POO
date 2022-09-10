package main.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] argrs){

        String nomeFunc;
        int matriculaFunc;
        double salarioFunc;
        String dataAdmissaoFunc;
        String cpfFuncionario;

        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Calcular renda do funcionario");

        System.out.println("Digite seu cpf: ");
        cpfFuncionario = sc.nextLine();
        funcionario.setCpfFuncionario(cpfFuncionario);

        System.out.println("Digite seu nome: ");
        nomeFunc = sc.nextLine();
        funcionario.setNomeFuncionario(nomeFunc);

        System.out.println("Digite sua matricula: ");
        matriculaFunc = sc.nextInt();
        funcionario.setMatriculaFuncionario(matriculaFunc);

        System.out.println("Digite seu salário: ");
        salarioFunc = sc.nextDouble();
        funcionario.setSalarioFuncionario(salarioFunc);

        System.out.println("Digite sua data de admissão: ");
        sc.nextLine();
        dataAdmissaoFunc = sc.nextLine();
        funcionario.setDataAdmissaoFuncionario(dataAdmissaoFunc);

        funcionario.receberAumento(1000);
        System.out.println(funcionario);
    }
}

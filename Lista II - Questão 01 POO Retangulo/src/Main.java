import java.util.Scanner;

public class Main {

    public static void main(String[] arsgrs){
        Scanner sc = new Scanner(System.in);
        Retangulo retangulo = new Retangulo();
        float ladoUm;
        float ladoDois;

        System.out.println("Deseja calcular um Retangulo? (s/n) ");
        char condicao = sc.next().charAt(0);

        while (condicao == 's'){

            System.out.println("Digte o valor do lado 1 do Retangulo: ");
            ladoUm = sc.nextFloat();
            retangulo.setLado1(ladoUm);

            System.out.println("Digte o valor do lado 2 do Retangulo: ");
            ladoDois = sc.nextFloat();
            retangulo.setLado2(ladoDois);

            retangulo.calcularArea();
            retangulo.calcularPerimetro();

            System.out.println(retangulo);
            System.out.println("Deseja calcular outro Retangulo? (s/n) ");
            condicao = sc.next().charAt(0);
        }
    sc.close();
    }
}

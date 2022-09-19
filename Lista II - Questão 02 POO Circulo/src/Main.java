public class Main {

    public static void main(String[] args){

        Circulo novoCirculo = new Circulo();

        novoCirculo.setRaio(10);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        novoCirculo.setRaio(4);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        novoCirculo.setRaio(15);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        novoCirculo.setRaio(85);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();

        novoCirculo.setRaio(26);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();
    }
}

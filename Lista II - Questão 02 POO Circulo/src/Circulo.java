public class Circulo {

    private double raio;
    private double area;
    private double perimetro;

    public Circulo() {
    }
    public void setRaio(double raio) {
        this.raio = raio;
    }
    //Method
    public void calcularArea(){
        System.out.printf("Area: %.2f%n", area = (raio * raio) * 3.14 );
    }
    public void calcularPerimetro(){
        System.out.printf("Perimetro: %.2f%n", perimetro = (2 * 3.14) * raio);
        System.out.println("_____________________");
    }
}

public class Retangulo {

    private float lado1;
    private float lado2;
    private float area;
    private float perimetro;

    //Contructor
    public Retangulo() {
    }
    // Setter
    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    //Method
    public float calcularArea(){
        return area = lado1 * lado2;
    }

    public float calcularPerimetro(){
        return perimetro = (2 * lado1) + (2 * lado2);
    }

    @Override
    public String toString() {
        return  "Area do Retangulo: "+ calcularArea() + "\n" +
                "Perimetro: " + calcularPerimetro();
    }
}
